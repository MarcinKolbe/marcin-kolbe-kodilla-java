package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String continentName;
    private List<Country> countryList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }
    public void addCountry(Country country) {
        countryList.add(country);
    }
    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countryList=" + countryList +
                '}';
    }
}