package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.orbitsoft.teamorbitsoft.R;

public class AnimationActivity extends AppCompatActivity {

    private ProgressDialog progressBar;
    private AnimationDrawable myAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        // ImageView imageView = (ImageView) findViewById(R.id.imv);
        LinearLayout ll = (LinearLayout) findViewById(R.id.LinearLayout1);



        new Thread(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ll.setBackgroundResource(R.drawable.anim);
                        myAnimation = (AnimationDrawable) ll.getBackground();
                        myAnimation.start();
                    }
                });
            }
        }).start();



    }
}