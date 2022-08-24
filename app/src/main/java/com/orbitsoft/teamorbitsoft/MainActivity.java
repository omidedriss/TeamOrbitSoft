package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orbitsoft.teamorbitsoft.Gorji.Gorji;
import com.orbitsoft.teamorbitsoft.Hatami.Hatami;
import com.orbitsoft.teamorbitsoft.Kanani.Kanani;
import com.orbitsoft.teamorbitsoft.Mazaheri.Mazaheri;


import com.orbitsoft.teamorbitsoft.Nikkhu.Nikkhu;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian;
import com.orbitsoft.teamorbitsoft.Saeidian2.saeidian2_main;
import com.orbitsoft.teamorbitsoft.Saeidian2.saeidian_login1;
import com.orbitsoft.teamorbitsoft.Salimi.SalimiActivity;
import com.orbitsoft.teamorbitsoft.example.IntentSample;
import com.orbitsoft.teamorbitsoft.example.LifeCycleActivity;
import com.orbitsoft.teamorbitsoft.example.MyDialog;

public class MainActivity extends AppCompatActivity {
Button btGorji;
Button btmaz,btMoosavi,btSaeedian,btSaeidian2,btSaeidian2_main,btHatami,btIntent,btLifeCycle,btNickQue,my_dialog,btSalimi,btKanani;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNickQue = findViewById(R.id.btNickQue);
        btGorji = findViewById(R.id.btactivity_gorji);
        btmaz=findViewById(R.id.btmaz);
        btMoosavi=findViewById(R.id.moosavi);
        btSaeedian=findViewById(R.id.saeedian);
        //btSaeidian2_main=findViewById(R.id.saeidian2);
        btHatami=findViewById(R.id.hatami);
        btSalimi=findViewById(R.id.Salimi);
        btKanani=findViewById(R.id.Kanani);
        btIntent=findViewById(R.id.intent);
        btLifeCycle=findViewById(R.id.life_cycle);
        my_dialog=findViewById(R.id.my_dialog);


        btGorji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gorji = new Intent(getApplicationContext(), Gorji.class);
                startActivity(gorji);
            }
        });

        btmaz.setOnClickListener(v -> {
                Intent imaz=new Intent(this, Mazaheri.class);
                startActivity(imaz);
                }
        );
        btSaeedian.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, saeidian_login1.class);
                    startActivity(imaz);
                }
        );
//        btSaeidian2_main.setOnClickListener(v -> {
//                    Intent imaz=new Intent(this, saeidian_login1.class);
//                    startActivity(imaz);
//                }
//        );
        btMoosavi.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, login_moosavi.class);
                    startActivity(imaz);
                }
        );
        btHatami.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, Hatami.class);
                    startActivity(imaz);
                }
        );
        btIntent.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, IntentSample.class);
                    startActivity(imaz);
                }
        );
        btLifeCycle.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, LifeCycleActivity.class);
                    startActivity(imaz);
                }
        );
        btNickQue.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, Nikkhu.class);
                    startActivity(imaz);
                }
        );
        btSalimi.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, SalimiActivity.class);
                    startActivity(imaz);
                }
        );
        btKanani.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, Kanani.class);
                    startActivity(imaz);
                }
        );
        my_dialog.setOnClickListener(v -> {
                    Intent imaz=new Intent(this, MyDialog.class);
                    startActivity(imaz);
                }
        );


    }
}