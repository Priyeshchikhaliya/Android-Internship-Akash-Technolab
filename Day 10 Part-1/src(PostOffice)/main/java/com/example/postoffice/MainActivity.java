package com.example.postoffice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText to,sub,msg;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to = findViewById(R.id.to);
        sub = findViewById(R.id.sub);
        msg = findViewById(R.id.msg);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to1,subject,message;
                to1 = to.getText().toString();
                subject = sub.getText().toString();
                message = msg.getText().toString();

                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL,new String []{to1});
                i.putExtra(Intent.EXTRA_SUBJECT,new String []{subject});
                i.putExtra(Intent.EXTRA_TEXT,new String []{message});
                i.setType("message/rfc822");

                startActivity(Intent.createChooser(i,"Send Email:"));
            }
        });
    }
}