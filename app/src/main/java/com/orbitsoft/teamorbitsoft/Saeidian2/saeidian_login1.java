package com.orbitsoft.teamorbitsoft.Saeidian2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.firebase.auth.PhoneAuthOptions;
//import com.google.firebase.auth.PhoneAuthProvider;
import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian;

import java.util.concurrent.TimeUnit;

public class saeidian_login1 extends AppCompatActivity {

    EditText get_username;
    String get_username2;
    String right_username = "thesheox";
    String get_password2;
    String right_password = "Shayan616114";
    EditText get_password;
    Button login;
    String phone="09173929711";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian2_login1);
        TextView no_acountt = findViewById(R.id.no_acount);
        TextView guest = findViewById(R.id.guest);
        TextView reset = findViewById(R.id.reset);
        get_username = (EditText) findViewById(R.id.get_username);

        login = (Button) findViewById(R.id.login2);
        get_password = (EditText) findViewById(R.id.get_password);
        get_username.setTextColor(Color.BLACK);
        get_password.setTextColor(Color.BLACK);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get_username2 = get_username.getText().toString();
                get_password2 = get_password.getText().toString();
                if (get_username2.equalsIgnoreCase(right_username) && get_password2.equalsIgnoreCase(right_password)) {

                    Intent i = new
                            Intent(saeidian_login1.this, saeidian.class);
                    Bundle bundle = new Bundle();

                    i.putExtras(bundle);
                    startActivity(i);
                } else {
                    Toast.makeText(saeidian_login1.this, "User not found", Toast.LENGTH_LONG).show();
                }
            }
        });
        no_acountt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(saeidian_login1.this, saeidian_login2.class);
                Bundle bundle = new Bundle();
                i.putExtras(bundle);
                startActivity(i);


//                get_sms2 = get_sms.getText().toString();
//                //Toast.makeText(saeidian_login2.this, get_sms2, Toast.LENGTH_SHORT).show();
//                if (get_sms2.equalsIgnoreCase(get_sms3)) {
//
//                    Toast.makeText(saeidian_login2.this, "correct", Toast.LENGTH_SHORT).show();
//                    Intent i = new
//                            Intent(saeidian_login2.this, saeidian_login1.class);
//                    Bundle bundle = new Bundle();
//
//                    i.putExtras(bundle);
//                    startActivity(i);
//                } else {
//                    Toast.makeText(saeidian_login2.this, "wrong", Toast.LENGTH_SHORT).show();
//                }

            }
        });
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(saeidian_login1.this, saeidian.class);
                Bundle bundle = new Bundle();
                i.putExtras(bundle);
                startActivity(i);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmsManager mySmsManager = SmsManager.getDefault();
                mySmsManager.sendTextMessage(phone, null, "Shayan616114", null, null);
            }
        });
    }
}