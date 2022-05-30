package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public String findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> FlightDatabase = new HashMap<>();
        FlightDatabase.put("Warsaw", true);
        FlightDatabase.put("Berlin", true);
        FlightDatabase.put("Moscow", false);

        if(FlightDatabase.containsKey(flight.getArrivalAirportl())){
            if(FlightDatabase.get(flight.getArrivalAirportl())){return "Flight possible";}
            else { return "Flight not possible";}
        } else {
            throw new RouteNotFoundException();
        }
    }
}
