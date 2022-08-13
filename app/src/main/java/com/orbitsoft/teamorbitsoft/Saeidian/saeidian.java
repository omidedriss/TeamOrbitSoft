package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.Gorji.Gorji;
import com.orbitsoft.teamorbitsoft.Mazaheri.Mazaheri;
import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.example.IntentSample;
import com.orbitsoft.teamorbitsoft.example.MyBrowserActivity;


public class saeidian extends AppCompatActivity {
    TextView shayan;
    Button sh;
    Button aa;
    Button bb;
    Button cc;
    Button dd;
    Button ff;
    int request_Code = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saaidian);
        shayan = findViewById(R.id.textView);
        thesheox student = new thesheox();
        sh=findViewById(R.id.button);
        aa=findViewById(R.id.button2);
        bb=findViewById(R.id.button3);
        cc=findViewById(R.id.button4);
        dd=findViewById(R.id.button5);
        ff=findViewById(R.id.button6);
        student.setName("shayan");
        student.setFamily("saeidain");
        student.setWeight(100);
        student.setHeight(1.75F);
        student.setNumber(111);
        //
student.setBmi(student.getWeight()/ student.getHeight()/student.getHeight());
student.setAvg((student.getS1()+student.getS2()+student.getS3()+student.getS4()+student.getS5()+student.getS6()+student.getS7())/7);

        shayan.setText("idnumber : "+student.getNumber()+"\n"+"name : "+student.getName() + "\n"+"family : "+student.getFamily()+ "\n"+"height : "+student.getHeight()+ "\n"+"weight : "+student.getWeight()+"avg : "+student.getAvg()+"\n"+"bmi : "+student.getBmi());
//        sh.setOnClickListener(v -> {
//            Intent imaz=new Intent(this, Mazaheri.class);
//            startActivity(imaz);
//        });
        sh.setOnClickListener(view -> {
           // Intent imaz=new Intent(saeidian.this, Gorji.class);
            Intent i = new
                    Intent(saeidian.this, Gorji.class);
            Bundle bundle = new Bundle();
            bundle.putLong("test2",12);
            bundle.putString("test","saeidian");
           // bundle.putLong("saeidian",12);
            i.putExtras(bundle);
        startActivity(i);

        });
        aa.setOnClickListener(view -> {
            Intent i = new
                    Intent("android.intent.action.VIEW");
            i.setData(Uri.parse("http://www.google.com"));
            startActivity(i);
        });
        bb.setOnClickListener(view -> {
        Intent i = new
                Intent(android.content.Intent.ACTION_DIAL,
                Uri.parse("tel:09173929711"));
        startActivity(i);
        });
        cc.setOnClickListener(view -> {
        Intent i = new
                Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("geo:37.827500,-122.481670"));
        startActivity(i);
        });
        dd.setOnClickListener(view -> {
        Intent i = new
                       Intent(android.content.Intent.ACTION_CALL,
                        Uri.parse("tel:09389970343"));
                startActivity(i);
        });
        ff.setOnClickListener(view -> {
            Intent i = new
                    Intent(android.content.Intent.ACTION_PICK);
            //i.setType(ContactsContract.Contacts.CONTENT_TYPE);
            i.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
            startActivityForResult(i, request_Code);
        });
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == request_Code) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, data.getData().toString(),
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(data.getData().toString()));
                startActivity(i);
            }
        }
    }
}