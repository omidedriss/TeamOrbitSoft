package com.orbitsoft.teamorbitsoft.Nikkhu;


import static com.orbitsoft.teamorbitsoft.Nikkhu.model.recevier_layout;
import static com.orbitsoft.teamorbitsoft.Nikkhu.model.sender_layout;
import static com.orbitsoft.teamorbitsoft.Nikkhu.model.sender_pic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class myRecyclAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<model> arrayList;

    public myRecyclAdapter(Context context, ArrayList<model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getItemViewType(int position) {
        switch (arrayList.get(position).getSenderOrRecevier()){
            case 1:
                return sender_layout;
            case 2:
                return recevier_layout;
            case 3:
                return sender_pic;
            default: return -1;
        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=null;
        switch (viewType){
            case sender_layout:
                view=LayoutInflater.from(context).inflate(R.layout.my_recycle_view_sender,parent,false);

                return new mySenderView(view);
            case recevier_layout:
                view=LayoutInflater.from(context).inflate(R.layout.my_recycle_view_recevier,parent,false);
                return new myRecevierView(view);

            case sender_pic:
                view=LayoutInflater.from(context).inflate(R.layout.my_recycle_view_sender_attach,parent,false);
                return new mySenderImage(view);

            default:return null;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (arrayList.get(position).getSenderOrRecevier()){
            case sender_layout:
                ((mySenderView) holder).txt_sender.setText(arrayList.get(position).getMessage());
                break;
            case recevier_layout:
                ((myRecevierView) holder).txt_recevier.setText(arrayList.get(position).getMessage());
                break;
            case sender_pic:
                ((mySenderImage) holder).imageView.setImageURI(arrayList.get(position).getUri());

                break;
        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }





    public static class mySenderView extends RecyclerView.ViewHolder{
        private TextView txt_sender;
        public mySenderView(@NonNull View itemView) {
            super(itemView);
            txt_sender=itemView.findViewById(R.id.txt_sender);
        }
    }

    public static class myRecevierView extends RecyclerView.ViewHolder{
        private TextView txt_recevier;
        public myRecevierView(@NonNull View itemView) {
            super(itemView);
            txt_recevier=itemView.findViewById(R.id.txt_recevier);

        }
    }

    public static class mySenderImage extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public mySenderImage(View itemView) {
            super(itemView);
            imageView=(ImageView) itemView.findViewById(R.id.imageView);

        }
    }
}
