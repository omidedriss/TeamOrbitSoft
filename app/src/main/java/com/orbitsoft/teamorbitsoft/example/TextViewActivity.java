package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        Button button = findViewById(R.id.button16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout llMain = findViewById(R.id.rlMain);
                TextView textView = new TextView(TextViewActivity.this);
                textView.setText("اضافه شدن متن به صفحه");
                textView.setTextSize(28);
                //Add To Style
               // textView.setTextAppearance(TextViewActivity.this,R.style.settings_header);

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                Typeface font = Typeface.createFromAsset(getAssets(), "fonts/BNazanin.ttf");
                // Assign the typeface to the view
                textView.setTypeface(font);

                textView.setLayoutParams(params);
                llMain.addView(textView);
            }
        });

    }
}