
package com.netsuite.webservices.lists.supplychain_2018_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_1.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.ManufacturingOperationTaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchRow;


/**
 * <p>Java class for ManufacturingOperationTaskSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingOperationTaskSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_1.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="predecessorJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="workOrderJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customSearchJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingOperationTaskSearchRow", propOrder = {
    "basic",
    "predecessorJoin",
    "userJoin",
    "workOrderJoin",
    "customSearchJoin"
})
public class ManufacturingOperationTaskSearchRow
    extends SearchRow
{

    protected ManufacturingOperationTaskSearchRowBasic basic;
    protected ManufacturingOperationTaskSearchRowBasic predecessorJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected TransactionSearchRowBasic workOrderJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchRowBasic }
     *     
     */
    public ManufacturingOperationTaskSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchRowBasic }
     *     
     */
    public void setBasic(ManufacturingOperationTaskSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the predecessorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchRowBasic }
     *     
     */
    public ManufacturingOperationTaskSearchRowBasic getPredecessorJoin() {
        return predecessorJoin;
    }

    /**
     * Sets the value of the predecessorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchRowBasic }
     *     
     */
    public void setPredecessorJoin(ManufacturingOperationTaskSearchRowBasic value) {
        this.predecessorJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the workOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getWorkOrderJoin() {
        return workOrderJoin;
    }

    /**
     * Sets the value of the workOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setWorkOrderJoin(TransactionSearchRowBasic value) {
        this.workOrderJoin = value;
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
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
