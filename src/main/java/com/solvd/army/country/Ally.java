package com.solvd.army.country;
import java.util.Objects;

public class Ally extends CountryInfo {
    public Ally(String countryName, String mainReligion, String government, int population, int yearsOfEstablishment, int numOfSoldiers, CountryTerritory territory) {
        //super(countryName, mainReligion, government, population, yearsOfEstablishment, numOfSoldiers, territory);
        super(countryName, mainReligion, government, population, yearsOfEstablishment, numOfSoldiers);
    }

    @Override
    public String toString(){
        return getCountryName() + " " + getPopulation() + " " + getNumOfSoldiers();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getCountryName(), getMainReligion(), getGovernment(), getPopulation(), getYearsOfEstablishment(), getNumOfSoldiers());
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else{
            return false;
        }
    }
}
