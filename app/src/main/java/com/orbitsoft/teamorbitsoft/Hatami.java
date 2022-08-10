package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Hatami extends AppCompatActivity {
    TextView txt1;TextView txt2;
    //txt3 is for next practice
    TextView txt3;
    //txt4 is for next practice
    TextView txt4;
    //txt5 is for next practice
    TextView txt5;
    int RNnum1=10,RNnum2=20,RNnum3=30,RNnum4=40,RNnum5=50,Rnnum6=60,all=0;
    int i=1;
    String RESULT;
    private int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_hatami);
        txt1 = findViewById (R.id.tx1);
        txt2 = findViewById (R.id.tx2);
        txt3 = findViewById (R.id.tx3);
        txt4 = findViewById (R.id.tx4);
        txt5 = findViewById (R.id.tx5);
        // for multiplication
        String tx="";
        String jadval="";
        String y =String.valueOf (0);


        if (RNnum1 <= RNnum2) {
            all+=RNnum2;
            RESULT=all+"+";

        }
        if (all<=RNnum3){
            all+=RNnum3;
            RESULT=RESULT+"=";

        }if (all<=RNnum4){
            all+=RNnum4;
            RESULT=RESULT+"=";
        }
        if (all<=RNnum5){
            all+=RNnum5;
            RESULT=RESULT+"=";
        }
        if (all<=Rnnum6){
            all+=Rnnum6;
            RESULT=RESULT+"=";
        }else {RESULT=RESULT+Rnnum6+"=";
            txt1.setText (String.valueOf (all));

        }
        txt2.setText (String.valueOf (RESULT));


        double[] x={10, 20, 30, 40};
        double all=0;
        for(double i: x) {
            all += i;

        }
        double avrage =all/x.length;
        txt3.setText (String.valueOf (avrage));


//        while(i<=30){
//            y = y + i +"\n";
//
//            Log.d ("text",Integer.toString (i));
//            i =1+2;
//        }
        zarb();

            }

            public void zarb(){
        String jadval="";
          //      int ii=0;
            //    int jj=0;
                for( int i=1;i<=10;i++);{
                    for( int jj=1;jj<=10;jj++);{

                        jadval=jadval+i+"*" + j+"=" +i*j +"\n";

                    }
                    jadval+= jadval+"\n";

                }
                txt5.setText (jadval);

            }
}

