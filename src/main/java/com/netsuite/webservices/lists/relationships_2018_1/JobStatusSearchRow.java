
package com.netsuite.webservices.lists.relationships_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_1.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.JobStatusSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchRow;


/**
 * <p>Java class for JobStatusSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobStatusSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_1.platform.webservices.netsuite.com}JobStatusSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobStatusSearchRow", propOrder = {
    "basic",
    "userJoin"
})
public class JobStatusSearchRow
    extends SearchRow
{

    protected JobStatusSearchRowBasic basic;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatusSearchRowBasic }
     *     
     */
    public JobStatusSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatusSearchRowBasic }
     *     
     */
    public void setBasic(JobStatusSearchRowBasic value) {
        this.basic = value;
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

}
