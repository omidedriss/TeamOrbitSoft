package com.orbitsoft.teamorbitsoft.Salimi;
import java.util.Scanner;

public class Student {
    String name, lastname;
    double height;
    double Weight;
    int stu_id;
    float[] score;
    float BMI;
    private double weight;

    public Student() {
        this.name = name;
        this.lastname = lastname;
        this.height = height;
        this.Weight = Weight;
        this.stu_id = stu_id;
        this.score = score;
    }
    public double[] Score(double[] a) {
        double result = 0;
        for (double i : score) {
            result += i;
        }
        double avarage = result / score.length;
        return a;
    }
    public void BMI(float[] b){
        float BMI = (float) (weight / (height * height));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public float[] getScore() {
        return score;
    }

    public void setScore(float[] score) {
        this.score = score;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(float BMI) {
        this.BMI = BMI;
    }

    public void setScore(Scanner sc) {
    }
}
