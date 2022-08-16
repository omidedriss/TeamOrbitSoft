package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class SecendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
        Bundle bl = getIntent().getExtras();
        if(bl!=null) {
            String name = "";
            String family = "";
            String company = "No Company";

            name = getIntent().getExtras().getString("name").toString().trim();
            Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();



            family =  bl.getString("family").toString().trim();
            Toast.makeText(getApplicationContext(),family,Toast.LENGTH_LONG).show();

            if(bl.containsKey("company")){
                company = bl.getString("company").toString().trim();
                Toast.makeText(getApplicationContext(),company,Toast.LENGTH_LONG).show();}

        }
    }
}