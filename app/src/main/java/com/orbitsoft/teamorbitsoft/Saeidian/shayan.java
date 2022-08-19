package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AlertDialog;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.saeidian_custom_dialog);
    }
    public void btn_showDialog(View view)
    {
final AlertDialog.Builder alert=new AlertDialog.Builder(shayan.this);
View mView=getLayoutInflater().inflate(R.layout.saeidiancustomdialog,null);
Button name = (Button)mView.findViewById(R.id.name2);
        Button family = (Button)mView.findViewById(R.id.family2);
        alert.setView(mView);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(shayan.this, "shayan", Toast.LENGTH_SHORT).show();
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(shayan.this, "saeidain", Toast.LENGTH_SHORT).show();
            }
        });
    }
}