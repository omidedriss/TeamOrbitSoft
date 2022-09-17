package com.orbitsoft.teamorbitsoft.example;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.orbitsoft.teamorbitsoft.R;


public class SampleHolder extends RecyclerView.ViewHolder {
    public TextView titleCateory,suggest_kartak_main_price_member;
    public ImageView coverImageView,delete,edite;
    public LinearLayout cover;
    public SampleHolder(View v) {
        super(v);
        titleCateory =  v.findViewById(R.id.title_category);
        coverImageView =  v.findViewById(R.id.coverImageView);
        delete =  v.findViewById(R.id.delete);
        edite =  v.findViewById(R.id.edit);
        cover =  v.findViewById(R.id.cover);
        //suggest_kartak_main_price_member =v.findViewById(R.id.suggest_kartak_main_price_member);

    }



}