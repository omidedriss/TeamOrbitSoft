package com.orbitsoft.teamorbitsoft.Kanani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.orbitsoft.teamorbitsoft.Gorji.Student;
import com.orbitsoft.teamorbitsoft.R;

import java.text.BreakIterator;
import java.text.StringCharacterIterator;

public class Kanani extends AppCompatActivity {

    private String name, family;
    private float hight;
    private long codemeli;
    private float weight, bmi, avg;
    private StringCharacterIterator mbmi;
    private int num1, num2, num3, num4;
    private StringCharacterIterator mavg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanani);
        //public void school(){
            Student S = new Student();
            S.setName(name);
            S.setFamily(family);
            S.setHight(Integer.valueOf((int) hight));
            S.setNationalCode(Integer.valueOf((int) codemeli));
            S.setWeight(Float.valueOf(weight));
            float bmi = S.getBmi();
            mbmi.setText(String.valueOf(bmi));
            float avg = S.calAvg(num1, num2, num3, num4);
            mavg.setText(String.valueOf(avg));
        }
    }