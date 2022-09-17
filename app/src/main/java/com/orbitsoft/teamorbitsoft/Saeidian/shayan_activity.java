package com.orbitsoft.teamorbitsoft.Saeidian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class shayan_activity extends AppCompatActivity {
int bb;
    int y=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shayan);
        saeidian_son masahat = new saeidian_son();

        EditText square_tol=findViewById(R.id.square_tol);
        EditText triangle_ertefa=findViewById(R.id.triangle_ertefa);
        EditText triangle_ghaede=findViewById(R.id.triangle_ghaede);
        EditText rectangle_arz=findViewById(R.id.rectangle_arz);
        EditText rectangle_tol=findViewById(R.id.rectangle_tol);
        EditText poly_ghaede_kochak=findViewById(R.id.poly_ghaede_kochak);
        EditText poly_ghaede_bozorg=findViewById(R.id.poly_ghaede_bozorg);
        EditText poly_ertefa=findViewById(R.id.poly_ertefa);

        TextView square_show=findViewById(R.id.square_show);
        TextView triangle_show=findViewById(R.id.triangle_show);
        TextView rectangle_show=findViewById(R.id.rectangle_show);
        TextView poly_show=findViewById(R.id.poly_show);

        Button square_bt=findViewById(R.id.square_bt);
        Button triangle_bt=findViewById(R.id.triangle_bt);
        Button poly_bt=findViewById(R.id.poly_bt);
        Button rectangle_bt=findViewById(R.id.rectangle_bt);
        Button theme=findViewById(R.id.theme);




        square_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int square_tol_get=Integer.parseInt(square_tol.getText().toString());
                int square= masahat.square(square_tol_get);
                square_show.setText(Integer.toString(square));
            }
        });
        triangle_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int triangle_ertefa_get=Integer.parseInt(triangle_ertefa.getText().toString());
        int triangle_ghaede_get=Integer.parseInt(triangle_ghaede.getText().toString());
        int triangle= masahat.triangle(triangle_ghaede_get,triangle_ertefa_get);
         triangle_show.setText(Integer.toString(triangle));

            }
        });
        rectangle_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        int rectangle_arz_get=Integer.parseInt(rectangle_arz.getText().toString());
        int rectangle_tol_get=Integer.parseInt(rectangle_tol.getText().toString());
     int rectangle= masahat.rectangle(rectangle_tol_get,rectangle_arz_get);
     rectangle_show.setText(Integer.toString(rectangle));

            }
        });
        poly_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        int poly_ghaede_kochak_get=Integer.parseInt(poly_ghaede_kochak.getText().toString());
        int poly_ghaede_bozorg_get=Integer.parseInt(poly_ghaede_bozorg.getText().toString());
        int poly_ertefa_get=Integer.parseInt(poly_ertefa.getText().toString());
     int poly= masahat.poly(poly_ghaede_kochak_get,poly_ghaede_bozorg_get,poly_ertefa_get);
                     poly_show.setText(Integer.toString(poly));
            }
        });

//        saeidian_son gg =new saeidian_son();
//        gg.saeidian_void(shayan_activity.this);



        //Toast.makeText(shayan_activity.this,String.valueOf(bb),Toast.LENGTH_LONG).show();
    }
}