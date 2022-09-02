package com.orbitsoft.teamorbitsoft.Hatami;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

public class login3 extends AppCompatActivity {

    Button exit;
    TextView name;
    TextView email;
    TextView phone;
    TextView password;
    String phone_read2;

    String name_read2;
    String email_read2;
    String password_read2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);

        Bundle bundle = getIntent().getExtras();
        name =  findViewById(R.id.entered_name);
        email =  findViewById(R.id.entered_email);
        phone =  findViewById(R.id.entered_phone);
        password =  findViewById(R.id.entered_password);
        exit = (Button) findViewById(R.id.exit);

        if (bundle != null) {
            phone_read2 = bundle.getString("phone2", "nothing");
            name_read2 = bundle.getString("name2", "nothing");
            email_read2 = bundle.getString("email2", "nothing");
            password_read2 = bundle.getString("password2", "nothing");
        }
        name.setText("Name/Family:" + name_read2);
        email.setText("email:" + email_read2);
        phone.setText("Phone:" + phone_read2);
        password.setText("Password:" + password_read2);
        exit.setOnClickListener(view -> {
            Intent i = new
                    Intent(login3.this, MainActivity.class);
            Bundle bundle1 = new Bundle();

            i.putExtras(bundle1);
            startActivity(i);

        });
    }
}