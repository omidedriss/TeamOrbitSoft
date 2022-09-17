package com.orbitsoft.teamorbitsoft.example;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;


import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.example.Klid;
import com.orbitsoft.teamorbitsoft.example.SampleHolder;


import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;



public class SampleAdapter extends RecyclerView.Adapter<SampleHolder> {
    private ArrayList<Klid> list;
    public SampleAdapter(ArrayList<Klid> Data) {
        list = Data;
    }
    @Override
    public SampleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_sample, parent, false);
        SampleHolder holder = new SampleHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(final SampleHolder holder, @SuppressLint("RecyclerView") final int position) {

        holder.titleCateory.setText(list.get(position).getName()+"-"+list.get(position).getMobile());
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Klid klid = list.get(position);



                    //this.notifyAll();
                }catch (Exception e){

                }

            }
        });
        holder.edite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   MainTask.Instance.ConnectServerForTime(list,position);

            }
        });


    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}