package com.orbitsoft.teamorbitsoft.Hatami;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class interface1 extends AppCompatActivity {
TextView mt;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface1);
        mt=findViewById(R.id.mytext);

        int r = 5;
       circle circle1=new circle();
       float g = circle1.getarea(r,0,0);
        mt.setText( Float.toString(g));



    }

}