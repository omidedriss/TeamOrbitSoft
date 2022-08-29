package com.orbitsoft.teamorbitsoft.Saeidian2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian2;

public class saeidian2_main extends AppCompatActivity {
    TextView c1;
    TextView c2;
    TextView c3;
    TextView c4;
    TextView c5;
    TextView c6;
    TextView c7;
    TextView c8;
    TextView c9;
    TextView c10;
    TextView c11;
    TextView c12;
    TextView c13;
    TextView c14;
    TextView c15;
    TextView c16;
    TextView c17;
    TextView c18;
    TextView c19;
    TextView c20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian2_main);
//        cans();
        TextView c1 = findViewById(R.id.c1);
        TextView c2 = findViewById(R.id.c2);
        TextView c3 = findViewById(R.id.c3);
        TextView c4 = findViewById(R.id.c4);
        TextView c5 = findViewById(R.id.c5);
        TextView c6 = findViewById(R.id.c6);
        TextView c7 = findViewById(R.id.c7);
        TextView c8 = findViewById(R.id.c8);
        TextView c9 = findViewById(R.id.c9);
        TextView c10 = findViewById(R.id.c10);
        TextView c11 = findViewById(R.id.c11);
        TextView c12 = findViewById(R.id.c12);
        TextView c13 = findViewById(R.id.c13);
        TextView c14 = findViewById(R.id.c14);
        TextView c15 = findViewById(R.id.c15);
        TextView c16 = findViewById(R.id.c16);
        TextView c17 = findViewById(R.id.c17);
        TextView c18 = findViewById(R.id.c18);
        TextView c19 = findViewById(R.id.c19);
        TextView c20 = findViewById(R.id.c20);


//        test_fact shayanfc=new test_fact();
//        int fc=shayanfc.test_fact(6);
//        Toast.makeText(saeidian2_main.this,Integer.toString(fc),Toast.LENGTH_LONG).show();

//        int x = fuc(4);
//        Toast.makeText(saeidian2_main.this, Integer.toString(x), Toast.LENGTH_LONG).show();

