package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orbitsoft.teamorbitsoft.R;

public class Gorji extends AppCompatActivity implements View.OnClickListener {
Button insta,myInfo,metaco,exit;

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
        if(v . equals(insta.getId())){

        }
        if(v.equals(myInfo.getId())){

        }
        if(v.equals(metaco.getId())){

        }
        if(v.equals(exit.getId())){
            
        }

    }
}