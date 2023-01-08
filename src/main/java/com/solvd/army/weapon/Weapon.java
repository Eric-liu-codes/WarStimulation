package com.solvd.army.weapon;
import com.solvd.army.position.Operator;

public abstract class Weapon {
    //make this into an arraylist
    private String ammunition;
    private int rounds;
    private String weaponName;
    private Operator operator;

    public Weapon(String ammunition, int rounds, String weaponName, Operator operator) {
        this.ammunition = ammunition;
        this.rounds = rounds;
        this.weaponName = weaponName;
        this.operator = operator;
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

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
