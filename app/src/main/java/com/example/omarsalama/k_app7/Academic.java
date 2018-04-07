package com.example.omarsalama.k_app7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.example.omarsalama.k_app7.Projects.*;

public class Academic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);
        Button androidBtn = (Button)findViewById(R.id.androidBtn);
        androidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent android = new Intent(Academic.this,android.class);
                startActivity(android);
            }
        });
        Button roboticsBtn = (Button)findViewById(R.id.roboticsBtn);
        roboticsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robotics = new Intent(Academic.this,Robotics.class);
                startActivity(robotics);
            }
        });
        Button wdBtn = (Button)findViewById(R.id.wdBtn);
        wdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webdesign = new Intent(Academic.this,WebDesign.class);
                startActivity(webdesign);
            }
        });
        Button ssBtn = (Button)findViewById(R.id.ssBtn);
        ssBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent softskills = new Intent(Academic.this,SoftSkills.class);
                startActivity(softskills);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(),Drawer.class);
        startActivityForResult(myIntent,0);
        return true;
    }
    }

