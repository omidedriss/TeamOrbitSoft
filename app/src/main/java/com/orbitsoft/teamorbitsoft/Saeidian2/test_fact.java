package com.orbitsoft.teamorbitsoft.Saeidian2;

import android.widget.Toast;

public class test_fact {
    int b=1;
    public int test_fact(int a)
    {
        if(a==1)
        {
            return b;
        }
        else
        {
            b=b*a;
            return test_fact(a-1);
        }
    }


}
