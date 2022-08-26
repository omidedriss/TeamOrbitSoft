package com.orbitsoft.teamorbitsoft.Saeidian2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian2;
import com.orbitsoft.teamorbitsoft.Saeidian.thesheox;

import java.util.Random;

public class saeidian_login3 extends AppCompatActivity {
    TextView show_phone;
    EditText enter_phone;
    Button next;
     public String message2,message;
   public String number;
    public String asm;
    String phone_read;
    int x=0;
    String name_read;
    String email_read;
    String password_read;
   String code_read;
    String email;
String phone="09173929711";
    String code_get;
    TextView print_email;
    TextView print_phone;
    EditText code;
Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian2_login3);
        Bundle bundle = getIntent().getExtras();
       // print_email=findViewById(R.id.email2);
        print_phone=findViewById(R.id.phone2);
        code = (EditText) findViewById(R.id.get_code);
        TextView wrongnumber = findViewById(R.id.wrong_number);
        TextView resendcode = findViewById(R.id.resend_code);
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
            code.setText(code_read);
        }

//
//        Toast.makeText(saeidian_login3.this, code_get, Toast.LENGTH_SHORT).show();
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code_get = code.getText().toString();
                //Toast.makeText(saeidian_login3.this, code_get, Toast.LENGTH_SHORT).show();
                if (code_get.equalsIgnoreCase(code_read)|code_get.equalsIgnoreCase(message2)) {

                    showToast();
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
                    showToast1();
                }
            }
        });
        wrongnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(saeidian_login3.this, saeidian_login2.class);
                Bundle bundle = new Bundle();
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        resendcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x<5) {
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
                            Intent(saeidian_login3.this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    i.putExtras(bundle);
                    startActivity(i);
                }
            }
        });

//        confirm.setOnClickListener(view ->
//        {
//            if (TextUtils.isEmpty(code.getText().toString())) {
//                Toast.makeText(saeidian_login3.this, "Wrong Sms", Toast.LENGTH_SHORT).show();
//            }
//            else
//                verifycode(code.getText().toString());
//        });

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
    public void showToast() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.saeidian_custom_toast, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);
        ImageView toastImage = layout.findViewById(R.id.toast_image);

        toastText.setText("Correct Code");
//            toastImage.setImageResource(R.drawable.ic_toasticon);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 300);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }
    public void showToast1() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.saeidian_custom_toast, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);
        ImageView toastImage = layout.findViewById(R.id.toast_image);

        toastText.setText("Wrong Code");
//            toastImage.setImageResource(R.drawable.ic_toasticon);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 300);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }
    public void showToast2() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.saeidian_custom_toast, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);
        ImageView toastImage = layout.findViewById(R.id.toast_image);

        toastText.setText("5 Attemot pass Try Again Latter");
//            toastImage.setImageResource(R.drawable.ic_toasticon);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 300);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }
}