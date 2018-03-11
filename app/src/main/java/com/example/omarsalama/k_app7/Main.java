package com.example.omarsalama.k_app7;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;



public class Main extends AppCompatActivity {

    ProgressBar progressBar= (ProgressBar)findViewById(R.id.progressBar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button continueBtn = findViewById(R.id.continueBtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent continueint = new Intent(Main.this,Drawer.class);
                progressBar.setVisibility(View.VISIBLE);
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {

                    }
                };
                Handler handler = new Handler();
                handler.postDelayed(runnable,4000);
                startActivity(continueint);
            }
        });
        progressBar.setVisibility(View.INVISIBLE);
    }

}
