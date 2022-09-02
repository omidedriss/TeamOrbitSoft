package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

import java.time.Duration;
import java.util.Random;

public class GorjiContactActivity extends AppCompatActivity {
private Button add;
private View v1;
private String name = "abbas", family ="gorji";
private long number = 9162020267l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji_contact);
        entry();
        add.setOnClickListener(v -> {
            add();
        });
    }
    public void entry(){
        add = findViewById(R.id.gorji_add);
        v1 = findViewById(R.id.linear);
    }
    public void add() {
        for (int i = 0; i < 1; i++) {
            switch (i) {
                case 0:{
                User us = new User(name, family, number);

                TextView tv = new TextView(this);
                tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                        + "\n \t" + us.getNumber());
                tv.setTextSize(22f);
                tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT
                , ViewGroup.LayoutParams.WRAP_CONTENT));
                ((LinearLayout) v1).addView(tv);}
                case 1:{
                    User us = new User("Ali", "alavi", 9632514875l);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 2:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 3:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 4:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 5:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 6:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 7:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 8:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 9:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 10:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 11:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 12:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 13:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 14:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 15:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 16:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 17:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 18:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 19:{
                    User us = new User(name, family, number);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
                case 20:{
                    User us = new User("Heshmat", "Kiani", 9135487920l);

                    TextView tv = new TextView(this);
                    tv.setText("name : " + us.getName().toString() + "\t" + us.getFamily().toString()
                            + "\n \t" + us.getNumber());
                    tv.setTextSize(22f);
                    tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
                    ((LinearLayout) v1).addView(tv);}
            }
        }
    }


}
