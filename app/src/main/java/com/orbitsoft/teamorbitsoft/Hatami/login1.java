package com.orbitsoft.teamorbitsoft.Hatami;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

import java.util.Random;

public class login1 extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText phone;
    EditText password;
    EditText confirm_password;

    String set_name;
    String set_email;
    String set_phone;
    String set_password;
    String set_confirm_password;
    public String message;
    public String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);


        Button signup = findViewById(R.id.signup2);
        TextView have_account = findViewById(R.id.haveaccount2);
        name = (EditText) findViewById(R.id.get_name_family);
        email = (EditText) findViewById(R.id.get_email);
        phone = (EditText) findViewById(R.id.get_phonenumber);
        password = (EditText) findViewById(R.id.get_password);
        confirm_password = (EditText) findViewById(R.id.get_confirmpassword);
        email.setTextColor(Color.BLACK);
        phone.setTextColor(Color.BLACK);
        password.setTextColor(Color.BLACK);
        name.setTextColor(Color.BLACK);
        confirm_password.setTextColor(Color.BLACK);


        signup.setOnClickListener(this::onClick);
        have_account.setOnClickListener(view -> {
            Intent i = new
                    Intent(login1.this, login2.class);
            Bundle bundle = new Bundle();
            i.putExtras(bundle);
            startActivity(i);
        });

    }

    @SuppressLint("SetTextI18n")
    public void showToast() {
        View layout =  findViewById(R.id.toast_root);
        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText("write a right input");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 30, 200);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }

    private void onClick(View view) {
        set_name = name.getText().toString();
        set_email = email.getText().toString();
        set_phone = phone.getText().toString();
        set_password = password.getText().toString();
        set_confirm_password = confirm_password.getText().toString();
        if (set_password.equalsIgnoreCase(set_confirm_password) && !set_phone.isEmpty() && !set_name.isEmpty() && !set_email.isEmpty() && !set_password.isEmpty() && set_phone.length() == 11 && set_password.length() == 6 && set_phone.startsWith("09")) {
            Random random = new Random();

            int val = random.nextInt(1000);
            message = (Integer.toString(val));
            SmsManager mySmsManager = SmsManager.getDefault();
            mySmsManager.sendTextMessage(set_phone, null, message, null, null);
            Intent i = new
                    Intent(login1.this, login2.class);
            Bundle bundle = new Bundle();

            bundle.putString("name", set_name);
            bundle.putString("email", set_email);
            bundle.putString("phone", set_phone);
            bundle.putString("password", set_password);
            bundle.putString("code", message);
            i.putExtras(bundle);

            startActivity(i);


        } else {
            showToast();
        }
    }
}


