package com.orbitsoft.teamorbitsoft.Moosavi ;
import android.widget.EditText ;
import android.widget.ImageView ;
import com.orbitsoft.teamorbitsoft.R ;
import java.util.Random ;
public class moosavi_passing_class
{
    private int turner = 0 ;
    private String passWord ;
    private Random rand = new Random ( ) ;
    public void Created ( ImageView passShow )
    {
        turner = rand.nextInt ( 6 ) ;
        if ( turner == 0 )
        {
            passShow.setImageResource ( R.drawable.moosavi_main_login_drawable_png_b394q17 ) ;
            passWord = "b394q17" ;
        }
        if ( turner == 1 )
        {
            passShow.setImageResource ( R.drawable.moosavi_main_login_drawable_png_o572y20 ) ;
            passWord = "o572y20" ;
        }
        if ( turner == 2 )
        {
            passShow.setImageResource ( R.drawable.moosavi_main_login_drawable_png_s237g19 ) ;
            passWord = "s237g19" ;
        }
        if ( turner == 3 )
        {
            passShow.setImageResource ( R.drawable.moosavi_main_login_drawable_png_r451f37 ) ;
            passWord = "r451f37" ;
        }
        if ( turner == 4 )
        {
            passShow.setImageResource ( R.drawable.moosavi_main_login_drawable_png_n538t76 ) ;
            passWord = "n538t76" ;
        }
        if ( turner == 5 )
        {
            passShow.setImageResource ( R.drawable.moosavi_main_login_drawable_png_j927k31 ) ;
            passWord = "j927k31" ;
        }
    }
    public int CheckPass ( EditText passText )
    {
        if ( passText.toString ( ) == passWord )
        {
            return 1 ;
        }
        else
        {
            return 0 ;
        }
    }
}







































