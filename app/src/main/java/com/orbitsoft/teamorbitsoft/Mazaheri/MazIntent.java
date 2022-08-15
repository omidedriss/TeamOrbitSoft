package com.orbitsoft.teamorbitsoft.Mazaheri;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class MazIntent extends AppCompatActivity {

    Button btmazweb, b2, b3, b4, b5,b6;
    int request_Code_call = 1;
    int request_Code_web = 2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_mazintent);

     //   //---Web browser button---
     //   btmazweb = (Button) findViewById(R.id.btn_webbrowser);
     //   btmazweb.setOnClickListener(new View.OnClickListener()
     //   {
     //       public void onClick(View arg0){
     //       	/*
     //           Intent i = new
     //               Intent(android.content.Intent.ACTION_VIEW,
     //                 Uri.parse("http://www.amazon.com"));
     //           */

     //           //---OR---
     //           Intent i = new
     //                   Intent("android.intent.action.VIEW");
     //           //Intent(android.content.Intent.ACTION_VIEW);
     //           i.setData(Uri.parse("http://www.amazon.com"));
     //
     //           startActivity(i);
     //       }
     //   });

        //---Make calls button---
        b2 = (Button) findViewById(R.id.maz_makecalls);
        b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){

                Intent i = new
                Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:+653232546"));
                startActivity(i);

            }
        });

        //---Make calls button--- //در این حالت باید دسترسی تلفن به اپلیکیشن داده شود
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){


                Intent i = new
                        Intent(android.content.Intent.ACTION_CALL,
                        Uri.parse("tel:+321654654"));
                startActivity(i);

            }
        });

     //   //---Show Map button---
     //   b3 = (Button) findViewById(R.id.btn_showMap);
     //   b3.setOnClickListener(new View.OnClickListener()
     //   {
     //       public void onClick(View arg0){
     //           Intent i = new
     //                   Intent(Intent.ACTION_VIEW,
     //                   Uri.parse("geo:37.827500,-122.481670"));
     //           startActivity(i);
     //       }
     //   });

        //---Choose Contact button---
        b4 = (Button) findViewById(R.id.btn_chooseContact);
        b4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent i = new
                        Intent(Intent.ACTION_PICK);
                //i.setType(ContactsContract.Contacts.CONTENT_TYPE);
                i.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
                startActivityForResult(i,request_Code_call);
            }
        });

//        b5 = (Button) findViewById(R.id.btn_launchMyBrowser);
//        b5.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View arg0)
//            {

            	//---Method 1---
// //            	Intent i = new
// //                   Intent("com.orbitsoft.teamorbitsoft.MyBrowser");
// //           	i.setData(Uri.parse("http://www.amazon.com"));
// //               startActivity(i);
//
//                Intent i = new
//                        Intent(MazIntent.this, MyBrowserActivity.class);
//               Bundle bundle = new Bundle();
//               bundle.putLong("testputLong",12);
//               i.putExtra("test", bundle);
//
//                startActivity(i);



            	/*
                //---Method 2---
                Intent i = new
                    Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://www.amazon.com"));
                startActivity(i);
                */

                //---Method 3---
//                Intent i = new
//                        Intent("com.orbitsoft.teamorbitsoft.MyBrowser",
//                        Uri.parse("http://www.amazon.com"));
//                i.addCategory("com.orbitsoft.teamorbitsoft.OtherApps");
//                i.addCategory("com.orbitsoft.teamorbitsoft.SomeOtherApps");
//                startActivity(i);
//            }
//        });





    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == request_Code_web) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, data.getData().toString(),
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(data.getData().toString()));
                startActivity(i);
            }
        }
        if (requestCode == request_Code_call) {
            if (resultCode == RESULT_OK) {
                // گرفتن مقدار داده ها
                Uri contactUri = data.getData();
                // پیدا کردن ستون شماره تلفن مخاطب
                String[] projection = {ContactsContract.CommonDataKinds.Phone.NUMBER};

                //اجرای کوئری برای دریافت شماره تلفن از داخل uri
                Cursor cursor = getContentResolver().query(contactUri, projection, null, null, null);
                cursor.moveToFirst();

                // گرفتن مقدار شماره تلفن
                int column = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                String number = cursor.getString(column);
                Toast.makeText(getApplicationContext(),number,Toast.LENGTH_LONG).show();
                //برقراری تماس
               //number="tel:"+number;
                Intent i = new
                       Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:"+number));
              startActivity(i);

            }
        }
    }

}
