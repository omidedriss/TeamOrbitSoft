package com.orbitsoft.teamorbitsoft.Saeidian.saeidian_printname;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;


//public class saeidian2 extends AppCompatActivity {
//    TextView test;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_saaidian2);
//        Bundle bundle = getIntent().getExtras();
//        test = findViewById(R.id.test);
//        if(bundle!=null) {
//            String Name = bundle.getString("test", "nothing");
//           // Long number = bundle.getLong("test2", 12);
//            test.setText("Name/Family : "+Name);
//            Toast.makeText(saeidian2.this, "Name/Family : "+Name, Toast.LENGTH_LONG).show();
////+Long.toString(number)
//        }
//
//    }
//}
public class saeidian2 extends AppCompatActivity {
    EditText name_sh;
    EditText family_sh;


    Button print_name;
    String name_sh2;
    String family_sh2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saaidian2);
        name_sh=(EditText)findViewById(R.id.enter_name_sh);
        family_sh=(EditText)findViewById(R.id.enter_family_sh);
        print_name = (Button) findViewById(R.id.print_name_2);

        name_sh.setTextColor(Color.BLACK);
      family_sh.setTextColor(Color.BLACK);
        print_name.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                        Intent(saeidian2.this, thesheox.class);
                Bundle bundle = new Bundle();
                name_sh2 = name_sh.getText().toString();
                family_sh2= family_sh.getText().toString();
              bundle.putString("test_name", name_sh2);
                bundle.putString("test_family", family_sh2);
                i.putExtras(bundle);
                startActivity(i);



            }
        }));

    }
}