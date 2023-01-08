package com.solvd.army.weapon;

import com.solvd.army.exceptions.InvalidAmmunitionException;
import com.solvd.army.position.Operator;

public class Tank extends Weapon{
    private int wheels;
    private String engine;
    private int numOfSoldier;

    public Tank(String ammunition, int rounds, String weaponName, Operator operator,
                     int wheels, String engine, int numOfSoldier)
            throws InvalidAmmunitionException {
        super(ammunition, rounds, weaponName, operator);
        this.wheels = wheels;
        this.engine = engine;
        this.numOfSoldier = numOfSoldier;
        if(ammunition == null){
            throw new InvalidAmmunitionException("Invalid Ammunition");
        }
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
}
