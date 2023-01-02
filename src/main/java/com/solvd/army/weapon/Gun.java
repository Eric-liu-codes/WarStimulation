package com.solvd.army.weapon;

import com.solvd.army.exceptions.InvalidAmmunitionException;

public class Gun {
    private String gunName;
    private String ammunition;
    private int rounds;

    public Gun(String gunName, String ammunition, int rounds) throws InvalidAmmunitionException {
        this.gunName = gunName;
        this.ammunition = ammunition;
        if(this.ammunition == null){
            throw new InvalidAmmunitionException("Invalid Ammunition");
        }
        this.rounds = rounds;
    }

    public String getGunName() {
        return gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    public String getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(String ammunition) {
        this.ammunition = ammunition;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
