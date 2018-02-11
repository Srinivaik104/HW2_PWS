
package com.services.BottomUp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getItineraries", namespace = "http://BottomUp.services.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItineraries", namespace = "http://BottomUp.services.com/", propOrder = {
    "authToken",
    "depCity",
    "destCity",
    "date"
})
public class GetItinerary {

    @XmlElement(name = "authToken", namespace = "")
    private String authToken;
    @XmlElement(name = "depCity", namespace = "")
    private String depCity;
    @XmlElement(name = "destCity", namespace = "")
    private String destCity;
    @XmlElement(name = "date", namespace = "")
    private String date;

    /**
     * 
     * @return
     *     returns String
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * 
     * @param authToken
     *     the value for the authToken property
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDepCity() {
        return this.depCity;
    }

    /**
     * 
     * @param depCity
     *     the value for the depCity property
     */
    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDestCity() {
        return this.destCity;
    }

    /**
     * 
     * @param destCity
     *     the value for the destCity property
     */
    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDate() {
        return this.date;
    }

    /**
     * 
     * @param date
     *     the value for the date property
     */
    public void setDate(String date) {
        this.date = date;
    }

}
