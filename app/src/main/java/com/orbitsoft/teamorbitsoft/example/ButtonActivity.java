package com.orbitsoft.teamorbitsoft.example;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_view);

        Student student = new Student();
        student.setName("test");

        Button button = findViewById(R.id.button16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout llMain = findViewById(R.id.rlMain);
                Button button = new Button(ButtonActivity.this);
                button.setText("اضافه شدن دکمه به صفحه");
                button.setTextSize(28);
                //Add To Style
               // textView.setTextAppearance(TextViewActivity.this,R.style.settings_header);

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                Typeface font = Typeface.createFromAsset(getAssets(), "fonts/BNazanin.ttf");
                // Assign the typeface to the view
                button.setTypeface(font);

                button.setLayoutParams(params);
                llMain.addView(button);
            }
        });


        Button button1 = findViewById(R.id.textView7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "Test Click", Toast.LENGTH_LONG).show();
            }
        });
    }
}