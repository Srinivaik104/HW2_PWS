
package com.services.topdown;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FlightResTD", targetNamespace = "http://topdown.com.se/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlightResTD {


    /**
     * 
     * @param authToken
     * @param itinerary
     * @param cardNumber
     * @return
     *     returns java.lang.String
     * @throws UnauthorizedException
     */
    @WebMethod(action = "bookTicket")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookTicket", targetNamespace = "http://topdown.com.se/", className = "com.services.topdown.BookTicket")
    @ResponseWrapper(localName = "bookTicketResponse", targetNamespace = "http://topdown.com.se/", className = "com.services.topdown.BookTicketResponse")
    public String bookTicket(
        @WebParam(name = "authToken", targetNamespace = "")
        String authToken,
        @WebParam(name = "itinerary", targetNamespace = "")
        Itinerary itinerary,
        @WebParam(name = "cardNumber", targetNamespace = "")
        String cardNumber)
        throws UnauthorizedException
    ;

    /**
     * 
     * @param ticketNumber
     * @param authToken
     * @return
     *     returns com.services.topdown.Ticket
     * @throws UnauthorizedException
     */
    @WebMethod(action = "issueTicket")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "issueTicket", targetNamespace = "http://topdown.com.se/", className = "com.services.topdown.IssueTicket")
    @ResponseWrapper(localName = "issueTicketResponse", targetNamespace = "http://topdown.com.se/", className = "com.services.topdown.IssueTicketResponse")
    public Ticket issueTicket(
        @WebParam(name = "authToken", targetNamespace = "")
        String authToken,
        @WebParam(name = "ticketNumber", targetNamespace = "")
        String ticketNumber)
        throws UnauthorizedException
    ;

}