package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btGorji;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btGorji = findViewById(R.id.btactivity_gorji);
        btGorji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gorji = new Intent(getApplicationContext(),Gorji.class);
                startActivity(gorji);

            }
        });

    }
}