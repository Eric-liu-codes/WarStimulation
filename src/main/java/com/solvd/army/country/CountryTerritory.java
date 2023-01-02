package com.solvd.army.country;
import java.util.Objects;

final public class CountryTerritory {
    private String continent;
    private String regionName;
    private int landMass;

    public CountryTerritory(String continent, String regionName, int landMass) {
        this.continent = continent;
        this.regionName = regionName;
        this.landMass = landMass;
    }

    public String toString(){
        return this.continent + " " + this.regionName + " " + this.landMass;
    }
    public int hashCode(){
        return Objects.hash(this.continent, this.regionName, this.landMass);
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else{
            return false;
        }
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getLandMass() {
        return landMass;
    }

    public void setLandMass(int landMass) {
        this.landMass = landMass;
    }
}
