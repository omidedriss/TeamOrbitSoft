package com.orbitsoft.teamorbitsoft.Nikkhu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

import java.util.Arrays;
import java.util.Random;

public class Nikkhu extends AppCompatActivity implements View.OnClickListener {
    TextView txt;

   private Button bt1, bt2, bt3,bt_info ,my_recycler,btReturn,btn_factor,btn_login;

    private Dialog d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nikkhu);


        bt1 =(Button) findViewById(R.id.bt1);
        btn_factor =(Button) findViewById(R.id.btn_factor);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        my_recycler = (Button) findViewById(R.id.my_recycler);
        btn_login = (Button) findViewById(R.id.btn_login);
        btReturn = findViewById(R.id.btReturn);
        bt_info =(Button) findViewById(R.id.bt_info);



        d=new Dialog(this);




    }


    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {


       switch (v.getId() ){
            case R.id.bt1:
                Toast.makeText(getApplicationContext(),"instgram page",Toast.LENGTH_LONG).show();
               Uri uri= Uri.parse("https://https://instagram.com/metacomplex");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.instagram.android");
                startActivity(intent);
                break;

           case R.id.bt2:
                Intent intent1 =new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://fa.metacomplex.com"));
                startActivity(intent1);
                break;

           case R.id.bt3:

               d.setContentView(R.layout.activity_nikoo_log);
               d.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.black));
               Button bt_exit=d.findViewById(R.id.bt_exit);
               Button bt_cancel=d.findViewById(R.id.bt_cancel);
              bt_exit.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                     Intent i =new Intent(getApplicationContext(),MainActivity.class);
                     startActivity(i);
                   }
               });
               bt_cancel.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Toast.makeText(getApplicationContext(),"cancel",Toast.LENGTH_LONG).show();
                       d.dismiss();
                   }
               });
               d.show();
               break;

           case R.id.bt_info:

               dilog d2 =new dilog(Nikkhu.this);
               d2.show(getSupportFragmentManager(),"info");
               break;
           case R.id.btn_factor:

                Intent i=new Intent(this,contact_list.class);
                startActivity(i);

               break;
           case R.id.btn_login:

              i=new Intent(this,nickoo_login.class);
               startActivity(i);

               break;
           case R.id.my_recycler:
               i=new Intent(this,nikoo_recycle.class);
               startActivity(i);





       }

    }



}