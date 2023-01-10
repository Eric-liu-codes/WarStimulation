package com.solvd.army.position;

import com.solvd.army.interfaces.IOperateTank;
import com.solvd.army.Runner;
import com.solvd.army.exceptions.NoNameException;

import org.apache.logging.log4j.*;

import java.util.Objects;

public class Captain extends ArmyRanks implements IOperateTank {

    private static Logger logger = LogManager.getLogger(Runner.class.getName());
    
    public Captain(String fName, String lName, int age, int yearsOfExperience, int soldiersUnderCommand)
    throws NoNameException {
        super(fName, lName, age, yearsOfExperience, soldiersUnderCommand);
        if(fName == null || lName == null){
            logger.info("No name or Invalid name");
            throw new NoNameException("Invalid/No Name");
        }
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
        Captain captain = (Captain) obj;
        return (captain.getfName().equals(this.getfName())) && (captain.getlName().equals((this.getlName())));
    }

    @Override
    public void moving(double speed, String direction) {

    }

    @Override
    public void firing(boolean isFiring) {

    }
}
