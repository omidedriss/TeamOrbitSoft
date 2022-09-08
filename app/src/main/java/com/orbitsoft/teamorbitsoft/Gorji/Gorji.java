package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.example.MyDialog;

public class Gorji extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
private Button insta,myInfo,metaco,exit,login,fact,contact,chat;
private CheckBox loginCheckBox;
int x , y,q,w,b = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji);
        entry();

        Toast.makeText(getApplicationContext(), "دکمه  صفحه لاگین مخفی است", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "برای پخش صدا روی چک باکس کلیک کنید", Toast.LENGTH_LONG).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_gorji_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.exit_menu) {
            Toast.makeText(getApplicationContext(), "صفحه خروج اجباری :)", Toast.LENGTH_LONG).show();
            Intent init = new Intent(getApplicationContext(), GorjiCustomDialog.class);
            startActivity(init);
        }
        if(item.getItemId()==R.id.metaco_menu){
            Toast.makeText(getApplicationContext(),"سایت متاکو",Toast.LENGTH_LONG).show();
            Intent init1 = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("https://tr.metacomplex.com/");
            init1.setData(uri);
            startActivity(init1);
        }
        if(item.getItemId()==R.id.instagram_menu){
            Toast.makeText(getApplicationContext(),"به صفحه اینستا گرام عباس گرجی خوش آمدید",Toast.LENGTH_LONG).show();
            Uri uri = Uri.parse("https://instagram.com/abbas1gorji");
            Intent init = new Intent(Intent.ACTION_VIEW,uri);
            init.setPackage("com.instagram.android");

            startActivity(init);
        }
        if (item.getItemId()==R.id.info_menu){
            Toast.makeText(getApplicationContext(),"صفحه درباره",Toast.LENGTH_LONG).show();
            Intent init = new Intent(Gorji.this, GorjiMyDialogActivity.class);
            startActivity(init);
        }
        if(item.getItemId()==R.id.login_menu);{
            Toast.makeText(getApplicationContext(),"دکمه صفحه لاگین اضافه شد",Toast.LENGTH_LONG).show();
        login.setVisibility(View.VISIBLE);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {


        if(v.getId()==insta.getId()){
        insta();

        }
        if(v.getId()==myInfo.getId()){
        myInfo();
        }
        if(v.getId()==metaco.getId()){
        metaco();


        }
        if(v.getId() == fact.getId()){
        int x = fact1(5);
        Toast.makeText(getApplicationContext(),String.valueOf(x),Toast.LENGTH_LONG).show();
        }
        if(v.getId()==exit.getId()){
            sound2();
            finish();
            //exit();
        }
        if(v.getId() == login.getId()){
                Intent initLogin = new Intent(getApplicationContext(),GorjiPhoneNumberActivity.class);
                startActivity(initLogin);

        }
        if(v.getId() == contact.getId()){
            contact();
        }
        if(v.getId() == chat.getId()){
          //  riazi();
            //add_text_view();
            chat();
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (loginCheckBox.isChecked()) {
            login.setVisibility(View.VISIBLE);
            login.setEnabled(b);
        }
        else
        {login.setVisibility(View.GONE);
        }
        if (loginCheckBox.isChecked()){
            fact.setVisibility(View.VISIBLE);
            fact.setEnabled(b);
        }else {fact.setVisibility(View.GONE);}
        if (loginCheckBox.isChecked()){
            contact.setVisibility(View.VISIBLE);
            contact.setEnabled(b);
        }else{contact.setVisibility(View.GONE);}
        if(loginCheckBox.isChecked()){
        sound();}else{
            sound1();
        }
    }
    private void entry (){
        insta=findViewById(R.id.insta);
        myInfo=findViewById(R.id.my_info);
        metaco=findViewById(R.id.metaco);
        exit=findViewById(R.id.exit);
        login=findViewById(R.id.login);
        loginCheckBox=findViewById(R.id.checkBox_login);
        fact = findViewById(R.id.fact_gorji);
        contact= findViewById(R.id.gorji_contact);
        chat = findViewById(R.id.chat);
        chat.setOnClickListener(this);
        contact.setVisibility(View.GONE);
        contact.setOnClickListener(this);
        fact.setVisibility(View.GONE);
        fact.setOnClickListener(this);
        loginCheckBox.setChecked(false);
        login.setVisibility(View.GONE);
        login.setOnClickListener(this);
        insta.setOnClickListener(this);
        myInfo.setOnClickListener(this);
        metaco.setOnClickListener(this);
        exit.setOnClickListener(this);
        loginCheckBox.setOnCheckedChangeListener(this);
        sound();
    }

    public int fact1(int fa){
        if (fa == 1)
        {
            return b;
        }
        else
        {
            b *=fa;
            return fact1(fa-1);
        }
    }
    private void insta (){
        Toast.makeText(getApplicationContext(),"به صفحه اینستا گرام عباس گرجی خوش آمدید",Toast.LENGTH_LONG).show();
        Uri uri = Uri.parse("https://instagram.com/abbas1gorji");
        Intent init = new Intent(Intent.ACTION_VIEW,uri);
        init.setPackage("com.instagram.android");
        startActivity(init);
    }
    private void myInfo(){
        Toast.makeText(getApplicationContext(),"صفحه درباره",Toast.LENGTH_LONG).show();
        Intent init = new Intent(Gorji.this, GorjiMyDialogActivity.class);
        startActivity(init);
    }
    private void metaco(){
        Toast.makeText(getApplicationContext(),"سایت متاکو",Toast.LENGTH_LONG).show();
        Intent init1 = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("https://tr.metacomplex.com/");
        init1.setData(uri);
        startActivity(init1);
    }
    private void exit(){
        Toast.makeText(getApplicationContext(),"صفحه خروج اجباری :)",Toast.LENGTH_LONG).show();
        Intent init = new Intent(getApplicationContext(),GorjiCustomDialog.class);
        startActivity(init);
    }
    public void contact(){
        Intent i = new Intent(getApplicationContext(),GorjiContactActivity.class);
        startActivity(i);
    }
    public void chat(){
        Intent i = new Intent(getApplicationContext(),GorjiChat.class);
        startActivity(i);
    }
    public void riazi(){
                mohasebe  m = new mohasebe();
                x= m.masahat(2,2,0);
                y= m.masahat(0,0,2);
                q=m.mohit(5,5,0);
                w = m.mohit(0,0,6);

    }
    public void add_text_view(){
        LinearLayout ln = findViewById(R.id.add_linear);
        TextView tv =new TextView(Gorji.this);
        tv.setTextSize(22f);
        tv.setTextColor(getResources().getColor(R.color.white));

        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        String st = String.valueOf("masahat mostatil = "+x + "\t masahat daire = "+y+"\t mohid mostatil = "+q
                +"\t mohit daire = "+w);
        tv.setLayoutParams(params);
        tv.setText(st);
        ln.addView(tv);
    }
    public void sound(){
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.start_activity);
        mp.start();
    }
    public void sound1(){
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.battlehorn);
        mp.start();
    }
    public void sound2(){
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.quit);
        mp.start();
    }
    public void sound3(){
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.loading);
        mp.start();
    }
}