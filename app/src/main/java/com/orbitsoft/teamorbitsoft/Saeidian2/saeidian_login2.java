package com.orbitsoft.teamorbitsoft.Saeidian2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.telephony.SmsManager;
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

import java.util.Random;

public class saeidian_login2 extends AppCompatActivity {
    TextView show_number2;
    Button next2;
    EditText name;
    EditText email;
    EditText phone;
    EditText password;
    EditText confirmpassword;

    String set_name;
    String set_email;
    String set_phone;
    String set_password;
    String set_confirmpassword;
    public String message;
    public String number;
    String get_sms2;
    String get_sms3;
    String salam = "salam";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_login2);


        Button signup = findViewById(R.id.signup2);
        name = (EditText) findViewById(R.id.get_name_family);
        email = (EditText) findViewById(R.id.get_email);
        phone = (EditText) findViewById(R.id.get_phonenumber);
        password = (EditText) findViewById(R.id.get_password);
        confirmpassword = (EditText) findViewById(R.id.get_confirmpassword);
        email.setTextColor(Color.BLACK);
        phone.setTextColor(Color.BLACK);
        password.setTextColor(Color.BLACK);
        name.setTextColor(Color.BLACK);
        confirmpassword.setTextColor(Color.BLACK);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set_name = name.getText().toString();
                set_email = email.getText().toString();
                set_phone = phone.getText().toString();
                set_password = password.getText().toString();
                set_confirmpassword = confirmpassword.getText().toString();
                Random random = new Random();
                int val = random.nextInt(1000000); // save random number in an integer variable
                //txt.setText(Integer.toString(val)); //convert to String and set it as text inside the textview

                message = (Integer.toString(val));


                SmsManager mySmsManager = SmsManager.getDefault();
                mySmsManager.sendTextMessage(set_phone, null, message, null, null);


                Intent i = new
                        Intent(saeidian_login2.this, saeidian_login3.class);
                Bundle bundle = new Bundle();
//                bundle.putString("email", set_email);
                bundle.putString("name", set_name);
                bundle.putString("email", set_email);
                bundle.putString("phone", set_phone);
                bundle.putString("password", set_password);

                bundle.putString("code", message);
                i.putExtras(bundle);
                startActivity(i);


            }
        });
    }
}
