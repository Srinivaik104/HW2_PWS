
package se.com.topdown;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 *  WSDL File for FlightReservationServiceTopDown
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FlightResTD", targetNamespace = "http://topdown.com.se/", wsdlLocation = "file:/Users/srinivaik/NetBeansProjects/TopDown/src/conf/xml-resources/web-services/TopDownService/wsdl/FlightResTD.wsdl")
public class FlightResTD_Service
    extends Service
{

    private final static URL FLIGHTRESTD_WSDL_LOCATION;
    private final static WebServiceException FLIGHTRESTD_EXCEPTION;
    private final static QName FLIGHTRESTD_QNAME = new QName("http://topdown.com.se/", "FlightResTD");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/srinivaik/NetBeansProjects/TopDown/src/conf/xml-resources/web-services/TopDownService/wsdl/FlightResTD.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FLIGHTRESTD_WSDL_LOCATION = url;
        FLIGHTRESTD_EXCEPTION = e;
    }

    public FlightResTD_Service() {
        super(__getWsdlLocation(), FLIGHTRESTD_QNAME);
    }

    public FlightResTD_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), FLIGHTRESTD_QNAME, features);
    }

    public FlightResTD_Service(URL wsdlLocation) {
        super(wsdlLocation, FLIGHTRESTD_QNAME);
    }

    public FlightResTD_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FLIGHTRESTD_QNAME, features);
    }

    public FlightResTD_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FlightResTD_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FlightResTD
     */
    @WebEndpoint(name = "FlightResTDPort")
    public FlightResTD getFlightResTDPort() {
        return super.getPort(new QName("http://topdown.com.se/", "FlightResTDPort"), FlightResTD.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FlightResTD
     */
    @WebEndpoint(name = "FlightResTDPort")
    public FlightResTD getFlightResTDPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://topdown.com.se/", "FlightResTDPort"), FlightResTD.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FLIGHTRESTD_EXCEPTION!= null) {
            throw FLIGHTRESTD_EXCEPTION;
        }
        return FLIGHTRESTD_WSDL_LOCATION;
    }

}