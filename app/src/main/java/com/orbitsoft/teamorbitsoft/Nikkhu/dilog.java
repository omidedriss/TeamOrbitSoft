package com.orbitsoft.teamorbitsoft.Nikkhu;

import android.app.Dialog;
import android.app.UiAutomation;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class dilog extends AppCompatDialogFragment {

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

                    }
                });
        return builder.create();

    }

}
