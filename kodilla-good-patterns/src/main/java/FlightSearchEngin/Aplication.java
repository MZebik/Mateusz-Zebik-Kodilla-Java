package FlightSearchEngin;

public class Aplication {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch("Gdańsk", "Wrocław", "Kraków");
        flightSearch.checkFlight();
        flightSearch.allFlightsFrom();
        flightSearch.allFlightsTo();
        flightSearch.flightThrough();

    }
}
