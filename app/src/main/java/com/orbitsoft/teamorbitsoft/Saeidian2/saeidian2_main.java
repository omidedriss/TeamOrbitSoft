package com.orbitsoft.teamorbitsoft.Saeidian2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian2;

public class saeidian2_main extends AppCompatActivity {
    Button buttonx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_login1);
        buttonx = (Button) findViewById(R.id.buttonx);

//        buttonx.setOnClickListener((new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent i =new
//
//                        Intent(saeidian2_main .this, saeidian_login3 .class);
//
//                Bundle bundle = new Bundle();
//                i.putExtras(bundle);
//
//                startActivity(i);
//            }
//
//
//        }));

    }
}