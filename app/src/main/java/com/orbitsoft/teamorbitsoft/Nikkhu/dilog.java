package com.orbitsoft.teamorbitsoft.Nikkhu;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiAutomation;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class dilog extends AppCompatDialogFragment {
public Activity a1;


    public dilog (Activity s2){
        a1=s2;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        MaterialAlertDialogBuilder builder= new MaterialAlertDialogBuilder(getActivity());

        builder.setTitle("personal information")
                .setMessage("حسین نیکخو"
                +"\n"+
                        "کاردانی برق"+"\n"+
                        "دولپور اندروید")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        in(a1);
                    }
                });
        return builder.create();

    }

    public void in(Activity s1){
        Toast.makeText(s1,"yyy",Toast.LENGTH_LONG).show();
    }

}
