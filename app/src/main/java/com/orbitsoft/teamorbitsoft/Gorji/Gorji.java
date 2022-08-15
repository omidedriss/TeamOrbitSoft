package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class Gorji extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
float num1 =0;
    float num2=1;
    float num3=2;
    float num4=3;
    int num5=4;
    /*int num1 = 10,num2=18,num3=85,num4=98,sum = 0 , n=11;
String st = "  ",st1="";
TextView average,fard,show,adadBozorgTar,satrr,sotunn,zarb1,zarb2,zarb3,zarb4,zarb5,zarb6,zarb7,zarb8,zarb9,zarb10;
   */
    String name = "1",family="",hight,nationalCode1,weight;
    //int hight,nationalCode1;

    Button ok;
    TextView mavg , mbmi , showAvg ,showBmi;
    EditText ename,efamily,eweight,ehight,ecationalcod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji);
        Bundle bundle = getIntent().getExtras();




        /* adadBozorgTar = findViewById(R.id.tv);
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
        st1= "Gorji";
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
        num1 = random.nextInt(100);
        num2 = random.nextInt(100);
        num3 = random.nextInt(100);
        num4 = random.nextInt(100);
        sum = 0;

        sum = num1+num2+num3+num4;
        sum = sum/4;
        st = String.valueOf(sum);

        average.setText(st);*/ // تمرین اول
        mbmi = findViewById(R.id.tv_show);
        mavg = findViewById(R.id.tv_average);
        ename = findViewById(R.id.eName);
        efamily=findViewById(R.id.eFamily);
        ecationalcod=findViewById(R.id.nationalCod);
        eweight = findViewById(R.id.eWeight);
        ehight=findViewById(R.id.ehight);
        ok = findViewById(R.id.accept);
        ok.setOnClickListener(this);
        ok.setOnLongClickListener(this);
        showAvg = findViewById(R.id.tv1);
        showBmi=findViewById(R.id.tv_fard);
        Toast.makeText(getApplicationContext(),"onrCeate",Toast.LENGTH_LONG).show();

    }

    //متد برای فراخوانی کلاس student
    public void school(){
        Student huaman = new Student();
        huaman.setName(name);
        huaman.setFamily(family);
        huaman.setHight(Integer.valueOf(hight));
        huaman.setNationalCode(Integer.valueOf(nationalCode1));
        huaman.setWeight(Float.valueOf(weight));
        float bmi = huaman.getBmi();
        mbmi.setText(String.valueOf(bmi));
        float avg = huaman.calAvg(num1,num2,num3,num4);
        mavg.setText(String.valueOf(avg));
    }

    @Override
    public void onClick(View v) {
        name=ename.getText().toString().trim();
        family=efamily.getText().toString().trim();
        weight=eweight.getText().toString().trim();
        hight=ehight.getText().toString().trim();
        nationalCode1=ecationalcod.getText().toString().trim();
        ename.setText(name+"\t"+family);
        ehight.setText("");
        eweight.setText("");
        ecationalcod.setText("");
        efamily.setText("");
        efamily.setHint("num1");
        eweight.setText("");
        eweight.setHint("num2");
        ehight.setText("");
        ehight.setHint("num3");
        ecationalcod.setText("");
        ecationalcod.setHint("num4");
        showBmi.setText("بعد از وارد کردن اعداد روی دکمه کلیک طولانی کنید");
        showBmi.setTextSize(28f);
       /* for(int i =0 ;i<=4;i++) {
            Toast.makeText(getApplicationContext(), "for run", Toast.LENGTH_LONG).show();
            if (num1==0){
            Toast.makeText(getApplicationContext(),"name run",Toast.LENGTH_LONG).show();
            name = entry.getText().toString();
            entry.setText("");
            num1+=1;
        }
            else
                Toast.makeText(getApplicationContext(),"else run",Toast.LENGTH_LONG).show();
        ;
        if(num2==1){
            entry.setHint("Family");
            Toast.makeText(getApplicationContext(),"fami run",Toast.LENGTH_LONG).show();
            family = entry.getText().toString();
            entry.setText("");
            num2+=1;
        }else
            Toast.makeText(getApplicationContext(),"else run",Toast.LENGTH_LONG).show();

        if(num3==2){
            entry.setHint("Hight");
            Toast.makeText(getApplicationContext(),"قد",Toast.LENGTH_LONG).show();
            entry.setInputType(3);
            hight = entry.getText().toString();
            entry.setText("");
            num3+=1;
        }else
            Toast.makeText(getApplicationContext(),"else run",Toast.LENGTH_LONG).show();

        if(num4==3){
            entry.setHint("Nationalcod");
            entry.setInputType(3);
            nationalCode1=entry.getText().toString();
            entry.setText("");
            num4+=1;
        }else
            Toast.makeText(getApplicationContext(),"else run",Toast.LENGTH_LONG).show();

        if(num5==4){
            entry.setHint("Weight");
            entry.setInputType(3);
            weight = entry.getText().toString();
            entry.setText("");
            num5+=1;

        }
        else
            Toast.makeText(getApplicationContext(),"else run",Toast.LENGTH_LONG).show();

    }//end for */
       /* for(int i = 0 ;i<=4;i++) {
            switch (i) {
                case 0:
                    Toast.makeText(getApplicationContext(), "name run", Toast.LENGTH_LONG).show();
                    name = entry.getText().toString();
                    entry.setText("");
                    break;
                case 1:
                    entry.setHint("Family");
                    Toast.makeText(getApplicationContext(), "fami run", Toast.LENGTH_LONG).show();
                    family = entry.getText().toString();
                    entry.setText("");
                    break;
                case 2:
                    entry.setHint("Hight");
                    Toast.makeText(getApplicationContext(), "قد", Toast.LENGTH_LONG).show();
                    entry.setInputType(3);
                    hight = entry.getText().toString();
                    entry.setText("");
                    break;
                case 3:
                    entry.setHint("Nationalcod");
                    entry.setInputType(3);
                    nationalCode1 = entry.getText().toString();
                    entry.setText("");
                    i++;
                    break;
                case 4:
                    entry.setHint("Weight");
                    entry.setInputType(3);
                    weight = entry.getText().toString();
                    entry.setText("");
                    break;
                default:
                    break;
            }
        }*/
    }



    @Override
    public boolean onLongClick(View v) {
        num1=Float.valueOf(efamily.getText().toString());
        num2=Float.valueOf(eweight.getText().toString());
        num3=Float.valueOf(ehight.getText().toString());
        num4=Float.valueOf(ecationalcod.getText().toString());
        efamily.setVisibility(View.INVISIBLE);
        ecationalcod.setVisibility(View.INVISIBLE);
        eweight.setVisibility(View.INVISIBLE);
        ehight.setVisibility(View.INVISIBLE);
        showAvg.setText(name +"\t"+family+"\t"+"Averagr");
        showBmi.setText(name +"\n"+family+"\t"+"Bmi");
        showBmi.setTextSize(14f);
        school ();
        return true;

    }
}



