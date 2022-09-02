package com.orbitsoft.teamorbitsoft.Nikkhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class contact_list extends AppCompatActivity {

    ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        mylist = (ListView) findViewById(R.id.mylist);
        ArrayList<String> myArray=new ArrayList<>();


        String[] title = {"Name:", "phon Number:" };
        String[] name = {"hossein nikoo1", "hossein nikoo2","hossein nikoo3","hossein nikoo4","hossein nikoo5",
                "hossein nikoo6","hossein nikoo7","hossein nikoo8","hossein nikoo9","hossein nikoo10",
                "hossein nikoo11","hossein nikoo12","hossein nikoo13","hossein nikoo14","hossein nikoo15"};


        for(int i=0;i<15 ;i++) {

            myArray.add("\n"+title[0]+"\t\t"+name[i]+"\n"+title[1]+"\t\t"+"09395330036");

        }



        ArrayAdapter<String> adapter=new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,myArray);
        mylist.setAdapter(adapter);


    }
}