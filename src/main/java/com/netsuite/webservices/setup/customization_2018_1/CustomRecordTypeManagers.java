
package com.netsuite.webservices.setup.customization_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.RecordRef;


/**
 * <p>Java class for CustomRecordTypeManagers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomRecordTypeManagers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managerEmp" type="{urn:core_2018_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordTypeManagers", propOrder = {
    "managerEmp"
})
public class CustomRecordTypeManagers {

    protected RecordRef managerEmp;

    /**
     * Gets the value of the managerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getManagerEmp() {
        return managerEmp;
    }

    /**
     * Sets the value of the managerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setManagerEmp(RecordRef value) {
        this.managerEmp = value;
    }

}
