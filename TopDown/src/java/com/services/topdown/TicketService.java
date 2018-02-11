/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services.topdown;

import java.util.HashMap;
import java.util.Map;
import se.com.topdown.Itinerary;
import se.com.topdown.Ticket;

/**
 *
 * @author srinivaik
 */
class TicketService {

    public static final String SECRET_TOKEN = "Allow Access";
    private static Map<String, Ticket> tickets;
    public TicketService(){
    }
    public static void init() {
        tickets = new HashMap<>();
    }

    static String bookTicket(Itinerary itinerary, String cardNumber) {
        Ticket ticket = new Ticket();
        ticket.setItinerary(itinerary);
        ticket.setCardNumber(cardNumber);
        ticket.setTicketNumber(String.valueOf((long) (Math.random() * Long.MAX_VALUE)));

        tickets.put(ticket.getTicketNumber(), ticket);

        return ticket.getTicketNumber();    }

    static Ticket getTicket(String ticketNumber) {
        return tickets.get(ticketNumber);
    }
    
}
