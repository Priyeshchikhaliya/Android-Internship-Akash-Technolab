package com.example.threesplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class FirstSplashActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_first_splash);
        mp = MediaPlayer.create(FirstSplashActivity.this,R.raw.audio);
        mp.start();
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent(FirstSplashActivity.this,SecondSplashActivity.class);
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