
package com.netsuite.webservices.platform.messages_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.ItemAvailabilityFilter;


/**
 * <p>Java class for GetItemAvailabilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemAvailabilityRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemAvailabilityFilter" type="{urn:core_2018_1.platform.webservices.netsuite.com}ItemAvailabilityFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemAvailabilityRequest", propOrder = {
    "itemAvailabilityFilter"
})
public class GetItemAvailabilityRequest {

    @XmlElement(required = true)
    protected ItemAvailabilityFilter itemAvailabilityFilter;

    /**
     * Gets the value of the itemAvailabilityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemAvailabilityFilter }
     *     
     */
    public ItemAvailabilityFilter getItemAvailabilityFilter() {
        return itemAvailabilityFilter;
    }

    /**
     * Sets the value of the itemAvailabilityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAvailabilityFilter }
     *     
     */
    public void setItemAvailabilityFilter(ItemAvailabilityFilter value) {
        this.itemAvailabilityFilter = value;
    }

}
