package com.orbitsoft.teamorbitsoft.Nikkhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Nikkhu extends AppCompatActivity {
    TextView txt;
    Button bt1, bt2, bt3, btReturn;
    String[] messages= new String[]{"random number::","adade fard ::","jame Bozorgtareen Adad::"
            ,"+","=","miangeen 6 adad::","/6"};
    String space = "\t ";
    String newLine="\n\n\n\n";
    String newLine1="\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nikkhu);


        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        btReturn = findViewById(R.id.btReturn);

        bt1.setOnClickListener(v -> zarb());
        bt2.setOnClickListener(v -> adadeRandom());

        btReturn.setOnClickListener(v -> {
            Intent ints = new Intent(this, Nikkhu.class);
            startActivity(ints);

        });
    }


    //*********************************************************************************
    //*********************************************************************************

    // تایع ساخت ضرب اعداد
    public void zarb() {
        txt = findViewById(R.id.txt);
        StringBuilder st = new StringBuilder();

        String n = "\t ";
        String newLine="\n";

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {

                int s = i * j;
                st.append(s).append(n);
                txt.setText(st.toString());
            }
            st.append(newLine);

        }
    }

    //*****************************************************************************
    //*****************************************************************************


    public void adadeRandom(){
        txt = findViewById(R.id.txt);
        StringBuilder st = new StringBuilder();
        Random myRand =new Random();
        int[] myNumber =new int[20];
        int[] fard= new int[20];


        //*************************************************
        //********* sakht adaade random ta 20 adad*********
        for(int k=0;k<20;k++)
            myNumber[k] = myRand.nextInt(101);

        Arrays.sort(myNumber);
        st.append(messages[0]).append(newLine1);
        for(int k=0;k<20;k++) {

            st.append(myNumber[k]).append(space);
            txt.setText(st.toString());
        }



        //*************************************************
        //******** sakht  adad fard  **********************

        st.append(newLine).append(messages[1]).append(newLine1);

        for(int k=0;k<20;k++) {
            if (myNumber[k] % 2 != 0) {
                fard[k] = myNumber[k];
                st.append(fard[k]).append(space);
                txt.setText(st.toString());
            }

        }


        //*****************************************************
        //***************jame  bozorg tareen********************
        st.append(newLine).append(messages[2]).append(newLine1);

        int sum=myNumber[18]+myNumber[19];
        st.append(myNumber[18]).append(messages[3]).append(myNumber[19]).append(messages[4]).append(sum);
        txt.setText(st.toString());

        //*************************************************
        //************* average****************************





        st.append(newLine).append(messages[5]).append(newLine1);
        int ave=0;
        for(int k=1;k<7;k++){
            st.append(myNumber[k]).append(messages[3]);
            ave=+myNumber[k];

        }
        ave=(ave/6);
        st.append(messages[6]).append(messages[4]).append(ave);
        txt.setText(st.toString());
    }





}