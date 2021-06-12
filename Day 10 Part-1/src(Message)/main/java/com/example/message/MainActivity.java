package com.example.message;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.telephony.SmsManager;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNumber,etMsg;
    Button btnSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNumber);
        etMsg = findViewById(R.id.etMsg);
        btnSMS = findViewById(R.id.btnSMS);

        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number,message;
                number = etNumber.getText().toString();
                message = etMsg.getText().toString();

                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(number,null,message,null,null);
                Toast.makeText(MainActivity.this, "Message Sent Successfully!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}