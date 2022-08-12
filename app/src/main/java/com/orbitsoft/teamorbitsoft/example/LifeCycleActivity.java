package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.orbitsoft.teamorbitsoft.R;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onStart() {
        Log.d("lifecycle", "onstart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d("lifecycle", "onrestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d("lifecycle", "onresume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("lifecycle", "pause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("lifecycle", "onstop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifecycle", "ondestroy");
        super.onDestroy();
    }

}