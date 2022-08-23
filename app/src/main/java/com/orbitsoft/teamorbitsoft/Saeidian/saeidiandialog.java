package com.orbitsoft.teamorbitsoft.Saeidian;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian2.saeidian_login3;
import com.orbitsoft.teamorbitsoft.Saeidian2.saeidian_login4;

public class saeidiandialog extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes, no;

    //    public CustomDialogClass(Activity a) {
//        super(a);
//        // TODO Auto-generated constructor stub
//        this.c = a;
//    }
    public saeidiandialog(@NonNull Context context) {
        super(context);
        this.c= (Activity) context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        yes = (Button) findViewById(R.id.btn_yes);
        no = (Button) findViewById(R.id.btn_no);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:
           c.finish();
                break;
            case R.id.btn_no:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}