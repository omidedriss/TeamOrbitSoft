package com.orbitsoft.teamorbitsoft.Moosavi ;
import androidx.appcompat.app.AppCompatActivity ;
import android.content.Intent ;
import android.os.Bundle ;
import android.widget.Button ;
import android.widget.EditText ;
import android.widget.ImageView ;
import android.widget.TextView ;
import com.orbitsoft.teamorbitsoft.R ;
public class moosavi_main_login_activity extends AppCompatActivity
{
    ImageView showPass ;
    EditText enterPass ;
    Button ok ;
    TextView wrong ;
    @Override
    protected void onCreate ( Bundle savedInstanceState )
    {
        super.onCreate ( savedInstanceState ) ;
        setContentView ( R.layout.moosavi_main_login_layout ) ;
        moosavi_passing_class passer = new moosavi_passing_class ( ) ;
        showPass = findViewById ( R.id.moosavi_main_login_imageview_showpass ) ;
        enterPass = findViewById ( R.id.moosavi_main_login_edittext_enterpass ) ;
        ok = findViewById ( R.id.moosavi_main_login_button_ok ) ;
        wrong = findViewById ( R.id.moosavi_main_login_textview_wrong ) ;
        passer.Created ( showPass ) ;
        ok.setOnClickListener
                (v->{
                    if ( passer.CheckPass ( enterPass ) == 1 )
                    {
                        Intent intent = new Intent ( getApplicationContext ( ) , moosavi_main_choose_activity.class ) ;
                        startActivity ( intent ) ;
                    }
                    else
                    {
                        passer.Created ( showPass );
                        enterPass.setText ( "" ) ;
                        wrong.setText ( "Wrong pass word ! Try again" ) ;
                    }
                } ) ;
    }
}





































