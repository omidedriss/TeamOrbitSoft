package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class saeidian_arraylist extends AppCompatActivity {
ListView listView;
    ListView listView2;
    Button button14;
    int i;
    Button a1, b1, d1, e1, f1, g1, h1, i1, j1, y1, k1, l1, m1, n1, o1, p1, q1, r1, s1, t1;
    Button a2, b2, d2, e2, f2, g2, h2, i2, j2, y2, k2, l2, m2, n2, o2, p2, q2, r2, s2, t2;
    Button a3, b3, d3, e3, f3, g3, h3, i3, j3, y3, k3, l3, m3, n3, o3, p3, q3, r3, s3, t3;
    ArrayList<String> people =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_arraylist);
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

//
//        ArrayList<String> contact =new ArrayList<>();
//        contact.add(shayan_cons.phone2);
//        contact.add(abbas_cons.phone2);
//        contact.add(arian_cons.phone2);
//        contact.add(hossein_cons.phone2);
//        contact.add(ali_cons.phone2);
//        contact.add(mohammad_cons.phone2);
//        contact.add(amir_cons.phone2);
//        contact.add(amirali_cons.phone2);
//        contact.add(pouria_cons.phone2);
//        contact.add(ashkan_cons.phone2);
//        contact.add(mikaeil_cons.phone2);
//        contact.add(danial_cons.phone2);
//        contact.add(erfan_cons.phone2);
//        contact.add(iman_cons.phone2);
//        contact.add(kiarash_cons.phone2);
//        contact.add(saman_cons.phone2);
//        contact.add(mehdi_cons.phone2);
//        contact.add(nikan_cons.phone2);
//        contact.add(sepehr_cons.phone2);
//        contact.add(sina_cons.phone2);

        ArrayList<String> contact_name =new ArrayList<>();
        contact_name.add(shayan_cons.name2+shayan_cons.family2+"\n"+shayan_cons.phone2+"\n");
        contact_name.add(abbas_cons.name2+abbas_cons.family2+"\n"+abbas_cons.phone2+"\n");
        contact_name.add(arian_cons.name2+arian_cons.family2+"\n"+arian_cons.phone2+"\n");
        contact_name.add(hossein_cons.name2+hossein_cons.family2+"\n"+hossein_cons.phone2+"\n");
        contact_name.add(ali_cons.name2+ali_cons.family2+"\n"+ali_cons.phone2+"\n");
        contact_name.add(mohammad_cons.name2+mohammad_cons.family2+"\n"+mohammad_cons.phone2+"\n");
        contact_name.add(amir_cons.name2+amir_cons.family2+"\n"+amir_cons.phone2+"\n");
        contact_name.add(amirali_cons.name2+amirali_cons.family2+"\n"+amirali_cons.phone2+"\n");
        contact_name.add(pouria_cons.name2+pouria_cons.family2+"\n"+pouria_cons.phone2+"\n");
        contact_name.add(ashkan_cons.name2+ashkan_cons.family2+"\n"+ashkan_cons.phone2+"\n");
        contact_name.add(mikaeil_cons.name2+mikaeil_cons.family2+"\n"+mikaeil_cons.phone2+"\n");
        contact_name.add(danial_cons.name2+danial_cons.family2+"\n"+danial_cons.phone2+"\n");
        contact_name.add(erfan_cons.name2+erfan_cons.family2+"\n"+erfan_cons.phone2+"\n");
        contact_name.add(iman_cons.name2+iman_cons.family2+"\n"+iman_cons.phone2+"\n");
        contact_name.add(kiarash_cons.name2+kiarash_cons.family2+"\n"+kiarash_cons.phone2+"\n");
        contact_name.add(saman_cons.name2+saman_cons.family2+"\n"+saman_cons.phone2+"\n");
        contact_name.add(mehdi_cons.name2+mehdi_cons.family2+"\n"+mehdi_cons.phone2+"\n");
        contact_name.add(nikan_cons.name2+nikan_cons.family2+"\n"+nikan_cons.phone2+"\n");
        contact_name.add(sepehr_cons.name2+sepehr_cons.family2+"\n"+sepehr_cons.phone2+"\n");
        contact_name.add(sina_cons.name2+sina_cons.family2+"\n"+sina_cons.phone2+"\n");


listView=findViewById(R.id.listview);
        ArrayAdapter adapter=new ArrayAdapter(saeidian_arraylist.this, android.R.layout.simple_list_item_1,contact_name);
        listView.setAdapter(adapter);
      //  listView2=findViewById(R.id.listview2);

      // Button button14=findViewById(R.id.button14);
//        people.add("shayan");
//        people.add("abaas");
//        people.add("sepehr");
//        people.add("sina");
//

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
            sendIntent.setData(Uri.parse("sms:"+ashkan_cons.phone2));
            startActivity(sendIntent);
        });
        k2.setOnClickListener(view ->
        {
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:"+mikaeil_cons.phone2));
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
        //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//               // Toast.makeText(saeidian_arraylist.this, "you select :"+people.get(position), Toast.LENGTH_SHORT).show();
//           if(position==0)
//           {
////               position=position+1;
////               Toast.makeText(saeidian_arraylist.this, "shayan", Toast.LENGTH_SHORT).show();
////               position=position+1;
//               adapter.remove(adapter.getItem(0));
//               adapter.add(shayan_cons.name2+shayan_cons.family2);
//           }

            //}
     //   });
//        ArrayAdapter adapter2=new ArrayAdapter(saeidian_arraylist.this, android.R.layout.simple_list_item_1,contact);
//    listView2.setAdapter(adapter2);
//
//
//        button14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                i++;
//                if(i%2==1)
//                {
//                    adapter.remove(adapter.getItem(0));
//                }
//                else if(i%2==0)
//                {
//                    adapter.add(shayan_cons.name2+shayan_cons.family2);
//
//
//                }
//
//            }
//        });
//        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent2, View view, int position, long id) {
//                // Toast.makeText(saeidian_arraylist.this, "you select :"+people.get(position), Toast.LENGTH_SHORT).show();
//                String name=(String)parent2.getItemAtPosition(position);
//                if(position==0)
//                {
//                    Toast.makeText(saeidian_arraylist.this, "shayan", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    }

}