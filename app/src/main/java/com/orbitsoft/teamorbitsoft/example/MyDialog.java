package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class MyDialog extends AppCompatActivity {

    CharSequence[] items = {"google","apple"};
    boolean[] itemsChecked = new boolean [items.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dialog);
        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                showDialog(0);

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub

        switch(id){

            case 0:
                return new AlertDialog.Builder(this)
                        .setIcon(R.drawable.ic_action_search)
                        .setTitle("A Test Dialog")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                // TODO Auto-generated method stub
                                Toast.makeText(getBaseContext(), "OK", Toast.LENGTH_LONG).show();

                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getBaseContext(), "Cancel", Toast.LENGTH_LONG).show();

                            }
                        }).setMultiChoiceItems(items, itemsChecked, new DialogInterface.OnMultiChoiceClickListener() {
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                                Toast.makeText(getBaseContext(), items[which] + (isChecked ? "cheched !": "unchecked"), Toast.LENGTH_LONG).show();

                            }
                        }).create();




        }




        return super.onCreateDialog(id);
    }


}