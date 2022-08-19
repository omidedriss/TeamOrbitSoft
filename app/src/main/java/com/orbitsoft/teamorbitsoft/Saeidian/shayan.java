package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class shayan extends AppCompatActivity {
    private Dialog dialog;
    private Button ShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dialog.setContentView(R.layout.activity_shayan);

        //setContentView(R.layout.activity_shayan);

        //ShowDialog = findViewById(R.id.dialog_btn);

        //Create the Dialog here
        dialog = new Dialog(this);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false); //Optional
        //dialog.getWindow().getAttributes().windowAnimations = Build.VERSION_CODES.R.style.DialogAnimation; //Setting the animations to dialog
        Button Okay = dialog.findViewById(R.id.btn_okay);
        Button Cancel = dialog.findViewById(R.id.btn_cancel);
dialog.show();
        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(shayan.this, "Okay", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(shayan.this, "Cancel", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });





    }
}