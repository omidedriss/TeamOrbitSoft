package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.orbitsoft.teamorbitsoft.R;

public class code_textview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_textview);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.back);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.image_shayan);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
//        layoutParams.addRule(RelativeLayout.BELOW, R.id.ButtonRecalculate);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        layoutParams.addRule(RelativeLayout.ALIGN_BOTTOM);

        relativeLayout.addView(imageView, layoutParams);

    }
}