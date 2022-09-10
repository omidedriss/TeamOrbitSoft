package com.orbitsoft.teamorbitsoft.Moosavi ;
import androidx.appcompat.app.AppCompatActivity ;
import android.content.Intent ;
import android.os.Bundle ;
import android.widget.Button ;
import android.widget.EditText ;
import android.widget.TextView ;
import com.orbitsoft.teamorbitsoft.R ;
public class moosavi_messager_getnumber_activity extends AppCompatActivity
{
    TextView guide ;
    EditText number ;
    Button back , enter ;
    @Override
    protected void onCreate ( Bundle savedInstanceState )
    {
        super.onCreate ( savedInstanceState ) ;
        setContentView ( R.layout.moosavi_messager_getnumber_layout ) ;
        moosavi_messagergetnumber_numcheck_class numChecking = new moosavi_messagergetnumber_numcheck_class ( ) ;
        guide = findViewById ( R.id.moosavi_messager_getnumber_textview_guide ) ;
        back = findViewById ( R.id.moosavi_messager_getnumber_button_back ) ;
        enter = findViewById ( R.id.moosavi_messager_getnumber_button_enter ) ;
        number = findViewById ( R.id.moosavi_messager_getnumber_edittext_numgetter ) ;
        back.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_main_choose_activity.class ) ;
                    startActivity ( intent ) ;
                } ) ;
        enter.setOnClickListener
                (v->{
                    if ( numChecking.NumChecker ( String.valueOf ( number.getText ( ) ) ) == 1 )
                    {
                        Intent intent = new Intent ( moosavi_messager_getnumber_activity.this , moosavi_messager_texting_activity.class ) ;
                        Bundle bundle = new Bundle ( ) ;
                        bundle.putString ( "phoneNum" , String.valueOf ( number.getText ( ) ) ) ;
                        intent.putExtra ( "phoneNum" , bundle ) ;
                        startActivity ( intent ) ;
                    }
                    else
                    {
                        guide.setText ( "Wrong number format ! try again in right form" ) ;
                        number.setText ( "_ _  _ _ _  _ _ _  _ _  _ _" ) ;
                    }
                } ) ;
    }
}














































