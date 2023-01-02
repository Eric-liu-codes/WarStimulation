package com.solvd.army.weapon;

import com.solvd.army.exceptions.InvalidAmmunitionException;
import com.solvd.army.position.Operator;

public class Tank {
    private int wheels;
    private String engine;
    private int numOfSoldier;
    private String ammunition;
    private Operator operator;

    public Tank(int wheels, String engine, int numOfSoldier, String ammunition, Operator operator)
            throws InvalidAmmunitionException {
        this.wheels = wheels;
        this.engine = engine;
        this.numOfSoldier = numOfSoldier;
        this.ammunition = ammunition;
        if(this.ammunition == null){
            throw new InvalidAmmunitionException("Invalid Ammunition");
        }
        this.operator = operator;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumOfSoldier() {
        return numOfSoldier;
    }

    public void setNumOfSoldier(int numOfSoldier) {
        this.numOfSoldier = numOfSoldier;
    }

    public String getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(String ammunition) {
        this.ammunition = ammunition;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
