
package com.netsuite.webservices.platform.messages_2018_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.BaseRef;
import com.netsuite.webservices.platform.core_2018_1.DeletionReason;


/**
 * <p>Java class for DeleteListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseRef" type="{urn:core_2018_1.platform.webservices.netsuite.com}BaseRef" maxOccurs="unbounded"/>
 *         &lt;element name="deletionReason" type="{urn:core_2018_1.platform.webservices.netsuite.com}DeletionReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteListRequest", propOrder = {
    "baseRef",
    "deletionReason"
})
public class DeleteListRequest {

    @XmlElement(required = true)
    protected List<BaseRef> baseRef;
    protected DeletionReason deletionReason;

    /**
     * Gets the value of the baseRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseRef }
     * 
     * 
     */
    public List<BaseRef> getBaseRef() {
        if (baseRef == null) {
            baseRef = new ArrayList<BaseRef>();
        }
        return this.baseRef;
    }

    /**
     * Gets the value of the deletionReason property.
     * 
     * @return
     *     possible object is
     *     {@link DeletionReason }
     *     
     */
    public DeletionReason getDeletionReason() {
        return deletionReason;
    }

    /**
     * Sets the value of the deletionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletionReason }
     *     
     */
    public void setDeletionReason(DeletionReason value) {
        this.deletionReason = value;
    }

}
