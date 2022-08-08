package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Nikkhu extends AppCompatActivity {
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nikkhu);
        t1=findViewById(R.id.textView3);








        for ( int i=1;i<31;i++){
            if (i%2!=0)
                Toast.makeText(getApplicationContext(), String.valueOf(i),Toast.LENGTH_LONG).show();






        }







    }
}