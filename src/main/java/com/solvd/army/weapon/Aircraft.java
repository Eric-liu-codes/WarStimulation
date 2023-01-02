package com.solvd.army.weapon;

import com.solvd.army.exceptions.InvalidAmmunitionException;
import com.solvd.army.position.Operator;

public class Aircraft {
    private Operator operator;
    private String engine;
    private int numOfRockets;
    private String ammunition;

    public Aircraft(Operator operator, String engine, int numOfRockets, String ammunition)
            throws InvalidAmmunitionException{
        this.operator = operator;
        this.engine = engine;
        this.numOfRockets = numOfRockets;
        this.ammunition = ammunition;
        if(this.ammunition == null){
            throw new InvalidAmmunitionException("Invalid Ammunition");
        }
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
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

    public String getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(String ammunition) {
        this.ammunition = ammunition;
    }
}
