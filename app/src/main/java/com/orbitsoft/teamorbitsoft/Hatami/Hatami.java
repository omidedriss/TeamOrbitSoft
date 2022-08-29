package com.orbitsoft.teamorbitsoft.Hatami;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

import java.util.concurrent.TimeUnit;

public class Hatami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatami);
    }
}