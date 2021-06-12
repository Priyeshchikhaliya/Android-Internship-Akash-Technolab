package com.example.sharedpre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity {

    EditText etEmail,etPass;
    Button btnSignin,btnSignup;

    public static final String main_key = "myKey";
    public static final String email_key = "emailKey";
    public static final String pass_key = "passKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
        btnSignup = findViewById(R.id.btnSignup);
        btnSignin = findViewById(R.id.btnSignin);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SigninActivity.this,SignupActivity.class);
                startActivity(i);
            }
        });

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
                String userEmail,userPass,email,password;
                userEmail = etEmail.getText().toString();
                userPass = etPass.getText().toString();

                email = preferences.getString(email_key,"");
                password = preferences.getString(pass_key,"");

                if(userEmail.equals(email) && userPass.equals(password)){
                    Intent i = new Intent(SigninActivity.this,MainActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(SigninActivity.this, "Invalid Email or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}