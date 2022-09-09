package com.orbitsoft.teamorbitsoft.Hatami2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.orbitsoft.teamorbitsoft.R;


import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyHolder> {

    private final ArrayList<Product> ProductList;
    private final Context c;

    public Adapter(Context c, ArrayList<Product> productArrayList) {
        this.ProductList = productArrayList;
        this.c = c;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.row_layout, parent, false);
        return new MyHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        Product s = ProductList.get(position);
        holder.txtCode.setText(s.getId());
        holder.txtName.setText(s.getName());
        holder.txtPrice.setText(s.getPrice()+" دلار ");
        holder.imgv.setOnClickListener(v -> v.startAnimation(AnimationUtils.loadAnimation(c,android
                .R.anim.slide_in_left)));

    }
    @Override
    public int getItemCount() {
        return ProductList.size();
    }


    static class MyHolder extends RecyclerView.ViewHolder {

        TextView txtCode;
        TextView txtName;
        TextView txtPrice;
        ImageView imgv ;

        public MyHolder(View itemView) {
            super(itemView);

            txtCode = itemView.findViewById(R.id.rowTxtCode);
            txtName = itemView.findViewById(R.id.rowTxtProductName);
            txtPrice = itemView.findViewById(R.id.rowTxtPrice);
            imgv = itemView.findViewById(R.id.rowImgProduct);
        }
    }
}
