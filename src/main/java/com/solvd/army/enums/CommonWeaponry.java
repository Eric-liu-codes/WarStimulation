package com.solvd.army.enums;

public enum CommonWeaponry {
    AIRCRAFT(2), GUN(1), SUBMARINE(4), TANK(4);

    private int numOfOperator;

    CommonWeaponry(int numOfOperator){
        this.numOfOperator = numOfOperator;
    }

    public int getNumOfOperator() {
        return numOfOperator;
    }
}
