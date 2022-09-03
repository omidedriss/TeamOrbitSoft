package com.orbitsoft.teamorbitsoft.Mazaheri;



public class Mazuser {

        private String MazName;
        private String MazFamil;
        private String MazNumber;

        public Mazuser (String MazName,String MazFamil,String MazNumber){

            this.MazName = MazName;
            this.MazFamil=MazFamil;
            this.MazNumber = MazNumber;
        }

        public String getName() {
            return MazName;
        }

        public void setName(String name) {
            MazName = name;
        }

        public String getFamil() {
            return MazFamil;
        }

        public void setFamil(String famil) {
            MazFamil = famil;
        }

        public String getNumber() {
            return MazNumber;
        }

        public void setNumber(String number) {
            MazNumber = number;
        }
    }




