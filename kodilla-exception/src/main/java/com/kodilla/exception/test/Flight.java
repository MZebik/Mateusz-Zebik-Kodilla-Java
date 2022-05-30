package com.kodilla.exception.test;

public class Flight {

    private String departureAirport;
    private String arrivalAirportl;

    public Flight(String departureAirport, String arrivalAirportl) {
        this.departureAirport = departureAirport;
        this.arrivalAirportl = arrivalAirportl;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirportl() {
        return arrivalAirportl;
    }
}
