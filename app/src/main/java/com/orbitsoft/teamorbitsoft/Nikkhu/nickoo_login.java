package com.orbitsoft.teamorbitsoft.Nikkhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.appizona.yehiahd.fastsave.FastSave;
import com.orbitsoft.teamorbitsoft.R;

public class nickoo_login extends AppCompatActivity implements View.OnClickListener{
    private EditText ed_username,ed_password;
    private Button bt_login;
    private TextView tx_signup;
    private String user,pass,phon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickoo_login);
        FastSave.init(this);
        ed_password = (EditText) findViewById(R.id.ed_password);
        ed_username = (EditText) findViewById(R.id.ed_username);
        tx_signup = (TextView) findViewById(R.id.tx_signup);
        bt_login=(Button) findViewById(R.id.bt_login);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user=FastSave.getInstance().getString("myuser","");
                pass=FastSave.getInstance().getString("pass","");
                phon=FastSave.getInstance().getString("phon","");
//                Toast.makeText(nickoo_login.this, user, Toast.LENGTH_LONG).show();
//                Toast.makeText(nickoo_login.this, pass, Toast.LENGTH_LONG).show();

                if((ed_password.getText().toString().equals(pass))&&
                        (ed_username.getText().toString().equals(user)))
                    Toast.makeText(nickoo_login.this,
                            "You are loged in", Toast.LENGTH_SHORT).show();

                else{
                    Toast.makeText(getApplicationContext(),
                            "Wrong User Name or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tx_signup:
                Intent i=new Intent(getApplicationContext(),nickoo_signUp.class);
                startActivity(i);
                break;
//            case R.id.bt_login:
//                Toast.makeText(this, "button1", Toast.LENGTH_LONG).show();
//               mylogin();
//                break;

        }

    }

    public void mylogin() {
        Toast.makeText(this, "button", Toast.LENGTH_LONG).show();



    }
}