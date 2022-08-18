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
        myInfo.setOnClickListener(this);
        metaco.setOnClickListener(this);
        exit.setOnClickListener(this);




        }

    @Override
    public void onClick(View v) {
        if(v.getId()==insta.getId()){
            Toast.makeText(getApplicationContext(),"insta",Toast.LENGTH_LONG).show();
            Uri uri = Uri.parse("https://instagram.com/abbas1gorji");
            Intent init = new Intent(Intent.ACTION_VIEW,uri);
            init.setPackage("com.instagram.android");

        startActivity(init);
        }
        if(v.getId()==myInfo.getId()){
        Intent init = new Intent(Gorji.this, GorjiMyDialogActivity.class);
        startActivity(init);
        }
        if(v.getId()==metaco.getId()){
            Intent init1 = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("https://tr.metacomplex.com/");
            init1.setData(uri);
            startActivity(init1);

        }
        if(v.getId()==exit.getId()){
            Intent init = new Intent(getApplicationContext(),GorjiCustomDialog.class);
            startActivity(init);
        }

    }
}