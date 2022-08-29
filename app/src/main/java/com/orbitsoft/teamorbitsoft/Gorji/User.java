package com.orbitsoft.teamorbitsoft.Gorji;

public class User {
    private String Name , Family;
    private Long Number;

    public User (String name,String family,Long number){
        this.Family=family;
        this.Name = name;
        this.Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public Long getNumber() {
        return Number;
    }

    public void setNumber(Long number) {
        Number = number;
    }
}
