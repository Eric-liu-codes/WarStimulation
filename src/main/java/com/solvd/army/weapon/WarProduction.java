package com.solvd.army.weapon;

final public class WarProduction {
    private int tanksPerDay;
    private int aircraftPerDay;
    private int submarinesPerDay;
    private int gunsPerDay;
    private int foodPerDay;
    private int clothesPerDay;
    private int campingUnitPerDay;

    public WarProduction(int tanksPerDay, int aircraftPerDay, int submarinesPerDay, int gunsPerDay,
                         int foodPerDay, int clothesPerDay, int campingUnitPerDay) {
        this.tanksPerDay = tanksPerDay;
        this.aircraftPerDay = aircraftPerDay;
        this.submarinesPerDay = submarinesPerDay;
        this.gunsPerDay = gunsPerDay;
        this.foodPerDay = foodPerDay;
        this.clothesPerDay = clothesPerDay;
        this.campingUnitPerDay = campingUnitPerDay;
    }

    final public int totalDayOutput(int tanksPerDay, int aircraftPerDay, int submarinesPerDay,
                                    int gunsPerDay, int foodPerDay, int clothesPerDay, int campingUnitPerDay){
        return tanksPerDay + aircraftPerDay + submarinesPerDay + gunsPerDay + foodPerDay +
                clothesPerDay + campingUnitPerDay;
    }

    public int getTanksPerDay() {
        return tanksPerDay;
    }

    public void setTanksPerDay(int tanksPerDay) {
        this.tanksPerDay = tanksPerDay;
    }

    public int getAircraftPerDay() {
        return aircraftPerDay;
    }

    public void setAircraftPerDay(int aircraftPerDay) {
        this.aircraftPerDay = aircraftPerDay;
    }

    public int getSubmarinesPerDay() {
        return submarinesPerDay;
    }

    public void setSubmarinesPerDay(int submarinesPerDay) {
        this.submarinesPerDay = submarinesPerDay;
    }

    public int getGunsPerDay() {
        return gunsPerDay;
    }

    public void setGunsPerDay(int gunsPerDay) {
        this.gunsPerDay = gunsPerDay;
    }

    public int getFoodPerDay() {
        return foodPerDay;
    }

    public void setFoodPerDay(int foodPerDay) {
        this.foodPerDay = foodPerDay;
    }

    public int getClothesPerDay() {
        return clothesPerDay;
    }

    public void setClothesPerDay(int clothesPerDay) {
        this.clothesPerDay = clothesPerDay;
    }

    public int getCampingUnitPerDay() {
        return campingUnitPerDay;
    }

    public void setCampingUnitPerDay(int campingUnitPerDay) {
        this.campingUnitPerDay = campingUnitPerDay;
    }
}
