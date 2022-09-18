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
        klid.name= "shayan saeidian";
        klid.phone="09131005050" ;
        klid.call=(R.drawable.phone);
        klid.info=(R.drawable.info);
        klid.message=(R.drawable.message);
        klids.add(klid);

        saeidian_klid klid2 = new saeidian_klid();
        klid2.name= "shayan saeidian";
        klid2.phone="09131005050" ;
        klid2.call=(R.drawable.phone);
        klid2.info=(R.drawable.info);
        klid2.message=(R.drawable.message);
        klids.add(klid2);

        saeidian_klid klid3 = new saeidian_klid();
        klid3.name= "shayan saeidian";
        klid3.phone="09131005050" ;
        klid3.call=(R.drawable.phone);
        klid3.info=(R.drawable.info);
        klid3.message=(R.drawable.message);
        klids.add(klid3);

        saeidian_klid klid4 = new saeidian_klid();
        klid4.name= "shayan saeidian";
        klid4.phone="09131005050" ;
        klid4.call=(R.drawable.phone);
        klid4.info=(R.drawable.info);
        klid4.message=(R.drawable.message);
        klids.add(klid4);

        saeidian_klid klid5 = new saeidian_klid();
        klid5.name= "shayan saeidian";
        klid5.phone="09131005050" ;
        klid5.call=(R.drawable.phone);
        klid5.info=(R.drawable.info);
        klid5.message=(R.drawable.message);
        klids.add(klid5);

        saeidian_klid klid6 = new saeidian_klid();
        klid6.name= "shayan saeidian";
        klid6.phone="09131005050" ;
        klid6.call=(R.drawable.phone);
        klid6.info=(R.drawable.info);
        klid6.message=(R.drawable.message);
        klids.add(klid6);

        saeidian_klid klid7 = new saeidian_klid();
        klid7.name= "shayan saeidian";
        klid7.phone="09131005050" ;
        klid7.call=(R.drawable.phone);
        klid7.info=(R.drawable.info);
        klid7.message=(R.drawable.message);
        klids.add(klid7);

        saeidian_klid klid8 = new saeidian_klid();
        klid8.name= "shayan saeidian";
        klid8.phone="09131005050" ;
        klid8.call=(R.drawable.phone);
        klid8.info=(R.drawable.info);
        klid8.message=(R.drawable.message);
        klids.add(klid8);

        saeidian_klid klid9 = new saeidian_klid();
        klid9.name= "shayan saeidian";
        klid9.phone="09131005050" ;
        klid9.call=(R.drawable.phone);
        klid9.info=(R.drawable.info);
        klid9.message=(R.drawable.message);
        klids.add(klid9);

        saeidian_klid klid10 = new saeidian_klid();
        klid10.name= "shayan saeidian";
        klid10.phone="09131005050" ;
        klid10.call=(R.drawable.phone);
        klid10.info=(R.drawable.info);
        klid10.message=(R.drawable.message);
        klids.add(klid10);

        saeidian_klid klid11 = new saeidian_klid();
        klid11.name= "shayan saeidian";
        klid11.phone="09131005050" ;
        klid11.call=(R.drawable.phone);
        klid11.info=(R.drawable.info);
        klid11.message=(R.drawable.message);
        klids.add(klid11);

        saeidian_klid klid12 = new saeidian_klid();
        klid12.name= "shayan saeidian";
        klid12.phone="09131005050" ;
        klid12.call=(R.drawable.phone);
        klid12.info=(R.drawable.info);
        klid12.message=(R.drawable.message);
        klids.add(klid12);

        saeidian_klid klid13 = new saeidian_klid();
        klid13.name= "shayan saeidian";
        klid13.phone="09131005050" ;
        klid13.call=(R.drawable.phone);
        klid13.info=(R.drawable.info);
        klid13.message=(R.drawable.message);
        klids.add(klid13);

        saeidian_klid klid14 = new saeidian_klid();
        klid14.name= "shayan saeidian";
        klid14.phone="09131005050" ;
        klid14.call=(R.drawable.phone);
        klid14.info=(R.drawable.info);
        klid14.message=(R.drawable.message);
        klids.add(klid14);

        saeidian_klid klid15 = new saeidian_klid();
        klid15.name= "shayan saeidian";
        klid15.phone="09131005050" ;
        klid15.call=(R.drawable.phone);
        klid15.info=(R.drawable.info);
        klid15.message=(R.drawable.message);
        klids.add(klid15);

        saeidian_adapter adapter_saeidian = new saeidian_adapter(klids);
        RecyclerView shayan_listview = (RecyclerView) findViewById(R.id.saeidian_list_custom);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        shayan_listview.setLayoutManager(layoutManager);
        shayan_listview.setAdapter(adapter_saeidian);
    }
}