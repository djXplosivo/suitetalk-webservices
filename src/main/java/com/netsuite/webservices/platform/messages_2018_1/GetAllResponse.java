
package com.netsuite.webservices.platform.messages_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.GetAllResult;


/**
 * <p>Java class for GetAllResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_1.platform.webservices.netsuite.com}getAllResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllResponse", propOrder = {
    "getAllResult"
})
public class GetAllResponse {

    @XmlElement(namespace = "urn:core_2018_1.platform.webservices.netsuite.com", required = true)
    protected GetAllResult getAllResult;

    /**
     * Gets the value of the getAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllResult }
     *     
     */
    public GetAllResult getGetAllResult() {
        return getAllResult;
    }

    /**
     * Sets the value of the getAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllResult }
     *     
     */
    public void setGetAllResult(GetAllResult value) {
        this.getAllResult = value;
    }

}
