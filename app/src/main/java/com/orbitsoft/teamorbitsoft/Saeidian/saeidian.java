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
import com.orbitsoft.teamorbitsoft.Saeidian2.saeidian_factorial;
import com.orbitsoft.teamorbitsoft.Saeidian2.saeidian_login1;
import com.orbitsoft.teamorbitsoft.Saeidian2.test_fact;

import java.util.ArrayList;
import java.util.List;

public class saeidian extends AppCompatActivity {

    TextView shayan;
    Button name;
    Button browser;
    Button dial;
    Button map;
    Button call;
    Button contact ;
    Button exit;
    Button factorial;
    Button bmi;
    public Button name2,family2;
    //private Dialog dialog;
    private List<String>list;
    int request_Code = 1;
    private static final int RESULT_PICK_CONTACT = 1;
    private TextView phone;
    private Button select;
    String phoneNo = null;
    Cursor cursor = null;
    CharSequence[] items = {"name","family","age"};
    boolean[] itemsChecked = new boolean [items.length];

    public void saeedian(){
        saeidiandialog customDialogClass = new saeidiandialog(saeidian.this);
        customDialogClass.show();
//        new AlertDialog.Builder(saeidian.this)
//                .setTitle("Delete entry")
//                .setMessage("Are you sure you want to delete this entry?")
//
//                // Specifying a listener allows you to take an action before dismissing the dialog.
//                // The dialog is automatically dismissed when a dialog button is clicked.
//                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int which) {
//                        // Continue with delete operation
//                    }
//                })
//
//                // A null listener allows the button to dismiss the dialog and take no further action.
//                .setNegativeButton(android.R.string.no, null)
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .show();
//
    }
    //public void CreateAlertDialog() {
//    list = new ArrayList<>();
//    AlertDialog.Builder builder = new AlertDialog.Builder(this);
//    builder.setTitle("info");
//    builder.setMultiChoiceItems(R.array.info, null, (dialog, which, isChecked) -> {
//        String arr[] = getResources().getStringArray(R.array.info);
//
//if (isChecked)
//{
//    list.add(arr[which]);
//} else if (list.contains(arr[which]))
//{
//    list.remove(arr[which]);
//}
//    });
//
//        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
//
//        public void onClick(DialogInterface dialog, int which) {
//            String data = "";
//            for (String item : list)
//            {
//                data = data + item;
//            }
//            Toast.makeText(saeidian.this, data, Toast.LENGTH_LONG).show();
//
//        }
//    });
//
//
//}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        test_fact shayan_fact=new test_fact();
        int fact=shayan_fact.test_fact(5);
//        Toast.makeText(saeidian.this,Integer.toString(fact),Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_saaidian);
factorial=(Button) findViewById(R.id.fact);
        phone = findViewById(R.id.phone);
        contact = findViewById(R.id.contact);
        shayan = findViewById(R.id.maztextView);
        //thesheox student = new thesheox();
        name = findViewById(R.id.name);
        browser = findViewById(R.id.browser);
        dial = findViewById(R.id.dial);
        map = findViewById(R.id.map);
        call = findViewById(R.id.call);
        //bmi = findViewById(R.id.button6);
//         exit = (Button) findViewById(R.id.exit);
//        exit.setOnClickListener(new View.OnClickListener() {
//////dialog
//            public void onClick(View v) {
//               //showDialog(0);
//                saeidiandialog customDialogClass = new saeidiandialog(saeidian.this);
//              customDialogClass.show();
//            }
//        });
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
        factorial.setOnClickListener(view -> {
            Intent i = new
                    Intent(saeidian.this, saeidian_factorial.class);
            Bundle bundle = new Bundle();
            i.putExtras(bundle);
            startActivity(i);
        });
        name.setOnClickListener(view -> {
            Intent i = new
                    Intent(saeidian.this, saeidian2.class);
            Bundle bundle = new Bundle();
            i.putExtras(bundle);
            startActivity(i);
            //bundle.putString("test","shayan saeidian");
            // Intent imaz=new Intent(saeidian.this, Gorji.class);
            // bundle.putLong("saeidian",12);
            // bundle.putLong("test2",12);
        });
        //open a website in app
        browser.setOnClickListener(new View.OnClickListener() {
            //dialog
            public void onClick(View v) {
//             Intent i = new
//                    Intent("android.intent.action.VIEW");
//            i.setData(Uri.parse("http://www.instagram.com/bigezmoge"));
//            i.setPackage("com.instagram.android");
//
//            startActivity(i);
                Intent i = new
                        Intent(saeidian.this, saeidianBrowser.class);
                Bundle bundle = new Bundle();
                bundle.putLong("testputLong", 12);
                i.putExtra("test", bundle);
                i.setData(Uri.parse("http://www.amazon.com"));
                startActivity(i);
            }
        });
        //put a number to dial
        dial.setOnClickListener(view ->
        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_DIAL,
                    Uri.parse("tel:09173929711"));
            startActivity(i);
        });
        //open map
        map.setOnClickListener(view ->
        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("geo:37.827500,-122.481670"));
            startActivity(i);
        });
        //call a number
        call.setOnClickListener(view ->

        {
            Intent i = new
                    Intent(android.content.Intent.ACTION_CALL,
                    Uri.parse("tel:09389970343"));
            startActivity(i);
        });

//get number from contact anf call
        contact.setOnClickListener(view ->

        {
            Intent in = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
            startActivityForResult(in, RESULT_PICK_CONTACT);
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
        list = new ArrayList<>();
        switch (id){
            case 0:
                return new AlertDialog.Builder(this)
                        .setIcon(R.drawable.ic_action_search)
                        .setTitle("info")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                String data = "";
                                for (String item : list)
                                {
                                    data = data +" "+ item;
                                }
                                Toast.makeText(saeidian.this, data, Toast.LENGTH_LONG).show();


                            }
                        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getBaseContext(), "cancel", Toast.LENGTH_LONG).show();

                            }
                        })
                        .setMultiChoiceItems(R.array.info, null, new DialogInterface.OnMultiChoiceClickListener() {
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                String arr[] = getResources().getStringArray(R.array.info);

                                if (isChecked)
                                {
                                    list.add(arr[which]);
                                } else if (list.contains(arr[which]))
                                {
                                    list.remove(arr[which]);
                                }
                            }
                        })
                        .create();
            case 1:
                return new AlertDialog.Builder(this)
                        .setIcon(R.drawable.ic_action_search)
                        .setTitle("info")
                        .setMessage("shayan saeidian 18 student")
                        .create();
        }



        return super.onCreateDialog(id);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.saeidianmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_instagram:
                Intent i = new
                        Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("http://www.instagram.com/bigezmoge"));
                i.setPackage("com.instagram.android");

                startActivity(i);
                return true;
            case R.id.menu_exit:
                saeedian();
                return true;
            case R.id.menu_metaco:
                Intent b = new
                        Intent("android.intent.action.VIEW");
                b.setData(Uri.parse("http://tr.metacomplex.com"));
                startActivity(b);
                return true;
            case R.id.menu_info:
                showDialog(1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
