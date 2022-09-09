package com.orbitsoft.teamorbitsoft.Hatami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class Radio_Button extends AppCompatActivity {

    RadioGroup rgMain;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        rgMain = findViewById(R.id.rgMain);
        txtResult = findViewById(R.id.txtResult);
    }

    public void answerVoid(View view) {
        int idChecked = rgMain.getCheckedRadioButtonId();
        RadioButton rbSelected = findViewById(idChecked);
        if (rbSelected.getText().toString().trim().equals("اصفهان")) {
            txtResult.setText("پاسخ صحیح");
            txtResult.setBackgroundColor(
                    getResources().getColor(R.color.teal_700)
            );
        } else {
            txtResult.setText("پاسخ نادرست");
            txtResult.setBackgroundColor(
                    getResources().getColor(android.R.color.holo_red_light)
            );
        }
    }
}