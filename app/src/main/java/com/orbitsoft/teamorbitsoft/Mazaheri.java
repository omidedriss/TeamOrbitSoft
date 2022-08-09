package com.orbitsoft.teamorbitsoft;

import static java.lang.Math.random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Mazaheri extends AppCompatActivity {
TextView jad,txt;
Button btmazret,btmazjadvis,btmazsix,btmazfard,btmazemail,btmazaverage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazaheri);

        btmazret=findViewById(R.id.btmazret);
        btmazjadvis=findViewById(R.id.btmazjadvis);
        btmazsix=findViewById(R.id.btmazsix);
        btmazfard=findViewById(R.id.btmazfard);
        btmazemail=findViewById(R.id.btmazemail);
        btmazaverage=findViewById(R.id.btmazaverage);

        btmazaverage.setOnClickListener(v -> {
            average();
        });
        btmazemail.setOnClickListener(v -> {
            concat();
        });
        btmazsix.setOnClickListener(v -> {
            sixgreat();
        });
        btmazfard.setOnClickListener(v -> {
            fard();
        });
        btmazjadvis.setOnClickListener(v -> {
            zarb();
        });

        btmazret.setOnClickListener(v -> {
            Intent imazret=new Intent(this,MainActivity.class);
            startActivity(imazret);
        });




    }

    public void zarb() {
        jad = findViewById(R.id.textView4maz);
        String tv = "";
        String st = "";
        int zar = 1;
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 11; j++) {
                zar = (i - 1) * (j - 1);
                if (i == 1 && j > 1) {
                    zar = j - 1;
                }
                if (i > 1 && j == 1) {
                    zar = i - 1;
                }
                if (i == 1 && j == 1) {
                    st = "x     ";
                } else {
                    st = String.valueOf(zar);
                }
                if (st.length() == 1) {
                    st = st + "     ";
                }
                if (st.length() == 2) {
                    st = st + "   ";
                }
                tv = tv + " " + st;
            }
            tv = tv + "\n\n";
        }
        jad.setText(tv);
    }
        public void sixgreat() {
            jad = findViewById(R.id.textView4maz);
            int[] rnum = new int[6];

            String tv = "";
            String st = "";
            jad.setText(tv);

            int min = 200;
            int max = 400;
            int temp = 0;


            for (int i = 0; i <= 5; i++) {


                rnum[i] = (int) (random() * (max - min + 1) + min);

            }

            for (int i = 0; i <= 5; i++) {

                for (int j = i + 1; j <= 5; j++) {
                    if (rnum[i] < rnum[j]) {
                        temp = rnum[i];
                        rnum[i] = rnum[j];
                        rnum[j] = temp;

                    }
                }


            }

            for (int i = 0; i <= 5; i++) {

                st = String.valueOf(rnum[i]);


                tv = tv + " " + st;
            }
            tv = tv + "\n\n";
            tv = tv + "Last Two Great : " + rnum[0] + " " + rnum[1];
            tv = tv + "\n\n";
            int sum = rnum[0] + rnum[1];

            tv = tv + "Sum Is : " + String.valueOf(sum);
            jad.setText(tv);


        }
        public void fard(){
            jad = findViewById(R.id.textView4maz);

            String tv = "";
            String st = "";
            for(int i=1;i<=30;i++){
                if(i%2==1){
                    st = String.valueOf(i);
                    tv = tv + " , " + st;
                }
            }
            jad.setText(tv);
        }
        public void concat(){
            jad = findViewById(R.id.textView4maz);

            String tv = "";
            String st = "";
            String name="حسن";
            String famil="نوری";
            String name_famil=name + " " + famil;
            String email="hasan@gmail.com";

            st=name;
            tv=tv+st;
            tv = tv + "\n\n";

            st=famil;
            tv=tv+st;
            tv = tv + "\n\n";



            tv=tv+name_famil;

            tv = tv + "\n\n";

            tv=tv +email;

            jad.setText(tv);




        }
        public void average(){

            jad = findViewById(R.id.textView4maz);
            float[] avenum = new float[6];

            String tv = "";
            String st = "";
            jad.setText(tv);

            float min = 200.0f;
            float max = 400.0f;
            float ave = 0.0f;
            float sum = 0.0f;

            for (int i = 0; i <= 5; i++) {


                avenum[i] = (int) (random() * (max - min + 1) + min);

            }
            for (int i = 0; i <= 5; i++) {


                sum +=avenum[i] ;

                tv = tv + " , " + Float.toString(avenum[i]); ;

            }
            ave=sum/6;

             st=Float.toString(ave);

            tv = tv + "\n\n"+"Average :";

             tv=tv+st;

            tv = tv + "\n\n";

            jad.setText(tv);
        }

    }

