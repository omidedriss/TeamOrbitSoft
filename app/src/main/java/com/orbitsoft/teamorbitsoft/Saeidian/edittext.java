package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.orbitsoft.teamorbitsoft.R;

public class edittext extends AppCompatActivity {
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edittext);
         EditText a1 = findViewById(R.id.a1);
        EditText a2= findViewById(R.id.a2);
        EditText  a3 = findViewById(R.id.a3);
        Button  a4=findViewById(R.id.a4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(i%2==0) {
                    a3.setInputType(InputType.TYPE_CLASS_PHONE);
                }
                if(i%2==1) {
                    a3.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });

    }
}