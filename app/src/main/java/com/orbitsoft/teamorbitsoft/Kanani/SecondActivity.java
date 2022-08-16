package com.orbitsoft.teamorbitsoft.Kanani;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        Bundle name=getIntent().getExtras();
        Bundle family=getIntent().getExtras();
        Toast.makeText(this,name.getString("name")+"",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,family.getString("family")+"",Toast.LENGTH_SHORT).show();
    }
}