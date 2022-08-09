package com.example.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        double[] m = {20, 16, 17, 13};
        double result = 0;
        for (double i: m) {
            result += i;
        }
        double avarage = result / m.length;
        text.setText(String.valueOf(avarage));
    }
}