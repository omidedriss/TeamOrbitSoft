package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<String> test = new ArrayList<String>();
        test.add("omid");
        test.add("omid1");
// Array of strings...
//        String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
//                "WebOS","Ubuntu","Windows7","Max OS X"};
//
//        ArrayAdapter adapter = new ArrayAdapter<String>(ListViewActivity.this, R.layout.listview_item,mobileArray);
//
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);

        ArrayList<Klid> klids = new ArrayList<>();
        Klid klid = new Klid();
        klid.name= "omid";
        klid.pic=R.drawable.imagescod;
        klids.add(klid);
        Klid klid2 = new Klid();
        klid2.name= "omid2";
        klid2.pic=R.drawable.ic_launcher;
        klids.add(klid2);
        SampleAdapter adapter1 = new SampleAdapter(RecyclerViewActivity.this,klids);
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
//        recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerViewActivity.this));
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        LinearLayoutManager layoutManager =
//                new GridLayoutManager(RecyclerViewActivity.this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter( adapter1);

    }
}