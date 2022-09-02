package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.firebase.FirebaseException;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.PhoneAuthCredential;
//import com.google.firebase.auth.PhoneAuthOptions;
//import com.google.firebase.auth.PhoneAuthProvider;
import com.orbitsoft.teamorbitsoft.R;

import java.util.Random;

public class saeidian_login2 extends AppCompatActivity {
    TextView show_number2;
    Button next2;
    EditText name;
    EditText email;
    EditText phone;
    EditText password;
    EditText confirmpassword;

    String set_name;
    String set_email;
    String set_phone;
    String set_password;
    String set_confirmpassword;
    public String message;
    public String number;
    String get_sms2;
    String get_sms3;
    String salam = "salam";
//    FirebaseAuth oAuth;
    //for verification function
    String verificationID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian3_login2);


        Button signup = findViewById(R.id.signup2);
        TextView haveaccount = findViewById(R.id.haveaccount2);
        name = (EditText) findViewById(R.id.get_name_family);
        email = (EditText) findViewById(R.id.get_email);
        phone = (EditText) findViewById(R.id.get_phonenumber);
        password = (EditText) findViewById(R.id.get_password);
        confirmpassword = (EditText) findViewById(R.id.get_confirmpassword);
        email.setTextColor(Color.BLACK);
        phone.setTextColor(Color.BLACK);
        password.setTextColor(Color.BLACK);
        name.setTextColor(Color.BLACK);
        confirmpassword.setTextColor(Color.BLACK);

//        oAuth= FirebaseAuth.getInstance();



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    set_name = name.getText().toString();
                    set_email = email.getText().toString();
                    set_phone = phone.getText().toString();
                    set_password = password.getText().toString();
                    set_confirmpassword = confirmpassword.getText().toString();
                if ( set_password.equalsIgnoreCase(set_confirmpassword)&&!set_phone.isEmpty() &&!set_name.isEmpty()&& !set_email.isEmpty()&&!set_password.isEmpty()&&set_phone.length() == 11&& set_password.length() == 6&& set_confirmpassword.length() == 6 && set_phone.startsWith("09")) {
                    Random random = new Random();

                    int val = random.nextInt(1000000);
                    message = (Integer.toString(val));
                    SmsManager mySmsManager = SmsManager.getDefault();
                    mySmsManager.sendTextMessage(set_phone, null, message, null, null);
                    Intent i = new
                            Intent(saeidian_login2.this, saeidian_login3.class);
                    Bundle bundle = new Bundle();
//                bundle.putString("email", set_email);
                    bundle.putString("name", set_name);
                    bundle.putString("email", set_email);
                    bundle.putString("phone", set_phone);
                    bundle.putString("password", set_password);
                    bundle.putString("code", message);
                    i.putExtras(bundle);

                    startActivity(i);
//            if (TextUtils.isEmpty(phone.getText().toString())) {
//                Toast.makeText(saeidian_login2.this, "Enter a valid Number", Toast.LENGTH_SHORT).show();
//            } else {
//                String number = phone.getText().toString();
//                sendverificationcode(number);
//            }

                }
                else
                {
                    showToast();
                }
            }

        });
        haveaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(saeidian_login2.this, saeidian_login1.class);
                Bundle bundle = new Bundle();
                i.putExtras(bundle);
                startActivity(i);
            }
        });

    }
    public void showToast() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.saeidian_custom_toast, (ViewGroup) findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);
        ImageView toastImage = layout.findViewById(R.id.toast_image);

        toastText.setText("Fill All The Blanks Right");
//            toastImage.setImageResource(R.drawable.ic_toasticon);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 300);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }
//    private void sendverificationcode(String phoneNumber)
//    {
//        PhoneAuthOptions options =
//                PhoneAuthOptions.newBuilder(oAuth)
//                        .setPhoneNumber("+98"+phoneNumber)
//                        .setTimeout(60L, TimeUnit.SECONDS)
//                        .setActivity(this)
//                        .setCallbacks(mCallbacks)
//                        .build();
//        PhoneAuthProvider.verifyPhoneNumber(options);
//    }
//    private PhoneAuthProvider.OnVerificationStateChangedCallbacks
//            mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks()
//    {
//
//        @Override
//        public void onVerificationCompleted(@NonNull PhoneAuthCredential credential)
//        {
//            // log.d baray debag giri
//            //Log.d(TAG, "onVerificationCompleted:" + credential);
//            final String code =credential.getSmsCode();
//            if (code!=null){
//                verifycode(code);
//            }
//        }
//        @Override
//        public void onVerificationFailed(@NonNull FirebaseException e)
//        {
//            // Log.w(TAG, "onVerificationFailed", e);
//            Toast.makeText(saeidian_login2.this,"verification failed",Toast.LENGTH_LONG).show();
//        }
//        @Override
//        public void onCodeSent(@NonNull String s,
//                               @NonNull PhoneAuthProvider.ForceResendingToken token)
//        {
//            //  Log.d(TAG, "onCodeSent:" + verificationId);
//            super.onCodeSent(s,token);
//            verificationID=s;
//        }
//    };
//    private void verifycode(String code)
//    {
//        PhoneAuthCredential credential= PhoneAuthProvider.getCredential(verificationID,code);
//        sighinbyCredentials(credential);
//    }
//    private void sighinbyCredentials(PhoneAuthCredential credential)
//    {
//        FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
//        firebaseAuth.signInWithCredential(credential)
//                .addOnCompleteListener(task ->
//                {
//                    if (task.isSuccessful())
//                    {
//                        Toast.makeText(saeidian_login2.this,"login seccessfull",Toast.LENGTH_SHORT).show();
//
//                    }
//                });
    }


