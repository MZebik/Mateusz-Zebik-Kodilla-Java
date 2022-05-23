package com.kodilla.stream.world;

import com.kodilla.stream.invoice.simple.SimpleItem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {


    private List<Country> countries = new ArrayList<>();

    public void addCountry(Country country){
        countries.add(country);
    }

    public List<Country> getCountryList(){
        return new ArrayList<>(countries);
}
}
