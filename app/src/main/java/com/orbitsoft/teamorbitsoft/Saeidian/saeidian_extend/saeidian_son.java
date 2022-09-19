package com.orbitsoft.teamorbitsoft.Saeidian.saeidian_extend;

import android.content.Context;
import android.widget.Toast;

public class saeidian_son extends saeidian_father implements saeidian_interface {

    public void saeidian_void(Context context)
    {
        saeidian_father saeidian_class =new saeidian_father();

        saeidian_class.setFamily("saeidian");
        String zz=saeidian_class.getFamily();
        Toast.makeText(context,zz,Toast.LENGTH_LONG).show();
    }



    @Override
    public int triangle(int ghaede, int ertefa) {
        int masahat_triangle=(ghaede*ertefa)/2;
        return masahat_triangle;
    }

    @Override
    public int square(int tol) {
        int masahat_square=tol*tol;
        return masahat_square;
    }

    @Override
    public int rectangle(int tol, int arz) {
        int masahat_rectangle=tol*arz;
        return masahat_rectangle;
    }

    @Override
    public int poly(int ghaede_kochak, int ghaede_bozorg, int ertefa) {
        int masahat_poly=((ghaede_kochak+ghaede_bozorg)*ertefa)/2;
        return masahat_poly;
    }
}
