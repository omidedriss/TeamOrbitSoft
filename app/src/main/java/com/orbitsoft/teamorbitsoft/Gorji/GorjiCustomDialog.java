package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class GorjiCustomDialog extends AppCompatActivity implements View.OnClickListener {
    private Activity gorjicustomdialog;
    private Button exit,cancel;
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji_custom_dialog);
        exit=findViewById(R.id.exit);
        cancel=findViewById(R.id.cancel);
        show=findViewById(R.id.About);
        exit.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == exit.getId())
        {
            showDialog(0);

        }
        if(view.getId()==cancel.getId()){
            showDialog(1);
        }
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id){
            case 0 :
                return new AlertDialog.Builder(this)
                        .setTitle("آیا برای خروج مطمعن هستید")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                gorjicustomdialog.finish();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                show.setText("شما از خروج منصرف شدین برای خروج روی exit کلیک کنید");
                            }
                        }).create();

            case 1:
                return new AlertDialog.Builder(this)
                        .setTitle("شما کنسل را زدید برای خروج باید Yes را بزنید :)")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                gorjicustomdialog.finish();
                            }
                        }).create();
        }

        return super.onCreateDialog(id);
    }
}