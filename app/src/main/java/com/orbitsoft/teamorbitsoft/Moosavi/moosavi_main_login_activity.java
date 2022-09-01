package com.orbitsoft.teamorbitsoft.Moosavi ;
import androidx.appcompat.app.AppCompatActivity ;
import android.os.Bundle ;
import android.widget.Button ;
import android.widget.EditText ;
import android.widget.ImageView ;
import com.orbitsoft.teamorbitsoft.R ;
public class moosavi_main_login_activity extends AppCompatActivity
{
    ImageView showpass ;
    EditText enterpass ;
    Button ok ;
    @Override
    protected void onCreate ( Bundle savedInstanceState )
    {
        super.onCreate ( savedInstanceState ) ;
        setContentView ( R.layout.moosavi_main_login_layout ) ;
        showpass = findViewById ( R.id.moosavi_main_login_imageview_showpass ) ;
        enterpass = findViewById ( R.id.moosavi_main_login_edittext_enterpass ) ;
        ok = findViewById ( R.id.moosavi_main_login_button_ok ) ;
    }
}