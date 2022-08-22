package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

import java.util.Random;

public class GorjiCodPhoneActivity extends AppCompatActivity implements View.OnClickListener {
private EditText codPhoneNumber;
private ImageView img;
private int i =0;
Button resend,accept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji_cod_phone);
        codPhoneNumber = findViewById(R.id.cod_phone_number);
        img =findViewById(R.id.cantact_pic1);
        resend =findViewById(R.id.resend);
        accept=findViewById(R.id.accept);
        codPhoneNumber.setOnClickListener(this);
        resend.setOnClickListener(this);
        accept.setOnClickListener(this);
        Bundle bl = getIntent().getExtras();
        if(bl != null){
            if(bl.containsKey("key")){
               String st = bl.getString("key").toString();
               codPhoneNumber.setText(st);
                Toast.makeText(getApplicationContext(),st,Toast.LENGTH_LONG).show();

           }
        }

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==resend.getId());
        if(i < 5){
        Random random = new Random();
        String st1 = String.valueOf(random.nextInt(10000000));
       // Toast.makeText(getApplicationContext(),st1,Toast.LENGTH_LONG).show();
        codPhoneNumber.setText(st1);
        i++;}else{
            Toast.makeText(getApplicationContext(),"شما بیش از حد تلاش کردین",Toast.LENGTH_LONG).show();}
        if(view.getId() == accept.getId()){
            Intent init = new Intent(GorjiCodPhoneActivity.this,GorjiLoginActivity.class);
            startActivity(init);
        }
    }
}