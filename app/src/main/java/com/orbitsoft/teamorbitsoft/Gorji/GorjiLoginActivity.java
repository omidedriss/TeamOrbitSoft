package com.orbitsoft.teamorbitsoft.Gorji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class GorjiLoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText name,password;
    private Button loginButton;
    private String userName="abbas"
            ,userPassword="gorji";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorji_login);
        name=findViewById(R.id.username_login);
        password=findViewById(R.id.password_login);
        loginButton=findViewById(R.id.button_login);

        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==loginButton.getId()){
            if(userName.equals(name.getText().toString())
                    && userPassword.equals(password.getText().toString()) ){
                Toast.makeText(getApplicationContext(),"ورود موفقیت آمیز بود",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(getApplicationContext(),"ورود نا موفق بود",Toast.LENGTH_LONG).show();

            }
        }
    }
}
