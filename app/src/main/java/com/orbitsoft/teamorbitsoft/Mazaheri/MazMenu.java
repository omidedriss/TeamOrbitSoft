package com.orbitsoft.teamorbitsoft.Mazaheri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class MazMenu extends AppCompatActivity  {
    private Button mazinstagram, mazInfo, mazmetaco, mazmenuexit, mazlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazmenu);


/*
        mazinstagram = findViewById(R.id.mazinstagram);
        mazInfo = findViewById(R.id.mazinfo);
        mazmetaco = findViewById(R.id.mazmetaco);
        mazmenuexit = findViewById(R.id.mazmenuexit);

        mazinstagram.setOnClickListener(MazMenu.this);
        mazInfo.setOnClickListener(this);
        mazmetaco.setOnClickListener(this);
        mazmenuexit.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mazmenuitem, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.mazinstagram_menu) {
            Toast.makeText(getApplicationContext(), "اینستاگرام من", Toast.LENGTH_LONG).show();
            Uri uri = Uri.parse("https://instagram.com/Myinstalgram");
            Intent mazint = new Intent(Intent.ACTION_VIEW, uri);
            mazint.setPackage("com.instagram.android");

            startActivity(mazint);
        }
        if (item.getItemId() == R.id.mazmetaco_menu) {
            Toast.makeText(getApplicationContext(), "متاکو", Toast.LENGTH_LONG).show();
            Intent mazint = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("https://wa.metacomplex.com/");
            mazint.setData(uri);
            startActivity(mazint);

            if (item.getItemId() == R.id.mazabout_menu) {
                Toast.makeText(getApplicationContext(), "درباره ما", Toast.LENGTH_LONG).show();
                // Intent mazint = new Intent(Gorji.this, GorjiMyDialogActivity.class);
                // startActivity(mazint);
            }
            //   if(item.getItemId()==R.id.login_menu);{
            //       Toast.makeText(getApplicationContext(),"دکمه صفحه لاگین اضافه شد",Toast.LENGTH_LONG).show();
            //      // login.setVisibility(View.VISIBLE);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == mazinstagram.getId()) {
            Toast.makeText(MazMenu.this, "اینستاگرام من", Toast.LENGTH_LONG).show();
            Uri uri = Uri.parse("https://instagram.com/Myinstalgram");
            Intent mazint = new Intent(Intent.ACTION_VIEW, uri);
            mazint.setPackage("com.instagram.android");

            startActivity(mazint);
        }
        //    if(v.getId()==mazInfo.getId()){
        //        Toast.makeText(getApplicationContext(),"درباره ما",Toast.LENGTH_LONG).show();
//
        //          Intent mazint = new Intent(MazMenu.this,MazDialog.class);
        //        startActivity(mazint);
        //  }
        if (v.getId() == mazmetaco.getId()) {
            Toast.makeText(getApplicationContext(), "متاکو", Toast.LENGTH_LONG).show();
            Intent mazint = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("https://wa.metacomplex.com/");
            mazint.setData(uri);
            startActivity(mazint);

        }


 */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mazmenuitem, menu);
        return super.onCreateOptionsMenu(menu);
    }


}