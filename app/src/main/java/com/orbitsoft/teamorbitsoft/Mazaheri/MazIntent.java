package com.orbitsoft.teamorbitsoft.Mazaheri;

import android.annotation.SuppressLint;
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

    Button btmazweb, b1,b2, b3, b4, b5,b6,b7;
    int request_Code_call = 1;
    int request_Code_web = 2;

    /** Called when the activity is first created. */
    @SuppressLint("CutPasteId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //مخفی کرد عنوان صفحه و فول اسکرین
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_mazintent);



        //شماره گیری سریع اینتنت معمولی
        //---Make calls button--- //در این حالت باید دسترسی تلفن به اپلیکیشن داده شود
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){


                Intent i = new
                        Intent(android.content.Intent.ACTION_CALL,
                        Uri.parse("tel:+321654654"));
                startActivity(i);

            }
        });


        //---Make calls button---
        //
        //شماره گیری معمولی با اینتنت معمولی
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

        //شماره گیری با اینتنت شرطی از روی دفتر تلفن
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

        //---Method 1---
        b5 = (Button) findViewById(R.id.btn_launchMyBrowser);
        b5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {


                Intent i = new
                        Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("https://www.google.com"));
                startActivity(i);

            }
        });


           //---Web browser button---
           btmazweb = (Button) findViewById(R.id.b2);

           btmazweb.setOnClickListener(new View.OnClickListener()
           {
               public void onClick(View arg1)
               {

                   Intent i = new
                           Intent(android.content.Intent.ACTION_VIEW,
                   Uri.parse("https://www.google.com")); //android.content.Intent.ACTION_VIEW

                   startActivity(i);
               }
           });




 //       //---Show Map button---
 //       b3 = (Button) findViewById(R.id.btn_showMap);
 //       b3.setOnClickListener(new View.OnClickListener()
 //       {
 //           public void onClick(View arg0){
 //               Intent i = new
 //                       Intent(Intent.ACTION_VIEW,
 //                       Uri.parse("geo:37.827500,-122.481670"));
 //               startActivity(i);
 //           }
 //       });



//        b7 = (Button) findViewById(R.id.btmazweb);
//        b7.setOnClickListener(v -> {
//                Intent i = new
//                        Intent(MazIntent.this, MazBrowser.class);

//            i.putExtra("site","https://www.amazon.com");
//              // Bundle bundle = new Bundle();
//              // bundle.putLong("testputLong",12);
//             //  i.putExtra("https://www.google.com", bundle);
//
//            startActivity(i);
//        });
//





                //---Method 3---
//                Intent i = new
//                        Intent("com.orbitsoft.teamorbitsoft.MyBrowser",
//                        Uri.parse("http://www.amazon.com"));
//                i.addCategory("com.orbitsoft.teamorbitsoft.OtherApps");
//                i.addCategory("com.orbitsoft.teamorbitsoft.SomeOtherApps");
//                startActivity(i);


    }


    //باز نویسی کلاس مدیریت اینتنت در بازگشت داده ها
    //متد اینتنت بر اساس نتیجه، برای همه موارد اینتنت میباشد ، بنابر این برای مدیریت هر
    //اینتنت باید کدی برای آن قرارداد مثل request_Code_call که برای تلفن در نظر گرفته شده است.
    @Override
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

                // استخراج شماره تلفن
                int column = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                String number = cursor.getString(column);
                Toast.makeText(getApplicationContext(),number,Toast.LENGTH_LONG).show();
                //برقراری تماس

                Intent i = new
                       Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:"+number));
              startActivity(i);

            }

        }
    }

}
