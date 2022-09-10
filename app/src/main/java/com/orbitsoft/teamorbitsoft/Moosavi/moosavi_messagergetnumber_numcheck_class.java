package com.orbitsoft.teamorbitsoft.Moosavi ;

import android.text.Editable;

public class moosavi_messagergetnumber_numcheck_class
{
    public int NumChecker (String theNum )
    {
        if ( theNum.length ( ) == 12 )
        {
            return 1 ;
        }
        else
        {
            return 0 ;
        }
    }
}
