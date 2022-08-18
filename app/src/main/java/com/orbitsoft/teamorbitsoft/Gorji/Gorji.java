package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.example.MyDialog;

public class Gorji extends AppCompatActivity implements View.OnClickListener {
Button insta,myInfo,metaco,exit;
int x ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji);
        insta=findViewById(R.id.insta);
        myInfo=findViewById(R.id.my_info);
        metaco=findViewById(R.id.metaco);
        exit=findViewById(R.id.exit);
        insta.setOnClickListener(this);
        myInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent init = new Intent(Gorji.this, GorjiMyDialogActivity.class);
                startActivity(init);

            }
        });
        metaco.setOnClickListener(this);
        exit.setOnClickListener(this);

    /*
                Intent i = new
                        Intent(Gorji.this,GorjiBrowserActivity.class);
               Bundle bundle = new Bundle();
               bundle.putLong("testputLong",12);
               i.putExtra("test", bundle);
                i.setData(Uri.parse("http://www.amazon.com"));
               startActivity(i);
*/


        }

    @Override
    public void onClick(View v) {
        if(v .equals(insta.getId())){
            Toast.makeText(getApplicationContext(),"insta",Toast.LENGTH_LONG).show();
            Uri uri = Uri.parse("https://instagram.com/abbas1gorji");
            Intent init = new Intent(Intent.ACTION_VIEW,uri);
            init.setPackage("com.instagram.android");

        startActivity(init);
        }
       // if(v.equals(myInfo.getId())){

        //}
        if(v.equals(metaco.getId())){
            Intent init1 = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("https://tr.metacomplex.com/");
            init1.setData(uri);
            startActivity(init1);

        }
        if(v.equals(exit.getId())){
            
        }

    }
}