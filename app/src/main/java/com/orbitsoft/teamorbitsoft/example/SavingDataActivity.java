package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class SavingDataActivity extends AppCompatActivity {

    // creating variables for our edittext, button and dbhandler
    private EditText courseNameEdt, courseTracksEdt, courseDurationEdt, courseDescriptionEdt;
    private Button addCourseBtn;
    private DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saving_data);

        SharedPreferences sharedpreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedpreferences.edit();
//        editor.putString("key", "value Test");
//        editor.commit();
     String data=   sharedpreferences.getString("key","not Set");
        Toast.makeText(SavingDataActivity.this,data,Toast.LENGTH_LONG ).show();

// initializing all our variables.
        courseNameEdt = findViewById(R.id.idEdtCourseName);
        courseTracksEdt = findViewById(R.id.idEdtCourseTracks);
        courseDurationEdt = findViewById(R.id.idEdtCourseDuration);
        courseDescriptionEdt = findViewById(R.id.idEdtCourseDescription);
        addCourseBtn = findViewById(R.id.idBtnAddCourse);

        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(SavingDataActivity.this);

//      ArrayList cource= dbHandler.getAllCource();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                ArrayList cource=   dbHandler.getAllCource();
//            }
//        }).start();
        ArrayList cource=   dbHandler.getAllCource();
        ArrayAdapter adapter = new ArrayAdapter<String>(SavingDataActivity.this, R.layout.listview_item,cource);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // below line is to add on click listener for our add course button.
        addCourseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // below line is to get data from all edit text fields.
                String courseName = courseNameEdt.getText().toString();
                String courseTracks = courseTracksEdt.getText().toString();
                String courseDuration = courseDurationEdt.getText().toString();
                String courseDescription = courseDescriptionEdt.getText().toString();

                // validating if the text fields are empty or not.
                if (courseName.isEmpty() && courseTracks.isEmpty() && courseDuration.isEmpty() && courseDescription.isEmpty()) {
                    Toast.makeText(SavingDataActivity.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }

                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.
                dbHandler.addNewCourse(courseName, courseDuration, courseDescription, courseTracks);

                // after adding the data we are displaying a toast message.
                Toast.makeText(SavingDataActivity.this, "Course has been added.", Toast.LENGTH_SHORT).show();
                courseNameEdt.setText("");
                courseDurationEdt.setText("");
                courseTracksEdt.setText("");
                courseDescriptionEdt.setText("");
            }
        });


    }
}