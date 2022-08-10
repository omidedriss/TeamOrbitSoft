package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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




        // ------------------------------------------------------------------------ نمایش اعداد  فرد

        for ( int i = 1 ; i <= 30 ; i++ )
        {
            if ( ( i % 2) =! 0 )
            {
                Log.d( " test 3 " , Integer.intoString(i)) ;
            }
        }




        // ------------------------------------------------------------------------جدول ضرب 100 تایی

        String table = "\n" ;
        string a , b ;
        for ( int i = 1 ; i <= 10 ; i++ )
        {
            for (int j = 1 ; j <= 10 ; j++ )
            {
                table = table + Integer.intoString( i * j ) + " " ;
            }
            table = table + "\n" ;
        }
        Log.d ( "test 4" , table ) ;



    }
}














