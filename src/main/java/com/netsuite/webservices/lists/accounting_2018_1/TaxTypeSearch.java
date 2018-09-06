
package com.netsuite.webservices.lists.accounting_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_1.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TaxTypeSearchBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchRecord;


/**
 * <p>Java class for TaxTypeSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxTypeSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_1.platform.webservices.netsuite.com}TaxTypeSearchBasic" minOccurs="0"/>
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
@XmlType(name = "TaxTypeSearch", propOrder = {
    "basic",
    "userJoin"
})
public class TaxTypeSearch
    extends SearchRecord
{

    protected TaxTypeSearchBasic basic;
    protected EmployeeSearchBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeSearchBasic }
     *     
     */
    public TaxTypeSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeSearchBasic }
     *     
     */
    public void setBasic(TaxTypeSearchBasic value) {
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
