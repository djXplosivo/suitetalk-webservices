
package com.netsuite.webservices.platform.messages_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.AsyncStatusResult;


/**
 * <p>Java class for AsyncStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_1.platform.webservices.netsuite.com}asyncStatusResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncStatusResponse", propOrder = {
    "asyncStatusResult"
})
public class AsyncStatusResponse {

    @XmlElement(namespace = "urn:core_2018_1.platform.webservices.netsuite.com", required = true)
    protected AsyncStatusResult asyncStatusResult;

    /**
     * Gets the value of the asyncStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncStatusResult }
     *     
     */
    public AsyncStatusResult getAsyncStatusResult() {
        return asyncStatusResult;
    }

    /**
     * Sets the value of the asyncStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncStatusResult }
     *     
     */
    public void setAsyncStatusResult(AsyncStatusResult value) {
        this.asyncStatusResult = value;
    }

}
