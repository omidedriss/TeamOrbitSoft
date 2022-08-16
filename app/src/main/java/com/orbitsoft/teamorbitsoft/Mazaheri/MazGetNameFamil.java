package com.orbitsoft.teamorbitsoft.Mazaheri;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class MazGetNameFamil extends AppCompatActivity {
Button btmazsendnamefamil;
TextView mazname,mazfamil;
EditText mazedname,mazedfamil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazgetnamefamil);

        btmazsendnamefamil=findViewById(R.id.button);
        mazname=findViewById(R.id.maztextView);
        mazfamil=findViewById(R.id.textView2);
        mazedname=findViewById(R.id.editTextTextPersonName);
        mazedfamil=findViewById(R.id.editTextTextPersonName2);

        Intent mint=new Intent(MazGetNameFamil.this, MazShowNameFamil.class);


        btmazsendnamefamil.setOnClickListener(v -> {
            String sname=mazedname.getText().toString();
            String sfamil=mazedfamil.getText().toString();

            mint.putExtra("name",sname);
            mint.putExtra("famil",sfamil);



            startActivity(mint);
        });

    }
}