package com.solvd.army.position;
import com.solvd.army.IOperateSubmarines;

import java.util.Objects;

public class Sergeant extends ArmyRanks implements IOperateSubmarines {
    public Sergeant(String fName, String lName, int age, int yearsOfExperience, int soldiersUnderCommand) {
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
        Sergeant sergeant = (Sergeant) obj;
        return (sergeant.getfName().equals(this.getfName())) && (sergeant.getlName().equals((this.getlName())));
    }

    @Override
    public void diving(String direction) {

    }

    @Override
    public void radar(boolean isTurnOn, int findObject, int scan) {

    }
}
