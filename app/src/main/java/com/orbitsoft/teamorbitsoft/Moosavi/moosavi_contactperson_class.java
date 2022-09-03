package com.orbitsoft.teamorbitsoft.Moosavi ;
import android.content.Intent ;
import android.net.Uri ;
import android.telephony.SmsManager ;
public class moosavi_contactperson_class
{
    SmsManager sms = SmsManager.getDefault ( ) ;
    private String phone ;
    private String name ;
    public void Setting ( String phone , String name )
    {
        this.name = name ;
        this.phone = phone ;
    }
    public String GetName ( )
    {
        return name ;
    }
    public void Call ( )
    {
        Intent intent = new Intent ( android.content.Intent.ACTION_DIAL ) ;
        intent.setData ( Uri.parse ( "tel:" + phone ) ) ;
    }
    public void Message ( String theText )
    {
        sms.sendTextMessage ( phone , null , theText , null , null ) ;
    }
}
