package com.orbitsoft.teamorbitsoft.Kanani;

public class fact {
    int b=1;
    public int fact(int a)
    {
        if(a==1)
        {
            return b;
        }
        else
        {
            b=b*a;
            return fact(a-1);
        }
    }
}
