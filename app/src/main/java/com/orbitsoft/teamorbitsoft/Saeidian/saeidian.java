package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
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
    private static final int RESULT_PICK_CONTACT = 1;
    private TextView phone;
    private Button select;
    String phoneNo = null;
    Cursor cursor = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saaidian);
        phone = findViewById(R.id.phone);
        select = findViewById(R.id.select);
        shayan = findViewById(R.id.textView);
        thesheox student = new thesheox();
        sh = findViewById(R.id.button);
        aa = findViewById(R.id.button2);
        bb = findViewById(R.id.button3);
        cc = findViewById(R.id.button4);
        dd = findViewById(R.id.button5);
//show bmi+avg
//        student.setName("shayan");
//        student.setFamily("saeidain");
//        student.setWeight(100);
//        student.setHeight(1.75F);
//        student.setNumber(111);
//
//
//        //
//        student.setBmi(student.getWeight() / student.getHeight() / student.getHeight());
//        student.setAvg((student.getS1() + student.getS2() + student.getS3() + student.getS4() + student.getS5() + student.getS6() + student.getS7()) / 7);
//
//        shayan.setText("idnumber : " + student.getNumber() + "\n" + "name : " + student.getName() + "\n" + "family : " + student.getFamily() + "\n" + "height : " + student.getHeight() + "\n" + "weight : " + student.getWeight() + "avg : " + student.getAvg() + "\n" + "bmi : " + student.getBmi());
//       sh.setOnClickListener(v -> {
//            Intent imaz=new Intent(this, Mazaheri.class);
//            startActivity(imaz);
//        });
        //send name/family to a new class
        sh.setOnClickListener(view -> {
            Intent i = new
                    Intent(saeidian.this, saeidian2.class);
            Bundle bundle = new Bundle();
            bundle.putString("test","shayan saeidian");
            i.putExtras(bundle);
            startActivity(i);
            // Intent imaz=new Intent(saeidian.this, Gorji.class);
            // bundle.putLong("saeidian",12);
            // bundle.putLong("test2",12);
        });
        //open a website
        aa.setOnClickListener(view ->
        {
            Intent i = new
                    Intent("android.intent.action.VIEW");
            i.setData(Uri.parse("http://www.google.com"));
            startActivity(i);
        });
        //put a number to dial
        bb.setOnClickListener(view ->
        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_DIAL,
                    Uri.parse("tel:09173929711"));
            startActivity(i);
        });
        //open map
        cc.setOnClickListener(view ->
        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("geo:37.827500,-122.481670"));
            startActivity(i);
        });
        //call a number
        dd.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:09389970343"));
            startActivity(i);
        });

//get number from contact anf call
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(in, RESULT_PICK_CONTACT);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {

            Uri uri = data.getData();
            cursor = getContentResolver().query(uri, null, null, null, null);
            cursor.moveToFirst();
            int phoneIndex = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            phoneNo = cursor.getString(phoneIndex);
            //phone.setText (phoneNo);

        } else {
            Toast.makeText(this, "Failed To pick contact", Toast.LENGTH_SHORT).show();
        }
        Log.d("phone", phoneNo);
        Intent i = new
                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNo));

        startActivity(i);
    }
    }



