package FlightSearchEngin;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private String departure;
    private String arrival;
    private String through;
    private boolean check;

    public FlightSearch(String departure, String arrival, String through) {
        this.departure = departure;
        this.arrival = arrival;
        this.through = through;
    }

    public void allFlightsFrom(){

        String allFlights = FlightDatabase.getFlights().stream()
                .filter(flights -> flights.getDeparture().equals(departure))
                .map(flights -> flights.toString())
                .collect(Collectors.joining("\n"));
        System.out.println("All flights from: " + departure + "\n" + allFlights);
    }
    public void allFlightsTo(){

        String allFlights = FlightDatabase.getFlights().stream()
                .filter(flights -> flights.getArrival().equals(arrival))
                .map(flights -> flights.toString())
                .collect(Collectors.joining("\n"));
        System.out.println("All flights to: " + arrival + "\n" + allFlights);
    }
    public void checkFlight() {
        long flightCheck = FlightDatabase.getFlights().stream()
                .filter(flights -> flights.equals(new Flight(departure, arrival)))
                .count();
        if (flightCheck > 0) {
            check = true;
            System.out.println("Direct flight exist!");
        } else {
            check = false;
            System.out.println("Direct flight does not exist! Try to find fly through");
        }
    }
    public void findflightThrough(){
        if(!check) {
           List<Flight> departures = FlightDatabase.getFlights().stream()
                    .filter(flights -> flights.getDeparture().equals(departure))
                    .collect(Collectors.toList());
           List<Flight> arrivals = FlightDatabase.getFlights().stream()
                   .filter(flights -> flights.getArrival().equals(arrival))
                   .collect(Collectors.toList());

            for(int i = 0; i<departures.size(); i++){
                for(Flight flights: arrivals){
                    if(flights.getDeparture().equals(departures.get(i).getArrival())){
                        String firstPart = departures.get(i).toString();
                        String lastPart = flights.toString();
                        System.out.println("First flight: " + firstPart + "\n" + "Last part: " + lastPart);
                    }
                }
            }
        } else { System.out.println("Exist direct fly");}
    }
    public void flightThrough(){
        String flight1 = FlightDatabase.getFlights().stream()
                .filter(flights -> flights.equals(new Flight(departure, through)))
                .map(flights -> flights.toString())
                .collect(Collectors.joining());
        String flight2 = FlightDatabase.getFlights().stream()
                .filter(flights -> flights.equals(new Flight(through, arrival)))
                .map(flights -> flights.toString())
                .collect(Collectors.joining());

        System.out.println("First part flight: " + flight1 + "\n" + "Last part flight: " + flight2);
    }
}
