package com.solvd.army.weapon;

import com.solvd.army.exceptions.InvalidAmmunitionException;
import com.solvd.army.position.Operator;

public class Submarine extends Weapon{
    private int loadCapacity;
    private int numOfRockets;
    private int numOfSoldiers;

    public Submarine(String ammunition, int rounds, String weaponName, Operator operator,
            int loadCapacity, int numOfRockets, int numOfSoldiers)
            throws InvalidAmmunitionException {
        super(ammunition, rounds, weaponName, operator);
        this.loadCapacity = loadCapacity;
        this.numOfRockets = numOfRockets;
        this.numOfSoldiers = numOfSoldiers;
        if(ammunition == null){
            throw new InvalidAmmunitionException("Invalid Ammunition");
        }
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumOfRockets() {
        return numOfRockets;
    }

    public void setNumOfRockets(int numOfRockets) {
        this.numOfRockets = numOfRockets;
    }

    public int getNumOfSoldiers() {
        return numOfSoldiers;
    }

    public void setNumOfSoldiers(int numOfSoldiers) {
        this.numOfSoldiers = numOfSoldiers;
    }
}
