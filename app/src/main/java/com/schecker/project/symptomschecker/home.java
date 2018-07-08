package com.schecker.project.symptomschecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Button sym = (Button) findViewById(R.id.symptoms);
        Button dis = (Button) findViewById(R.id.diseases);
        sym.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, SymptomsCheck.class));
            }
        });
        dis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(home.this, diseases.class));
            }
        });
    }

    public void onSearch(View v)
    {
        startActivity(new Intent(home.this, search.class));
    }
}