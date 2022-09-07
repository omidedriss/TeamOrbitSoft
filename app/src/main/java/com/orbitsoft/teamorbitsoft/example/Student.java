package com.orbitsoft.teamorbitsoft.example;

public class Student extends User implements FatherUser{

    int Grade;
    int Avrage;
    String ClassName;

    @Override
    public void setName(String name) {
        String NameTemp="Student Name :"+name;
        super.setName(NameTemp);

    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public int getAvrage() {
        return Avrage;
    }

    public void setAvrage(int avrage) {
        Avrage = avrage;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    @Override
    public void FatherName(String res) {

    }
}
