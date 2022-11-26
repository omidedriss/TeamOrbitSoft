package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class BackgroundServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_service);


        final TextView text = findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString().equals("Started")) {
                    text.setText("Stoped");
                    stopService(new Intent(BackgroundServiceActivity.this,MyService.class));
                } else {
                    text.setText("Started");
                    startService(new Intent(BackgroundServiceActivity.this,MyService.class));
                }
            }
        });

        final TextView text2 = findViewById(R.id.text2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text2.getText().toString().equals("Started")) {
                    text2.setText("Stoped");
                    stopService(new Intent(BackgroundServiceActivity.this,MyIntentService.class));
                } else {
                    text2.setText("Started");
                    startService(new Intent(BackgroundServiceActivity.this,MyIntentService.class));
                }
            }
        });

    }
}