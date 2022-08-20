package com.orbitsoft.teamorbitsoft.Salimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class SecondActivitySalimi extends AppCompatActivity {
    public static final String KYE_NAME = "name";
    public static final String KYE_LASTNAME = "lastname";
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second_salimi );
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString(KYE_NAME);
        String lastname = bundle.getString(KYE_LASTNAME);
        text = findViewById(R.id.textView3);
        text.setText(name +" "+ lastname);
    }
}