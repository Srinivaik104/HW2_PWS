package com.services.BottomUp;

import java.util.List;

public class Itinerary {
    private String depCity;
    private String destCity;

    private List<Flight>flights;

    public Itinerary(String depCity, String destCity, List<Flight> flights) {
        this.depCity= depCity;
        this.destCity = destCity;
        this.flights = flights;
    }

    public String getDepCity() {
        return depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public int getPrice() {
        int price = 0;

        if (flights != null) {
            for (Flight flight : flights) {
                price += flight.getPrice();
            }
        }

        return price;
    }
}
