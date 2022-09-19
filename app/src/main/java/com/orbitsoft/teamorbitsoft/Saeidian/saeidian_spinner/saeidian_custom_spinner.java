package com.orbitsoft.teamorbitsoft.Saeidian.saeidian_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian_recycler_view.saeidian_klid;
import com.orbitsoft.teamorbitsoft.Saeidian.test_cons;

import java.util.ArrayList;

public class saeidian_custom_spinner extends AppCompatActivity {
spinneradapter adapter_spinner;
ArrayList<saeidian_klid> saeidian_spinner_array;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_custom_spinner);
        initList();
        Spinner spinner = findViewById(R.id.saeidian_spinner);
        adapter_spinner = new spinneradapter(this, saeidian_spinner_array);
        spinner.setAdapter(adapter_spinner);

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
        test_cons shayan_cons = new test_cons("shayan", "saeidian", "09173929711");
        test_cons abbas_cons = new test_cons("abass", "gorji", "09162020267");
        test_cons arian_cons = new test_cons("arian", "taheri", "09134332092");
        test_cons hossein_cons = new test_cons("hossein", "rahimi", "09136503775");
        test_cons ali_cons = new test_cons("ali", "rahmani", "09368115440");
        test_cons mohammad_cons = new test_cons("mohammad", "ziaei", "09138334887");
        test_cons amir_cons = new test_cons("amir", "kheirkhah", "09132101841");
        test_cons amirali_cons = new test_cons("amirali", "kabirian", "09140271959");
        test_cons pouria_cons = new test_cons("pouria", "bakhtiari", "09103493880");
        test_cons ashkan_cons = new test_cons("ashkan", "azimi", "09134333627");
        test_cons mikaeil_cons = new test_cons("mikaeil", "daneshfar", "09132362371");
        test_cons danial_cons = new test_cons("danial", "shafiei", "09028346273");
        test_cons erfan_cons = new test_cons("erfan", "dehghan", "09360189017");
        test_cons iman_cons = new test_cons("iman", "khodaei", "09134258818");
        test_cons kiarash_cons = new test_cons("kiarash", "kamyabi", "09390670054");
        test_cons saman_cons = new test_cons("saman", "saghafian", "09011360833");
        test_cons mehdi_cons = new test_cons("mehdi", "hosseini", "09330174760");
        test_cons nikan_cons = new test_cons("nikan", "khoshnam", "09160735766");
        test_cons sepehr_cons = new test_cons("sepehr", "soltani", "09368927161");
        test_cons sina_cons = new test_cons("sina", "zamani", "09379163053");

        ArrayList<test_cons> contact =new ArrayList<>();
        contact.add(shayan_cons);
        contact.add(abbas_cons);
        contact.add(arian_cons);
        contact.add(hossein_cons);
        contact.add(ali_cons);
        contact.add(mohammad_cons);
        contact.add(amir_cons);
        contact.add(amirali_cons);
        contact.add(pouria_cons);
        contact.add(ashkan_cons);
        contact.add(mikaeil_cons);
        contact.add(danial_cons);
        contact.add(erfan_cons);
        contact.add(iman_cons);
        contact.add(kiarash_cons);
        contact.add(saman_cons);
        contact.add(mehdi_cons);
        contact.add(nikan_cons);
        contact.add(sepehr_cons);
        contact.add(sina_cons);

        saeidian_spinner_array =new ArrayList<>();
        saeidian_klid klid=new saeidian_klid();
        klid.name= contact.get(0).name2 +" "+contact.get(0).family2 ;
        klid.phone=contact.get(0).phone2 ;
        klid.call=(R.drawable.phone);
        klid.info=(R.drawable.info);
        klid.message=(R.drawable.message);
        saeidian_spinner_array.add(klid);

        saeidian_klid klid2 = new saeidian_klid();
        klid2.name= contact.get(1).name2 +" "+contact.get(1).family2 ;
        klid2.phone=contact.get(1).phone2 ;
        klid2.call=(R.drawable.phone);
        klid2.info=(R.drawable.info);
        klid2.message=(R.drawable.message);
        saeidian_spinner_array.add(klid2);

        saeidian_klid klid3 = new saeidian_klid();
        klid3.name= contact.get(2).name2 +" "+contact.get(2).family2 ;
        klid3.phone=contact.get(2).phone2 ;
        klid3.call=(R.drawable.phone);
        klid3.info=(R.drawable.info);
        klid3.message=(R.drawable.message);
        saeidian_spinner_array.add(klid3);

        saeidian_klid klid4 = new saeidian_klid();
        klid4.name= contact.get(3).name2 +" "+contact.get(3).family2 ;
        klid4.phone=contact.get(3).phone2 ;
        klid4.call=(R.drawable.phone);
        klid4.info=(R.drawable.info);
        klid4.message=(R.drawable.message);
        saeidian_spinner_array.add(klid4);

        saeidian_klid klid5 = new saeidian_klid();
        klid5.name= contact.get(4).name2 +" "+contact.get(4).family2 ;
        klid5.phone=contact.get(4).phone2 ;
        klid5.call=(R.drawable.phone);
        klid5.info=(R.drawable.info);
        klid5.message=(R.drawable.message);
        saeidian_spinner_array.add(klid5);

        saeidian_klid klid6 = new saeidian_klid();
        klid6.name= contact.get(5).name2 +" "+contact.get(5).family2 ;
        klid6.phone=contact.get(5).phone2 ;
        klid6.call=(R.drawable.phone);
        klid6.info=(R.drawable.info);
        klid6.message=(R.drawable.message);
        saeidian_spinner_array.add(klid6);

        saeidian_klid klid7 = new saeidian_klid();
        klid7.name= contact.get(6).name2 +" "+contact.get(6).family2 ;
        klid7.phone=contact.get(6).phone2 ;
        klid7.call=(R.drawable.phone);
        klid7.info=(R.drawable.info);
        klid7.message=(R.drawable.message);
        saeidian_spinner_array.add(klid7);

        saeidian_klid klid8 = new saeidian_klid();
        klid8.name= contact.get(7).name2 +" "+contact.get(7).family2 ;
        klid8.phone=contact.get(7).phone2 ;
        klid8.call=(R.drawable.phone);
        klid8.info=(R.drawable.info);
        klid8.message=(R.drawable.message);
        saeidian_spinner_array.add(klid8);

        saeidian_klid klid9 = new saeidian_klid();
        klid9.name= contact.get(8).name2 +" "+contact.get(8).family2 ;
        klid9.phone=contact.get(8).phone2 ;
        klid9.call=(R.drawable.phone);
        klid9.info=(R.drawable.info);
        klid9.message=(R.drawable.message);
        saeidian_spinner_array.add(klid9);

        saeidian_klid klid10 = new saeidian_klid();
        klid10.name= contact.get(9).name2 +" "+contact.get(9).family2 ;
        klid10.phone=contact.get(9).phone2 ;
        klid10.call=(R.drawable.phone);
        klid10.info=(R.drawable.info);
        klid10.message=(R.drawable.message);
        saeidian_spinner_array.add(klid10);

        saeidian_klid klid11 = new saeidian_klid();
        klid11.name= contact.get(10).name2 +" "+contact.get(10).family2 ;
        klid11.phone=contact.get(10).phone2 ;
        klid11.call=(R.drawable.phone);
        klid11.info=(R.drawable.info);
        klid11.message=(R.drawable.message);
        saeidian_spinner_array.add(klid11);

        saeidian_klid klid12 = new saeidian_klid();
        klid12.name= contact.get(11).name2 +" "+contact.get(11).family2 ;
        klid12.phone=contact.get(11).phone2 ;
        klid12.call=(R.drawable.phone);
        klid12.info=(R.drawable.info);
        klid12.message=(R.drawable.message);
        saeidian_spinner_array.add(klid12);

        saeidian_klid klid13 = new saeidian_klid();
        klid13.name= contact.get(12).name2 +" "+contact.get(12).family2 ;
        klid13.phone=contact.get(12).phone2 ;
        klid13.call=(R.drawable.phone);
        klid13.info=(R.drawable.info);
        klid13.message=(R.drawable.message);
        saeidian_spinner_array.add(klid13);

        saeidian_klid klid14 = new saeidian_klid();
        klid14.name= contact.get(13).name2 +" "+contact.get(13).family2 ;
        klid14.phone=contact.get(13).phone2 ;
        klid14.call=(R.drawable.phone);
        klid14.info=(R.drawable.info);
        klid14.message=(R.drawable.message);
        saeidian_spinner_array.add(klid14);

        saeidian_klid klid15 = new saeidian_klid();
        klid15.name= contact.get(14).name2 +" "+contact.get(14).family2 ;
        klid15.phone=contact.get(14).phone2 ;
        klid15.call=(R.drawable.phone);
        klid15.info=(R.drawable.info);
        klid15.message=(R.drawable.message);
        saeidian_spinner_array.add(klid15);

        saeidian_klid klid16 = new saeidian_klid();
        klid16.name= contact.get(15).name2 +" "+contact.get(15).family2 ;
        klid16.phone=contact.get(15).phone2 ;
        klid16.call=(R.drawable.phone);
        klid16.info=(R.drawable.info);
        klid16.message=(R.drawable.message);
        saeidian_spinner_array.add(klid16);

        saeidian_klid klid17 = new saeidian_klid();
        klid17.name= contact.get(16).name2 +" "+contact.get(16).family2 ;
        klid17.phone=contact.get(16).phone2 ;
        klid17.call=(R.drawable.phone);
        klid17.info=(R.drawable.info);
        klid17.message=(R.drawable.message);
        saeidian_spinner_array.add(klid17);

        saeidian_klid klid18 = new saeidian_klid();
        klid18.name= contact.get(17).name2 +" "+contact.get(17).family2 ;
        klid18.phone=contact.get(17).phone2 ;
        klid18.call=(R.drawable.phone);
        klid18.info=(R.drawable.info);
        klid18.message=(R.drawable.message);
        saeidian_spinner_array.add(klid18);

        saeidian_klid klid19 = new saeidian_klid();
        klid19.name= contact.get(18).name2 +" "+contact.get(0).family2 ;
        klid19.phone=contact.get(18).phone2 ;
        klid19.call=(R.drawable.phone);
        klid19.info=(R.drawable.info);
        klid19.message=(R.drawable.message);
        saeidian_spinner_array.add(klid19);

        saeidian_klid klid20 = new saeidian_klid();
        klid20.name= contact.get(19).name2 +" "+contact.get(19).family2 ;
        klid20.phone=contact.get(19).phone2 ;
        klid20.call=(R.drawable.phone);
        klid20.info=(R.drawable.info);
        klid20.message=(R.drawable.message);
        saeidian_spinner_array.add(klid20);
    }

    }
