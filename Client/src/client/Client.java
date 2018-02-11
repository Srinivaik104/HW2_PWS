/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.services.bottomup.Flight;
import com.services.bottomup.Itinerary;
import com.services.bottomup.UnauthorizedException;
import com.services.bottomup.UnauthorizedException_Exception;
import com.services.topdown.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author srinivaik
 */
public class Client {
    private static final String SECRET_TOKEN = "AllowAccess";
    private static final String USERNAME = "Bruce Wayne";
    private static final String PASSWORD = "Bruce Wayne";
    private static final String DEPARTURE_CITY = "Gotham";
    private static final String DESTINATION_CITY = "Metropolis";
    private static final String DATE = "2050-02-08";
    
    private static String savedTicketNumber = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(AuthTest()){
            System.out.println("Authentication Tested Successfully");
        }
        else {
            System.out.println("Authentication Test Failed");
        }
       /* if(FindItinTest()){
            System.out.println("Itinerary Found");
        }
        else {
            System.out.println("FindItin Test Failed");
        }
        */
        if(BookItinTest()){
            System.out.println("Itinerary Booked");
        }
        else {
            System.out.println("Itinerary Booking Test Failed");
        }
        if (IssueTicketTest()) {
            System.out.println("Test for Issuing Ticket succeeded");
        } 
        else {
            System.out.println("Test for Issuing Ticket failed");
        }
        if (testComplete()) {
            System.out.println("testComplete succeeded");
        } 
        else {
            System.out.println("testComplete failed");
        }
    }

    public static boolean AuthTest() {
        try {
            boolean okAuth = login(USERNAME, PASSWORD) != null;
            
            boolean failAuth = false;
            try {
            login("fail", "fail");
            }
            catch (UnauthorizedException_Exception e) {
                failAuth = true;
            }
            
            return okAuth && failAuth;
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
/*
    private static boolean FindItinTest() {
        try {
            boolean okIntineary = getItineraries(SECRET_TOKEN, DEPARTURE_CITY, DESTINATION_CITY, DATE).isEmpty() == false;
            boolean failedAuth = false;
            try {
                 getItineraries("NotSecretToken", DEPARTURE_CITY, DESTINATION_CITY, DATE);
            }
            catch (UnauthorizedException_Exception e) {
                failedAuth = true;
            }
            boolean failDepartureIntineary = getItineraries(SECRET_TOKEN, "NotOkCity", DESTINATION_CITY, DATE).isEmpty();
            boolean failDestinationIntineary = getItineraries(SECRET_TOKEN, DEPARTURE_CITY, "NotOkCity", DATE).isEmpty();
            boolean failDateIntineary = getItineraries(SECRET_TOKEN, DEPARTURE_CITY, DESTINATION_CITY, "NotOkDate").isEmpty();
            
            return okIntineary && failedAuth && failDepartureIntineary && failDestinationIntineary && failDateIntineary;
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
*/
    private static boolean BookItinTest() {
try {
            com.services.topdown.Itinerary itinerary = new com.services.topdown.Itinerary();
            itinerary.setDepartureCity(DEPARTURE_CITY);
            itinerary.setDestinationCity(DESTINATION_CITY);
            
            List<com.services.topdown.Flight> flights = new ArrayList<>();
            
            com.services.topdown.Flight flight = new com.services.topdown.Flight();
            flight.setDepartureCity(DEPARTURE_CITY);
            flight.setDestinationCity(DESTINATION_CITY);
            flight.setDate(DATE);
            flight.setPrice(1000);
            
            itinerary.getFlights().addAll(flights);
                    
            savedTicketNumber = bookTicket(SECRET_TOKEN, itinerary, "54321");
            boolean okBooking = savedTicketNumber != null;
            boolean failedBooking = bookTicket(SECRET_TOKEN, itinerary, null) == null;
            
            return okBooking && failedBooking;
            
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;    }
    private static boolean IssueTicketTest() {
try {
            boolean ticketOk = issueTicket(SECRET_TOKEN, savedTicketNumber) != null;
            boolean ticketFailed = issueTicket(SECRET_TOKEN, "unknownnumber") == null;
            
            return ticketOk && ticketFailed;
            
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;    }

    private static boolean testComplete() {
 try {
            String token = (String) login(USERNAME, PASSWORD);

            System.out.println(token);

            List<Itinerary> itineraries = (List<Itinerary>) getItineraries(token, DEPARTURE_CITY, DESTINATION_CITY, DATE);

            for (Itinerary itinerary : itineraries) {
                System.out.println("------------------------------");
                System.out.println("Itineary for trip from " + itinerary.getDepCity() + " to " + itinerary.getDestCity() + ":");

                int price = 0;
                for (Flight flight : itinerary.getFlights()) {
                    System.out.println(flight.getDate() + " - From " + flight.getDepCity() + " to " + flight.getDestCity());

                    price += flight.getPrice();
                }

                System.out.println("Price: $" + price);
            }

            if (!itineraries.isEmpty()) {
                String ticketNumber = bookTicket(token, convertItinerary(itineraries.get(0)), "12345");

                if (ticketNumber != null) {

                    System.out.println("Ticket booked with ticketNumber: " + ticketNumber);

                    Ticket ticket = (Ticket) issueTicket(token, ticketNumber);

                    if (ticket != null) {
                        System.out.println("Ticket issued with ticketnumber: " + ticket.getTicketNumber() + ", cardNumber: " + ticket.getCardNumber());

                        return true;
                    }
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;    }

    private static Object login(String USERNAME, String PASSWORD) throws UnauthorizedException_Exception {
       com.services.bottomup.FlightReservationServiceBUService service = new com.services.bottomup.FlightReservationServiceBUService();
       com.services.bottomup.FlightReservationServiceBU port = (com.services.bottomup.FlightReservationServiceBU) service.getFlightReservationServiceBUPort();
        return port.login(USERNAME, PASSWORD);
    }

    private static Object getItineraries(String SECRET_TOKEN, String DEPARTURE_CITY, String DESTINATION_CITY, String DATE) throws UnauthorizedException_Exception {
    com.services.bottomup.FlightReservationServiceBUService service = new com.services.bottomup.FlightReservationServiceBUService();
    com.services.bottomup.FlightReservationServiceBU port = (com.services.bottomup.FlightReservationServiceBU) service.getFlightReservationServiceBUPort();
    return port.getItineraries(SECRET_TOKEN, DEPARTURE_CITY, DESTINATION_CITY, DATE);
    }

    private static String bookTicket(String SECRET_TOKEN, com.services.topdown.Itinerary itinerary, String USERNAME) throws com.services.topdown.UnauthorizedException{
    com.services.topdown.FlightResTD_Service service = new com.services.topdown.FlightResTD_Service();
    com.services.topdown.FlightResTD port = service.getFlightResTDPort();
    return port.bookTicket(SECRET_TOKEN, itinerary, USERNAME);
    }

    private static Object issueTicket(String SECRET_TOKEN, String savedTicketNumber) throws com.services.topdown.UnauthorizedException {
        com.services.topdown.FlightResTD_Service service = new com.services.topdown.FlightResTD_Service();
        com.services.topdown.FlightResTD port = service.getFlightResTDPort();
        return port.issueTicket(SECRET_TOKEN, savedTicketNumber);
    }

    private static com.services.topdown.Itinerary convertItinerary(Itinerary itinerary) {
        com.services.topdown.Itinerary convertedItinerary = new com.services.topdown.Itinerary();
        convertedItinerary.setDepartureCity(itinerary.getDepCity());
        convertedItinerary.setDestinationCity(itinerary.getDestCity());

        for (Flight flight : itinerary.getFlights()) {
            convertedItinerary.getFlights().add(convertFlight(flight));
        }

        return convertedItinerary;
    }

    private static com.services.topdown.Flight convertFlight(Flight flight) {
        com.services.topdown.Flight convertedFlight = new com.services.topdown.Flight();
        convertedFlight.setDepartureCity(flight.getDepCity());
        convertedFlight.setDestinationCity(flight.getDestCity());
        convertedFlight.setDate(flight.getDate());
        convertedFlight.setPrice(flight.getPrice());

        return convertedFlight;
    }

   
    
}
