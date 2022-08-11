package com.orbitsoft.teamorbitsoft.Mazaheri;

public class Student {
    String name,family;
    double height,weight,lesson1,lesson2;
    int stunum;
    // تعریف سازنده کلاس برای مقدار دهی اولیه آبجکت ها
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
    //متد نمایش داده ها
    public String show(){String st="";
        st=st+"\n";
        st= "نام و فامیل : "+this.name +" " + this.family;
        st=st+"\n";
        st=st+"قد : "+this.height;
        st=st+"\n";
        st=st+"وزن : "+this.weight;
        st=st+"\n";
        st=st+"شماره دانش آموز : "+this.stunum;
        st=st+"\n";
        st=st+"نمره درس 1 : "+this.lesson1;
        st=st+"\n";
        st=st+"نمره درس 2 : "+this.lesson2;
        st=st+"\n";
        st=st+"معدل : "+avarage(this.lesson1,this.lesson2);
        st=st+"\n";
        st=st+"بی ام آی : "+bmi(this.weight,this.height);

        st=st+"    >>>>    "+tahlilBMI(bmi(this.weight,this.height));

        st=st+"\n\n\n";
        return st;
    }
    //متد معدل گیری
    public double avarage(double lesson1,double lesson2){
        return (lesson1+lesson2)/2;
    }

    public double bmi(double weight, double height){
        //BMI=weight/height^2
        double v =weight / (Math.pow(height/100,2));
        v=Math.round(v*10.0)/10.0;
         return v;
    }

    public String tahlilBMI(double bmi){
        String tahlil="";
         if(bmi<=18.5){
             tahlil="دانش آموز دچار کاهش وزن است.";
         }
         if(bmi>18.5 && bmi<= 24.9){
             tahlil="دانش آموز در بازه ی وزن سالم به سر می برد.";
         }
        if(bmi>25 && bmi<= 29.9){
            tahlil="دانش آموز اضافه وزن دارد.";
        }
        if(bmi>30 ){
            tahlil="دانش آموز از چاقی مفرط رنج می برد.";
        }
        return tahlil;
    }

}
