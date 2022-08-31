package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class saeidian_custom_contact extends AppCompatActivity {
    TextView c1, c2,c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20;
    TextView u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,u13,u14,u15,u16,u17,u18,u19,u20;
    Button a1, b1, d1, e1, f1, g1, h1, i1, j1, y1, k1, l1, m1, n1, o1, p1, q1, r1, s1, t1;
    Button a2, b2, d2, e2, f2, g2, h2, i2, j2, y2, k2, l2, m2, n2, o2, p2, q2, r2, s2, t2;
    Button a3, b3, d3, e3, f3, g3, h3, i3, j3, y3, k3, l3, m3, n3, o3, p3, q3, r3, s3, t3;
    String aa;
    int aa1, aa2, aa3, aa4, aa5, aa6, aa7, aa8, aa9, aa10, aa11, aa12, aa13, aa14, aa15, aa16, aa17, aa18, aa19, aa20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_custom_contact);
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

        TextView u1 = findViewById(R.id.u1);
        TextView u2 = findViewById(R.id.u2);
        TextView u3 = findViewById(R.id.u3);
        TextView u4 = findViewById(R.id.u4);
        TextView u5 = findViewById(R.id.u5);
        TextView u6 = findViewById(R.id.u6);
        TextView u7 = findViewById(R.id.u7);
        TextView u8 = findViewById(R.id.u8);
        TextView u9 = findViewById(R.id.u9);
        TextView u10 = findViewById(R.id.u10);
        TextView u11 = findViewById(R.id.u11);
        TextView u12 = findViewById(R.id.u12);
        TextView u13 = findViewById(R.id.u13);
        TextView u14 = findViewById(R.id.u14);
        TextView u15 = findViewById(R.id.u15);
        TextView u16 = findViewById(R.id.u16);
        TextView u17 = findViewById(R.id.u17);
        TextView u18 = findViewById(R.id.u18);
        TextView u19 = findViewById(R.id.u19);
        TextView u20 = findViewById(R.id.u20);

        Button a1 = (Button) findViewById(R.id.a1);
        Button b1 = (Button) findViewById(R.id.b1);
        Button d1 = (Button) findViewById(R.id.d1);
        Button e1 = (Button) findViewById(R.id.e1);
        Button f1 = (Button) findViewById(R.id.f1);
        Button g1 = (Button) findViewById(R.id.g1);
        Button h1 = (Button) findViewById(R.id.h1);
        Button i1 = (Button) findViewById(R.id.i1);
        Button j1 = (Button) findViewById(R.id.j1);
        Button y1 = (Button) findViewById(R.id.y1);
        Button k1 = (Button) findViewById(R.id.k1);
        Button l1 = (Button) findViewById(R.id.l1);
        Button m1 = (Button) findViewById(R.id.m1);
        Button n1 = (Button) findViewById(R.id.n1);
        Button o1 = (Button) findViewById(R.id.o1);
        Button p1 = (Button) findViewById(R.id.p1);
        Button q1 = (Button) findViewById(R.id.q1);
        Button r1 = (Button) findViewById(R.id.r1);
        Button s1 = (Button) findViewById(R.id.s1);
        Button t1 = (Button) findViewById(R.id.t1);

        Button a2 = (Button) findViewById(R.id.a2);
        Button b2 = (Button) findViewById(R.id.b2);
        Button d2 = (Button) findViewById(R.id.d2);
        Button e2 = (Button) findViewById(R.id.e2);
        Button f2 = (Button) findViewById(R.id.f2);
        Button g2 = (Button) findViewById(R.id.g2);
        Button h2 = (Button) findViewById(R.id.h2);
        Button i2 = (Button) findViewById(R.id.i2);
        Button j2 = (Button) findViewById(R.id.j2);
        Button y2 = (Button) findViewById(R.id.y2);
        Button k2 = (Button) findViewById(R.id.k2);
        Button l2 = (Button) findViewById(R.id.l2);
        Button m2 = (Button) findViewById(R.id.m2);
        Button n2 = (Button) findViewById(R.id.n2);
        Button o2 = (Button) findViewById(R.id.o2);
        Button p2 = (Button) findViewById(R.id.p2);
        Button q2 = (Button) findViewById(R.id.q2);
        Button r2 = (Button) findViewById(R.id.r2);
        Button s2 = (Button) findViewById(R.id.s2);
        Button t2 = (Button) findViewById(R.id.t2);

        Button a3 = (Button) findViewById(R.id.a3);
        Button b3 = (Button) findViewById(R.id.b3);
        Button d3 = (Button) findViewById(R.id.d3);
        Button e3 = (Button) findViewById(R.id.e3);
        Button f3 = (Button) findViewById(R.id.f3);
        Button g3 = (Button) findViewById(R.id.g3);
        Button h3 = (Button) findViewById(R.id.h3);
        Button i3 = (Button) findViewById(R.id.i3);
        Button j3 = (Button) findViewById(R.id.j3);
        Button y3 = (Button) findViewById(R.id.y3);
        Button k3 = (Button) findViewById(R.id.k3);
        Button l3 = (Button) findViewById(R.id.l3);
        Button m3 = (Button) findViewById(R.id.m3);
        Button n3 = (Button) findViewById(R.id.n3);
        Button o3 = (Button) findViewById(R.id.o3);
        Button p3 = (Button) findViewById(R.id.p3);
        Button q3 = (Button) findViewById(R.id.q3);
        Button r3 = (Button) findViewById(R.id.r3);
        Button s3 = (Button) findViewById(R.id.s3);
        Button t3 = (Button) findViewById(R.id.t3);


        test_cons shayan_cons = new test_cons("shayan", "saeidian", "09173929711");
        test_cons abbas_cons = new test_cons("abass", "gorji", "09162020267");
        test_cons arian_cons = new test_cons("arian", "taheri", "09134332092");
        test_cons hossein_cons = new test_cons("hossein", "rahimi", "09136503775");
        test_cons ali_cons = new test_cons("ali", "rahmani", "09368115440");
        test_cons mohammad_cons = new test_cons("mohammad", "ziaei", "09138334887");
        test_cons amir_cons = new test_cons("amir", "kheirkhah", "09132101841");
        test_cons amirali_cons = new test_cons("amirali", "kabirian", "09140271959");
        test_cons pouria_cons = new test_cons("pouria", "bakhtiari", "09103493880");
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


        String shayan=shayan_cons.name2+" "+shayan_cons.family2;
        String abbas=abbas_cons.name2+" "+abbas_cons.family2;
        String arian=arian_cons.name2+" "+arian_cons.family2;
        String hossein=hossein_cons.name2+" "+hossein_cons.family2;
        String ali=ali_cons.name2+" "+ali_cons.family2;
        String mohammad=mohammad_cons.name2+" "+mohammad_cons.family2;
        String amir=amir_cons.name2+" "+amir_cons.family2;
        String amirali=amirali_cons.name2+" "+amirali_cons.family2;
        String pouria=pouria_cons.name2+" "+pouria_cons.family2;
        String ashkan=ashkan_cons.name2+" "+ashkan_cons.family2;
        String mikaeil=mikaeil_cons.name2+" "+mikaeil_cons.family2;
        String danial=danial_cons.name2+" "+danial_cons.family2;
        String erfan=erfan_cons.name2+" "+erfan_cons.family2;
        String iman=iman_cons.name2+" "+iman_cons.family2;
        String kiarash=kiarash_cons.name2+" "+kiarash_cons.family2;
        String saman=saman_cons.name2+" "+saman_cons.family2;
        String mehdi=mehdi_cons.name2+" "+mehdi_cons.family2;
        String nikan=nikan_cons.name2+" "+nikan_cons.family2;
        String sepehr=sepehr_cons.name2+" "+sepehr_cons.family2;
        String sina=sina_cons.name2+" "+sina_cons.family2;




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

        u1.setVisibility(View.GONE);
        u2.setVisibility(View.GONE);
        u3.setVisibility(View.GONE);
        u4.setVisibility(View.GONE);
        u5.setVisibility(View.GONE);
        u6.setVisibility(View.GONE);
        u7.setVisibility(View.GONE);
        u8.setVisibility(View.GONE);
        u9.setVisibility(View.GONE);
        u10.setVisibility(View.GONE);
        u11.setVisibility(View.GONE);
        u12.setVisibility(View.GONE);
        u13.setVisibility(View.GONE);
        u14.setVisibility(View.GONE);
        u15.setVisibility(View.GONE);
        u16.setVisibility(View.GONE);
        u17.setVisibility(View.GONE);
        u18.setVisibility(View.GONE);
        u19.setVisibility(View.GONE);
        u20.setVisibility(View.GONE);

        u1.setText(shayan_cons.phone2);
        u2.setText(abbas_cons.phone2);
        u3.setText(arian_cons.phone2);
        u4.setText(hossein_cons.phone2);
        u5.setText(ali_cons.phone2);
        u6.setText(mohammad_cons.phone2);
        u7.setText(amir_cons.phone2);
        u8.setText(amirali_cons.phone2);
        u9.setText(pouria_cons.phone2);
        u11.setText(mikaeil_cons.phone2);
        u10.setText(ashkan_cons.phone2);
        u12.setText(danial_cons.phone2);
        u13.setText(erfan_cons.phone2);
        u14.setText(iman_cons.phone2);
        u15.setText(kiarash_cons.phone2);
        u16.setText(saman_cons.phone2);
        u17.setText(mehdi_cons.phone2);
        u18.setText(nikan_cons.phone2);
        u19.setText(sepehr_cons.phone2);
        u20.setText(sina_cons.phone2);


        a2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+shayan_cons.phone2));
            startActivity(sendIntent);
