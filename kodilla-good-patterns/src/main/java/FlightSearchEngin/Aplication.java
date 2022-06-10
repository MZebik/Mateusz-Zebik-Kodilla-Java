package FlightSearchEngin;

import java.util.List;

public class Aplication {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch("Warszawa", "Szczecin", "Kraków");
        flightSearch.checkFlight();
        List<Flight> allFlightsFrom = flightSearch.allFlightsFrom();
        System.out.println(allFlightsFrom);
        List<Flight> allFlightsTo = flightSearch.allFlightsTo();
        System.out.println(allFlightsTo);
        flightSearch.flightThrough();
        flightSearch.findflightThrough();
    }
}
