package com.orbitsoft.teamorbitsoft.example;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class BackgroundServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_service);


        final TextView text = findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString().equals("Started")) {
                    text.setText("Stoped");
                    stopService(new Intent(BackgroundServiceActivity.this,MyService.class));
                } else {
                    text.setText("Started");
                    startService(new Intent(BackgroundServiceActivity.this,MyService.class));
                }
            }
        });

        final TextView text2 = findViewById(R.id.text2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text2.getText().toString().equals("Started")) {
                    text2.setText("Stoped");
                    stopService(new Intent(BackgroundServiceActivity.this,MyIntentService.class));
                } else {
                    text2.setText("Started");
                    startService(new Intent(BackgroundServiceActivity.this,MyIntentService.class));
                }
            }
        });

        final TextView text3 = findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                if (text3.getText().toString().equals("Started")) {
                    text3.setText("Stoped");

                } else {
                    text3.setText("Started");

                }


                final int lState = SoundService.getState();
                if (lState == MusicConstants.STATE_SERVICE.NOT_INIT) {
                    if (!NetworkHelper.isInternetAvailable(v.getContext())) {
//                        showError(v);
                        return;
                    }
                    Intent startIntent = new Intent(v.getContext(), SoundService.class);
                    startIntent.setAction(MusicConstants.ACTION.START_ACTION);
                    startService(startIntent);
                } else if (lState == MusicConstants.STATE_SERVICE.PREPARE ||
                        lState == MusicConstants.STATE_SERVICE.PLAY) {
                    Intent lPauseIntent = new Intent(v.getContext(), SoundService.class);
                    lPauseIntent.setAction(MusicConstants.ACTION.PAUSE_ACTION);
                    PendingIntent lPendingPauseIntent = PendingIntent.getService(v.getContext(), 0, lPauseIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                    try {
                        lPendingPauseIntent.send();
                    } catch (PendingIntent.CanceledException e) {
                        e.printStackTrace();
                    }
                } else if (lState == MusicConstants.STATE_SERVICE.PAUSE) {
                    if (!NetworkHelper.isInternetAvailable(v.getContext())) {
//                        showError(v);
                        return;
                    }
                    Intent lPauseIntent = new Intent(v.getContext(), SoundService.class);
                    lPauseIntent.setAction(MusicConstants.ACTION.PLAY_ACTION);
                    PendingIntent lPendingPauseIntent = PendingIntent.getService(v.getContext(), 0, lPauseIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                    try {
                        lPendingPauseIntent.send();
                    } catch (PendingIntent.CanceledException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

    }
}