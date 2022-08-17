package com.cfsuman.me.androidcodesnippets;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private Activity mActivity;

    private LinearLayout mRootLayout;
    private Button mBtnDoTask;
    private TextView mTvResults;

    private static final int MY_PERMISSION_REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the application context
        mContext = getApplicationContext();
        mActivity = MainActivity.this;

        // Get the widget reference from xml layout
        mRootLayout = findViewById(R.id.root_layout);
        mBtnDoTask = findViewById(R.id.btn_do_task);
        mTvResults = findViewById(R.id.results);

        // Make text view scrollable
        mTvResults.setMovementMethod(new ScrollingMovementMethod());

        // Set a click listener for the button
        mBtnDoTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    checkPermission();
                }else {
                    getContacts();
                }
            }
        });
    }

    // Custom method to get contacts name and phone number
    protected void getContacts(){
        /*
            Cursor
                This interface provides random read-write access to the result
                set returned by a database query.
        */
        /*
            ContactsContract
                The contract between the contacts provider and applications. Contains definitions
                for the supported URIs and columns. These APIs supersede ContactsContract.Contacts.
        */
        /*
            ContactsContract.CommonDataKinds
                Container for definitions of common data types stored in the ContactsContract.Data table.
        */
        /*
            ContactsContract.CommonDataKinds.Phone
                A data kind representing a telephone number.
        */
        /*
            CONTENT_URI
                The content:// style URI for all data records of the CONTENT_ITEM_TYPE MIME type,
                combined with the associated raw contact and aggregate contact data.
        */
        Cursor contacts = getContentResolver().query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                null,
                null,
                null,
                null
        );
        // Empty text view
        mTvResults.setText("");

        // Loop through the contacts
        while (contacts.moveToNext())
        {
            // Get the current contact name
            String name = contacts.getString(
                    contacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME_PRIMARY));

            // Get the current contact phone number
            String phoneNumber = contacts.getString(
                    contacts.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

            // Display the contact to text view
            mTvResults.append(name);
            mTvResults.append("\n" + phoneNumber + "\n\n");
        }
        contacts.close();
    }

    protected void checkPermission(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.READ_CONTACTS)!= PackageManager.PERMISSION_GRANTED){
                if(shouldShowRequestPermissionRationale(Manifest.permission.READ_CONTACTS)){
                    // show an alert dialog
                    AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
                    builder.setMessage("Read Contacts permission is required.");
                    builder.setTitle("Please grant permission");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ActivityCompat.requestPermissions(
                                    mActivity,
                                    new String[]{Manifest.permission.READ_CONTACTS},
                                    MY_PERMISSION_REQUEST_CODE
                            );
                        }
                    });
                    builder.setNeutralButton("Cancel",null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }else {
                    // Request permission
                    ActivityCompat.requestPermissions(
                            mActivity,
                            new String[]{Manifest.permission.READ_CONTACTS},
                            MY_PERMISSION_REQUEST_CODE
                    );
                }
            }else {
                // Permission already granted
                getContacts();
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults){
        switch(requestCode){
            case MY_PERMISSION_REQUEST_CODE:{
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    // Permission granted
                    getContacts();
                }else {
                    // Permission denied
                }
            }
        }
    }
}