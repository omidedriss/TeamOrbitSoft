package com.orbitsoft.teamorbitsoft.Hatami;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;

import com.orbitsoft.teamorbitsoft.R;

public class Radio_Button extends AppCompatActivity {

    TextView textView;
    Spinner spinner;
    ArrayAdapter adapter;
    RadioGroup radioGroup;
    MediaPlayer mediaPlayer;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        textView = findViewById(R.id.tvitems);
        spinner = findViewById(R.id.spinneritem);
        radioGroup = findViewById(R.id.radiogroupitem);

        adapter = ArrayAdapter.createFromResource(this, R.array.colours_name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


                switch (i) {
                    case R.id.rdone:
                        textView.setText("RED");
                        textView.setTextColor(RED);

                        break;


                    case R.id.rdtwo:
                        textView.setText("GREEN");
                        textView.setTextColor(GREEN);
                        break;
                }
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                itemselected();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void itemselected() {
        String color = spinner.getSelectedItem().toString();

        if (color.equals("RED")) {

            textView.setText("RED");
            textView.setTextColor(RED);


        }
        if (color.equals("YELLOW")) {

            textView.setText("YELLOW");
            textView.setTextColor(YELLOW);


        }
        if (color.equals("GREEN")) {

            textView.setText("GREEN");
            textView.setTextColor(GREEN);

        }


    }

    public void red(View view) {

    }

    public void green(View view) {


    }
}
