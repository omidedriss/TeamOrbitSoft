package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class saeidian_chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_chat);
        TextView chat=findViewById(R.id.chat);
    }
}