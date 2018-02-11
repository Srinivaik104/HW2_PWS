/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services.BottomUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author srinivaik
 */
public class FlightData {
    public static final String SECRET_TOKEN = "Allow Access";
    public static Map<String, String> users;
    public static List<Flight>flights;

    public FlightData(){

    }
    public static void init() {
        generateUsers();
        generateFlights();
    }
    private static void generateUsers() {
        users = new HashMap<>();
        users.put("Bruce Wayne", "Bruce Wayne");
        users.put("Clark Kent", "Clark Kent");
        users.put("Barry Allen", "Barry Allen");
    }
    private static void generateFlights() {
        flights = new ArrayList<>();
        for(int i = 0; i<100; i++){
            String depCity = "";
            String destCity = "";
            String date = "";
            int price = (int) (Math.random() * 475) +280;

            switch (((int) (Math.random() * 5))){
                case 0:
                    depCity = "Central City";
                    break;
                case 1:
                    depCity = "Metropolis";
                    break;
                case 2:
                    depCity = "Gotham";
                    break;
                case 3:
                    depCity = "Star City";
                    break;
                case 4:
                    depCity = "Nanda Parbat";
                    break;
            }
            switch (((int) (Math.random() * 5))){
                case 0:
                    destCity = "Central City";
                    break;
                case 1:
                    destCity = "Metropolis";
                    break;
                case 2:
                    destCity = "Gotham";
                    break;
                case 3:
                    destCity = "Star City";
                    break;
                case 4:
                    destCity = "Nanda Parbat";
                    break;
            }
            switch (((int) (Math.random() * 5))){
                case 0:
                    date = "2050-02-08";
                    break;
                case 1:
                    date = "2050-02-12";
                    break;
                case 2:
                    date = "2050-02-16";
                    break;
                case 3:
                    date = "2050-02-20";
                    break;
                case 4:
                    date = "2050-02-24";
                    break;
            }
            if(!depCity.equals(destCity)){
                flights.add(new Flight(depCity,destCity,date,price));
            }
        }
    }
    public static List<Itinerary> getItinerary(String depCity, String destCity, String date){
        List<Itinerary> itineraries =new ArrayList<>();
        for(Flight flight:flights){
            if (flight.getDepCity().equals(depCity)&&flight.getDestCity().equals(destCity)
                    && (date == null || flight.getDate().equals(date))){
                List<Flight>flightsOfItin = new ArrayList<>();
                flightsOfItin.add(flight);
                Itinerary itinerary = new Itinerary(depCity, destCity, flightsOfItin);
                itineraries.add(itinerary);
            }
        }
        for (Flight flight : flights) {
            if (flight.getDepCity().equals(depCity)
                    && (date == null || flight.getDate().equals(date))) {
                List<Flight> flightsOfItin = new ArrayList<>();
                flightsOfItin.add(flight);
                for (Flight flight1 : flights) {
                    if (flight1.getDepCity().equals(flight.getDestCity())
                            && flight1.getDestCity().equals(destCity)
                            && ((date == null && flight1.getDate().compareTo(flight.getDate()) >= 0)
                            || flight1.getDate().equals(date))) {
                        flightsOfItin.add(flight1);
                        Itinerary itinerary = new Itinerary(depCity, destCity, flightsOfItin);
                        itineraries.add(itinerary);
                        break;
                    }
                }
            }
        }

        return itineraries;
    }

    public static boolean authorize(String usn, String pwd) {
        return users.containsKey(usn) && pwd.equals(users.get(usn));
    }


}
