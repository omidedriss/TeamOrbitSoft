package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orbitsoft.teamorbitsoft.R;

public class BroadcastReceiversActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receivers);
        Button b = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.orbitsoft.CUSTOM_INTENT");
                sendBroadcast(intent);
            }
        });
    }

}