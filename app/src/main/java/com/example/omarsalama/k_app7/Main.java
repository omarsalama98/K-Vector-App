package com.example.omarsalama.k_app7;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ProgressBar;

import spencerstudios.com.bungeelib.Bungee;


public class Main extends AppCompatActivity {

    ProgressBar progressBar;
   // Button continueBtn;
   Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
       /* continueBtn = (Button) findViewById(R.id.continueBtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Main.this,Drawer.class);
                    progressBar.setVisibility(View.VISIBLE);
                    Runnable runnable = new Runnable() {
                        @Override
                        public void run() {

                        }
                    };
                    Handler handler = new Handler();

                        handler.postDelayed(runnable, 4000);
                        startActivity(intent);
                    }*//*


        });
        progressBar.setVisibility(View.INVISIBLE);
    }*/
//        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            progressBar.setVisibility(View.VISIBLE);

            }
        };
        Handler handler = new Handler();
        handler.postDelayed(runnable,2500);


        intent = new Intent(Main.this,Drawer.class);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.INVISIBLE);
                startActivity(intent);
                finish();

            }
        };
         handler.postDelayed(runnable1,1500);





}
}
