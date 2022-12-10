package com.orbitsoft.teamorbitsoft.example;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Dialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class bluetoothActivity extends AppCompatActivity  {
    Button b1, b2, b3, b4;
    private BluetoothAdapter BA;
    private Set<BluetoothDevice> pairedDevices;
  //  BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();

    //public List<BluetoothLeScanner> Devices;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);

        BA = BluetoothAdapter.getDefaultAdapter();
        lv = (ListView) findViewById(R.id.listView);

    }

    public void on(View v) {
        askForPermission();
        if (!BA.isEnabled()) {
            Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);

            startActivityForResult(turnOn, 0);
            Toast.makeText(getApplicationContext(), "Turned on", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Already on", Toast.LENGTH_LONG).show();
        }
    }

    public void off(View v) {
        askForPermission();

        BA.disable();
        Toast.makeText(getApplicationContext(), "Turned off", Toast.LENGTH_LONG).show();
    }


    public void visible(View v) {
        askForPermission();
        Intent getVisible = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);

        startActivityForResult(getVisible, 0);
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    public void list(View v) {
        askForPermission();

        pairedDevices = BA.getBondedDevices();
       // BluetoothLeScanner Device = BA.getBluetoothLeScanner();

        ArrayList list = new ArrayList();

        for(BluetoothDevice bt : pairedDevices)
        {list.add(bt.getName());}


//        List<ScanFilter> filters = new ArrayList<>();
//        ScanFilter.Builder scanFilterBuilder = new ScanFilter.Builder();
//        filters.add(scanFilterBuilder.build());
//
//        ScanSettings.Builder settingsBuilder = new ScanSettings.Builder();
//        settingsBuilder.setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY);
//
//        BluetoothLeScanner bleScanner = adapter.getBluetoothLeScanner();
//        if (bleScanner != null) {
//            bleScanner.startScan(filters, settingsBuilder.build(), scanCallback);
//        }




        Toast.makeText(getApplicationContext(), "Showing Paired Devices",Toast.LENGTH_SHORT).show();

        final ArrayAdapter adapter = new  ArrayAdapter(this,android.R.layout.simple_list_item_1, list);

        lv.setAdapter(adapter);
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void askForPermission() {
        int hasWriteContactsPermission = checkSelfPermission(Manifest.permission.BLUETOOTH_CONNECT);
        if (hasWriteContactsPermission != PackageManager.PERMISSION_GRANTED) {
            if (!shouldShowRequestPermissionRationale(Manifest.permission.BLUETOOTH_CONNECT)) {

                new AlertDialog.Builder(bluetoothActivity.this)
                        .setTitle("Access")
                        .setMessage("You need to allow access to bluetooth")

                        // Specifying a listener allows you to take an action before dismissing the dialog.
                        // The dialog is automatically dismissed when a dialog button is clicked.
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continue with delete operation
                                requestPermissions(new String[]{Manifest.permission.BLUETOOTH_CONNECT}, 1);

                            }
                        })

                        // A null listener allows the button to dismiss the dialog and take no further action.
                        .setNegativeButton(android.R.string.no, null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();

//                 builder.create();




            }

            //return;
        }
    }
}