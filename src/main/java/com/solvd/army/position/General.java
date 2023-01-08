package com.solvd.army.position;

import java.util.Objects;

public final class General extends ArmyRanks {
    public General(String fName, String lName, int age, int yearsOfExperience, int soldiersUnderCommand){
        super(fName, lName, age, yearsOfExperience, soldiersUnderCommand);
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
        General general = (General) obj;
        return (general.getfName().equals(this.getfName())) && (general.getlName().equals((this.getlName())));
    }
}
