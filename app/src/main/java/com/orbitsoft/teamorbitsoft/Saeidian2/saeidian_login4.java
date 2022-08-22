package com.orbitsoft.teamorbitsoft.Saeidian2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class saeidian_login4 extends AppCompatActivity {

    Button exit;
    TextView name;
    TextView email;
    TextView phone;
    TextView password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_login4);


        Button signup = findViewById(R.id.signup2);
        name =  findViewById(R.id.entered_name);
        email =  findViewById(R.id.entered_email);
        phone =  findViewById(R.id.entered_phone);
        password =  findViewById(R.id.entered_password);
        exit = (Button) findViewById(R.id.exit);
//        name.setText("Name/Family:" + Name);
//        email.setText("email:" + Name);
//        phone.setText("Phone:" + Name);
//        password.setText("Password:" + Name);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}