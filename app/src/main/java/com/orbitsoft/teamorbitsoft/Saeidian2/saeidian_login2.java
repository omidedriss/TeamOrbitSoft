package com.orbitsoft.teamorbitsoft.Saeidian2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian2;
import com.orbitsoft.teamorbitsoft.Saeidian.thesheox;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;
public class saeidian_login2 extends AppCompatActivity {
    TextView show_number2;
    Button next2;
    EditText get_sms;
    String get_sms2;
    String get_sms3;
    String salam = "salam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_login2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            get_sms3 = bundle.getString("sms", "nothing");}
        Toast.makeText(saeidian_login2.this, get_sms3, Toast.LENGTH_SHORT).show();
            show_number2 = findViewById(R.id.show_phone2);
            get_sms = (EditText) findViewById(R.id.get_sms);
            next2 = (Button) findViewById(R.id.next2);

            next2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    get_sms2 = get_sms.getText().toString();
                    //Toast.makeText(saeidian_login2.this, get_sms2, Toast.LENGTH_SHORT).show();
                    if (get_sms2.equalsIgnoreCase(get_sms3)) {

                        Toast.makeText(saeidian_login2.this, "correct", Toast.LENGTH_SHORT).show();
                        Intent i = new
                                Intent(saeidian_login2.this, saeidian_login1.class);
                        Bundle bundle = new Bundle();

                        i.putExtras(bundle);
                        startActivity(i);
                    } else {
                        Toast.makeText(saeidian_login2.this, "wrong", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }
