package com.orbitsoft.teamorbitsoft.Saeidian2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian;

import java.util.function.IntFunction;

public class saeidian_factorial extends AppCompatActivity {
    Button show_factorial;
    Button show_factorial2;
    EditText enter_number;
    TextView show_number;
    String get_number;
String number;
int get;
int sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_factorial);
        show_factorial = (Button) findViewById(R.id.show_factorial);
        show_factorial2= (Button) findViewById(R.id.show_factorial2);
        enter_number = (EditText) findViewById(R.id.enter_number);
        show_number = findViewById(R.id.show_number);
        enter_number.setTextColor(Color.BLACK);
        show_factorial.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
number=enter_number.getText().toString();
                get = fact(Integer.parseInt(number));
                show_number.setText(Integer.toString(get));
            }
        });
        show_factorial2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               finish();
                Intent i = new
                        Intent(saeidian_factorial.this, saeidian_factorial.class);
                Bundle bundle = new Bundle();
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }


int b1=1;

    public int fact(int a1)
    {
        if(a1==1)
        {
            return b1;
        }
        else
        {
            b1=b1*a1;
            return fact(a1-1);
        }

    }
    }
//
//    get_number = enter_number.getText().toString();
//                number=Integer.valueOf(get_number);
    //        test_fact shayanfc=new test_fact();
//       int fc=shayanfc.test_fact(get_number);
//        Toast.makeText(saeidian_factorial.this,Integer.toString(fc),Toast.LENGTH_LONG).show();

//        int x = fuc(4);
//        Toast.makeText(saeidian2_main.this, Integer.toString(x), Toast.LENGTH_LONG).show();


//    public void cans ()
//    {
//        test_cons shayan_cons = new test_cons("shayan","saeidian");
//        shayan_cons.setEmail("asv");
//        shayan_cons.setPass("1234");
//    }
