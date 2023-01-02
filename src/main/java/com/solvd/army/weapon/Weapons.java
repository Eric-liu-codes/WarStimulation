package com.solvd.army.weapon;
import java.util.ArrayList;

public abstract class Weapons {
    //make this into an arraylist
    private ArrayList <Tank> tanks;
    private ArrayList <Aircraft> aircraft;
    private ArrayList <Submarine> submarines;
    private ArrayList <Gun> guns;

    public Weapons(ArrayList<Tank> tanks, ArrayList<Aircraft> aircraft, ArrayList<Submarine> submarines, ArrayList<Gun> guns) {
        this.tanks = tanks;
        this.aircraft = aircraft;
        this.submarines = submarines;
        this.guns = guns;
    }

    public ArrayList<Tank> getTanks() {
        return tanks;
    }

    public void setTanks(ArrayList<Tank> tanks) {
        this.tanks = tanks;
    }

    public ArrayList<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(ArrayList<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    public ArrayList<Submarine> getSubmarines() {
        return submarines;
    }

    public void setSubmarines(ArrayList<Submarine> submarines) {
        this.submarines = submarines;
    }

    public ArrayList<Gun> getGuns() {
        return guns;
    }

    public void setGuns(ArrayList<Gun> guns) {
        this.guns = guns;
    }
}
