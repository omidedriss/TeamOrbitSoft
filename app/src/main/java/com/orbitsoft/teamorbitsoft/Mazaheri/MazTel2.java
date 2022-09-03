package com.orbitsoft.teamorbitsoft.Mazaheri;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;
import java.util.List;

public class MazTel2 extends AppCompatActivity {
    TextView mazusertel1,mazusertel2,mazusertel3,mazusertel4,
            mazusertel5,mazusertel6,mazusertel7,mazusertel8,
            mazusertel9,mazusertel10,mazusertel11,mazusertel12,
            mazusertel13,mazusertel14,mazusertel15;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maz_tel2);

        initialliz2();

        newusers2();

    }


    public void  initialliz2(){
        //استاتیک

        List<Mazuser> list=new ArrayList<Mazuser>();

        int viewArray[] = {R.id.mazusertel1,R.id.mazusertel2,R.id.mazusertel3,
                R.id.mazusertel4,R.id.mazusertel5,R.id.mazusertel6,
                R.id.mazusertel7,R.id.mazusertel8,R.id.mazusertel9,
                R.id.mazusertel10,R.id.mazusertel11,R.id.mazusertel12,
                };

        mazusertel1=findViewById(viewArray[0]);
        mazusertel2=findViewById(viewArray[1]);
        mazusertel3=findViewById(viewArray[2]);
        mazusertel4=findViewById(viewArray[3]);
        mazusertel5=findViewById(viewArray[4]);
        mazusertel6=findViewById(viewArray[5]);
        mazusertel7=findViewById(viewArray[6]);
        mazusertel8=findViewById(viewArray[7]);
        mazusertel9=findViewById(viewArray[8]);
        mazusertel10=findViewById(viewArray[9]);
        mazusertel11=findViewById(viewArray[10]);
        mazusertel12=findViewById(viewArray[11]);

    }

    public void newusers2(){

        //ایجاد اری لیست یوزرها
        List<Mazuser> list=new ArrayList<Mazuser>();
        //ایجاد یوزرها
        Mazuser user1=new Mazuser("Ali","Nori","09139139139");
        Mazuser user2=new Mazuser("Alireza","Norosy","09139129122");
        Mazuser user3=new Mazuser("Hasan","Salmani","09129139139");
        Mazuser user4=new Mazuser("Reza","Nazari","09159129122");
        Mazuser user5=new Mazuser("Ali","Nori","09139139139");
        Mazuser user6=new Mazuser("Alireza","Norosy","09139129122");
        Mazuser user7=new Mazuser("Hasan","Salmani","09129139139");
        Mazuser user8=new Mazuser("Reza","Nazari","09159129122");
        Mazuser user9=new Mazuser("Ali","Nori","09139139139");
        Mazuser user10=new Mazuser("Alireza","Norosy","09139129122");
        Mazuser user11=new Mazuser("Hasan","Salmani","09129139139");
        Mazuser user12=new Mazuser("Reza","Nazari","09159129122");


        //اضافه کردن یوزرها به لیست
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);
        list.add(user10);
        list.add(user11);
        list.add(user12);

        //جاگذاری یوزرها در دفتر تلفن و نمایش آن
      //  for(Mazuser b:list){
            mazusertel1.setText(user1.getName()+"     "+user1.getFamil()+"\n"+user1.getNumber());
            mazusertel2.setText(user2.getName()+"     "+user2.getFamil()+"\n"+user2.getNumber());
            mazusertel3.setText(user3.getName()+"     "+user3.getFamil()+"\n"+user3.getNumber());
            mazusertel4.setText(user4.getName()+"     "+user4.getFamil()+"\n"+user4.getNumber());
            mazusertel5.setText(user5.getName()+"     "+user5.getFamil()+"\n"+user5.getNumber());
            mazusertel6.setText(user6.getName()+"     "+user6.getFamil()+"\n"+user6.getNumber());
            mazusertel7.setText(user7.getName()+"     "+user7.getFamil()+"\n"+user7.getNumber());
            mazusertel8.setText(user8.getName()+"     "+user8.getFamil()+"\n"+user8.getNumber());
            mazusertel9.setText(user9.getName()+"     "+user9.getFamil()+"\n"+user9.getNumber());
            mazusertel10.setText(user10.getName()+"     "+user10.getFamil()+"\n"+user10.getNumber());
            mazusertel11.setText(user11.getName()+"     "+user11.getFamil()+"\n"+user11.getNumber());
            mazusertel12.setText(user12.getName()+"     "+user12.getFamil()+"\n"+user12.getNumber());
     //   }


    }
}


