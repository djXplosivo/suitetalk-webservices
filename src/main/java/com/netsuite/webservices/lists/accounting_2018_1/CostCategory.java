
package com.netsuite.webservices.lists.accounting_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.accounting_2018_1.types.CostCategoryItemCostType;
import com.netsuite.webservices.platform.core_2018_1.Record;
import com.netsuite.webservices.platform.core_2018_1.RecordRef;


/**
 * <p>Java class for CostCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account" type="{urn:core_2018_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemCostType" type="{urn:types.accounting_2018_1.lists.webservices.netsuite.com}CostCategoryItemCostType" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostCategory", propOrder = {
    "name",
    "account",
    "itemCostType",
    "isInactive"
})
public class CostCategory
    extends Record
{

    protected String name;
    protected RecordRef account;
    @XmlSchemaType(name = "string")
    protected CostCategoryItemCostType itemCostType;
    protected Boolean isInactive;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccount(RecordRef value) {
        this.account = value;
    }

    /**
     * Gets the value of the itemCostType property.
     * 
     * @return
     *     possible object is
     *     {@link CostCategoryItemCostType }
     *     
     */
    public CostCategoryItemCostType getItemCostType() {
        return itemCostType;
    }

    /**
     * Sets the value of the itemCostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostCategoryItemCostType }
     *     
     */
    public void setItemCostType(CostCategoryItemCostType value) {
        this.itemCostType = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