//    int b=1;
//    public int fuc(int a)
//    {
//        if(a==1)
//        {
//            return b;
//        }
//        else
//        {
//            b=b*a;
//            return fuc(a-1);
//        }
//
//    }
//    public void cans ()
//    {
//        test_cons shayan_cons = new test_cons("shayan","saeidian");
//        shayan_cons.setEmail("asv");
//        shayan_cons.setPass("1234");
//    }


        test_cons shayan_cons = new test_cons("shayan", "saeidian", "09173929711");
        test_cons abbas_cons = new test_cons("abass", "gorji", "09162020267");
        test_cons arian_cons = new test_cons("arian", "taheri", "09134332092");
        test_cons hossein_cons = new test_cons("hossein", "rahimi", "09136503775");
        test_cons ali_cons = new test_cons("ali", "rahmani", "09368115440");
        test_cons mohammad_cons = new test_cons("mohammad", "ziaei", "09138334887");
        test_cons amir_cons = new test_cons("amir", "kheirkhah", "09132101841");
        test_cons amirali_cons = new test_cons("amirali", "kabirian", "09140271959");
        test_cons pouria_bakhtiari = new test_cons("pouria", "bakhtiari", "09103493880");
        test_cons ashkan_cons = new test_cons("ashkan", "azimi", "09134333627");
        test_cons mikaeil_cons = new test_cons("mikaeil", "daneshfar", "09132362371");
        test_cons danial_cons = new test_cons("danial", "shafiei", "09028346273");
        test_cons erfan_cons = new test_cons("erfan", "dehghan", "09360189017");
        test_cons iman_cons = new test_cons("iman", "khodaei", "09134258818");
        test_cons kiarash_cons = new test_cons("kiarash", "kamyabi", "09390670054");
        test_cons saman_cons = new test_cons("saman", "saghafian", "09011360833");
        test_cons mehdi_cons = new test_cons("mehdi", "hosseini", "09330174760");
        test_cons nikan_cons = new test_cons("nikan", "khoshnam", "09160735766");
        test_cons sepehr_cons = new test_cons("sepehr", "soltani", "09368927161");
        test_cons sina_cons = new test_cons("sina", "zamani", "09379163053");


        String shayan=shayan_cons.name2+" "+shayan_cons.family2+"\n"+shayan_cons.phone2;
        String abbas=abbas_cons.name2+" "+abbas_cons.family2+"\n"+abbas_cons.phone2;
        String arian=arian_cons.name2+" "+arian_cons.family2+"\n"+arian_cons.phone2;
        String hossein=hossein_cons.name2+" "+hossein_cons.family2+"\n"+hossein_cons.phone2;
        String ali=ali_cons.name2+" "+ali_cons.family2+"\n"+ali_cons.phone2;
        String mohammad=mohammad_cons.name2+" "+mohammad_cons.family2+"\n"+mohammad_cons.phone2;
        String amir=amir_cons.name2+" "+amir_cons.family2+"\n"+amir_cons.phone2;
        String amirali=amirali_cons.name2+" "+amirali_cons.family2+"\n"+amirali_cons.phone2;
        String pouria=pouria_bakhtiari.name2+" "+pouria_bakhtiari.family2+"\n"+pouria_bakhtiari.phone2;
        String ashkan=ashkan_cons.name2+" "+ashkan_cons.family2+"\n"+ashkan_cons.phone2;
        String mikaeil=mikaeil_cons.name2+" "+mikaeil_cons.family2+"\n"+mikaeil_cons.phone2;
        String danial=danial_cons.name2+" "+danial_cons.family2+"\n"+danial_cons.phone2;
        String erfan=erfan_cons.name2+" "+erfan_cons.family2+"\n"+erfan_cons.phone2;
        String iman=iman_cons.name2+" "+iman_cons.family2+"\n"+iman_cons.phone2;
        String kiarash=kiarash_cons.name2+" "+kiarash_cons.family2+"\n"+kiarash_cons.phone2;
        String saman=saman_cons.name2+" "+saman_cons.family2+"\n"+saman_cons.phone2;
        String mehdi=mehdi_cons.name2+" "+mehdi_cons.family2+"\n"+mehdi_cons.phone2;
        String nikan=nikan_cons.name2+" "+nikan_cons.family2+"\n"+nikan_cons.phone2;
        String sepehr=sepehr_cons.name2+" "+sepehr_cons.family2+"\n"+sepehr_cons.phone2;
        String sina=sina_cons.name2+" "+sina_cons.family2+"\n"+sina_cons.phone2;

        c1.setText(shayan);
        c2.setText(abbas);
        c3.setText(arian);
        c4.setText(hossein);
        c5.setText(ali);
        c6.setText(mohammad);
        c7.setText(amir);
        c8.setText(amirali);
        c9.setText(pouria);
        c10.setText(ashkan);
        c11.setText(mikaeil);
        c12.setText(danial);
        c13.setText(erfan);
        c14.setText(iman);
        c15.setText(kiarash);
        c16.setText(saman);
        c17.setText(mehdi);
        c18.setText(nikan);
        c19.setText(sepehr);
        c20.setText(sina);

        c1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+shayan_cons.phone2));
            startActivity(i);
        });
        c2.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+abbas_cons.phone2));
            startActivity(i);
        });
        c3.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+arian_cons.phone2));
            startActivity(i);
        });
        c4.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+hossein_cons.phone2));
            startActivity(i);
        });
        c5.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+ali_cons.phone2));
            startActivity(i);
        });
        c7.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+amir_cons.phone2));
            startActivity(i);
        });
        c8.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+amirali_cons.phone2));
            startActivity(i);
        });
        c9.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+pouria_bakhtiari.phone2));
            startActivity(i);
        });
        c10.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+ashkan_cons.phone2));
            startActivity(i);
        });
        c11.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+mikaeil_cons.phone2));
            startActivity(i);
        });
        c12.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+danial_cons.phone2));
            startActivity(i);
        });
        c13.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+erfan_cons.phone2));
            startActivity(i);
        });
        c14.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+iman_cons.phone2));
            startActivity(i);
        });
        c15.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+kiarash_cons.phone2));
            startActivity(i);
        });
        c16.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+saman_cons.phone2));
            startActivity(i);
        });
        c17.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+mehdi_cons.phone2));
            startActivity(i);
        });
        c18.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+nikan_cons.phone2));
            startActivity(i);
        });
        c19.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+sepehr_cons.phone2));
            startActivity(i);
        });
        c20.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+sina_cons.phone2));
            startActivity(i);
        });
        c6.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+mohammad_cons.phone2));
            startActivity(i);
        });

    }
}


