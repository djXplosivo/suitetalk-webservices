
package com.netsuite.webservices.lists.accounting_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_1.ContactRoleSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.EmployeeSearchBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchRecord;


/**
 * <p>Java class for ContactRoleSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRoleSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_1.platform.webservices.netsuite.com}ContactRoleSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRoleSearch", propOrder = {
    "basic",
    "userJoin"
})
public class ContactRoleSearch
    extends SearchRecord
{

    protected ContactRoleSearchBasic basic;
    protected EmployeeSearchBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRoleSearchBasic }
     *     
     */
    public ContactRoleSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRoleSearchBasic }
     *     
     */
    public void setBasic(ContactRoleSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

}
