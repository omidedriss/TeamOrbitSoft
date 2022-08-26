package com.orbitsoft.teamorbitsoft.Saeidian2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian;
import com.orbitsoft.teamorbitsoft.Saeidian.saeidian2;

public class saeidian2_main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_login1);
        test_fact shayanfc=new test_fact();
        int fc=shayanfc.test_fact(6);
//        Toast.makeText(saeidian2_main.this,Integer.toString(fc),Toast.LENGTH_LONG).show();

//        int x = fuc(4);
//        Toast.makeText(saeidian2_main.this, Integer.toString(x), Toast.LENGTH_LONG).show();
    }
    int b=1;
    public int fuc(int a)
    {
        if(a==1)
        {
            return b;
        }
        else
        {
            b=b*a;
            return fuc(a-1);
        }

    }
    public void cans ()
    {
        test_cons shayan_cons = new test_cons("shayan","saeidian");
        shayan_cons.setEmail("asv");
        shayan_cons.setPass("1234");
    }


}