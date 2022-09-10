package com.orbitsoft.teamorbitsoft.Moosavi ;
import androidx.appcompat.app.AppCompatActivity ;
import android.content.Intent ;
import android.os.Bundle ;
import android.widget.Button ;

import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R ;
public class moosavi_main_choose_activity extends AppCompatActivity
{
    Button contacts , messager , back ;
    @Override
    protected void onCreate ( Bundle savedInstanceState )
    {
        super.onCreate ( savedInstanceState ) ;
        setContentView ( R.layout.moosavi_main_choose_layout ) ;
        contacts = findViewById ( R.id.moosavi_main_choose_button_contacts ) ;
        back = findViewById ( R.id.moosavi_main_choose_button_back ) ;
        messager= findViewById ( R.id.moosavi_main_choose_button_messaging ) ;
        contacts.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_list_actvivity.class ) ;
                    startActivity ( intent ) ;
                } ) ;
        back.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , MainActivity.class ) ;
                    startActivity ( intent ) ;
                } ) ;
        messager.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_messager_getnumber_activity.class ) ;
                    startActivity ( intent ) ;
                } ) ;
    }
}








































