package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.example.IntentSample;
import com.orbitsoft.teamorbitsoft.example.MyBrowserActivity;
import com.orbitsoft.teamorbitsoft.example.MyDialog;

public class saeidian extends AppCompatActivity {
    TextView shayan;
    Button sh;
    Button aa;
    Button bb;
    Button cc;
    Button dd;
    Button ff;
    Button zz;
    int request_Code = 1;
    private static final int RESULT_PICK_CONTACT = 1;
    private TextView phone;
    private Button select;
    String phoneNo = null;
    Cursor cursor = null;
    CharSequence[] items = {"ok","ok1"};
    boolean[] itemsChecked = new boolean [items.length];
    public void saeedian(){
        new AlertDialog.Builder(saeidian.this)
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

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saaidian);
        phone = findViewById(R.id.phone);
        select = findViewById(R.id.select);
        shayan = findViewById(R.id.maztextView);
        thesheox student = new thesheox();
        sh = findViewById(R.id.button);
        aa = findViewById(R.id.button2);
        bb = findViewById(R.id.button3);
        cc = findViewById(R.id.button4);
        dd = findViewById(R.id.button5);
        Button zz = (Button) findViewById(R.id.button9);
        zz.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //showDialog(0);
                saeidiandialog customDialogClass = new saeidiandialog(saeidian.this);
              customDialogClass.show();
            }
        });
//show bmi+avg
//        student.setName("shayan");
//        student.setFamily("saeidain");
//        student.setWeight(100);
//        student.setHeight(1.75F);
//        student.setNumber(111)
//        student.setBmi(student.getWeight() / student.getHeight() / student.getHeight());
//        student.setAvg((student.getS1() + student.getS2() + student.getS3() + student.getS4() + student.getS5() + student.getS6() + student.getS7()) / 7);
//        shayan.setText("idnumber : " + student.getNumber() + "\n" + "name : " + student.getName() + "\n" + "family : " + student.getFamily() + "\n" + "height : " + student.getHeight() + "\n" + "weight : " + student.getWeight() + "avg : " + student.getAvg() + "\n" + "bmi : " + student.getBmi());
//       sh.setOnClickListener(v -> {
//            Intent imaz=new Intent(this, Mazaheri.class);
//            startActivity(imaz);
//        });



//        }




        //  return super.onCreateDialog(id);

        sh.setOnClickListener(view -> {
            Intent i = new
                    Intent(saeidian.this, saeidian2.class);
            Bundle bundle = new Bundle();
            //bundle.putString("test","shayan saeidian");
            i.putExtras(bundle);
            startActivity(i);
            // Intent imaz=new Intent(saeidian.this, Gorji.class);
            // bundle.putLong("saeidian",12);
            // bundle.putLong("test2",12);
        });
        //open a website
        aa.setOnClickListener(view ->
        {
//            Intent i = new
//                    Intent("android.intent.action.VIEW");
//            i.setData(Uri.parse("http://www.instagram.com/bigezmoge"));
//            i.setPackage("com.instagram.android");
//
//            startActivity(i);
            Intent i = new
                    Intent(saeidian.this, saeidianBrowser.class);
            Bundle bundle = new Bundle();
            bundle.putLong("testputLong",12);
            i.putExtra("test", bundle);
            i.setData(Uri.parse("https://www.google.com"));
            startActivity(i);
        });
        //put a number to dial
        bb.setOnClickListener(view ->
        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_DIAL,
                    Uri.parse("tel:09173929711"));
            startActivity(i);
        });
        //open map
        cc.setOnClickListener(view ->
        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("geo:37.827500,-122.481670"));
            startActivity(i);
        });
        //call a number
        dd.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:09389970343"));
            startActivity(i);
        });

//get number from contact anf call
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(in, RESULT_PICK_CONTACT);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {

            Uri uri = data.getData();
            cursor = getContentResolver().query(uri, null, null, null, null);
            cursor.moveToFirst();
            int phoneIndex = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            phoneNo = cursor.getString(phoneIndex);
            //phone.setText (phoneNo);

        } else {
            Toast.makeText(this, "Failed To pick contact", Toast.LENGTH_SHORT).show();
        }
        Log.d("phone", phoneNo);
        Intent i = new
                Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNo));
        startActivity(i);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id){
            case 0:
                return new AlertDialog.Builder(this)
                        .setIcon(R.drawable.ic_action_search)
                        .setTitle("saeidian")
                        .setPositiveButton("true", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                // TODO Auto-generated method stub
                                Toast.makeText(getBaseContext(), "true", Toast.LENGTH_LONG).show();

                            }
                        }).setNegativeButton("false", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getBaseContext(), "false", Toast.LENGTH_LONG).show();

                            }
                        })
                        .setMultiChoiceItems(items, itemsChecked, new DialogInterface.OnMultiChoiceClickListener() {
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                                Toast.makeText(getBaseContext(), items[which] + (isChecked ? "cheched !": "unchecked"), Toast.LENGTH_LONG).show();

                            }
                        })
                        .create();
        }



        return super.onCreateDialog(id);
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
                  saeedian();
                return true;
//            case R.id.help:
//                showHelp();
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    }





