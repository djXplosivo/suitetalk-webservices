
package com.netsuite.webservices.platform.core_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.types.SearchRecordType;


/**
 * <p>Java class for GetSavedSearchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSavedSearchRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="searchType" type="{urn:types.core_2018_1.platform.webservices.netsuite.com}SearchRecordType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSavedSearchRecord")
public class GetSavedSearchRecord {

    @XmlAttribute(name = "searchType")
    protected SearchRecordType searchType;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRecordType }
     *     
     */
    public SearchRecordType getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRecordType }
     *     
     */
    public void setSearchType(SearchRecordType value) {
        this.searchType = value;
    }

}
