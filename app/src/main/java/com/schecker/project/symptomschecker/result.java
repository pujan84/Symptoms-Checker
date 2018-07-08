package com.schecker.project.symptomschecker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Admin on 30/03/2017.
 */

public class result extends AppCompatActivity{
    String diseases;
    String dfull;
    String[] d,d1;
    ListView l,l1;
    TextView t;
    int size;
    int sfull;
    int j;
    static final String TAG = result.class.getSimpleName();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Intent i1 = getIntent();
        //t = (TextView)findViewById(R.id.text);
        diseases = i1.getExtras().getString("diseases");
        size=i1.getExtras().getInt("size");
        dfull = i1.getExtras().getString("dfull");
        sfull=i1.getExtras().getInt("sfull");
        d = new String[size];
        d1 = new String[sfull];
        ListAdapter la,lf;
        if(size!=0 || diseases!=null)
        {
            for(int i=0;i<size;i++)
            {
                j=diseases.indexOf(",");
                d[i]=diseases.substring(0,j);
                Log.d(TAG,d[i]);
                if(i<size)
                {
                    diseases=diseases.substring(j+1,diseases.length());
                }
                Log.d(TAG,diseases);
            }
            l = (ListView)findViewById(R.id.list1);
            la = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,d);
            l.setAdapter(la);
            l.setOnItemClickListener(
                    new AdapterView.OnItemClickListener()
                    {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View v, int position, long id)
                        {
                            Intent i = new Intent(result.this,dcommon.class);
                            i.putExtra("disease",String.valueOf(parent.getItemAtPosition(position)));
                            startActivity(i);
                        }
                    }
            );
        }
        if(sfull!=0 || dfull!=null)
        {
            for(int i=0;i<sfull;i++)
            {
                j=dfull.indexOf(",");
                d1[i]=dfull.substring(0,j);
                if(i<sfull)
                {
                    dfull=dfull.substring(j+1,dfull.length());
                }
            }
            l1 = (ListView)findViewById(R.id.list2);
            lf = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,d1);
            l1.setAdapter(lf);
            l1.setOnItemClickListener(
                    new AdapterView.OnItemClickListener()
                    {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View v, int position, long id)
                        {
                            Intent i = new Intent(result.this,dcommon.class);
                            i.putExtra("disease",String.valueOf(parent.getItemAtPosition(position)));
                            startActivity(i);
                        }
                    }
            );
        }
        /*for(int i=0;i<size;i++)
        {
            t.setText(t.getText()+d[i]+"\n\n");
        }*/
    }
}
