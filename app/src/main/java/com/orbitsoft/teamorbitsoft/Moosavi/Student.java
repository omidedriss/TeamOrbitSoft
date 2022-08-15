//  +{Human.java  ->Moosavi.java

package com.orbitsoft.teamorbitsoft.Moosavi;

// Identify of "Student" :
public class Student extends Human
{
    // Methods :
    private String schoolName ;
    private int grade ;
    private int id ;
    private int sub1 ;
    private int sub2 ;
    private int sub3 ;

    // Functions :
    public void SetIdentify ( String schoolName , int grade , int id ) // To set Identify of student
    {
        if ( 1 <= grade &&  grade <= 12 && id / 10000 == 0 )
        {
            this.schoolName = schoolName ;
            this.grade = grade ;
            this.id = id ;
        }
    }
    public void SetSub ( int sub1 , int sub2 , int sub3 ) // To set the scores of subjects
    {
        if ( sub1 >= 0 && sub2 >= 0 && sub3 >= 0 && sub1 <= 20 && sub2 <= 20 && sub3 <= 20 )
        {
            this.sub1 = sub1 ;
            this.sub2 = sub2 ;
            this.sub3 = sub3 ;
        }
    }
    public String GetSchoolName () // To get the school name
    {
        return schoolName;
    }
    public int GetId () // To get the ID of student
    {
        return id ;
    }
    public int GetGrade () // To get the grade of school
    {
        return grade ;
    }
    public float GetAvg ()
    {
        return ( sub1 + sub2 + sub3 ) / 3 ;
    }

}
