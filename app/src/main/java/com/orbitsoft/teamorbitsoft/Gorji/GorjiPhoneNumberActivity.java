package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

import java.util.Random;

public class GorjiPhoneNumberActivity extends AppCompatActivity implements View.OnClickListener {
private ImageView contactPic;
private Button next,close;
private EditText phoneNumber;
private String phone ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji_phone_number);
        contactPic=findViewById(R.id.cantact_pic);
        next=findViewById(R.id.next);
        phoneNumber=findViewById(R.id.phone_number);

        close=findViewById(R.id.close);
        next.setOnClickListener(this);
        close.setOnClickListener(this);
        contactPic.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==next.getId()){
            phone = phoneNumber.getText().toString();
            if (!phone.isEmpty() && (phone.length() == 11 && phone.startsWith("09"))) {
                Intent init = new Intent(getApplicationContext(), GorjiCodPhoneActivity.class);
                Random random = new Random();
                String st1 = String.valueOf(random.nextInt(1000000));
                init.putExtra("key",st1);
                startActivity(init);
            }else{
                Toast.makeText(getApplicationContext(),"شماره موبایل را صحیح وارد کنید",Toast.LENGTH_LONG).show();
                phoneNumber.requestFocus();
            }
        }
        if(view.getId()==close.getId()){
            finish();
        }
        if(view.getId()==contactPic.getId()){
            Toast.makeText(getApplicationContext(),"شما روی عکس کلیک کردید",Toast.LENGTH_LONG).show();
        }
    }
}