package com.solvd.army.weapon;

import com.solvd.army.exceptions.InvalidAmmunitionException;
import com.solvd.army.position.Operator;

public class Aircraft extends Weapon {
    private String engine;
    private int numOfRockets;

    public Aircraft(String ammunition, int rounds, String weaponName, Operator operator, String engine, int numOfRockets)
            throws InvalidAmmunitionException{
        super(ammunition, rounds, weaponName, operator);
        this.engine = engine;
        this.numOfRockets = numOfRockets;
        if(ammunition == null){
            throw new InvalidAmmunitionException("Invalid Ammunition");
        }
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumOfRockets() {
        return numOfRockets;
    }

    public void setNumOfRockets(int numOfRockets) {
        this.numOfRockets = numOfRockets;
    }
}