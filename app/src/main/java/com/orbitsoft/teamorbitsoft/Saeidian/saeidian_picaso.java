package com.orbitsoft.teamorbitsoft.Saeidian;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;
import com.squareup.picasso.Picasso;

public class saeidian_picaso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saeidian_picaso);
        ImageView imageView = findViewById(R.id.imageView5);
        Picasso.get().load("https://static.remove.bg/remove-bg-web/c4b29bf4b97131238fda6316e24c9b3606c18000/assets/start-1abfb4fe2980eabfbbaaa4365a0692539f7cd2725f324f904565a9a744f8e214.jpg").into(imageView);


    }
}