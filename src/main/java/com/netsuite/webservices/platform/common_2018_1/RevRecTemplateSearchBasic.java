
package com.netsuite.webservices.platform.common_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.SearchBooleanField;
import com.netsuite.webservices.platform.core_2018_1.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2018_1.SearchLongField;
import com.netsuite.webservices.platform.core_2018_1.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_1.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchStringField;


/**
 * <p>Java class for RevRecTemplateSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevRecTemplateSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="amorMethod" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="amorPeriod" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="amorStartOffset" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="amorTermSrc" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="amorType" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="contraAccount" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="deferralAccount" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="periodOffset" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="targetAccount" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="useForeignAmounts" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevRecTemplateSearchBasic", propOrder = {
    "amorMethod",
    "amorPeriod",
    "amorStartOffset",
    "amorTermSrc",
    "amorType",
    "contraAccount",
    "deferralAccount",
    "externalId",
    "externalIdString",
    "internalId",
    "internalIdNumber",
    "isInactive",
    "name",
    "periodOffset",
    "targetAccount",
    "useForeignAmounts"
})
public class RevRecTemplateSearchBasic
    extends SearchRecordBasic
{

    protected SearchEnumMultiSelectField amorMethod;
    protected SearchLongField amorPeriod;
    protected SearchLongField amorStartOffset;
    protected SearchEnumMultiSelectField amorTermSrc;
    protected SearchEnumMultiSelectField amorType;
    protected SearchMultiSelectField contraAccount;
    protected SearchMultiSelectField deferralAccount;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isInactive;
    protected SearchStringField name;
    protected SearchLongField periodOffset;
    protected SearchMultiSelectField targetAccount;
    protected SearchBooleanField useForeignAmounts;

    /**
     * Gets the value of the amorMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAmorMethod() {
        return amorMethod;
    }

    /**
     * Sets the value of the amorMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAmorMethod(SearchEnumMultiSelectField value) {
        this.amorMethod = value;
    }

    /**
     * Gets the value of the amorPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getAmorPeriod() {
        return amorPeriod;
    }

    /**
     * Sets the value of the amorPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setAmorPeriod(SearchLongField value) {
        this.amorPeriod = value;
    }

    /**
     * Gets the value of the amorStartOffset property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getAmorStartOffset() {
        return amorStartOffset;
    }

    /**
     * Sets the value of the amorStartOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setAmorStartOffset(SearchLongField value) {
        this.amorStartOffset = value;
    }

    /**
     * Gets the value of the amorTermSrc property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAmorTermSrc() {
        return amorTermSrc;
    }

    /**
     * Sets the value of the amorTermSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAmorTermSrc(SearchEnumMultiSelectField value) {
        this.amorTermSrc = value;
    }

    /**
     * Gets the value of the amorType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAmorType() {
        return amorType;
    }

    /**
     * Sets the value of the amorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAmorType(SearchEnumMultiSelectField value) {
        this.amorType = value;
    }

    /**
     * Gets the value of the contraAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getContraAccount() {
        return contraAccount;
    }

    /**
     * Sets the value of the contraAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setContraAccount(SearchMultiSelectField value) {
        this.contraAccount = value;
    }

    /**
     * Gets the value of the deferralAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDeferralAccount() {
        return deferralAccount;
    }

    /**
     * Sets the value of the deferralAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDeferralAccount(SearchMultiSelectField value) {
        this.deferralAccount = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the externalIdString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * Sets the value of the externalIdString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the internalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * Sets the value of the internalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInactive(SearchBooleanField value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setName(SearchStringField value) {
        this.name = value;
    }

    /**
     * Gets the value of the periodOffset property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPeriodOffset() {
        return periodOffset;
    }

    /**
     * Sets the value of the periodOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPeriodOffset(SearchLongField value) {
        this.periodOffset = value;
    }

    /**
     * Gets the value of the targetAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTargetAccount() {
        return targetAccount;
    }

    /**
     * Sets the value of the targetAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTargetAccount(SearchMultiSelectField value) {
        this.targetAccount = value;
    }

    /**
     * Gets the value of the useForeignAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUseForeignAmounts() {
        return useForeignAmounts;
    }

    /**
     * Sets the value of the useForeignAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUseForeignAmounts(SearchBooleanField value) {
        this.useForeignAmounts = value;
    }

}
