
package com.netsuite.webservices.transactions.demandplanning_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_1.RecordRef;
import com.netsuite.webservices.transactions.demandplanning_2018_1.types.ItemSupplyPlanOrderType;


/**
 * <p>Java class for ItemSupplyPlanOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSupplyPlanOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="receiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sourceLocation" type="{urn:core_2018_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="orderCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="orderType" type="{urn:types.demandplanning_2018_1.transactions.webservices.netsuite.com}ItemSupplyPlanOrderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSupplyPlanOrder", propOrder = {
    "orderLineId",
    "orderDate",
    "receiptDate",
    "sourceLocation",
    "quantity",
    "orderCreated",
    "orderType"
})
public class ItemSupplyPlanOrder {

    protected Long orderLineId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    protected RecordRef sourceLocation;
    protected Double quantity;
    protected Boolean orderCreated;
    @XmlSchemaType(name = "string")
    protected ItemSupplyPlanOrderType orderType;

    /**
     * Gets the value of the orderLineId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderLineId() {
        return orderLineId;
    }

    /**
     * Sets the value of the orderLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderLineId(Long value) {
        this.orderLineId = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the sourceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceLocation() {
        return sourceLocation;
    }

    /**
     * Sets the value of the sourceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceLocation(RecordRef value) {
        this.sourceLocation = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the orderCreated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCreated() {
        return orderCreated;
    }

    /**
     * Sets the value of the orderCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCreated(Boolean value) {
        this.orderCreated = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSupplyPlanOrderType }
     *     
     */
    public ItemSupplyPlanOrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSupplyPlanOrderType }
     *     
     */
    public void setOrderType(ItemSupplyPlanOrderType value) {
        this.orderType = value;
    }

}