//   sendIntent.putExtra("sms_body", "tessst");
        });
        b2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+abbas_cons.phone2));
            startActivity(sendIntent);

        });
        d2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+arian_cons.phone2));
            startActivity(sendIntent);

        });
        e2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+hossein_cons.phone2));
            startActivity(sendIntent);
        });
        f2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+ali_cons.phone2));
            startActivity(sendIntent);
        });
        g2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+mohammad_cons.phone2));
            startActivity(sendIntent);
        });
        h2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+amir_cons.phone2));
            startActivity(sendIntent);
        });
        i2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+amirali_cons.phone2));
            startActivity(sendIntent);
        });
        j2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+pouria_cons.phone2));
            startActivity(sendIntent);
        });
        y2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+mikaeil_cons.phone2));
            startActivity(sendIntent);
        });
        k2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+ashkan_cons.phone2));
            startActivity(sendIntent);
        });
        l2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+danial_cons.phone2));
            startActivity(sendIntent);
        });
        m2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+erfan_cons.phone2));
            startActivity(sendIntent);
        });
        n2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+iman_cons.phone2));
            startActivity(sendIntent);
        });
        o2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+kiarash_cons.phone2));
            startActivity(sendIntent);
        });
        p2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+saman_cons.phone2));
            startActivity(sendIntent);
        });
        q2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+mehdi_cons.phone2));
            startActivity(sendIntent);
        });
        r2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+nikan_cons.phone2));
            startActivity(sendIntent);
        });
        s2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+sepehr_cons.phone2));
            startActivity(sendIntent);
        });
        t2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+sina_cons.phone2));
            startActivity(sendIntent);
        });



        a3.setOnClickListener(view ->
        {
            aa1++;
            if(aa1%2==1)
            {
                u1.setVisibility(View.VISIBLE);
            }
            else if(aa1%2==0)
            {
                u1.setVisibility(View.GONE);
            }

        });

        b3.setOnClickListener(view ->
        {
            aa2++;
            if(aa2%2==1)
            {
                u2.setVisibility(View.VISIBLE);
            }
            else if(aa2%2==0)
            {
                u2.setVisibility(View.GONE);
            }
        });
        d3.setOnClickListener(view ->
        {

            aa3++;
            if(aa3%2==1)
            {
                u3.setVisibility(View.VISIBLE);
            }
            else if(aa3%2==0)
            {
                u3.setVisibility(View.GONE);
            }
        });
        e3.setOnClickListener(view ->
        {
            aa4++;
            if(aa4%2==1)
            {
                u4.setVisibility(View.VISIBLE);
            }
           else if(aa4%2==0)
            {
                u4.setVisibility(View.GONE);
            }
        });
        f3.setOnClickListener(view ->
        {
            aa5++;
            if(aa5%2==1)
            {
                u5.setVisibility(View.VISIBLE);
            }
            else if(aa5%2==0)
            {
                u5.setVisibility(View.GONE);
            }
        });
        g3.setOnClickListener(view ->
        {
            aa6++;
            if(aa6%2==1)
            {
                u6.setVisibility(View.VISIBLE);
            }
            else if(aa6%2==0)
            {
                u6.setVisibility(View.GONE);
            }
        });
        h3.setOnClickListener(view ->
        {
            aa7++;
            if(aa7%2==1)
            {
                u7.setVisibility(View.VISIBLE);
            }
            else if(aa7%2==0)
            {
                u7.setVisibility(View.GONE);
            }
        });
        i3.setOnClickListener(view ->
        {
            aa8++;
            if(aa8%2==1)
            {
                u8.setVisibility(View.VISIBLE);
            }
            else if(aa8%2==0)
            {
                u8.setVisibility(View.GONE);
            }
        });
        j3.setOnClickListener(view ->
        {
            aa9++;
            if(aa9%2==1)
            {
                u9.setVisibility(View.VISIBLE);
            }
           else if(aa9%2==0)
            {
                u9.setVisibility(View.GONE);
            }

        });
        y3.setOnClickListener(view ->
        {
            aa10++;
            if(aa10%2==1)
            {
                u10.setVisibility(View.VISIBLE);
            }
            else if(aa10%2==0)
            {
                u10.setVisibility(View.GONE);
            }
        });
        k3.setOnClickListener(view ->
        {
            aa11++;
            if(aa11%2==1)
            {
                u11.setVisibility(View.VISIBLE);
            }
            else if(aa11%2==0)
            {
                u11.setVisibility(View.GONE);
            }
        });
        l3.setOnClickListener(view ->
        {
            aa12++;
            if(aa12%2==1)
            {
                u12.setVisibility(View.VISIBLE);
            }
           else if(aa12%2==0)
            {
                u12.setVisibility(View.GONE);
            }
        });
        m3.setOnClickListener(view ->
        {
            aa13++;
            if(aa13%2==1)
            {
                u13.setVisibility(View.VISIBLE);
            }
            else if(aa13%2==0)
            {
                u13.setVisibility(View.GONE);
            }
        });
        n3.setOnClickListener(view ->
        {
            aa14++;
            if(aa14%2==1)
            {
                u14.setVisibility(View.VISIBLE);
            }
            else if(aa14%2==0)
            {
                u14.setVisibility(View.GONE);
            }
        });
        o3.setOnClickListener(view ->
        {
        aa15++;
            if(aa15%2==1)
        {
            u15.setVisibility(View.VISIBLE);
        }
           else if(aa15%2==0)
        {
            u15.setVisibility(View.GONE);
        }
        });
        p3.setOnClickListener(view ->
        {
            aa16++;
            if(aa16%2==1)
            {
                u16.setVisibility(View.VISIBLE);
            }
            else if(aa16%2==0)
            {
                u16.setVisibility(View.GONE);
            }
        });
        q3.setOnClickListener(view ->
        {
            aa17++;
            if(aa17%2==1)
            {
                u17.setVisibility(View.VISIBLE);
            }
           else if(aa17%2==0)
            {
                u17.setVisibility(View.GONE);
            }
        });
        r3.setOnClickListener(view ->
        {
            aa18++;
            if(aa18%2==1)
            {
                u18.setVisibility(View.VISIBLE);
            }
            else if(aa18%2==0)
            {
                u18.setVisibility(View.GONE);
            }
        });
        s3.setOnClickListener(view ->
        {
            aa19++;
            if(aa19%2==1)
            {
                u19.setVisibility(View.VISIBLE);
            }
            else if(aa19%2==0)
            {
                u19.setVisibility(View.GONE);
            }
        });
        t3.setOnClickListener(view ->
        {
            aa20++;
            if(aa20%2==1)
            {
                u20.setVisibility(View.VISIBLE);
            }
            else if(aa20%2==0)
            {
                u20.setVisibility(View.GONE);
            }
        });








        a1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+shayan_cons.phone2));
            startActivity(i);
        });
        b1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+abbas_cons.phone2));
            startActivity(i);
        });
        d1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+arian_cons.phone2));
            startActivity(i);
        });
        e1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+hossein_cons.phone2));
            startActivity(i);
        });
        f1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+ali_cons.phone2));
            startActivity(i);
        });
        g1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+mohammad_cons.phone2));
            startActivity(i);
        });
        h1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+amir_cons.phone2));
            startActivity(i);
        });
        i1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+amirali_cons.phone2));
            startActivity(i);
        });
        j1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+pouria_cons.phone2));
            startActivity(i);
        });
        y1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+ashkan_cons.phone2));
            startActivity(i);
        });
        k1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+mikaeil_cons.phone2));
            startActivity(i);
        });
        l1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+danial_cons.phone2));
            startActivity(i);
        });
        m1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+erfan_cons.phone2));
            startActivity(i);
        });
        n1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+iman_cons.phone2));
            startActivity(i);
        });
        o1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+kiarash_cons.phone2));
            startActivity(i);
        });
        p1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+saman_cons.phone2));
            startActivity(i);
        });
        q1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+mehdi_cons.phone2));
            startActivity(i);
        });
        r1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+nikan_cons.phone2));
            startActivity(i);
        });
        s1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+sepehr_cons.phone2));
            startActivity(i);
        });
        t1.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:"+sina_cons.phone2));
            startActivity(i);
        });

    }
}


