package com.orbitsoft.teamorbitsoft.Nikkhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

public class nickoo_login extends AppCompatActivity implements View.OnClickListener{
    private EditText ed_username,ed_password;
    private Button bt_login;
    private TextView tx_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickoo_login);

        ed_password = (EditText) findViewById(R.id.ed_password);
        ed_username = (EditText) findViewById(R.id.ed_username);
        tx_signup = (TextView) findViewById(R.id.tx_signup);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tx_signup:
                Intent i=new Intent(getApplicationContext(),nickoo_signUp.class);
                startActivity(i);
                break;


        }

    }
}