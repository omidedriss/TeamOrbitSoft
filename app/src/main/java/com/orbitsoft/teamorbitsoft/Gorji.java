package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Gorji extends AppCompatActivity {
int num1 = 10,num2=18,num3=85,num4=98,sum = 0 , n=11;
String st = "  ",st1="";
TextView average,fard,show,adadBozorgTar,satrr,sotunn,zarb1,zarb2,zarb3,zarb4,zarb5,zarb6,zarb7,zarb8,zarb9,zarb10;
    int[] number1 = new int[n];
    int[] number2 = new int[n];
    int[] number3 = new int[n];
    int[] number4 = new int[n];
    int[] number5 = new int[n];
    int[] number6 = new int[n];
    int[] number7 = new int[n];
    int[] number8 = new int[n];
    int[] number9 = new int[n];
    int[] number10 = new int[n];
    int[] sotun = new int[n];
    int[] satr = new int[n];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji);
        adadBozorgTar = findViewById(R.id.tv);
        fard=findViewById(R.id.tv_fard);
        average= findViewById(R.id.tv_average);
        zarb1=findViewById(R.id.tv1);
        zarb2=findViewById(R.id.tv2);
        zarb3=findViewById(R.id.tv3);
        zarb4=findViewById(R.id.tv4);
        zarb5=findViewById(R.id.tv5);
        zarb6=findViewById(R.id.tv6);
        zarb7=findViewById(R.id.tv7);
        zarb8=findViewById(R.id.tv8);
        zarb9=findViewById(R.id.tv9);
        zarb10=findViewById(R.id.tv10);
        satrr=findViewById(R.id.satr);
        sotunn=findViewById(R.id.sotun);
        show = findViewById(R.id.tv_show);
       Random random = new Random();// از این کلاس برای تولید اعداد تصادفی اصفاده میکنیم
        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        num3 = random.nextInt(100);
        num4 = random.nextInt(100);
        if(num1<num2 || num1 == num2){
            sum += num2;
           // st =sum +"+";
        }else {
            sum +=num1;
        }
        if(sum<num3){
            sum += num3;
            //st = st + num3+"=";
        }
        if(sum<num4 || sum == num4){
            sum += num4;
            //st = st + num4+"=";
        }else{
        if(num3<num4 || num3== num4){
            sum+=num4;
        }else{
            sum += num3;
        }
        }


        adadBozorgTar.setText(String.valueOf(sum));//برای نمایش جمع اعداد استفاده شده
        //tv.setText(st);// تمرین عدد بزرگ تر
      //تمرین جدول ضرب

        for (int i = 1; i <= 10; i++) {
            sotun[i]=i;
            st1 = st1 + i + " \n \n";

            sotunn.setText(st1);
        }
        for (int i = 1 ; i <= 10; i++){
            satr[i]=i;
            st = st + i + "     ";
            satrr.setText(st);
        }
        st = "  ";
        for (int i = 1 ; i<=10 ; i++){
            satr[i]=i;
            st = st + i + "     ";
            zarb1.setText(st);
        }
        st = "  ";
        for (int i =1;i<=10;i++){
            st = st + i *2  + "     ";
            zarb2.setText(st);
        }
        st = "  ";
        for (int i =1;i<=10;i++){
            st = st + i * 3  + "     ";
            zarb3.setText(st);
        }
        st = "  ";
        for (int i =1;i<=10;i++){
            st = st + i * 4  + "     ";
            zarb4.setText(st);
        }
        st = "  ";
        for (int i =1;i<=10;i++){
            st = st + i * 5  + "     ";
            zarb5.setText(st);
        }
        st = "  ";
        for (int i =1;i<=10;i++){
            st = st + i * 6  + "     ";
            zarb6.setText(st);
        }
        st = "  ";
        for (int i =1;i<=10;i++){
            st = st + i * 7  + "     ";
            zarb7.setText(st);
        }
        st = "  ";
        for (int i =1;i<=10;i++){
            st = st + i * 8  + "     ";
            zarb8.setText(st);
        }
        st = "  ";
        for (int i =1;i<=10;i++){
            st = st + i * 9  + "     ";
            zarb9.setText(st);
        }
        st = "  ";
        for (int i =1;i<=10;i++){
            st = st + i * 10  + "     ";
            zarb10.setText(st);
        }
        // تمرین چاپ اسم فامیل و ایمیل
        st="Abbas";
        st1="Gorji";
        show.setText(st+"\t"+st1+"\n"+"absgorji@gmail.com");
        //نمایش اعداد فرد تا 30
        st="";
        for(int j = 0; j<30 ;j++){
            if(j%2 != 0){
                st=st+j+"\t";
            }

    }
        fard.setText(st);//پایان تمری نعدد فرد
        //محاسبه میانگین
        st="";
        for(int i = 0;i<4;i++){
            number1[i] = random.nextInt(5);
            st = String.valueOf( number1[i]);
        }
        for (int i = 0 ; i <4;i++){
            number1[i]=number1[i];
        st = String.valueOf( number1[i]);
        }

        average.setText(st);
    }
}



