
package com.netsuite.webservices.lists.relationships_2018_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_1.BillingAccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.BillingScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_1.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.JobSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ProjectTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ResourceAllocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TimeBillSearchBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchRecord;


/**
 * <p>Java class for JobSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_1.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="billingAccountJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}BillingAccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="billingScheduleJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}BillingScheduleSearchBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}ProjectTaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="resourceAllocationJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}ResourceAllocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="timeJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}TimeBillSearchBasic" minOccurs="0"/>
 *         &lt;element name="customSearchJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobSearch", propOrder = {
    "basic",
    "billingAccountJoin",
    "billingScheduleJoin",
    "contactPrimaryJoin",
    "customerJoin",
    "projectTaskJoin",
    "resourceAllocationJoin",
    "taskJoin",
    "timeJoin",
    "customSearchJoin"
})
public class JobSearch
    extends SearchRecord
{

    protected JobSearchBasic basic;
    protected BillingAccountSearchBasic billingAccountJoin;
    protected BillingScheduleSearchBasic billingScheduleJoin;
    protected ContactSearchBasic contactPrimaryJoin;
    protected CustomerSearchBasic customerJoin;
    protected ProjectTaskSearchBasic projectTaskJoin;
    protected ResourceAllocationSearchBasic resourceAllocationJoin;
    protected TaskSearchBasic taskJoin;
    protected TimeBillSearchBasic timeJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setBasic(JobSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the billingAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public BillingAccountSearchBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }

    /**
     * Sets the value of the billingAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public void setBillingAccountJoin(BillingAccountSearchBasic value) {
        this.billingAccountJoin = value;
    }

    /**
     * Gets the value of the billingScheduleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleSearchBasic }
     *     
     */
    public BillingScheduleSearchBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }

    /**
     * Sets the value of the billingScheduleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleSearchBasic }
     *     
     */
    public void setBillingScheduleJoin(BillingScheduleSearchBasic value) {
        this.billingScheduleJoin = value;
    }

    /**
     * Gets the value of the contactPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchBasic }
     *     
     */
    public ContactSearchBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * Sets the value of the contactPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchBasic value) {
        this.contactPrimaryJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the projectTaskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchBasic }
     *     
     */
    public ProjectTaskSearchBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }

    /**
     * Sets the value of the projectTaskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchBasic }
     *     
     */
    public void setProjectTaskJoin(ProjectTaskSearchBasic value) {
        this.projectTaskJoin = value;
    }

    /**
     * Gets the value of the resourceAllocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAllocationSearchBasic }
     *     
     */
    public ResourceAllocationSearchBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }

    /**
     * Sets the value of the resourceAllocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAllocationSearchBasic }
     *     
     */
    public void setResourceAllocationJoin(ResourceAllocationSearchBasic value) {
        this.resourceAllocationJoin = value;
    }

    /**
     * Gets the value of the taskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchBasic }
     *     
     */
    public TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * Sets the value of the taskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchBasic }
     *     
     */
    public void setTaskJoin(TaskSearchBasic value) {
        this.taskJoin = value;
    }

    /**
     * Gets the value of the timeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public TimeBillSearchBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * Sets the value of the timeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchBasic value) {
        this.timeJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
