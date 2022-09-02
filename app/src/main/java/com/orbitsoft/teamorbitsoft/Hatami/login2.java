package com.orbitsoft.teamorbitsoft.Hatami;

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

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

import java.util.Random;

public class login2 extends AppCompatActivity {
    public String message2,message;
    public String number;
    String phone_read;
    int x=0;
    String name_read;
    String email_read;
    String password_read;
    String code_read;
    String phone="09173929711";
    String code_get;
    TextView print_phone;
    EditText code;
    Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Bundle bundle = getIntent().getExtras();
        print_phone=findViewById(R.id.phone2);
        code = (EditText) findViewById(R.id.get_code);
        TextView wrong_number = findViewById(R.id.wrong_number);
        TextView resend_code = findViewById(R.id.resend_code);
        confirm = (Button) findViewById(R.id.confirm);
        code.setTextColor(Color.BLACK);

        if (bundle != null) {

            phone_read = bundle.getString("phone", "nothing");
            code_read = bundle.getString("code", "nothing");
            print_phone.setText(phone_read);
            //print_phone.setText(email);
            phone_read = bundle.getString("phone", "nothing");
            name_read = bundle.getString("name", "nothing");
            email_read = bundle.getString("email", "nothing");
            password_read = bundle.getString("password", "nothing");
            code.setText(code_read);
        }
        confirm.setOnClickListener(view -> {
            code_get = code.getText().toString();

            if (code_get.equalsIgnoreCase(code_read)|code_get.equalsIgnoreCase(message2)) {
                Intent i = new
                        Intent(login2.this, login3.class);
                Bundle bundle1 = new Bundle();
                bundle1.putString("name2", name_read);
                bundle1.putString("email2", email_read);
                bundle1.putString("phone2", phone_read);
                bundle1.putString("password2", password_read);
                bundle1.putString("code2", message);
                i.putExtras(bundle1);
                startActivity(i);
            } else {
                showToast1();
            }
        });
        wrong_number.setOnClickListener(view -> {
            Intent i = new
                    Intent(login2.this, login1.class);
            Bundle bundle12 = new Bundle();
            i.putExtras(bundle12);
            startActivity(i);
        });

        resend_code.setOnClickListener(view -> {
            if(x<6) {
                Random random2 = new Random();
                int val = random2.nextInt(1000000);
                message2 = (Integer.toString(val));
                SmsManager mySmsManager = SmsManager.getDefault();
                mySmsManager.sendTextMessage(phone, null, message2, null, null);
                code.getText().clear();
                code.setText(message2);
                x++;
            }
            else
            {
                showToast2();
                Intent i = new
                        Intent(login2.this, MainActivity.class);
                Bundle bundle13 = new Bundle();
                i.putExtras(bundle13);
                startActivity(i);
            }
        });


    }

    @SuppressLint("SetTextI18n")
    public void showToast1() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.saeidian_custom_toast, (ViewGroup) findViewById(R.id.toast_root));
        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText("Wrong_Input");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 300);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }
    @SuppressLint("SetTextI18n")
    public void showToast2() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.saeidian_custom_toast, (ViewGroup) findViewById(R.id.toast_root));
        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText("5 Attempt pass Try Again Latter");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 300);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }
}