package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;

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

            //**************************************
            // barnameye hasele jame adade bozorgtar

            Random myRand= new Random();
            int[] myNumber =new int[5];

            for(int k=0;k<5;k++)
                myNumber[k]=myRand.nextInt(100);

            Arrays.sort(myNumber);
            int sum=myNumber[3]+myNumber[4];

            for(int j=0;j<5;j++)
                Log.d("msg1",String.valueOf(j));
                Log.d("msg2",String.valueOf(sum));






        }







    }



}