package com.orbitsoft.teamorbitsoft.Mazaheri;

import static java.lang.Math.random;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

public class Mazaheri extends AppCompatActivity {
    TextView jad;
    Button btmazjadvis, btmazsix, btmazret,
                  btmazfard,btmazemail,btmazaverage,
                  btmazstudent,btmazstudent2,btmazstudent3,
                  btmazintent,btmaznamefamil,btmazstartonresult;
    @Override

    //بازگشت به صفحه اصلی
    //رفتن به صفحه اینتنت شامل شماره گیری سریع،شماره گیری دو مرحله ای، دفتر تلفن ،رجوع به سایت
    //ارسال نام با باندل و فامیل با اینتنت
    //مثالی از اجرای شرطی اینتنت
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_mazaheri);

        initialliz();

        //رفتن به صفحه اینتنت شامل شماره گیری سریع،شماره گیری دو مرحله ای، دفتر تلفن ،رجوع به سایت
     //   btmazintent.setOnClickListener(v -> {
     //       Intent imazintent=new Intent(Mazaheri.this, MazNewIntent.class);
     //       startActivity(imazintent);
     //   });
        //ارسال نام با باندل و فامیل با اینتنت
        btmaznamefamil.setOnClickListener(v -> {
            Intent imaznamefamil=new Intent(Mazaheri.this, MazGetNameFamil.class);
            startActivity(imaznamefamil);
        });
        //مثالی از اجرای شرطی اینتنت
        btmazstartonresult.setOnClickListener(v -> {
            Intent imazresult=new Intent(Mazaheri.this, MazStartForResult_firstActivity.class);
            startActivity(imazresult);
        });
        //بازگشت به صفحه اصلی
        btmazret.setOnClickListener(v -> {
            Intent imazret=new Intent(this, MainActivity.class);
            startActivity(imazret);
        });
    }
    //متد جدول ضرب
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
                    st = st + "     ";   // تنظیم سطر و ستون ها با توجه به تعداد ارقام هر عدد
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
    //متد مرتب سازی شش عدد
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
    // متد اعداد فرد
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
    //متد چسباندن اسم و فامیل
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
    // متد معدل گیری
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
    // متد دانش آموزان روش اول مقداردهی توسط سازنده
    public void mngstudent() {
        jad = findViewById(R.id.textView4maz);
        jad.setTextSize(14);
        String st="";
        Student_costractor st1=new Student_costractor("علی","احمدی",85.0f,140.0f,
                1000,17.5f,18.5f);
        Student_costractor st2=new Student_costractor("محمد","حیدری",95.0f,185.5f,
                1001,13.5f,14.5f);
        st=st+st1.show();
        st=st+st2.show();
        jad.setText(st);
    }
    // متد دانش آموزان روش دوم مقداردهی توسط متد
    public void mngstudent2() {
        jad = findViewById(R.id.textView4maz);
        jad.setTextSize(14);
        String st="";
        Student_through_method st1 = new Student_through_method();
        Student_through_method st2 = new Student_through_method();
        st1.insertRecord("حسن","احمدی",173.0f,70.0f,1000,17.5f,18.5f);
        st2.insertRecord("محمد","سلامی",175.0f,85.5f,1001,13.5f,14.5f);
        st=st+st1.show();
        st=st+st2.show();
        jad.setText(st);
    }
    //متد دانش آموزان روش سوم مقداردهی توسط رفرنس
    public void mngstudent3() {
        jad = findViewById(R.id.textView4maz);
        jad.setTextSize(14);
        String st="";
        Student_through_method st1 = new Student_through_method();
        Student_through_method st2 = new Student_through_method();
        st1.name="رضا";st1.family="خجسته";st1.height=160.0f;st1.weight=70.0f;st1.stunum=1000;st1.lesson1=17.5f;st1.lesson2=18.5f;
        st2.name="محسن";st2.family="صدری";st2.height=175.0f;st2.weight=75.5f;st2.stunum=1001;st2.lesson1=13.5f;st2.lesson2=14.5f;

        st=st+st1.show();
        st=st+st2.show();
        jad.setText(st);
    }
    //مقدار دهی اولیه کلیدها
    public void initialliz(){
        btmazsix=findViewById(R.id.btmazsix);
        btmazret=findViewById(R.id.btmazret);
        btmazfard=findViewById(R.id.btmazfard);
        btmazemail=findViewById(R.id.btmazemail);
        btmazjadvis=findViewById(R.id.btmazjadvis);
        btmazaverage=findViewById(R.id.btmazaverage);
        btmazstudent=findViewById(R.id.btmazstudent);
        btmazstudent2=findViewById(R.id.btmazstudent2);
        btmazstudent3=findViewById(R.id.btmazstudent3);
        btmazintent=findViewById(R.id.btmazintent);
        btmaznamefamil=findViewById(R.id.btmaznamefamil);
        btmazstartonresult=findViewById(R.id.btmazstartforresult);

        btmazstudent.setOnClickListener(v -> mngstudent());
        btmazstudent2.setOnClickListener(v -> mngstudent2());
        btmazstudent3.setOnClickListener(v -> mngstudent3());
        btmazaverage.setOnClickListener(v -> average());
        btmazemail.setOnClickListener(v -> concat());
        btmazsix.setOnClickListener(v -> sixgreat());
        btmazjadvis.setOnClickListener(v -> zarb());
        btmazfard.setOnClickListener(v -> fard());

    }

}

