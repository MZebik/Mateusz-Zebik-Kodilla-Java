package com.kodilla.stream.world;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent Europe = new Continent();
        Continent Asia = new Continent();
        Continent Africa = new Continent();
        Continent America = new Continent();

        world.addContinent(Europe);
        world.addContinent(Asia);
        world.addContinent(Africa);
        world.addContinent(America);

        //When
        Europe.addCountry(new Country("Poland", new BigDecimal(38000000)));
        Europe.addCountry(new Country("Germany", new BigDecimal(83170000)));
        Europe.addCountry(new Country("France", new BigDecimal(67290000)));
        Europe.addCountry(new Country("Great Britain", new BigDecimal(67080000)));
        Europe.addCountry(new Country("Italy", new BigDecimal(59640000)));

        Asia.addCountry(new Country("China", new BigDecimal(1439323776)));
        Asia.addCountry(new Country("India", new BigDecimal(1380004385)));
        Asia.addCountry(new Country("Indonesia", new BigDecimal(273523615)));
        Asia.addCountry(new Country("Pakistan", new BigDecimal(220892340)));
        Asia.addCountry(new Country("Japan", new BigDecimal(126476461)));

        Africa.addCountry(new Country("Nigeria", new BigDecimal(206139589)));
        Asia.addCountry(new Country("Ethiopia", new BigDecimal(114963588)));
        Asia.addCountry(new Country("Egypt", new BigDecimal(102334404)));
        Asia.addCountry(new Country("Kongo", new BigDecimal(89561403)));
        Asia.addCountry(new Country("South Africa", new BigDecimal(59308690)));

        America.addCountry(new Country("USA", new BigDecimal(313232044)));
        America.addCountry(new Country("Brazil", new BigDecimal(203429773)));
        America.addCountry(new Country("Mexico", new BigDecimal(113724226)));
        America.addCountry(new Country("Colombia", new BigDecimal(44725543)));
        America.addCountry(new Country("Argentina", new BigDecimal(41769726)));

        //Then
        assertEquals(new BigDecimal(new BigInteger("5044589563")), world.getPeopleQuantity() );
    }
}
