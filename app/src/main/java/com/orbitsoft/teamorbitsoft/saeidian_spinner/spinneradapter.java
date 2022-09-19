package com.orbitsoft.teamorbitsoft.saeidian_spinner;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.saeidian_recycler_view.saeidian_klid;

import java.util.ArrayList;

public class spinneradapter extends ArrayAdapter<saeidian_klid> {

    public spinneradapter(Context context,
                            ArrayList<saeidian_klid> saeidian_klid)
    {
        super(context, 0, saeidian_klid);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable
            View convertView, @NonNull ViewGroup parent)
    {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable
            View convertView, @NonNull ViewGroup parent)
    {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView,
                          ViewGroup parent)
    {
        // It is used to set our custom view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.saeidian_spinner_algorightm, parent, false);
        }

         TextView list_name,list_family,list_phone;
         ImageView list_info,list_call,list_message;

        list_name=convertView.findViewById(R.id.list_name);
        list_phone=convertView.findViewById(R.id.list_phone);
        list_info=convertView.findViewById(R.id.list_info);
        list_message=convertView.findViewById(R.id.list_message);
        list_call=convertView.findViewById(R.id.list_call);

        saeidian_klid currentItem = getItem(position);
        if (currentItem != null) {
            list_name.setText(currentItem.getName());
            list_phone.setText(currentItem.getPhone());
            list_call.setImageResource(R.drawable.phone);
            list_message.setImageResource(R.drawable.message);
        }
        return convertView;
    }
}
