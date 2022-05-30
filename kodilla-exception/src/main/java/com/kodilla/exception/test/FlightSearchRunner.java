package com.kodilla.exception.test;

public class FlightSearchRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Paris", "Prague");
        FlightSearch flightSearch = new FlightSearch();

        try {
            String newFlight = flightSearch.findFlight(flight);
            System.out.println(newFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Arrival airport does not exist");
        }
    }
}
