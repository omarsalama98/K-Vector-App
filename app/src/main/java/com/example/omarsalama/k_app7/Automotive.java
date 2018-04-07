package com.example.omarsalama.k_app7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Automotive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automotive);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button susBtn = (Button)findViewById(R.id.susBtn);
        susBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suspension = new Intent(Automotive.this,Suspension.class);
                startActivity(suspension);
            }
        });

        Button engineBtn = (Button)findViewById(R.id.engineBtn);
        engineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent engine = new Intent(Automotive.this,Engine.class);
                startActivity(engine);
            }
        });

        Button aeroBtn = (Button)findViewById(R.id.aeroBtn);
        aeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aero = new Intent(Automotive.this,AeroDynamics.class);
                startActivity(aero);
            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), Academic.class);
        startActivityForResult(myIntent,0);
        return true;
    }


}
