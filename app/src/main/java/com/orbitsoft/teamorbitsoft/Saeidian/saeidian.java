package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;


public class saeidian extends AppCompatActivity {
    TextView shayan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saaidian);
        shayan = findViewById(R.id.textView);
        thesheox student = new thesheox();
        student.setName("shayan");
        student.setFamily("saeidain");
        student.setWeight(100);
        student.setHeight(1.75F);
        student.setNumber(111);
        //
student.setBmi(student.getWeight()/ student.getHeight()/student.getHeight());
student.setAvg((student.getS1()+student.getS2()+student.getS3()+student.getS4()+student.getS5()+student.getS6()+student.getS7())/7);

        shayan.setText("idnumber : "+student.getNumber()+"\n"+"name : "+student.getName() + "\n"+"family : "+student.getFamily()+ "\n"+"height : "+student.getHeight()+ "\n"+"weight : "+student.getWeight()+"avg : "+student.getAvg()+"\n"+"bmi : "+student.getBmi());


    }
}