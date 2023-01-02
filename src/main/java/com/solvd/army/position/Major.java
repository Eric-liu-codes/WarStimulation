package com.solvd.army.position;
import java.util.Objects;

public class Major extends ArmyRanks {



    public Major(String fName, String lName, int age, int yearsOfExperience, int soldiersUnderCommand) {
        super(fName, lName, age, yearsOfExperience);
    }

    @Override
    public String toString(){
        return getfName() + " " + getlName();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getfName(), getlName(), getAge(), getYearsOfExperience());
    }
    @Override
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
        Major major = (Major) obj;
        return (major.getfName().equals(this.getfName())) && (major.getlName().equals((this.getlName())));
    }
}
