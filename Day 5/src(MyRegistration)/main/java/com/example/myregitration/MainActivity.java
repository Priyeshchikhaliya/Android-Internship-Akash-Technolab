package com.example.myregitration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname,gender,email,mobile,hobbies;
                uname = et1.getText().toString();
                gender = et2.getText().toString();
                email = et3.getText().toString();
                mobile = et4.getText().toString();
                hobbies = et5.getText().toString();

                Intent i = new Intent(MainActivity.this,DisplayDataActivity.class);
                i.putExtra("uname",uname);
                i.putExtra("gender",gender);
                i.putExtra("email",email);
                i.putExtra("mobile",mobile);
                i.putExtra("hobbies",hobbies);
                startActivity(i);
            }
        });
    }
}