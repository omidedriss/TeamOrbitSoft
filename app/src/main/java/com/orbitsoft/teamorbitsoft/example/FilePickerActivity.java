package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.orbitsoft.teamorbitsoft.R;

public class FilePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_picker);
        Button b = findViewById(R.id.button17);
        //https://github.com/salehyarahmadi/FileAndFolderPicker?utm_source=android-arsenal.com&utm_medium=referral&utm_campaign=8131
        //https://github.com/TutorialsAndroid/FilePicker?utm_source=android-arsenal.com&utm_medium=referral&utm_campaign=7663
        //https://android-arsenal.com/details/1/7635



        // pdf
        //https://android-arsenal.com/details/1/3761
        //https://android-arsenal.com/details/1/7820
        //https://android-arsenal.com/details/1/3155
        //https://android-arsenal.com/details/1/1332

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(permissionGranted()) {
                    SingleFilePickerDialog singleFilePickerDialog = new SingleFilePickerDialog(this,
                            () -> Toast.makeText(FilePickerActivity.this, "Canceled!!", Toast.LENGTH_SHORT).show(),
                            files -> Toast.makeText(FilePickerActivity.this, files[0].getPath(), Toast.LENGTH_SHORT).show());
                    singleFilePickerDialog.show();
                }
                else{
                    requestPermission();
                }

//                For select multiple files



//                if(permissionGranted()) {
//                    MultiFilePickerDialog multiFilePickerDialog = new MultiFilePickerDialog(this,
//                            () -> Toast.makeText(MainActivity.this, "Canceled!!", Toast.LENGTH_SHORT).show(),
//                            files -> Toast.makeText(MainActivity.this, files[0].getPath(), Toast.LENGTH_SHORT).show()
//                    );
//                    multiFilePickerDialog.show();
//                }
//                else{
//                    requestPermission();
//                }



//                For select directory


//                if(permissionGranted()) {
//                    DirectoryPickerDialog directoryPickerDialog = new DirectoryPickerDialog(this,
//                            () -> Toast.makeText(MainActivity.this, "Canceled!!", Toast.LENGTH_SHORT).show(),
//                            files -> Toast.makeText(MainActivity.this, files[0].getPath(), Toast.LENGTH_SHORT).show()
//                    );
//                    directoryPickerDialog.show();
//                }
//                else{
//                    requestPermission();
//                }
            }
        });
    }

    private boolean permissionGranted(){
        return ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
                && ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
    }
    private void requestPermission(){
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
    }
}