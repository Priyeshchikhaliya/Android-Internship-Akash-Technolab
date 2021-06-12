package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tv1 = findViewById(R.id.tv1);
        Intent i = getIntent();
        String nm = i.getStringExtra("NAME");

        tv1.setText("Welcome "+nm);
    }
}