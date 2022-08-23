package com.orbitsoft.teamorbitsoft.Saeidian2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

public class saeidian_login4 extends AppCompatActivity {

    Button exit;
    TextView name;
    TextView email;
    TextView phone;
    TextView password;
    String phone_read2;

    String name_read2;
    String email_read2;
    String password_read2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_login4);

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
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(saeidian_login4.this, MainActivity.class);
                Bundle bundle = new Bundle();

                i.putExtras(bundle);
                startActivity(i);

            }
        });
    }
}