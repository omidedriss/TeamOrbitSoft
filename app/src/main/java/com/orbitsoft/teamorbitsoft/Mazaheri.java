package com.orbitsoft.teamorbitsoft;

import static java.lang.Math.random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;



public class Mazaheri extends AppCompatActivity {
TextView jad;
    public Button btmazjadvis, btmazsix, btmazret,btmazfard,btmazemail,btmazaverage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazaheri);

        btmazsix=findViewById(R.id.btmazsix);
        btmazret=findViewById(R.id.btmazret);
        btmazfard=findViewById(R.id.btmazfard);
        btmazemail=findViewById(R.id.btmazemail);
        btmazjadvis=findViewById(R.id.btmazjadvis);
        btmazaverage=findViewById(R.id.btmazaverage);
        btmazaverage.setOnClickListener(v -> average());
        btmazemail.setOnClickListener(v -> concat());
        btmazsix.setOnClickListener(v -> sixgreat());
        btmazjadvis.setOnClickListener(v -> zarb());
        btmazfard.setOnClickListener(v -> fard());

        btmazret.setOnClickListener(v -> {
            Intent imazret=new Intent(this,MainActivity.class);
            startActivity(imazret);
        });
    }

    public void zarb() {
        jad = findViewById(R.id.textView4maz);
        jad.setTextSize(14);
        StringBuilder tv = new StringBuilder();
        String st;
        int zar;
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
                tv.append(" ").append(st);
            }
            tv.append("\n\n");
        }
        jad.setText(tv.toString());
    }
        public void sixgreat() {
            jad = findViewById(R.id.textView4maz);
            jad.setTextSize(20);
            int[] rnum = new int[6];

            StringBuilder tv = new StringBuilder();
            String st;
            jad.setText(tv.toString());

            int min = 200;
            int max = 400;
            int temp;


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


                tv.append(" ").append(st);
            }
            tv.append("\n\n");
            tv.append("Last Two Great : ").append(rnum[0]).append(" ").append(rnum[1]);
            tv.append("\n\n");
            int sum = rnum[0] + rnum[1];

            tv.append("Sum Is : ").append(sum);
            jad.setText(tv.toString());


        }
        public void fard(){
            jad = findViewById(R.id.textView4maz);
            jad.setTextSize(14);
            StringBuilder tv = new StringBuilder();
            String st;
            for(int i=1;i<=30;i++){
                if(i%2==1){
                    st = String.valueOf(i);
                    tv.append(" , ").append(st);
                }
            }
            jad.setText(tv.toString());
        }
        public void concat(){
            jad = findViewById(R.id.textView4maz);
            jad.setTextSize(20);
            String tv = "";
            String st;
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
            jad.setTextSize(16);
            float[] avenum = new float[6];

            StringBuilder tv = new StringBuilder();
            String st;
            jad.setText(tv.toString());

            float min = 200.0f;
            float max = 400.0f;
            float ave;
            float sum = 0.0f;

            for (int i = 0; i <= 5; i++) {


                avenum[i] = (int) (random() * (max - min + 1) + min);

            }
            for (int i = 0; i <= 5; i++) {


                sum +=avenum[i] ;

                tv.append(" , ").append(avenum[i]);

            }
            ave=sum/6;

             st=Float.toString(ave);

            tv.append("\n\n").append("Average :");

             tv.append(st);

            tv.append("\n\n");

            jad.setText(tv.toString());
        }

    }

