
package com.netsuite.webservices.transactions.employees_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_1.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.PaycheckSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.PayrollItemSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchRow;


/**
 * <p>Java class for PaycheckSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaycheckSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_1.platform.webservices.netsuite.com}PaycheckSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="payrollItemJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}PayrollItemSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckSearchRow", propOrder = {
    "basic",
    "employeeJoin",
    "payrollItemJoin"
})
public class PaycheckSearchRow
    extends SearchRow
{

    protected PaycheckSearchRowBasic basic;
    protected EmployeeSearchRowBasic employeeJoin;
    protected PayrollItemSearchRowBasic payrollItemJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link PaycheckSearchRowBasic }
     *     
     */
    public PaycheckSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckSearchRowBasic }
     *     
     */
    public void setBasic(PaycheckSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchRowBasic value) {
        this.employeeJoin = value;
    }

    /**
     * Gets the value of the payrollItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemSearchRowBasic }
     *     
     */
    public PayrollItemSearchRowBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }

    /**
     * Sets the value of the payrollItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemSearchRowBasic }
     *     
     */
    public void setPayrollItemJoin(PayrollItemSearchRowBasic value) {
        this.payrollItemJoin = value;
    }

}
