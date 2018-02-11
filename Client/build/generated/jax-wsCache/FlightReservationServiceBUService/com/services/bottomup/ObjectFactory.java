
package com.services.bottomup;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.services.bottomup package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Login_QNAME = new QName("http://BottomUp.services.com/", "login");
    private final static QName _UnauthorizedException_QNAME = new QName("http://BottomUp.services.com/", "UnauthorizedException");
    private final static QName _GetItinerariesResponse_QNAME = new QName("http://BottomUp.services.com/", "getItinerariesResponse");
    private final static QName _GetItineraries_QNAME = new QName("http://BottomUp.services.com/", "getItineraries");
    private final static QName _LoginResponse_QNAME = new QName("http://BottomUp.services.com/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.services.bottomup
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetItineraries }
     * 
     */
    public GetItineraries createGetItineraries() {
        return new GetItineraries();
    }

    /**
     * Create an instance of {@link GetItinerariesResponse }
     * 
     */
    public GetItinerariesResponse createGetItinerariesResponse() {
        return new GetItinerariesResponse();
    }

    /**
     * Create an instance of {@link UnauthorizedException }
     * 
     */
    public UnauthorizedException createUnauthorizedException() {
        return new UnauthorizedException();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BottomUp.services.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnauthorizedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BottomUp.services.com/", name = "UnauthorizedException")
    public JAXBElement<UnauthorizedException> createUnauthorizedException(UnauthorizedException value) {
        return new JAXBElement<UnauthorizedException>(_UnauthorizedException_QNAME, UnauthorizedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItinerariesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BottomUp.services.com/", name = "getItinerariesResponse")
    public JAXBElement<GetItinerariesResponse> createGetItinerariesResponse(GetItinerariesResponse value) {
        return new JAXBElement<GetItinerariesResponse>(_GetItinerariesResponse_QNAME, GetItinerariesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItineraries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BottomUp.services.com/", name = "getItineraries")
    public JAXBElement<GetItineraries> createGetItineraries(GetItineraries value) {
        return new JAXBElement<GetItineraries>(_GetItineraries_QNAME, GetItineraries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BottomUp.services.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

}
