package com.orbitsoft.teamorbitsoft.Moosavi ;
import androidx.appcompat.app.AppCompatActivity ;
import android.content.Intent ;
import android.graphics.Color;
import android.graphics.drawable.Drawable ;
import android.os.Bundle ;
import android.telephony.SmsManager ;
import android.view.ViewGroup ;
import android.widget.Button ;
import android.widget.EditText ;
import android.widget.LinearLayout ;
import android.widget.TextView ;
import com.orbitsoft.teamorbitsoft.R ;
public class moosavi_messager_texting_activity extends AppCompatActivity
{
    LinearLayout messagesList ;
    Button back , send ;
    EditText message ;
    TextView theMessage ;
    @Override
    protected void onCreate ( Bundle savedInstanceState )
    {
        SmsManager sms = SmsManager.getDefault ( ) ;
        super.onCreate ( savedInstanceState ) ;
        setContentView ( R.layout.moosavi_messager_texting_layout ) ;
        messagesList = findViewById ( R.id.moosavi_messager_texting_viewgroup_list ) ;
        back = findViewById ( R.id.moosavi_messager_texting_button_back ) ;
        send = findViewById ( R.id.moosavi_messager_texting_button_sending ) ;
        message = findViewById ( R.id.moosavi_messager_texting_edittext_message ) ;
        Bundle bundle = getIntent().getExtras();
        String phoneNum = bundle.getString ( "phoneNum" , "989928087738" ) ;
        back.setOnClickListener
                (v->{
                    Intent intent = new Intent ( getApplicationContext ( ) , moosavi_messager_getnumber_activity.class ) ;
                } ) ;
        send.setOnClickListener
                (v->{
                    sms.sendTextMessage ( phoneNum , null , String.valueOf ( message.getText ( ) ), null , null ) ;
                    theMessage = new TextView ( this ) ;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams ( LinearLayout.LayoutParams.MATCH_PARENT , LinearLayout.LayoutParams.WRAP_CONTENT ) ;
                    layoutParams.setMargins ( 0 ,10 , 0 , 0 ) ;
                    theMessage.setBackgroundDrawable ( getResources ( ).getDrawable ( R.drawable.moosavi_defaultall_baseobjbackg ) ) ;
                    theMessage.setPadding ( 5 , 5 , 5 , 5 ) ;
                    theMessage.setTextColor ( Color.parseColor ( "#000000" ) ) ;
                    theMessage.setText ( message.getText ( ) ) ;
                    messagesList.addView ( theMessage , layoutParams ) ;
                } ) ;
    }
}








































