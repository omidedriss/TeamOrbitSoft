package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class GorjiChat extends AppCompatActivity {
TextView tv;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji_chat);
        tv=findViewById(R.id.text_tm);
        img=findViewById(R.id.imageView_tm);
    }
}