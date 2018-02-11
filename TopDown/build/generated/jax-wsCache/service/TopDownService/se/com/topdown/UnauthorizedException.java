
package se.com.topdown;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnauthorizedException", targetNamespace = "http://topdown.com.se/")
public class UnauthorizedException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ExceptionBean faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UnauthorizedException(String message, ExceptionBean faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UnauthorizedException(String message, ExceptionBean faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: se.com.topdown.ExceptionBean
     */
    public ExceptionBean getFaultInfo() {
        return faultInfo;
    }

}
