package com.orbitsoft.teamorbitsoft.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ArrayList<AlgorithmItem> algorithmItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        initList();
        String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
                "WebOS","Ubuntu","Windows7","Max OS X"};

//        ArrayAdapter adapter = new ArrayAdapter<String>(ListViewActivity.this, R.layout.listview_item,mobileArray);

        ListView listView = (ListView) findViewById(R.id.list_view);


        AlgorithmAdapter  adapter2 = new AlgorithmAdapter(this, algorithmItems);
        listView.setAdapter(adapter2);

        //listView.setAdapter(adapter);
    }
    private void initList()
    {
        algorithmItems = new ArrayList<>();
        algorithmItems.add(new AlgorithmItem("Quick Sort"));
        algorithmItems.add(new AlgorithmItem("Merge Sort"));
        algorithmItems.add(new AlgorithmItem("Heap Sort"));
        algorithmItems.add(new AlgorithmItem("Prims Algorithm"));
        algorithmItems.add(new AlgorithmItem("Kruskal Algorithm"));
        algorithmItems.add(new AlgorithmItem("Rabin Karp"));
        algorithmItems.add(new AlgorithmItem("Binary Search"));
    }
}