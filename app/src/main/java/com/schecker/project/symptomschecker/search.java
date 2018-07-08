package com.schecker.project.symptomschecker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonElement;

import java.util.Map;

import ai.api.AIListener;
import ai.api.android.AIConfiguration;
import ai.api.android.AIService;
import ai.api.model.AIError;
import ai.api.model.AIResponse;
import ai.api.model.Result;


public class search extends AppCompatActivity implements AIListener{

    TextView t;
    ImageButton ib;
    private boolean islighton = false;
    private Camera camera;
    Context context;
    Parameters p;
    private AIService aiService;
    boolean ss = false;
    int i=0;
    String s[] = new String[50];
    String cs="";
    String[] d = {"Headache","Sore Throat","Weakness","Fatigue","Fever","Cough","Nasal congestion","Vomiting","Muscle weakness",
            "Muscle pain","Bloody Stools","Profuse sweating","Muscle aches","Joint aches","Red eyes","Shivers",
            "Diarrhea","Mild fever","Nausea","Myclonic","Sensory","Memory problems","Drowsiness","Irregular heartbeat","Swelling","Chest pain","Persistent cough",
            "Feeling thirsty","Feeling dizzy","Feeling tired","Dry mouth","Sunken eyes","Frequent urination","Blurred vision","Irritability","Wound that heal slowly","Skin infection"
            ,"Hearing loss","Pus-like ear drainage","Fussiness in young infants","Mild pain","Discomfort inside the ear",
            "Painful eroded gums","Swollen lymph nodes","Feeling and being seek","Dizziness","Intense thirst","Rapid heartbeat","Confusion","Unconsciousness",
            "Extreme tenderness in a joint","Podagra","Red or purplish skin","Inflammation","Redness","Body rash","Sudden onset of diarrhea","Convulsions","Coma","Mild to severe dehydration",
            "Toothache","Tooth sensitivity","Visible hole in teeth","Pain when you bite","Black staining on teeth","Tilting","Swaying","Spinning","Feeling nauseated",
            "Indigestion","Loss of appetite","Trouble swallowing","Swelling in your stomach","Malaise","Runny nose","Weight loss","Chills","Sweating at night","No appetite"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        context = this;
        PackageManager pm = context.getPackageManager();
        t = (TextView) findViewById(R.id.text);
        camera = Camera.open();
        p = camera.getParameters();
        ib = (ImageButton) findViewById(R.id.record);
        ib.setBackgroundResource(R.mipmap.speak);
        final AIConfiguration config = new AIConfiguration("96fa5d74880b4353aa785e4cb2006676", AIConfiguration.SupportedLanguages.English, AIConfiguration.RecognitionEngine.System);
        aiService = AIService.getService(this, config);
        aiService.setListener(this);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aiService.startListening();
            }
        });
    }

    public void onClear(View v)
    {
        t.setText("");
    }

    @Override
    public void onResult(AIResponse response) {
        Result result = response.getResult();
        String parameterString = "";
        /*if (result.getParameters() != null && !result.getParameters().isEmpty()) {
            for (final Map.Entry<String, JsonElement> entry : result.getParameters().entrySet()) {
                parameterString += "(" + entry.getKey() + ", " + entry.getValue() + ") ";
            }
        }*/
        String ans = result.getFulfillment().getSpeech();
        if(ans.equals("ss") && !ss)
        {
            ss = true;
            t.setText(t.getText()+"User input:" + result.getResolvedQuery() + "\nAnswer: Enter Symptoms"+"\n\n");
        }
        else if(ans.equals("done") && ss)
        {
            String[] t1 = new String[4];
            DBHandler db = new DBHandler(this,null,null,1);
            t1=db.checkMedical(s,i);
            if(Integer.parseInt(t1[1])==0 && Integer.parseInt(t1[3])==0)
            {
                Toast.makeText(search.this,"Not Matched with any diseases",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent i1 = new Intent(search.this,result.class);
                i1.putExtra("diseases",t1[0]);
                i1.putExtra("size",Integer.parseInt(t1[1]));
                i1.putExtra("dfull",t1[2]);
                i1.putExtra("sfull",Integer.parseInt(t1[3]));
                for(i=0;i<=20;i++)
                {
                    s[i]=null;
                }
                i=0;
                cs="";
                ss = false;
                startActivity(i1);
            }
        }
        else if(ans.equals("clear") && ss)
        {
            ss = false;
            i = 0;
            for(i=0;i<=20;i++)
            {
                s[i]=null;
            }
            i=0;
            t.setText("");
            cs="";
            ss = false;
        }
        else if(ans.equals("fon") && !ss)
        {
            if(islighton)
            {
                t.setText(t.getText()+"User input:" + result.getResolvedQuery() + "\nAnswer: Flashlight is already on\n\n");
            }
            else
            {
                p.setFlashMode(Parameters.FLASH_MODE_TORCH);
                camera.setParameters(p);
                camera.startPreview();
                islighton = true;
                t.setText(t.getText()+"User input:" + result.getResolvedQuery() + "\nAnswer: Turning on flashlight\n\n");
            }
        }
        else if(ans.equals("foff") && !ss)
        {
            if(!islighton)
            {
                t.setText(t.getText()+"User input:" + result.getResolvedQuery() + "\nAnswer :Flashlight is already off\n\n");
            }
            else
            {
                p.setFlashMode(Parameters.FLASH_MODE_OFF);
                camera.setParameters(p);
                camera.stopPreview();
                islighton = false;
                t.setText(t.getText()+"User input:" + result.getResolvedQuery() + "\nAnswer: Turning off flashlight\n\n");
            }
        }
        else if(ss)
        {
            boolean e = false;
            for (int j=0;j<79;j++)
            {
                if(ans.equalsIgnoreCase(d[j]))
                {
                    e = true;
                }
            }
            if(e)
            {
                String temp = ans;
                if(!cs.contains(temp))
                {
                    s[i] = temp;
                    i++;
                    cs = cs + temp;
                    t.setText(t.getText()+"User input:" + result.getResolvedQuery() + "\nAnswer: " + ans+" Added\n\n");
                }
                else
                {
                    st1(ans);
                }
            }
            else
            {
                st2(ans);
            }
        }
        else if(!ss)
        {
            t.setText(t.getText()+"User input:" + result.getResolvedQuery() + "\nAnswer: " + ans+"\n\n");
        }
        else
        {
            st();
        }
    }

    private void st2(String ans) {
        Toast.makeText(this,ans+" not found",Toast.LENGTH_SHORT).show();
    }

    private void st1(String ans) {
        Toast.makeText(this,ans+" already added",Toast.LENGTH_SHORT).show();
    }

    private void st() {
        Toast.makeText(this,"Enter symptom properly",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        if (camera != null) {
            camera.release();
        }
    }

    @Override
    public void onError(AIError error) {
        t.setText(t.getText()+error.toString()+"\n\n");
    }

    @Override
    public void onAudioLevel(float level) {

    }

    @Override
    public void onListeningStarted() {
        ib.setBackgroundResource(R.mipmap.listening);
    }

    @Override
    public void onListeningCanceled() {
        ib.setBackgroundResource(R.mipmap.speak);
    }

    @Override
    public void onListeningFinished() {
        ib.setBackgroundResource(R.mipmap.speak);
    }
}
