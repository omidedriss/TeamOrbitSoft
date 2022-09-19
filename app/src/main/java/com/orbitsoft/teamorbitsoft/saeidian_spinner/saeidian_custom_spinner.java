package com.orbitsoft.teamorbitsoft.saeidian_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.saeidian_recycler_view.saeidian_klid;

import java.util.ArrayList;

public class saeidian_custom_spinner extends AppCompatActivity {
spinneradapter adapter_ss;
ArrayList<saeidian_klid> saeidian_array;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_custom_spinner);
        initList();
        Spinner spinner = findViewById(R.id.saeidian_spinner);
        adapter_ss = new spinneradapter(this, saeidian_array);
        spinner.setAdapter(adapter_ss);

        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent,
                                               View view, int position, long id)
                    {
//
//
//                        if (i==1){
//
//                            saeidian_klid clickedItem = (saeidian_klid) parent.getItemAtPosition(position);
//                                adapter_ss.remove(clickedItem);
//
//
//                        }else {
//                            i++;
//                        }
                        if (position==0){
                            Toast.makeText(saeidian_custom_spinner.this, "position0", Toast.LENGTH_SHORT).show();

                        }
                        if (position==1){
                            Toast.makeText(saeidian_custom_spinner.this, "position1", Toast.LENGTH_SHORT).show();

                        }
                        if (position==2){
                            Toast.makeText(saeidian_custom_spinner.this, "position2", Toast.LENGTH_SHORT).show();

                        }
                        if (position==3){
                            Toast.makeText(saeidian_custom_spinner.this, "position3", Toast.LENGTH_SHORT).show();

                        }
                        // It returns the clicked item.
//                        saeidian_klid clickedItem = (saeidian_klid)
//                                parent.getItemAtPosition(position);
//
//                        String name = clickedItem.getName();
//                        Toast.makeText(saeidian_custom_spinner.this, name + " selected", Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent)
                    {
                    }
                });
    }
    private void initList()
    {

        saeidian_array=new ArrayList<>();
        saeidian_klid klid=new saeidian_klid();
        klid.name= "please select";
        klid.phone="09131005050" ;
        klid.call=(R.drawable.phone);
        klid.info=(R.drawable.info);
        klid.message=(R.drawable.message);
        saeidian_array.add(klid);

        saeidian_klid klid2 = new saeidian_klid();
        klid2.name= "shayan saeidian1";
        klid2.phone="09131005050" ;
        klid2.call=(R.drawable.phone);
        klid2.info=(R.drawable.info);
        klid2.message=(R.drawable.message);
        saeidian_array.add(klid2);

        saeidian_klid klid3 = new saeidian_klid();
        klid3.name= "shayan saeidian2";
        klid3.phone="09131005050" ;
        klid3.call=(R.drawable.phone);
        klid3.info=(R.drawable.info);
        klid3.message=(R.drawable.message);
        saeidian_array.add(klid3);

        saeidian_klid klid4 = new saeidian_klid();
        klid4.name= "shayan saeidian3";
        klid4.phone="09131005050" ;
        klid4.call=(R.drawable.phone);
        klid4.info=(R.drawable.info);
        klid4.message=(R.drawable.message);
        saeidian_array.add(klid4);

        saeidian_klid klid5 = new saeidian_klid();
        klid5.name= "shayan saeidian4";
        klid5.phone="09131005050" ;
        klid5.call=(R.drawable.phone);
        klid5.info=(R.drawable.info);
        klid5.message=(R.drawable.message);
        saeidian_array.add(klid5);

        saeidian_klid klid6 = new saeidian_klid();
        klid6.name= "shayan saeidian5";
        klid6.phone="09131005050" ;
        klid6.call=(R.drawable.phone);
        klid6.info=(R.drawable.info);
        klid6.message=(R.drawable.message);
        saeidian_array.add(klid6);

        saeidian_klid klid7 = new saeidian_klid();
        klid7.name= "shayan saeidian6";
        klid7.phone="09131005050" ;
        klid7.call=(R.drawable.phone);
        klid7.info=(R.drawable.info);
        klid7.message=(R.drawable.message);
        saeidian_array.add(klid7);

        saeidian_klid klid8 = new saeidian_klid();
        klid8.name= "shayan saeidian7";
        klid8.phone="09131005050" ;
        klid8.call=(R.drawable.phone);
        klid8.info=(R.drawable.info);
        klid8.message=(R.drawable.message);
        saeidian_array.add(klid8);

        saeidian_klid klid9 = new saeidian_klid();
        klid9.name= "shayan saeidian8";
        klid9.phone="09131005050" ;
        klid9.call=(R.drawable.phone);
        klid9.info=(R.drawable.info);
        klid9.message=(R.drawable.message);
        saeidian_array.add(klid9);

        saeidian_klid klid10 = new saeidian_klid();
        klid10.name= "shayan saeidian9";
        klid10.phone="09131005050" ;
        klid10.call=(R.drawable.phone);
        klid10.info=(R.drawable.info);
        klid10.message=(R.drawable.message);
        saeidian_array.add(klid10);

        saeidian_klid klid11 = new saeidian_klid();
        klid11.name= "shayan saeidian10";
        klid11.phone="09131005050" ;
        klid11.call=(R.drawable.phone);
        klid11.info=(R.drawable.info);
        klid11.message=(R.drawable.message);
        saeidian_array.add(klid11);

        saeidian_klid klid12 = new saeidian_klid();
        klid12.name= "shayan saeidian11";
        klid12.phone="09131005050" ;
        klid12.call=(R.drawable.phone);
        klid12.info=(R.drawable.info);
        klid12.message=(R.drawable.message);
        saeidian_array.add(klid12);

        saeidian_klid klid13 = new saeidian_klid();
        klid13.name= "shayan saeidian12";
        klid13.phone="09131005050" ;
        klid13.call=(R.drawable.phone);
        klid13.info=(R.drawable.info);
        klid13.message=(R.drawable.message);
        saeidian_array.add(klid13);

        saeidian_klid klid14 = new saeidian_klid();
        klid14.name= "shayan saeidian13";
        klid14.phone="09131005050" ;
        klid14.call=(R.drawable.phone);
        klid14.info=(R.drawable.info);
        klid14.message=(R.drawable.message);
        saeidian_array.add(klid14);

        saeidian_klid klid15 = new saeidian_klid();
        klid15.name= "shayan saeidian14";
        klid15.phone="09131005050" ;
        klid15.call=(R.drawable.phone);
        klid15.info=(R.drawable.info);
        klid15.message=(R.drawable.message);
        saeidian_array.add(klid15);
    }
    }
