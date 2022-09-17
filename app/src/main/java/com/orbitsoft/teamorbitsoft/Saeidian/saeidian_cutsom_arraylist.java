package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class saeidian_cutsom_arraylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_cutom_arraylist);
        ArrayList<saeidian_klid> klids = new ArrayList<>();
        saeidian_klid klid = new saeidian_klid();
        klid.name= "shayan";
        klid.family="saeidian";
        klid.phone="09173929711";
        klid.image=(R.drawable.zz);
        saeidian_adapter adapter_saeidian = new saeidian_adapter(klids);
        RecyclerView shayan_listview = (RecyclerView) findViewById(R.id.saeidian_list_custom);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        shayan_listview.setLayoutManager(layoutManager);
        shayan_listview.setAdapter(adapter_saeidian);
    }
}