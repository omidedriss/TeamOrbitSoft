package com.orbitsoft.teamorbitsoft.saeidian_recycler_view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.saeidian_recycler_view.saeidian_holder;
import com.orbitsoft.teamorbitsoft.saeidian_recycler_view.saeidian_klid;

import java.util.ArrayList;


public class saeidian_adapter extends RecyclerView.Adapter<saeidian_holder> {
    private ArrayList<saeidian_klid> saeidian_list;
    public saeidian_adapter(ArrayList<saeidian_klid> Data) {
        saeidian_list = Data;
    }
    @Override
    public saeidian_holder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.saeidian_adapter, parent, false);
        saeidian_holder holder = new saeidian_holder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(final saeidian_holder holder, @SuppressLint("RecyclerView") final int position) {
        holder.list_family.setVisibility(View.GONE);
        holder.list_image.setOnClickListener(view ->

        {
            holder.list_family.setVisibility(View.VISIBLE);
        });
       holder.list_name.setText((saeidian_list.get(position).getName()));
        holder.list_family.setText((saeidian_list.get(position).getFamily()));
        holder.list_phone.setText((saeidian_list.get(position).getPhone()));
        holder.list_image.setImageResource((saeidian_list.get(position).getImage()));

    }
    @Override
    public int getItemCount() {
        return saeidian_list.size();
    }
}