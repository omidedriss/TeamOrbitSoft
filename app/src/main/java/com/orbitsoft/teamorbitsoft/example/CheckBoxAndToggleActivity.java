package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.orbitsoft.teamorbitsoft.R;

public class CheckBoxAndToggleActivity extends AppCompatActivity {

    CheckBox ch1,ch2;
    Button b1,b2;
    ToggleButton simpleToggleButton1, simpleToggleButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_toggle);

        ch1=(CheckBox)findViewById(R.id.checkBox1);
        ch2=(CheckBox)findViewById(R.id.checkBox2);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        simpleToggleButton1 = (ToggleButton) findViewById(R.id.simpleToggleButton1);
        simpleToggleButton2 = (ToggleButton) findViewById(R.id.simpleToggleButton2);

        simpleToggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable img = CheckBoxAndToggleActivity.this.getResources().getDrawable(R.drawable.ic_action_search);
                simpleToggleButton1.setCompoundDrawablesWithIntrinsicBounds(img, null, null, null);
//                simpleToggleButton2.setChecked(true);

//                if (simpleToggleButton1.isChecked()){
//                    simpleToggleButton1.setText("روشن");
//                }else {
//                    simpleToggleButton1.setText("خاموش");
//                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String status = "ToggleButton1 : " + simpleToggleButton1.getText() + "\n" + "ToggleButton2 : " + simpleToggleButton2.getText();
                Toast.makeText(getApplicationContext(), status, Toast.LENGTH_SHORT).show(); // display the current state of toggle button's

                StringBuffer result = new StringBuffer();
                String sample= "test"+"test";
                result.append("Thanks : ").append(ch1.isChecked());//"Thanks : true"
                result.append("\nThanks: ").append(ch2.isChecked());//"Thanks : true Thanks: true"
               // if (ch1.isChecked()==true)
                Toast.makeText(CheckBoxAndToggleActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}