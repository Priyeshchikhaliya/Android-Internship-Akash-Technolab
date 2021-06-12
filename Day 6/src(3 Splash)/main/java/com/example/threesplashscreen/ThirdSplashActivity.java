package com.example.threesplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class ThirdSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_third_splash);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent(ThirdSplashActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}