package com.orbitsoft.teamorbitsoft.Saeidian2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_login3);
        ActivityCompat.requestPermissions(saeidian_login3.this, new String[]{Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);

            show_phone = findViewById(R.id.show_phone);
            enter_phone = (EditText) findViewById(R.id.enter_phone);
            next = (Button) findViewById(R.id.next);

            next.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Random random = new Random();
                    int val = random.nextInt(1000000); // save random number in an integer variable
                    //txt.setText(Integer.toString(val)); //convert to String and set it as text inside the textview

                     message = (Integer.toString(val));
                     number = enter_phone.getText().toString();

                    SmsManager mySmsManager = SmsManager.getDefault();
                    mySmsManager.sendTextMessage(number, null, message, null, null);
                    Intent i = new
                            Intent(saeidian_login3.this, saeidian_login2.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("sms", message);
                    i.putExtras(bundle);
                    startActivity(i);

                }



            }));
    }
}