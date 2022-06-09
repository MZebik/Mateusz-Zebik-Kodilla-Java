package FlightSearchEngin;

import java.util.ArrayList;
import java.util.List;

public final class FlightDatabase {
    public static List<Flight> getFlights() {
        final List<Flight> flights = new ArrayList<Flight>();

        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Kraków", "Wrocław"));
        flights.add(new Flight("Warszawa", "Katowice"));
        flights.add(new Flight("Gdańsk", "Rzeszów"));
        flights.add(new Flight("Szczecin", "Kraków"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Kraków"));
        flights.add(new Flight("Katowice", "Szczecin"));

        return new ArrayList<>(flights);
    }
}
