
package com.netsuite.webservices.lists.accounting_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.RecordRef;


/**
 * <p>Java class for RevRecScheduleRecurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevRecScheduleRecurrence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incomeaccount" type="{urn:core_2018_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="periodOffset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevRecScheduleRecurrence", propOrder = {
    "incomeaccount",
    "periodOffset",
    "recamount"
})
public class RevRecScheduleRecurrence {

    protected RecordRef incomeaccount;
    protected Long periodOffset;
    protected String recamount;

    /**
     * Gets the value of the incomeaccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIncomeaccount() {
        return incomeaccount;
    }

    /**
     * Sets the value of the incomeaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIncomeaccount(RecordRef value) {
        this.incomeaccount = value;
    }

    /**
     * Gets the value of the periodOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodOffset() {
        return periodOffset;
    }

    /**
     * Sets the value of the periodOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodOffset(Long value) {
        this.periodOffset = value;
    }

    /**
     * Gets the value of the recamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecamount() {
        return recamount;
    }

    /**
     * Sets the value of the recamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecamount(String value) {
        this.recamount = value;
    }

}
