package com.solvd.army.weapon;

import com.solvd.army.exceptions.InvalidAmmunitionException;
import com.solvd.army.position.Operator;

public class Gun extends Weapon{
    public Gun(String ammunition, int rounds, String weaponName, Operator operator)
            throws InvalidAmmunitionException{
        super(ammunition, rounds, weaponName, operator);
        if(ammunition == null){
            throw new InvalidAmmunitionException("Invalid Ammunition");
        }
    }
}
