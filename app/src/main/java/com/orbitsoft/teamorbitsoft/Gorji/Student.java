package com.orbitsoft.teamorbitsoft.Gorji;

public class Student {
    private String name,family;
    private float hight ;
    private long nationalCode;
    private float weight , bmi, avg;
    //کانسترکتور
    public Student(){

    }
    //ست کردن نام
    public void setName(String name) {
        this.name = name;
    }
    //ست کردن فامیل
    public void setFamily(String family) {
        this.family = family;
    }
    // ست کردن قد
    public void setHight(int hight) {
        this.hight = hight;
    }
    //ست کردن کد ملی
    public void setNationalCode(long nationalCode) {
        this.nationalCode = nationalCode;
    }

    //ست کردن وزن
    public void setWeight(float weight) {
        this.weight = weight;
    }
    //محاسبه میانگین نمره دانش آموز
    public float calAvg(float num1,float num2,float num3,float num4){

        avg=(num1+num2+num3+num4)/4;
        return avg;
    }
    //محاسبه Bmi
    public float getBmi() {
        hight /=100;
        bmi = weight/(hight*hight);
        return bmi;
    }
}
