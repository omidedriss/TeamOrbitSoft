package com.orbitsoft.teamorbitsoft.Kanani;

public class Student {
        private String name,family;
        private float hight ;
        private long codemeli;
        private float weight,bmi,avg;
        public Student(){
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setFamily(String family) {
            this.family = family;
        }
        public void setHight(int hight) {
            this.hight = hight;
        }
        public void setNationalCode(long nationalCode) {
            this.codemeli = nationalCode;
        }
        public void setWeight(float weight) {
            this.weight = weight;
        }
        public float calAvg(float num1,float num2,float num3,float num4){

            avg=(num1+num2+num3+num4)/4;
            return avg;
        }
        public float getBmi() {
            hight /=100;
            bmi = weight/(hight*hight);
            return bmi;
        }
    }

