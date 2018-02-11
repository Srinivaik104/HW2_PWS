
package com.services.BottomUp.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getItinerariesResponse", namespace = "http://BottomUp.services.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItinerariesResponse", namespace = "http://BottomUp.services.com/")
public class GetItineraryResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.services.BottomUp.Itinerary> _return;

    /**
     * 
     * @return
     *     returns List<Itinerary>
     */
    public List<com.services.BottomUp.Itinerary> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.services.BottomUp.Itinerary> _return) {
        this._return = _return;
    }

}
