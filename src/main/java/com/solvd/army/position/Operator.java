package com.solvd.army.position;

import com.solvd.army.IOperateAircraft;

import java.util.Objects;

public class Operator implements IOperateAircraft {
    private String fName;
    private String lName;
    private int age;
    private int yearsOfExperience;

    public Operator(String fName, String lName, int age, int yearsOfExperience) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String toString(){
        return this.fName + " " + this.lName;
    }
    public int hashCode(){
        return Objects.hash(this.fName, this.lName, this.age, this.yearsOfExperience);
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Operator operator = (Operator) obj;
        return (operator.getfName().equals(this.getfName())) && (operator.getlName().equals((this.getlName())));
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

    @Override
    public void moving(double speed, String direction) {

    }

    @Override
    public void firing(boolean isFiring) {

    }
}
