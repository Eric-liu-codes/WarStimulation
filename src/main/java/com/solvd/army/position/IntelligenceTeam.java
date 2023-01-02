package com.solvd.army.position;
import java.util.Objects;

public class IntelligenceTeam extends ArmyRanks{

    public IntelligenceTeam(String fName, String lName, int age, int yearsOfExperience) {
        super(fName, lName, age, yearsOfExperience);
    }

    @Override
    public String toString(){
        return getfName() + " " + getlName();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getfName(), getfName(), getAge(), getYearsOfExperience());
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
        IntelligenceTeam intel = (IntelligenceTeam) obj;
        return (intel.getfName().equals(this.getfName())) && (intel.getlName().equals((this.getlName())));
    }
}
