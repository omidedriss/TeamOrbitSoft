package com.orbitsoft.teamorbitsoft.Moosavi ;
import androidx.appcompat.app.AppCompatActivity ;
import android.content.Intent ;
import android.os.Bundle ;
import android.widget.Button ;
import android.widget.EditText ;
import android.widget.TextView ;
import com.orbitsoft.teamorbitsoft.R ;
import java.util.concurrent.atomic.AtomicInteger;
public class moosavi_contacts_messaging_activity extends AppCompatActivity
{
    TextView person , sents ;
    Button back , send ;
    EditText message ;
    @Override
    protected void onCreate ( Bundle savedInstanceState )
    {
        super.onCreate ( savedInstanceState ) ;
        setContentView ( R.layout.moosavi_contacts_messaging_layout ) ;
        moosavi_contactslist_class contactsList = new moosavi_contactslist_class ( ) ;
        person = findViewById ( R.id.moosavi_contacts_messaging_textview_title ) ;
        sents = findViewById ( R.id.moosavi_contacts_messaging_textview_sents ) ;
        back = findViewById ( R.id.moosavi_contacts_messaging_button_back ) ;
        send = findViewById ( R.id.moosavi_contacts_messaging_button_sending ) ;
        message = findViewById ( R.id.moosavi_contacts_messaging_edittext_thetext ) ;
        contactsList.Adding ( "Abbas Gorji" , "09162020267" ) ;
        contactsList.Adding ( "Omid Edris" , "09132708488" ) ;
        contactsList.Adding ( "Alireza Hatami" , "09130169816" ) ;
        contactsList.Adding ( "Hossein Nikkhoo" , "09395330036" ) ;
        contactsList.Adding ( "Amaneh Salimi" , "09054124086" ) ;
        contactsList.Adding ( "Mitra Kanaani" , "0935372884" ) ;
        contactsList.Adding ( "Shayan Saiedian" , "09173929711" ) ;
        contactsList.Adding ( "Shahriar Moosavi" , "09928087738" ) ;
        contactsList.Adding ( "Metaco Office" , "09928727696" ) ;
        back.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_list_actvivity.class ) ;
                    startActivity ( intent ) ;
                } ) ;
        AtomicInteger messages = new AtomicInteger ( ) ;
        Bundle bundle = getIntent ( ) . getExtras ( ) ;
        int turn = bundle.getInt ( "get_person" , 1 ) ;
        person.setText ( contactsList.GetName ( turn ) ) ;
        send.setOnClickListener
                (v->{
                    contactsList.Messaging ( turn , message.toString ( ) ) ;
                    message.setText ( "" ) ;
                    messages.set ( messages.get ( ) + 1 ) ;
                    sents.setText ( Integer.toString ( messages.get ( ) ) + " messages sent" ) ;
                } ) ;
    }
}

































