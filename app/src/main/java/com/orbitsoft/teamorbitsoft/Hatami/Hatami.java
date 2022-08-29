package com.orbitsoft.teamorbitsoft.Hatami;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

import java.util.concurrent.TimeUnit;

public class Hatami extends AppCompatActivity {
    EditText phone,sms;
    Button btn_do_task,verifysms;
    //for connectring to firebase function
    FirebaseAuth oAuth;
    //for verification function
    String verificationID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_hatami);
        phone=findViewById(R.id.phone);
        sms=findViewById(R.id.SMS);
        btn_do_task=findViewById(R.id.btn_do_task);
        verifysms=findViewById(R.id.Verifysms);
        oAuth= FirebaseAuth.getInstance();
        btn_do_task.setOnClickListener(view ->
        {
            if (TextUtils.isEmpty(phone.getText().toString())) {
                Toast.makeText(Hatami.this, "Enter a valid Number", Toast.LENGTH_SHORT).show();
            } else {
                String number = phone.getText().toString();
                sendverificationcode(number);
            }
        });
        verifysms.setOnClickListener(view ->
        {
            if (TextUtils.isEmpty(sms.getText().toString())) {
                Toast.makeText(Hatami.this, "Wrong Sms", Toast.LENGTH_SHORT).show();
            }
            else
                verifycode(sms.getText().toString());
        });

    }
    private void sendverificationcode(String phoneNumber)
    {
        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(oAuth)
                        .setPhoneNumber("+98"+phoneNumber)
                        .setTimeout(60L, TimeUnit.SECONDS)
                        .setActivity(this)
                        .setCallbacks(mCallbacks)
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);
    }
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks
            mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks()
    {

        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential credential)
        {
            // log.d baray debag giri
            //Log.d(TAG, "onVerificationCompleted:" + credential);
            final String code =credential.getSmsCode();
            if (code!=null){
                verifycode(code);
            }
        }
        @Override
        public void onVerificationFailed(@NonNull FirebaseException e)
        {
            // Log.w(TAG, "onVerificationFailed", e);
            Toast.makeText(Hatami.this,"verification failed",Toast.LENGTH_LONG).show();
        }
        @Override
        public void onCodeSent(@NonNull String s,
                               @NonNull PhoneAuthProvider.ForceResendingToken token)
        {
            //  Log.d(TAG, "onCodeSent:" + verificationId);
            super.onCodeSent(s,token);
            verificationID=s;
        }
    };
    private void verifycode(String code)
    {
        PhoneAuthCredential credential= PhoneAuthProvider.getCredential(verificationID,code);
        sighinbyCredentials(credential);
    }
    private void sighinbyCredentials(PhoneAuthCredential credential)
    {
        FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(task ->
                {
                    if (task.isSuccessful())
                    {
                        Toast.makeText(Hatami.this,"login seccessfull",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Hatami.this, MainActivity.class));
                    }
                });
    }
}