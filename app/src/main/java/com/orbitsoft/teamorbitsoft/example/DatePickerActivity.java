package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

import java.util.Locale;

public class DatePickerActivity extends AppCompatActivity {
    DatePicker picker;
    Button displayDate;
    TextView textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

//        Locale l= new Locale("fa");
//        Locale.setDefault(l);
//        Configuration configuration = DatePickerActivity.this.getResources().getConfiguration();
//        configuration.setLocale(l);
//        configuration.setLayoutDirection(l);

        Locale locale = new Locale("fa");
        Locale.setDefault(locale);
        Resources resources = DatePickerActivity.this.getResources();
        Configuration config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
        //https://github.com/aliab/Persian-Date-Picker-Dialog
        textview1=(TextView)findViewById(R.id.textView1);
        picker=(DatePicker)findViewById(R.id.datePicker);
        displayDate=(Button)findViewById(R.id.button1);

        textview1.setText("Current Date: "+getCurrentDate());

        displayDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                textview1.setText("Change Date: "+getCurrentDate());
            }

        });

    }
    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();;
        builder.append((picker.getMonth() + 1)+"/");//month is 0 based
        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear());
        return builder.toString();
    }
}