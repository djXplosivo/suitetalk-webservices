
package com.netsuite.webservices.platform.messages_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.SearchRecord;


/**
 * <p>Java class for SearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchRecord" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequest", propOrder = {
    "searchRecord"
})
public class SearchRequest {

    @XmlElement(required = true)
    protected SearchRecord searchRecord;

    /**
     * Gets the value of the searchRecord property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRecord }
     *     
     */
    public SearchRecord getSearchRecord() {
        return searchRecord;
    }

    /**
     * Sets the value of the searchRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRecord }
     *     
     */
    public void setSearchRecord(SearchRecord value) {
        this.searchRecord = value;
    }

}
