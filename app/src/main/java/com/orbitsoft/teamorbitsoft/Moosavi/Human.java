//  ->Student.java

package com.orbitsoft.teamorbitsoft.Moosavi;

// Identify of "Human" :
public class Human
{
    // Methods :
    private String name ;
    private String lName ;
    private int weigh ;
    private float high ;

    // Functions :
    public void SetName ( String name , String lName ) // To set name and last name values
    {
        this.name = name ;
        this.lName = lName ;
    }
    public void SetBody ( int weigh , float high ) // To set weigh & high values
    {
        this.weigh = weigh ;
        this.high = high ;
    }
    public String GetName ()
    {
        return name ;
    }
    public String GetLName ()
    {
        return lName ;
    }
    public float GetBMI ()
    {
        return weigh / ( high * high ) ;
    }


}
