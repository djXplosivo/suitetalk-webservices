
package com.netsuite.webservices.platform.messages_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.ChangePassword;


/**
 * <p>Java class for ChangePasswordRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changePassword" type="{urn:core_2018_1.platform.webservices.netsuite.com}ChangePassword"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordRequest", propOrder = {
    "changePassword"
})
public class ChangePasswordRequest {

    @XmlElement(required = true)
    protected ChangePassword changePassword;

    /**
     * Gets the value of the changePassword property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePassword }
     *     
     */
    public ChangePassword getChangePassword() {
        return changePassword;
    }

    /**
     * Sets the value of the changePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePassword }
     *     
     */
    public void setChangePassword(ChangePassword value) {
        this.changePassword = value;
    }

}
