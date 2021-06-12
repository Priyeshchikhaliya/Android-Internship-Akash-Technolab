package com.example.summation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1 , et2;
    Button btn1;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btn1 = findViewById(R.id.btn1);
        ans = findViewById(R.id.ans);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = et1.getText().toString();
                String n2 = et2.getText().toString();

                int num1,num2,sum;
                num1 = Integer.parseInt(n1);
                num2 = Integer.parseInt(n2);

                sum = num1+num2;
                ans.setText("The Sum is: "+String.valueOf(sum));
            }
        });
    }
}