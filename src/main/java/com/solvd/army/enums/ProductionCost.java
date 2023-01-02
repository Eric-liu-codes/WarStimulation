package com.solvd.army.enums;

public enum ProductionCost {
    //The average cost (in USD)
    AIRCRAFT_COST("150 Million"), GUN_COST("250"), SUBMARINE_COST("3.4 Billion"),
    TANK("4.3 Million");

    private String cost;

    ProductionCost(String cost){}

    public String getCost() {
        return cost;
    }
}
