package com.orbitsoft.teamorbitsoft.Saeidian2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian2;
import com.orbitsoft.teamorbitsoft.Saeidian.thesheox;

import java.util.Random;

public class saeidian_login3 extends AppCompatActivity {
    TextView show_phone;
    EditText enter_phone;
    Button next;
     public String message;
   public String number;
    public String asm;
    String phone_read;

    String name_read;
    String email_read;
    String password_read;
   String code_read;
    String email;

    String code_get;
    TextView print_email;
    TextView print_phone;
    EditText code;
Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_login3);
        Bundle bundle = getIntent().getExtras();
       // print_email=findViewById(R.id.email2);
        print_phone=findViewById(R.id.phone2);
        code = (EditText) findViewById(R.id.get_code);

        confirm = (Button) findViewById(R.id.confirm);
        code.setTextColor(Color.BLACK);
        if (bundle != null) {
             //phone = bundle.getString("email", "nothing");
             phone_read = bundle.getString("phone", "nothing");
            code_read = bundle.getString("code", "nothing");

            print_phone.setText(phone_read);
            //print_phone.setText(email);

                phone_read = bundle.getString("phone", "nothing");
                name_read = bundle.getString("name", "nothing");
                email_read = bundle.getString("email", "nothing");
                password_read = bundle.getString("password", "nothing");

        }

//
//        Toast.makeText(saeidian_login3.this, code_get, Toast.LENGTH_SHORT).show();
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code_get = code.getText().toString();
                //Toast.makeText(saeidian_login3.this, code_get, Toast.LENGTH_SHORT).show();
                if (code_get.equalsIgnoreCase(code_read)) {

                    Toast.makeText(saeidian_login3.this, "correct", Toast.LENGTH_SHORT).show();
            Intent i = new
                    Intent(saeidian_login3.this, saeidian_login4.class);
            Bundle bundle = new Bundle();
                    bundle.putString("name2", name_read);
                    bundle.putString("email2", email_read);
                    bundle.putString("phone2", phone_read);
                    bundle.putString("password2", password_read);
                    bundle.putString("code2", message);
            i.putExtras(bundle);
            startActivity(i);
                } else {
                    Toast.makeText(saeidian_login3.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

















//        ActivityCompat.requestPermissions(saeidian_login3.this, new String[]{Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);
//
////            show_phone = findViewById(R.id.show_phone);
////            enter_phone = (EditText) findViewById(R.id.enter_phone);
//            next = (Button) findViewById(R.id.next);
//
//            next.setOnClickListener((new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    Random random = new Random();
//                    int val = random.nextInt(1000000); // save random number in an integer variable
//                    //txt.setText(Integer.toString(val)); //convert to String and set it as text inside the textview
//
//                     message = (Integer.toString(val));
//                     number = enter_phone.getText().toString();
//
//                    SmsManager mySmsManager = SmsManager.getDefault();
//                    mySmsManager.sendTextMessage(number, null, message, null, null);
//                    Intent i = new
//                            Intent(saeidian_login3.this, saeidian_login2.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putString("sms", message);
//
//                    i.putExtras(bundle);
//                    startActivity(i);
//
//                }
//
//
//
//            }));
    }
}