package com.orbitsoft.teamorbitsoft.Moosavi ;
public class moosavi_contactslist_class
{
    private int turn = 0 ;
    private moosavi_savedcontact_class first  ;
    private moosavi_savedcontact_class cursor  ;
    private moosavi_savedcontact_class last ;
    public void Adding ( String name , String phone )
    {
        if ( turn == 0 )
        {
            first = new moosavi_savedcontact_class ( ) ;
            first.main.Setting ( phone , name ) ;
            last = first ;
            turn ++ ;
        }
        else
        {
            last.next = new moosavi_savedcontact_class ( ) ;
            last = last.next ;
            last.main.Setting ( phone , name ) ;
        }
    }
    public String GetName ( int que )
    {
        if ( turn > 0 && que <= turn )
        {
            cursor = first ;
            for ( int i = 1 ; i <= que ; i ++ )
            {
                if ( i != que )
                {
                    cursor = cursor.next ;
                }
            }
            return cursor.main.GetName ( ) ;
        }
        else
        {
            return "" ;
        }
    }
    public void Calling ( int que )
    {
        if ( turn > 0 && que <= turn )
        {
            cursor = first ;
            for ( int i = 1 ; i <= que ; i ++ )
            {
                if ( i != que )
                {
                    cursor = cursor.next ;
                }
            }
            cursor.main.Call ( ) ;
        }
    }
    public void Messaging ( int que , String myText )
    {
        if ( turn > 0 && que <= turn )
        {
            cursor = first ;
            for ( int i = 1 ; i <= que ; i ++ )
            {
                if ( i != que )
                {
                    cursor = cursor.next ;
                }
            }
            cursor.main.Message ( myText );
        }
    }
}






































