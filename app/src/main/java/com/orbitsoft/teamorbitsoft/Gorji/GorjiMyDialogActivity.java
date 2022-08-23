package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

import java.util.Queue;

public class GorjiMyDialogActivity extends AppCompatActivity implements View.OnClickListener {
private Button dialog;
private TextView infoGorji;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji_my_dialog);
        dialog=findViewById(R.id.Gorji_Dialog);
        infoGorji = findViewById(R.id.Info_Gorji);
        dialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        showDialog(0);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id){
            case 0 :
                Toast.makeText(getApplicationContext(),"درصورت زدن close صفحه بسته میشود",Toast.LENGTH_LONG).show();
                return new  AlertDialog.Builder(this)
                        .setIcon(R.drawable.ic_action_search)
                        .setTitle("درباره عباس گرجی")
                        .setPositiveButton("About Gorji", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                infoGorji.setText("نام:عباس \n" +
                                        "فامیل : گرجی\n" +
                                        "سن:25\n" +
                                        "دانشجوی رشته نرم افزار\n" +
                                        "درحال آموزش اندروید در مجوعه آموزشی متاکو \n" +
                                        "id tel : abbas1gorji\n" +
                                        "id instagram : abbas1gorji\n" );

                            }
                        })
                        .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"صفحه بسته شد :)",Toast.LENGTH_LONG).show();
                                finish();
                            }
                        })
                        .create();

        }


        return super.onCreateDialog(id);
    }
}