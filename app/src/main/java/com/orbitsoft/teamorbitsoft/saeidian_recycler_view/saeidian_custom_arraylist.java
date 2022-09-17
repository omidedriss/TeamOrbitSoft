package com.orbitsoft.teamorbitsoft.saeidian_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.saeidian_recycler_view.saeidian_klid;

import java.util.ArrayList;

public class saeidian_custom_arraylist extends AppCompatActivity {

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
        klids.add(klid);

        saeidian_klid klid2 = new saeidian_klid();
        klid2.name= "abbas";
        klid2.family="gorji";
        klid2.phone="09131005050";
        klid2.image=(R.drawable.ww);
        klids.add(klid2);

        saeidian_adapter adapter_saeidian = new saeidian_adapter(klids);
        RecyclerView shayan_listview = (RecyclerView) findViewById(R.id.saeidian_list_custom);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        shayan_listview.setLayoutManager(layoutManager);
        shayan_listview.setAdapter(adapter_saeidian);
    }
}