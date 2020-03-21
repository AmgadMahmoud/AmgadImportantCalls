package com.example.amgad.amgadimportantcalls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send (View v){
        EditText e1 = findViewById(R.id.editText_phoneNumber);
        String e2 = e1.getText().toString();
        EditText m1 = findViewById(R.id.editText_message);
        String message = m1.getText().toString();
        SmsManager.getDefault().sendTextMessage(e2,null,message,null,null);

    }
}