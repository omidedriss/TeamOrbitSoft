package com.orbitsoft.teamorbitsoft.Moosavi ;
import androidx.appcompat.app.AppCompatActivity ;
import android.content.Intent ;
import android.os.Bundle ;
import android.widget.Button ;
import com.orbitsoft.teamorbitsoft.R ;
public class moosavi_contacts_list_actvivity extends AppCompatActivity
{
    Button cgorji , cedris , chatami , csalimi , cnikkhoo , ckanaani , csaiedian , cmoosavi , coffice ;
    Button mgorji , medris , mhatami , msalimi , mnikkhoo , mkanaani , msaiedian , mmoosavi , moffice ;
    Button back ;
    @Override
    protected void onCreate ( Bundle savedInstanceState )
    {
        super.onCreate ( savedInstanceState ) ;
        setContentView ( R.layout.moosavi_contacts_list_layout ) ;
        moosavi_contactslist_class contactsList = new moosavi_contactslist_class ( ) ;
        cgorji = findViewById ( R.id.moosavi_contacts_list_button_gorjicall ) ;
        cedris = findViewById ( R.id.moosavi_contacts_list_button_edrisicall ) ;
        chatami = findViewById ( R.id.moosavi_contacts_list_button_hatamiicall ) ;
        csalimi = findViewById ( R.id.moosavi_contacts_list_button_salimicall ) ;
        cnikkhoo = findViewById ( R.id.moosavi_contacts_list_button_nikkhoocall ) ;
        ckanaani = findViewById ( R.id.moosavi_contacts_list_button_kanaanicall ) ;
        csaiedian = findViewById ( R.id.moosavi_contacts_list_button_saiediancall ) ;
        cmoosavi= findViewById ( R.id.moosavi_contacts_list_button_moosavicall ) ;
        coffice = findViewById ( R.id.moosavi_contacts_list_button_officecall ) ;
        mgorji = findViewById ( R.id.moosavi_contacts_list_button_gorjimessage ) ;
        medris = findViewById ( R.id.moosavi_contacts_list_button_edrisimessage ) ;
        mhatami = findViewById ( R.id.moosavi_contacts_list_button_hatamimessage ) ;
        msalimi = findViewById ( R.id.moosavi_contacts_list_button_salimimessage ) ;
        mnikkhoo = findViewById ( R.id.moosavi_contacts_list_button_nikkhoomessage ) ;
        mkanaani = findViewById ( R.id.moosavi_contacts_list_button_kanaanicall ) ;
        msaiedian = findViewById ( R.id.moosavi_contacts_list_button_saiediancall ) ;
        mmoosavi = findViewById ( R.id.moosavi_contacts_list_button_moosavimessage ) ;
        moffice = findViewById ( R.id.moosavi_contacts_list_button_officemessage ) ;
        back = findViewById ( R.id.moosavi_contacts_list_button_back ) ;
        back.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_main_choose_activity.class ) ;
                    startActivity ( intent ) ;
                } ) ;
        contactsList.Adding ( "Abbas Gorji" , "09162020267" ) ;
        contactsList.Adding ( "Omid Edris" , "09132708488" ) ;
        contactsList.Adding ( "Alireza Hatami" , "09130169816" ) ;
        contactsList.Adding ( "Hossein Nikkhoo" , "09395330036" ) ;
        contactsList.Adding ( "Amaneh Salimi" , "09054124086" ) ;
        contactsList.Adding ( "Mitra Kanaani" , "0935372884" ) ;
        contactsList.Adding ( "Shayan Saiedian" , "09173929711" ) ;
        contactsList.Adding ( "Shahriar Moosavi" , "09928087738" ) ;
        contactsList.Adding ( "Metaco Office" , "09928727696" ) ;
        cgorji.setOnClickListener
                (v->{
                    contactsList.Calling ( 1 ) ;
                } ) ;
        cedris.setOnClickListener
                (v->{
                    contactsList.Calling ( 2 ) ;
                } ) ;
        chatami.setOnClickListener
                (v->{
                    contactsList.Calling ( 3 ) ;
                } ) ;
        cnikkhoo.setOnClickListener
                (v->{
                    contactsList.Calling ( 4 ) ;
                } ) ;
        csalimi.setOnClickListener
                (v->{
                    contactsList.Calling ( 5 ) ;
                } ) ;
        ckanaani.setOnClickListener
                (v->{
                    contactsList.Calling ( 6 ) ;
                } ) ;
        csaiedian.setOnClickListener
                (v->{
                    contactsList.Calling ( 7 ) ;
                } ) ;
        cmoosavi.setOnClickListener
                (v->{
                    contactsList.Calling ( 8 ) ;
                } ) ;
        coffice.setOnClickListener
                (v->{
                    contactsList.Calling ( 9 ) ;
                } ) ;

// ------------++++++++++++++++++++++++++++_____________

        mgorji.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_messaging_activity.class ) ;
                    Bundle bundle = new Bundle ( ) ;
                    bundle.putInt ( "get_person" , 1 ) ;
                    intent.putExtra ( "get_person" , bundle ) ;
                    startActivity ( intent ) ;
                } ) ;
        medris.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_messaging_activity.class ) ;
                    Bundle bundle = new Bundle ( ) ;
                    bundle.putInt ( "get_person" , 2 ) ;
                    intent.putExtra ( "get_person" , bundle ) ;
                    startActivity ( intent ) ;
                } ) ;
        mhatami.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_messaging_activity.class ) ;
                    Bundle bundle = new Bundle ( ) ;
                    bundle.putInt ( "get_person" , 3 ) ;
                    intent.putExtra ( "get_person" , bundle ) ;
                    startActivity ( intent ) ;
                } ) ;
        mnikkhoo.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_messaging_activity.class ) ;
                    Bundle bundle = new Bundle ( ) ;
                    bundle.putInt ( "get_person" , 4 ) ;
                    intent.putExtra ( "get_person" , bundle ) ;
                    startActivity ( intent ) ;
                } ) ;
        msalimi.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_messaging_activity.class ) ;
                    Bundle bundle = new Bundle ( ) ;
                    bundle.putInt ( "get_person" , 5 ) ;
                    intent.putExtra ( "get_person" , bundle ) ;
                    startActivity ( intent ) ;
                } ) ;
        mkanaani.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_messaging_activity.class ) ;
                    Bundle bundle = new Bundle ( ) ;
                    bundle.putInt ( "get_person" , 6 ) ;
                    intent.putExtra ( "get_person" , bundle ) ;
                    startActivity ( intent ) ;
                } ) ;
        msaiedian.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_messaging_activity.class ) ;
                    Bundle bundle = new Bundle ( ) ;
                    bundle.putInt ( "get_person" , 7 ) ;
                    intent.putExtra ( "get_person" , bundle ) ;
                    startActivity ( intent ) ;
                } ) ;
        mmoosavi.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_messaging_activity.class ) ;
                    Bundle bundle = new Bundle ( ) ;
                    bundle.putInt ( "get_person" , 8 ) ;
                    intent.putExtra ( "get_person" , bundle ) ;
                    startActivity ( intent ) ;
                } ) ;
        moffice.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_contacts_messaging_activity.class ) ;
                    Bundle bundle = new Bundle ( ) ;
                    bundle.putInt ( "get_person" , 9 ) ;
                    intent.putExtra ( "get_person" , bundle ) ;
                    startActivity ( intent ) ;
                } ) ;
    }
}
































