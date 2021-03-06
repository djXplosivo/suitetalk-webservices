
package com.netsuite.webservices.platform.core_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.types.GetAllRecordType;


/**
 * <p>Java class for GetAllRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="recordType" type="{urn:types.core_2018_1.platform.webservices.netsuite.com}GetAllRecordType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllRecord")
public class GetAllRecord {

    @XmlAttribute(name = "recordType")
    protected GetAllRecordType recordType;

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllRecordType }
     *     
     */
    public GetAllRecordType getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllRecordType }
     *     
     */
    public void setRecordType(GetAllRecordType value) {
        this.recordType = value;
    }

}
