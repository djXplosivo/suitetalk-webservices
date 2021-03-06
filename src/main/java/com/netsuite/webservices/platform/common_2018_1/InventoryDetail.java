
package com.netsuite.webservices.platform.common_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.Record;
import com.netsuite.webservices.platform.core_2018_1.RecordRef;


/**
 * <p>Java class for InventoryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="inventoryAssignmentList" type="{urn:common_2018_1.platform.webservices.netsuite.com}InventoryAssignmentList" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryDetail", propOrder = {
    "inventoryAssignmentList",
    "customForm"
})
public class InventoryDetail
    extends Record
{

    protected InventoryAssignmentList inventoryAssignmentList;
    protected RecordRef customForm;

    /**
     * Gets the value of the inventoryAssignmentList property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryAssignmentList }
     *     
     */
    public InventoryAssignmentList getInventoryAssignmentList() {
        return inventoryAssignmentList;
    }

    /**
     * Sets the value of the inventoryAssignmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryAssignmentList }
     *     
     */
    public void setInventoryAssignmentList(InventoryAssignmentList value) {
        this.inventoryAssignmentList = value;
    }

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

}
