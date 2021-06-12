package com.example.sharedpre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnLogout;
    TextView tvName,tvEmail,tvMobile;

    public static final String main_key = "myKey";
    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String pass_key = "passKey";
    public static final String mobile_key = "mobileKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogout = findViewById(R.id.btnLogout);
        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvMobile = findViewById(R.id.tvMobile);

        SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
        String name,mobile,email;
        name = preferences.getString(name_key,"");
        email = preferences.getString(email_key,"");
        mobile = preferences.getString(mobile_key,"");

        tvName.setText("NAME: "+name);
        tvEmail.setText("EMAIL: "+email);
        tvMobile.setText("MOBILE: "+mobile);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                editor.commit();
                finish();
            }
        });
    }
}