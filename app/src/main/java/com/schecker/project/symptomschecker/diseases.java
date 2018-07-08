package com.schecker.project.symptomschecker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Admin on 31/03/2017.
 */

public class diseases extends AppCompatActivity{
    ListView list;
    String[] diseases = {"Malaria","Polio","Yellow fever","Flu","Food poisoning","Brain tumor","Heart failure","Dehydration","Diabetes","Ear infections","Cold sore","Heat stroke","Gout","Aids","Cholera","Tooth decay","Vertigo","Stomach cancer","Bird flu","Tuberculosis"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListAdapter la = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,diseases);
        list = (ListView)findViewById(R.id.list);
        list.setAdapter(la);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View v, int position, long id)
                    {
                        Intent i = new Intent(diseases.this,dcommon.class);
                        i.putExtra("disease",String.valueOf(parent.getItemAtPosition(position)));
                        startActivity(i);
                    }
                }
        );
    }
}
