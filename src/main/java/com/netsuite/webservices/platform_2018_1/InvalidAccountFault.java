
package com.netsuite.webservices.platform_2018_1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "invalidAccountFault", targetNamespace = "urn:faults_2018_1.platform.webservices.netsuite.com")
public class InvalidAccountFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.netsuite.webservices.platform.faults_2018_1.InvalidAccountFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidAccountFault(String message, com.netsuite.webservices.platform.faults_2018_1.InvalidAccountFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidAccountFault(String message, com.netsuite.webservices.platform.faults_2018_1.InvalidAccountFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.netsuite.webservices.platform.faults_2018_1.InvalidAccountFault
     */
    public com.netsuite.webservices.platform.faults_2018_1.InvalidAccountFault getFaultInfo() {
        return faultInfo;
    }

}
