
package com.netsuite.webservices.platform.messages_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.GetSelectValueResult;


/**
 * <p>Java class for getSelectValueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelectValueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_1.platform.webservices.netsuite.com}getSelectValueResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelectValueResponse", propOrder = {
    "getSelectValueResult"
})
public class GetSelectValueResponse {

    @XmlElement(namespace = "urn:core_2018_1.platform.webservices.netsuite.com", required = true)
    protected GetSelectValueResult getSelectValueResult;

    /**
     * Gets the value of the getSelectValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueResult }
     *     
     */
    public GetSelectValueResult getGetSelectValueResult() {
        return getSelectValueResult;
    }

    /**
     * Sets the value of the getSelectValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueResult }
     *     
     */
    public void setGetSelectValueResult(GetSelectValueResult value) {
        this.getSelectValueResult = value;
    }

}
