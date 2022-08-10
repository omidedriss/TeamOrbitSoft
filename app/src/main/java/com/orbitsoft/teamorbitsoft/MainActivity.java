package com.orbitsoft.teamorbitsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btGorji;
Button btmaz,btMoosavi,btSaeedian,btHatami,btIntent,btLifeCycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btGorji = findViewById(R.id.btactivity_gorji);
        btmaz=findViewById(R.id.btmaz);
        btMoosavi=findViewById(R.id.moosavi);
        btSaeedian=findViewById(R.id.saeedian);
        btHatami=findViewById(R.id.hatami);
        btIntent=findViewById(R.id.intent);
        btLifeCycle=findViewById(R.id.life_cycle);

        btGorji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gorji = new Intent(getApplicationContext(),Gorji.class);
                startActivity(gorji);

            }
        });

        btmaz.setOnClickListener(v -> {
                Intent imaz=new Intent(this,Mazaheri.class);
                startActivity(imaz);
                }
        );
        btSaeedian.setOnClickListener(v -> {
                    Intent imaz=new Intent(this,Saaedian.class);
                    startActivity(imaz);
                }
        );
        btMoosavi.setOnClickListener(v -> {
                    Intent imaz=new Intent(this,Moosavi.class);
                    startActivity(imaz);
                }
        );
        btHatami.setOnClickListener(v -> {
                    Intent imaz=new Intent(this,Hatami.class);
                    startActivity(imaz);
                }
        );
        btIntent.setOnClickListener(v -> {
                    Intent imaz=new Intent(this,IntentSample.class);
                    startActivity(imaz);
                }
        );
        btLifeCycle.setOnClickListener(v -> {
                    Intent imaz=new Intent(this,IntentSample.class);
                    startActivity(imaz);
                }
        );

    }
}