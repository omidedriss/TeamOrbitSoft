package com.orbitsoft.teamorbitsoft.Hatami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.orbitsoft.teamorbitsoft.R;

public class bisto_se_shahrivar extends AppCompatActivity {
    EditText ed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisto_se_shahrivar);
        ed=findViewById(R.id.ed1);
        ed.setHint("hello");
        LinearLayout ll1 = findViewById(R.id.ll1);
        EditText ed1=new EditText(this);
        LinearLayout.LayoutParams pm = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

    }




}