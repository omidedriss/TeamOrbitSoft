package com.orbitsoft.teamorbitsoft.Saeidian;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;


public class saeidian2 extends AppCompatActivity {
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saaidian2);
        Bundle bundle = getIntent().getExtras();
        test = findViewById(R.id.test);
        if(bundle!=null) {
            String Name = bundle.getString("test", "nothing");
           // Long number = bundle.getLong("test2", 12);
            test.setText("Name/Family : "+Name);
            Toast.makeText(saeidian2.this, "Name/Family : "+Name, Toast.LENGTH_LONG).show();
//+Long.toString(number)
        }

    }
}