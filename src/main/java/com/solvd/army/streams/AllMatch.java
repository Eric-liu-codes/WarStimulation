package com.solvd.army.streams;

import com.solvd.army.country.Country;

import java.util.List;
import java.util.stream.Collectors;

public class AllMatch {
    List<Country> country = getCountry();
    private List<Country> getCountry(){
        return List.of(
                new Country("CountryA","Catholic", "Democrat",1350000000, 2401, 3000000),
                new Country("CountryB","Buddhism", "Republican",1520000000, 1521, 4000000),
                new Country("CountryC","No Religion", "Democrat",1650000000, 1864, 2500000),
                new Country("CountryD","Catholic", "Republican",1280000000, 1500, 1500000),
                new Country("CountryE","No Religion", "Democrat",210000000, 2400, 1400000)
        );
    }

    boolean allmatch = country.stream()
            .allMatch(coun -> coun.getNumOfSoldiers() > 3000000);
}
