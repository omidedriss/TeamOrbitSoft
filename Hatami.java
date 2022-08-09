package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Hatami extends AppCompatActivity {
    TextView txt1;TextView txt2;
    int RNnum1=10,RNnum2=20,RNnum3=30,RNnum4=40,RNnum5=50,Rnnum6=60,all=0;
    String RESULT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_hatami);
        txt1 = findViewById (R.id.tx1);
        txt2 = findViewById (R.id.tx2);
        if (RNnum1 <= RNnum2) {
            all+=RNnum2;
            RESULT=all+"+";

        }if (all<=RNnum3){
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

    }
}