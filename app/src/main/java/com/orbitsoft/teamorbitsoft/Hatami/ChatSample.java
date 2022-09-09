package com.orbitsoft.teamorbitsoft.Hatami;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class ChatSample extends AppCompatActivity {
    TextView TV;
    ImageView IV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_sample);
        TV =findViewById(R.id.text1);
        IV =findViewById(R.id.imageView1);
    }
}