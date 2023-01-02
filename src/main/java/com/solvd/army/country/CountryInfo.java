package com.solvd.army.country;

public abstract class CountryInfo {
    private String countryName;
    private String mainReligion;
    private String government;
    private int population;
    private int yearsOfEstablishment;
    private int numOfSoldiers;

    public CountryInfo(String countryName, String mainReligion, String government, int population, int yearsOfEstablishment, int numOfSoldiers) {
        this.countryName = countryName;
        this.mainReligion = mainReligion;
        this.government = government;
        this.population = population;
        this.yearsOfEstablishment = yearsOfEstablishment;
        this.numOfSoldiers = numOfSoldiers;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getMainReligion() {
        return mainReligion;
    }

    public void setMainReligion(String mainReligion) {
        this.mainReligion = mainReligion;
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getYearsOfEstablishment() {
        return yearsOfEstablishment;
    }

    public void setYearsOfEstablishment(int yearsOfEstablishment) {
        this.yearsOfEstablishment = yearsOfEstablishment;
    }

    public int getNumOfSoldiers() {
        return numOfSoldiers;
    }

    public void setNumOfSoldiers(int numOfSoldiers) {
        this.numOfSoldiers = numOfSoldiers;
    }
}
