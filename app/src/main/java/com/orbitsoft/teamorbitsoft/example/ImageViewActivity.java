package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.orbitsoft.teamorbitsoft.R;
import com.squareup.picasso.Picasso;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        ImageView imageView = findViewById(R.id.image);
        Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(imageView);


    }
}