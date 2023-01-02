package com.solvd.army.enums;

public enum Continent {
    NORTH_CONTINENT("Cold Westlands", "Northern Continent", 10000000),
    EAST_CONTINENT("The Vastlands", "Eastern Continent", 20000000),
    SOUTH_CONTINENT("The Desert Lands", "Sourthern Continent", 15000000),
    WEST_CONTINENT("Central Lands", "West Continent", 10000000);

    private String nameOfContinent;
    private String continent;
    private int landmass;

    Continent(String nameOfContinent, String continent, int landmass){
        this.nameOfContinent = nameOfContinent;
        this.continent = continent;
        this.landmass = landmass;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public String getContinent() {
        return continent;
    }

    public int getLandmass() {
        return landmass;
    }
}
