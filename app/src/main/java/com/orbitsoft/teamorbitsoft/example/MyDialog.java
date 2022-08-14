package com.orbitsoft.teamorbitsoft.example;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

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
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_settings:
                AlertDialog();
                return true;
//            case R.id.help:
//                showHelp();
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
  //  @Override
    public void AlertDialog() {
        // TODO Auto-generated method stub


//                 new AlertDialog.Builder(this)
//                        .setIcon(R.drawable.ic_action_search)
//                        .setTitle("A Test Dialog")
//                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//                            public void onClick(DialogInterface dialog, int which) {
//                                // TODO Auto-generated method stub
//                                Toast.makeText(getBaseContext(), "OK", Toast.LENGTH_LONG).show();
//
//                            }
//                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//
//                            public void onClick(DialogInterface dialog, int which) {
//                                Toast.makeText(getBaseContext(), "Cancel", Toast.LENGTH_LONG).show();
//
//                            }
//                        }).setMultiChoiceItems(items, itemsChecked, new DialogInterface.OnMultiChoiceClickListener() {
//                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
//
//                                Toast.makeText(getBaseContext(), items[which] + (isChecked ? "cheched !": "unchecked"), Toast.LENGTH_LONG).show();
//
//                            }
//                        }).create();
        new AlertDialog.Builder(MyDialog.this)
                .setTitle("Delete entry")
                .setMessage("Are you sure you want to delete this entry?")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();



//        }




      //  return super.onCreateDialog(id);
    }


}