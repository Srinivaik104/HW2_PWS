/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services.BottomUp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.List;

@WebService()
public class FlightReservationServiceBU {
   public FlightReservationServiceBU(){
       FlightData.init();
   }
    @WebMethod(operationName = "login")
    public String login(@WebParam (name = "Username") String usn, @WebParam (name = "Password") String pwd) throws UnauthorizedException{
    if(FlightData.authorize(usn,pwd)){
        return FlightData.SECRET_TOKEN;
    }
    throw new UnauthorizedException("Not Authorized");
   }
   @WebMethod(operationName = "getItineraries")
   public List<Itinerary> getItinerary(@WebParam(name = "authToken")String authToken,
                                       @WebParam(name = "depCity") String depCity,
                                       @WebParam(name = "destCity")String destCity,
                                       @WebParam(name = "date")String date) throws UnauthorizedException{
       if (!authToken.equals(FlightData.SECRET_TOKEN)) {
           throw new UnauthorizedException("Not authorized");
       }
       return FlightData.getItinerary(depCity,destCity,date);
   }
  
}

