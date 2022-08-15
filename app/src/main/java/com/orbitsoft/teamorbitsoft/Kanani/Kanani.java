package com.orbitsoft.teamorbitsoft.Kanani;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.Gorji.Student;
import com.orbitsoft.teamorbitsoft.R;

import java.text.StringCharacterIterator;

public class Kanani extends AppCompatActivity {
    Button b2,b1;
    private String name, family;
    private float hight;
    private long codemeli;
    private float weight, bmi, avg;
    private StringCharacterIterator mbmi;
    private int num1, num2, num3, num4;
    private StringCharacterIterator mavg;
    private Button button = (Button) findViewById(R.id.buttonCall);
    private Object tel;
    private Context ActivityCompat;

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

            //گرفتن شماره از contacts و نمایش آن
            setContentView(R.layout.activity_main);

            button = (Button) findViewById(R.id.buttonCall);

            button.setOnClickListener(new View.OnClickListener() {

                public void onClick(View arg0) {

                    Intent callIntent = new Intent(Intent.ACTION_CALL);

                    callIntent.setData(Uri.parse(“tel:0377778888”));

                    if (ActivityCompat.checkSelfPermission(MainActivity.this,

                            Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                        return;

                    }

                    startActivity(callIntent);

                }

            });

        }

    }
