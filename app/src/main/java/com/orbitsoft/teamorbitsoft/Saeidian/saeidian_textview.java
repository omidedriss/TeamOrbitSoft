package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class saeidian_textview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_textview);
        Button aa=findViewById(R.id.button16);
        Button saeidian_button=findViewById(R.id.shayan_button);
        saeidian_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout saeidian = findViewById(R.id.shayan_linear);
                TextView saeidian_textview=new TextView(saeidian_textview.this);
                Typeface saeidian_font = Typeface.createFromAsset(getAssets(), "saeidian_font/IranNastaliq.ttf");
                // Assign the typeface to the view
                saeidian_textview.setTypeface(saeidian_font);

                saeidian_textview.setText("شایان سعیدیان");
                saeidian_textview.setTextColor(Color.BLACK);
                saeidian_textview.setTextSize(100);

                LinearLayout.LayoutParams saeidian_layout  =new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT

                );
                saeidian_layout.setMargins(0,0,200,0);
                saeidian_textview.setLayoutParams(saeidian_layout);
                saeidian.addView(saeidian_textview);
            }
        });
    }
}