package com.orbitsoft.teamorbitsoft.Moosavi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.orbitsoft.teamorbitsoft.R;

public class Moosavi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moosavi);



        // ---------------------------------------------------------------------- نمایش اسم و فامیل

        String name = " Shahriar " ;
        String lname = " Moosavi " ;
        String email = " \nricheous2kand@gmail.com " ;
        String full = name + lname + email ;
        Log.d( " test 1 " , full ) ;



        //----------------------------------------------------------------- محاسبه ی میانگین 4 عدد

        int resault ;
        int a, b, c, d ;
        a = 46 ;
        b = 94 ;
        c = 38 ;
        d = 62 ;
        resault = ( a + b + c + d) / 4 ;
        Log.d( " test 2 " , Integer.toString( resault ) );


    }
}