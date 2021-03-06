
package com.netsuite.webservices.transactions.employees_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaycheckPayTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaycheckPayTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="apply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="taxableWageBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxedWageBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reportableWageBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isResidentTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckPayTax", propOrder = {
    "line",
    "apply",
    "payTax",
    "payItem",
    "taxableWageBase",
    "taxedWageBase",
    "reportableWageBase",
    "isExempt",
    "isResidentTax",
    "amount"
})
public class PaycheckPayTax {

    protected Long line;
    protected Boolean apply;
    protected String payTax;
    protected Long payItem;
    protected Double taxableWageBase;
    protected Double taxedWageBase;
    protected Double reportableWageBase;
    protected Boolean isExempt;
    protected Boolean isResidentTax;
    protected Double amount;

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLine(Long value) {
        this.line = value;
    }

    /**
     * Gets the value of the apply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApply() {
        return apply;
    }

    /**
     * Sets the value of the apply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApply(Boolean value) {
        this.apply = value;
    }

    /**
     * Gets the value of the payTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTax() {
        return payTax;
    }

    /**
     * Sets the value of the payTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTax(String value) {
        this.payTax = value;
    }

    /**
     * Gets the value of the payItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayItem() {
        return payItem;
    }

    /**
     * Sets the value of the payItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayItem(Long value) {
        this.payItem = value;
    }

    /**
     * Gets the value of the taxableWageBase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxableWageBase() {
        return taxableWageBase;
    }

    /**
     * Sets the value of the taxableWageBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxableWageBase(Double value) {
        this.taxableWageBase = value;
    }

    /**
     * Gets the value of the taxedWageBase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxedWageBase() {
        return taxedWageBase;
    }

    /**
     * Sets the value of the taxedWageBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxedWageBase(Double value) {
        this.taxedWageBase = value;
    }

    /**
     * Gets the value of the reportableWageBase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReportableWageBase() {
        return reportableWageBase;
    }

    /**
     * Sets the value of the reportableWageBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReportableWageBase(Double value) {
        this.reportableWageBase = value;
    }

    /**
     * Gets the value of the isExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExempt() {
        return isExempt;
    }

    /**
     * Sets the value of the isExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExempt(Boolean value) {
        this.isExempt = value;
    }

    /**
     * Gets the value of the isResidentTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResidentTax() {
        return isResidentTax;
    }

    /**
     * Sets the value of the isResidentTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResidentTax(Boolean value) {
        this.isResidentTax = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

}
