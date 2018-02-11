/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services.topdown;

import javax.ejb.Stateless;
import javax.jws.WebService;
import se.com.topdown.Ticket;
import se.com.topdown.UnauthorizedException;

/**
 *
 * @author srinivaik
 */
@WebService(serviceName = "FlightResTD",
        portName = "FlightResTDPort", 
        endpointInterface = "se.com.topdown.FlightResTD", 
        targetNamespace = "http://topdown.com.se/", 
        wsdlLocation = "WEB-INF/wsdl/TopDownService/FlightResTD.wsdl")
@Stateless
public class TopDownService {
    public TopDownService(){
        TicketService.init();
    }
    public java.lang.String bookTicket(java.lang.String authToken, se.com.topdown.Itinerary itinerary, java.lang.String cardNumber) throws UnauthorizedException {
        if (!authToken.equals(TicketService.SECRET_TOKEN)) {
            throw new UnauthorizedException("Not authorized", null);
        }
         if (cardNumber != null && !cardNumber.isEmpty()) {
            String ticketNumber = TicketService.bookTicket(itinerary, cardNumber);

            return ticketNumber;
        }

        return null;
    }

    public se.com.topdown.Ticket issueTicket(java.lang.String authToken, java.lang.String ticketNumber) throws UnauthorizedException {
         if (!authToken.equals(TicketService.SECRET_TOKEN)) {
            throw new UnauthorizedException("Not authorized", null);
        }  
        Ticket ticket = TicketService.getTicket(ticketNumber);

        return ticket;
    }
    
}
