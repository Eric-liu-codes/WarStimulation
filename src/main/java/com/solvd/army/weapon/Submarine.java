package com.solvd.army.weapon;

import com.solvd.army.position.Operator;

public class Submarine {
    private int loadCapacity;
    private int numOfRockets;
    private int numOfSoldiers;
    private Operator operator;

    public Submarine(int loadCapacity, int numOfRockets, int numOfSoldiers, Operator operator) {
        this.loadCapacity = loadCapacity;
        this.numOfRockets = numOfRockets;
        this.numOfSoldiers = numOfSoldiers;
        this.operator = operator;
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

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
