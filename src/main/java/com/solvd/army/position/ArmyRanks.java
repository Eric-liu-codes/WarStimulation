package com.solvd.army.position;

public abstract class ArmyRanks {
    private String fName;
    private String lName;
    private int age;
    private int yearsOfExperience;

    public ArmyRanks(String fName, String lName, int age, int yearsOfExperience) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
