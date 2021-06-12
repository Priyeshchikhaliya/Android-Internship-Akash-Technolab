package com.example.phone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.Phone.R;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button call_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.etNumber);
        call_btn = (Button) findViewById(R.id.btnCall);
        call_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:" + et.getText().toString()));
                startActivity(i);
            }
        });
    }
}