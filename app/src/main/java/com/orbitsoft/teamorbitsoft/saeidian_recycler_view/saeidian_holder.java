package com.orbitsoft.teamorbitsoft.saeidian_recycler_view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.orbitsoft.teamorbitsoft.R;


public class saeidian_holder extends RecyclerView.ViewHolder {
    public TextView list_name,list_family,list_phone;
    public ImageView list_image;
    public saeidian_holder(View show) {
        super(show);
        list_name=show.findViewById(R.id.list_name);
        list_family=show.findViewById(R.id.list_family);
        list_phone=show.findViewById(R.id.list_phone);
        list_image=show.findViewById(R.id.list_image);
    }



}