
package com.services.bottomup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItineraries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItineraries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItineraries", propOrder = {
    "authToken",
    "depCity",
    "destCity",
    "date"
})
public class GetItineraries {

    protected String authToken;
    protected String depCity;
    protected String destCity;
    protected String date;

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

    /**
     * Gets the value of the depCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepCity() {
        return depCity;
    }

    /**
     * Sets the value of the depCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepCity(String value) {
        this.depCity = value;
    }

    /**
     * Gets the value of the destCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCity() {
        return destCity;
    }

    /**
     * Sets the value of the destCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCity(String value) {
        this.destCity = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}
