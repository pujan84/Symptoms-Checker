package com.schecker.project.symptomschecker;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.support.v7.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class SymptomsCheck extends AppCompatActivity {
    TextView t;
    String[] d = {"Headache","Sore Throat","Weakness","Fatigue","Fever","Cough","Nasal congestion","Vomiting","Muscle weakness",
            "Muscle pain","Bloody Stools","Profuse sweating","Muscle aches","Joint aches","Red eyes","Shivers",
            "Diarrhea","Mild fever","Nausea","Myclonic","Sensory","Memory problems","Drowsiness","Irregular heartbeat","Swelling","Chest pain","Persistent cough",
            "Feeling thirsty","Feeling dizzy","Feeling tired","Dry mouth","Sunken eyes","Frequent urination","Blurred vision","Irritability","Wound that heal slowly","Skin infection"
            ,"Hearing loss","Pus-like ear drainage","Fussiness in young infants","Mild pain","Discomfort inside the ear",
            "Painful eroded gums","Swollen lymph nodes","Feeling and being seek","Dizziness","Intense thirst","Rapid heartbeat","Confusion","Unconsciousness",
            "Extreme tenderness in a joint","Podagra","Red or purplish skin","Inflammation","Redness","Body rash","Sudden onset of diarrhea","Convulsions","Coma","Mild to severe dehydration",
            "Toothache","Tooth sensitivity","Visible hole in teeth","Pain when you bite","Black staining on teeth","Tilting","Swaying","Spinning","Feeling nauseated",
            "Indigestion","Loss of appetite","Trouble swallowing","Swelling in your stomach","Malaise","Runny nose","Weight loss","Chills","Sweating at night","No appetite"};
    String[] s = new String[50];
    int i=0;
    ListView l;
    String cs="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListAdapter la = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,d);
        checkDatabase();
        l = (ListView)findViewById(R.id.list);
        l.setAdapter(la);
        t=(TextView)findViewById(R.id.text);
        l.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView<?> parent,View v,int position,long id)
                    {
                        if(!cs.contains(String.valueOf(position)))
                        {
                            String select = String.valueOf(parent.getItemAtPosition(position));
                            t.setText(t.getText()+select+",");
                            s[i]=select;
                            cs=cs+position;
                            i++;
                        }
                    }
                }
        );
    }

    private void checkDatabase() {
        File f = getApplicationContext().getDatabasePath("medical.db");
        if(!f.exists())
        {
            Medical m = new Medical("Flu","Headache,Sore Throat,Weakness,Fever,Cough,Nasal congestion");
            DBHandler db = new DBHandler(this,null,null,1);
            db.addMedical(m);
            m.setMedical("Malaria","Profuse sweating,Fever,Headache,Vomiting,Muscle pain,Bloody Stools");
            db.addMedical(m);
            m.setMedical("Polio","Sore Throat,Fatigue,Headache,Fever,Vomiting,Muscle weakness");
            db.addMedical(m);
            m.setMedical("Yellow Fever","Headache,Fever,Muscle aches,Joint aches,Red eyes,Shivers");
            db.addMedical(m);
            m.setMedical("Food poisoning","Diarrhea,Vomiting,Mild fever,Weakness,Nausea,Headache");
            db.addMedical(m);
            m.setMedical("Brain tumor","Myclonic,Sensory,Fatigue,Memory problems,Drowsiness");
            db.addMedical(m);
            m.setMedical("Heart failure","Fatigue,Irregular heartbeat,Swelling,Chest pain,Persistent cough,Nausea");
            db.addMedical(m);
            m.setMedical("Dehydration","Feeling thirsty,Feeling dizzy,Feeling tired,Dry mouth,Sunken eyes,Fatigue");
            db.addMedical(m);
            m.setMedical("Diabetes","Frequent urination,Blurred vision,Irritability,Nausea,Wound that heal slowly,Skin infection");
            db.addMedical(m);
            m.setMedical("Ear infections","Hearing loss,Pus-like ear drainage,Fussiness in young infants,Mild pain,Discomfort inside the ear");
            db.addMedical(m);
            m.setMedical("Cold sore","Fever,Painful eroded gums,Sore throat,Headache,Muscle aches,Swollen lymph nodes");
            db.addMedical(m);
            m.setMedical("Heat stroke","Feeling and being seek,Dizziness,Intense thirst,Rapid heartbeat,Confusion,Unconsciousness");
            db.addMedical(m);
            m.setMedical("Gout","Extreme tenderness in a joint,Podagra,Red or purplish skin,Inflammation,Redness");
            db.addMedical(m);
            m.setMedical("Aids","Body rash,Fever,Sore throat,Muscle aches,Nausea,Vomiting");
            db.addMedical(m);
            m.setMedical("Cholera","Sudden onset of diarrhea,Nausea,Convulsions,Coma,Fever,Mild to severe dehydration");
            db.addMedical(m);
            m.setMedical("Tooth decay","Toothache,Tooth sensitivity,Visible hole in teeth,Pain when you bite,Black staining on teeth");
            db.addMedical(m);
            m.setMedical("Vertigo","Tilting,Swaying,Spinning,Feeling nauseated,Vomiting");
            db.addMedical(m);
            m.setMedical("Stomach cancer","Indigestion,Loss of appetite,Trouble swallowing,Swelling in your stomach,Feeling tired");
            db.addMedical(m);
            m.setMedical("Bird flu","Diarrhea,Malaise,Runny nose,Cough,Sore throat,Headache");
            db.addMedical(m);
            m.setMedical("Tuberculosis","Weight loss,Chills,Fever,Sweating at night,Fatigue,No appetite");
            db.addMedical(m);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        MenuItem searchitem=menu.findItem(R.id.item_search);
        SearchView searchview=(SearchView) MenuItemCompat.getActionView(searchitem);
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<String> templist=new ArrayList<>();

                for(String temp:d)
                {
                    if(temp.toLowerCase().contains(newText.toLowerCase())){
                        templist.add(temp);
                    }
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<>(SymptomsCheck.this, android.R.layout.simple_list_item_1,templist);
                l.setAdapter(adapter);
                return true;
            }

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.clear:
                for(i=0;i<=20;i++)
                {
                    s[i]=null;
                }
                i=0;
                t.setText("");
                cs="";
                return true;
            case R.id.ok:
                String[] t1 = new String[4];
                DBHandler db = new DBHandler(this,null,null,1);
                t1=db.checkMedical(s,i);
                if(Integer.parseInt(t1[1])==0 && Integer.parseInt(t1[3])==0)
                {
                    Toast.makeText(SymptomsCheck.this,"Not Matched with any diseases",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i1 = new Intent(SymptomsCheck.this,result.class);
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
                    t.setText("");
                    startActivity(i1);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
