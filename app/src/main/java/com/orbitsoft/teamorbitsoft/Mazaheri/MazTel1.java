package com.orbitsoft.teamorbitsoft.Mazaheri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class MazTel1 extends AppCompatActivity {
TextView mazusertel1,mazusertel2,mazusertel3,mazusertel4,
        mazusertel5,mazusertel6,mazusertel7,mazusertel8,
        mazusertel9,mazusertel10,mazusertel11,mazusertel12,
        mazusertel13,mazusertel14,mazusertel15;
TextView c[]={mazusertel15};
String st=" salam";
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maz_tel1);

        initialliz();
        c[0]=mazusertel15;

        //استاتیک
        int viewArray[] = {R.id.mazusertel13};
        mazusertel13=findViewById(viewArray[0]);
        //دینامیک
        int id=getResources().getIdentifier("mazusertel" + String.valueOf("14"), "id", getPackageName());
        mazusertel14=findViewById(id);

        int id1=getResources().getIdentifier("mazusertel" + String.valueOf("14"), "id", getPackageName());
        c[0]=findViewById(id1);



        TextView themedViews[] = {mazusertel13};
        themedViews[0]=findViewById(viewArray[0]);

        Mazuser user13=new Mazuser("Reza","Nazari","09159129122");
        mazusertel13.setText(user13.getName()+"     "+user13.getFamil()+"\n"+user13.getNumber());

        newusers();

 //       int layoutID = getResources().getIdentifier("layout"+n, "layout", getPackageName());

    //    String[] textArray = {"mazusertel1","mazusertel2"};

     //   TextView title = null;
      //  TextView[] themedViews = new TextView[1];
//        for (int k = 13; k < 15; k++)
/*
        TextView themedViews1[] = {null};
            mazusertel13 = findViewById(getResources().getIdentifier("mazusertel" + String.valueOf("13"), "id", getPackageName()));
        themedViews1[0].setText("ff");

*/
    }

    public void initialliz(){



        mazusertel1=findViewById(R.id.mazusertel1);
        mazusertel1.setTextSize(24f);
        mazusertel1.setTypeface(null, Typeface.BOLD_ITALIC);
        mazusertel1.setTextColor(Color.rgb(0,200,0));
        mazusertel2=findViewById(R.id.mazusertel2);
        mazusertel2.setTextSize(24f);
        mazusertel2.setTypeface(null, Typeface.BOLD);
        mazusertel2.setTextColor(Color.parseColor("#00FF00"));
        mazusertel3=findViewById(R.id.mazusertel3);
        mazusertel3.setTextSize(24f);
        mazusertel3.setTypeface(null, Typeface.ITALIC);
        mazusertel3.setTextColor(Color.GREEN);
        mazusertel4=findViewById(R.id.mazusertel4);
        mazusertel4.setTextSize(24f);
        mazusertel4.setTextColor(0xFF00FF00);
        mazusertel5=findViewById(R.id.mazusertel5);
        mazusertel5.setTextSize(24f);
        mazusertel5.setTextColor(0xFF0000FF);
        mazusertel6=findViewById(R.id.mazusertel6);
        mazusertel6.setTextSize(24f);
        mazusertel7=findViewById(R.id.mazusertel7);
        mazusertel7.setTextSize(24f);
        mazusertel8=findViewById(R.id.mazusertel8);
        mazusertel8.setTextSize(24f);
        mazusertel9=findViewById(R.id.mazusertel9);
        mazusertel9.setTextSize(24f);
        mazusertel10=findViewById(R.id.mazusertel10);
        mazusertel10.setTextSize(24f);
        mazusertel11=findViewById(R.id.mazusertel11);
        mazusertel11.setTextSize(24f);
        mazusertel12=findViewById(R.id.mazusertel12);
        mazusertel12.setTextSize(24f);
    }
    public void newusers(){
        Mazuser user1=new Mazuser("Ali","Nori","09139139139");
        mazusertel1.setText(user1.getName()+"     "+user1.getFamil()+"\n"+user1.getNumber());
        Mazuser user2=new Mazuser("Alireza","Norosy","09139129122");
        mazusertel2.setText(user2.getName()+"     "+user2.getFamil()+"\n"+user2.getNumber());
        Mazuser user3=new Mazuser("Hasan","Salmani","09129139139");
        mazusertel3.setText(user3.getName()+"     "+user3.getFamil()+"\n"+user3.getNumber());
        Mazuser user4=new Mazuser("Reza","Nazari","09159129122");
        mazusertel4.setText(user4.getName()+"     "+user4.getFamil()+"\n"+user4.getNumber());
        Mazuser user5=new Mazuser("Ali","Nori","09139139139");
        mazusertel5.setText(user5.getName()+"     "+user5.getFamil()+"\n"+user5.getNumber());
        Mazuser user6=new Mazuser("Alireza","Norosy","09139129122");
        mazusertel6.setText(user6.getName()+"     "+user6.getFamil()+"\n"+user6.getNumber());
        Mazuser user7=new Mazuser("Hasan","Salmani","09129139139");
        mazusertel7.setText(user7.getName()+"     "+user7.getFamil()+"\n"+user7.getNumber());
        Mazuser user8=new Mazuser("Reza","Nazari","09159129122");
        mazusertel8.setText(user8.getName()+"     "+user8.getFamil()+"\n"+user8.getNumber());
        Mazuser user9=new Mazuser("Ali","Nori","09139139139");
        mazusertel9.setText(user9.getName()+"     "+user9.getFamil()+"\n"+user9.getNumber());
        Mazuser user10=new Mazuser("Alireza","Norosy","09139129122");
        mazusertel10.setText(user10.getName()+"     "+user10.getFamil()+"\n"+user10.getNumber());
        Mazuser user11=new Mazuser("Hasan","Salmani","09129139139");
        mazusertel11.setText(user11.getName()+"     "+user11.getFamil()+"\n"+user11.getNumber());
        Mazuser user12=new Mazuser("Reza","Nazari","09159129122");
        mazusertel12.setText(user12.getName()+"     "+user12.getFamil()+"\n"+user12.getNumber());

    }
}