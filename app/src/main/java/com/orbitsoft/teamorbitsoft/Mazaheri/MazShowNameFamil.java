package com.orbitsoft.teamorbitsoft.Mazaheri;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class MazShowNameFamil extends AppCompatActivity {
TextView welcome;
Button logout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazshownamefamil);

      //نام با باندل دریافت شد
      Bundle bundle = getIntent().getExtras();
       if(bundle!=null){
            String hotelName = bundle.getString("name","");
       }


        String siname = bundle.getString("name");

        logout=findViewById(R.id.button2);
        welcome=findViewById(R.id.textView3);

        Intent mint=new Intent(MazShowNameFamil.this, Mazaheri.class);
       //فامیل با اینتنت دریافت شد
        String sifamil=getIntent().getStringExtra("famil");
        String fullname=siname+" "+sifamil;

        welcome.setText(fullname);

        logout.setOnClickListener(v -> {
            startActivity(mint);



        });
    }
}