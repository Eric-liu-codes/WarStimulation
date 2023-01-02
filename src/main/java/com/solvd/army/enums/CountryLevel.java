package com.solvd.army.enums;

public enum CountryLevel {
    //Combat strength measuring from a scale from 1-10
    LOW_COMBAT("1-3"), MEDIUM_COMBAT("4-7"), HIGH_COMBAT("8-10");
    private String combatLevel;

    CountryLevel(String combatLevel){
        this.combatLevel = combatLevel;
    }
}
