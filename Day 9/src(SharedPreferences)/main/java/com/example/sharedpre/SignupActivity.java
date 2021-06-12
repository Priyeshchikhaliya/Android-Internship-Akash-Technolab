package com.example.sharedpre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    EditText etName,etEmail,etPass,etMobile;
    Button btnSignup;

    public static final String main_key = "myKey";
    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String pass_key = "passKey";
    public static final String mobile_key = "mobileKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
        etMobile = findViewById(R.id.etMobile);
        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
                String name,email,password,mobile;
                name = etName.getText().toString();
                email = etEmail.getText().toString();
                password = etPass.getText().toString();
                mobile = etMobile.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(name_key,name);
                editor.putString(email_key,email);
                editor.putString(pass_key,password);
                editor.putString(mobile_key,mobile);

                editor.commit();

                Intent i = new Intent(SignupActivity.this,SigninActivity.class);
                startActivity(i);

            }
        });
    }
}