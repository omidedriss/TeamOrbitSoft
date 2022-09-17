package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

//        ArrayList<String> test = new ArrayList<String>();
//        test.add("omid");
//        test.add("omid1");
// Array of strings...
        String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
                "WebOS","Ubuntu","Windows7","Max OS X"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.listview_item,mobileArray);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

//        ArrayList<Klid> klids = new ArrayList<>();
//        Klid klid = new Klid();
//        klid.name= "omid";
//        klids.add(klid);
//        Klid klid2 = new Klid();
//        klid2.name= "omid2";
//        klids.add(klid2);
//        SampleAdapter adapter1 = new SampleAdapter(klids);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);

    }
}