
package com.netsuite.webservices.platform.common_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.SearchBooleanField;
import com.netsuite.webservices.platform.core_2018_1.SearchCustomFieldList;
import com.netsuite.webservices.platform.core_2018_1.SearchDateField;
import com.netsuite.webservices.platform.core_2018_1.SearchLongField;
import com.netsuite.webservices.platform.core_2018_1.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_1.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchStringField;


/**
 * <p>Java class for EntityGroupSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityGroupSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="email" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="groupName" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="groupOwner" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="groupType" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="isDynamic" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isManufacturingWorkCenter" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isPrivate" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="laborResources" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="machineResources" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="workCalendar" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_1.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityGroupSearchBasic", propOrder = {
    "email",
    "externalId",
    "externalIdString",
    "groupName",
    "groupOwner",
    "groupType",
    "internalId",
    "internalIdNumber",
    "isDynamic",
    "isInactive",
    "isManufacturingWorkCenter",
    "isPrivate",
    "laborResources",
    "lastModifiedDate",
    "machineResources",
    "subsidiary",
    "workCalendar",
    "customFieldList"
})
public class EntityGroupSearchBasic
    extends SearchRecordBasic
{

    protected SearchStringField email;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchStringField groupName;
    protected SearchMultiSelectField groupOwner;
    protected SearchMultiSelectField groupType;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isDynamic;
    protected SearchBooleanField isInactive;
    protected SearchBooleanField isManufacturingWorkCenter;
    protected SearchBooleanField isPrivate;
    protected SearchLongField laborResources;
    protected SearchDateField lastModifiedDate;
    protected SearchLongField machineResources;
    protected SearchMultiSelectField subsidiary;
    protected SearchMultiSelectField workCalendar;
    protected SearchCustomFieldList customFieldList;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEmail(SearchStringField value) {
        this.email = value;
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
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGroupName(SearchStringField value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupOwner property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getGroupOwner() {
        return groupOwner;
    }

    /**
     * Sets the value of the groupOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setGroupOwner(SearchMultiSelectField value) {
        this.groupOwner = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setGroupType(SearchMultiSelectField value) {
        this.groupType = value;
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
     * Gets the value of the isDynamic property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsDynamic() {
        return isDynamic;
    }

    /**
     * Sets the value of the isDynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsDynamic(SearchBooleanField value) {
        this.isDynamic = value;
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
     * Gets the value of the isManufacturingWorkCenter property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsManufacturingWorkCenter() {
        return isManufacturingWorkCenter;
    }

    /**
     * Sets the value of the isManufacturingWorkCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsManufacturingWorkCenter(SearchBooleanField value) {
        this.isManufacturingWorkCenter = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsPrivate(SearchBooleanField value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the laborResources property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLaborResources() {
        return laborResources;
    }

    /**
     * Sets the value of the laborResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLaborResources(SearchLongField value) {
        this.laborResources = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastModifiedDate(SearchDateField value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the machineResources property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getMachineResources() {
        return machineResources;
    }

    /**
     * Sets the value of the machineResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setMachineResources(SearchLongField value) {
        this.machineResources = value;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }

    /**
     * Sets the value of the subsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidiary(SearchMultiSelectField value) {
        this.subsidiary = value;
    }

    /**
     * Gets the value of the workCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getWorkCalendar() {
        return workCalendar;
    }

    /**
     * Sets the value of the workCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setWorkCalendar(SearchMultiSelectField value) {
        this.workCalendar = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
