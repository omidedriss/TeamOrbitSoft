package com.orbitsoft.teamorbitsoft.Nikkhu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.appizona.yehiahd.fastsave.FastSave;
import com.orbitsoft.teamorbitsoft.R;

public class nickoo_signUp extends AppCompatActivity {
private EditText ed_username,ed_password,ed_phon;
private Button bt_register;
private String user,pass,phon;
public String in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickoo_sign_up);
        FastSave.init(this);
        inputInit();
        bt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user=ed_username.getText().toString().trim();
                pass=ed_password.getText().toString().trim();
                phon=ed_phon.getText().toString().trim();
                if(user.isEmpty()||pass.isEmpty()||phon.isEmpty())
                    Toast.makeText(nickoo_signUp.this, "Fill all the requirements", Toast.LENGTH_SHORT).show();

                else {
                    String[] info= new String[]{user,pass,phon};
                    FastSave.getInstance().saveString("myuser",user);
                    FastSave.getInstance().saveString("pass",pass);
                    FastSave.getInstance().saveString("phon",phon);
                    Toast.makeText(nickoo_signUp.this, "user Name and Password Saved Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

    private void inputInit() {
        ed_password=(EditText) findViewById(R.id.ed_password);
        ed_username=(EditText) findViewById(R.id.ed_username);
        ed_phon=(EditText) findViewById(R.id.ed_phon);
        bt_register=(Button) findViewById(R.id.bt_register);

    }
}