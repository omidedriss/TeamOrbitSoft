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
    int i=0;
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

        holder.list_info.setOnClickListener(view ->

        {
            i++;
            if(i%2==0)
            {
                holder.list_phone.setVisibility(View.GONE);
            }
            if(i%2==1)
            {
                holder.list_phone.setVisibility(View.VISIBLE);
            }

        });
       holder.list_name.setText((saeidian_list.get(position).getName()));
        holder.list_phone.setText((saeidian_list.get(position).getPhone()));
        holder.list_call.setImageResource((saeidian_list.get(position).getCall()));
        holder.list_message.setImageResource((saeidian_list.get(position).getMessage()));
        holder.list_info.setImageResource((saeidian_list.get(position).getInfo()));

    }
    @Override
    public int getItemCount() {
        return saeidian_list.size();
    }
}