package com.example.myregitration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayDataActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);

        Intent i = getIntent();
        String uname,gender,email,mobile,hobbies;
        uname = i.getStringExtra("uname");
        gender = i.getStringExtra("gender");
        email = i.getStringExtra("email");
        mobile = i.getStringExtra("mobile");
        hobbies = i.getStringExtra("hobbies");

        tv1.setText("Welcome "+uname);
        tv2.setText("Gender:"+gender);
        tv3.setText("Email:"+email);
        tv4.setText("Mobile:"+mobile);
        tv5.setText("Hobbies:"+hobbies);
    }
}