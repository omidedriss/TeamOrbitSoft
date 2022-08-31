package com.orbitsoft.teamorbitsoft.Nikkhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class contact_list extends AppCompatActivity {
    private TextView tx;
    String t="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        String[] title = {"Name:", "phon Number:", "\t\t\t", "\n\n"};
        String[] name = {"hossein nikoo1", "hossein nikoo2","hossein nikoo3","hossein nikoo4","hossein nikoo5",
                "hossein nikoo6"};
        String[] phon_nember = {"09395330036"};

        for(int i=0;i<5;i++) {

            t=t+("Name:" + "\t\t" + name[i] + "\n" + "phon Number:" + phon_nember[0] + "\n\n\n\n");

            tx = (TextView) findViewById(R.id.tx);
            tx.setText(t);
        }
    }
}