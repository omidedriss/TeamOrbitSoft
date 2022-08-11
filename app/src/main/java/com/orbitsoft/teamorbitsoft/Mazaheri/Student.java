package com.orbitsoft.teamorbitsoft.Mazaheri;

public class Student {
    String name,family;
    double height,weight,lesson1,lesson2;
    int stunum;
     Student(String name, String family, double weight,
                        double height, int stunum,double lesson1,
                        double lesson2) {
        this.name = name;
        this.family = family;
        this.weight = weight;
        this.height = height;
        this.stunum = stunum;
        this.lesson1=lesson1;
        this.lesson2=lesson2;
    }

    public String show(){
         String st="";
        st=st+"\n";
        st= "نام و فامیل : "+this.name +" " + this.family;
        st=st+"\n";
        st=st+"قد : "+this.height;
        st=st+"\n";
        st=st+"وزن : "+this.weight;
        st=st+"\n";
        st=st+"شماره دانش آموز : "+this.stunum;
        st=st+"\n";
        st=st+"درس 1 : "+this.lesson1;
        st=st+"\n";
        st=st+"درس 2 : "+this.lesson2;
        st=st+"\n";
        st=st+"معدل : "+avarage(this.lesson1,this.lesson2);
        st=st+"\n";
        st=st+"بی ام آی : "+bmi(this.weight,this.height);
        st=st+"\n";
        return st;
    }

    public double bmi(double weight, double height){
        //BMI=weight/height^2
        double v =weight / (Math.pow(height/100,2));
        v=Math.round(v*10.0)/10.0;
         return v;
    }

    public double avarage(double lesson1,double lesson2){
        return (lesson1+lesson2)/2;
    }

}
