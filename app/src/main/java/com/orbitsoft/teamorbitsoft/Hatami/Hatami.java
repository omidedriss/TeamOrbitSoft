package com.orbitsoft.teamorbitsoft.Hatami;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

public class Hatami extends AppCompatActivity {

    EditText get_username;
    String get_username2;
    String right_username ="alireza";
    String get_password2;
    String right_password ="12345aaa";
    EditText get_password;
    Button login;
    String phone="09130169816";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hatami);
        TextView no_account = findViewById(R.id.no_acount);
        TextView guest = findViewById(R.id.guest);
        TextView reset = findViewById(R.id.reset);
        get_username = (EditText) findViewById(R.id.get_username);

        login = (Button) findViewById(R.id.login2);
        get_password = (EditText) findViewById(R.id.get_password);
        get_username.setTextColor(Color.BLACK);
        get_password.setTextColor(Color.BLACK);
        login.setOnClickListener(view -> {
            get_username2 = get_username.getText().toString();
            get_password2 = get_password.getText().toString();

            if (get_username2.equalsIgnoreCase(right_username) && get_password2.equalsIgnoreCase(right_password)) {

                Intent i = new
                        Intent(Hatami.this, MainActivity.class);
                Bundle bundle = new Bundle();

                i.putExtras(bundle);
                startActivity(i);
            } else {
                showToast();
            }
        });
        no_account.setOnClickListener(view -> {
            Intent i = new
                    Intent(Hatami.this,  login1.class);
            Bundle bundle = new Bundle();
            i.putExtras(bundle);
            startActivity(i);



        });
        guest.setOnClickListener(view -> {
            Intent i = new
                    Intent(Hatami.this, MainActivity.class);
            Bundle bundle = new Bundle();
            i.putExtras(bundle);
            startActivity(i);
        });
        reset.setOnClickListener(view -> {
            SmsManager mySmsManager = SmsManager.getDefault();
            mySmsManager.sendTextMessage(phone, null, "12345aaa", null, null);
        });

    }
    @SuppressLint("SetTextI18n")
    public void showToast() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.saeidian_custom_toast, (ViewGroup) findViewById(R.id.toast_root));
        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText("User Not Found");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 300);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

    }
}