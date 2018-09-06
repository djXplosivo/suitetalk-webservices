
package com.netsuite.webservices.platform.core_2018_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetExchangeRateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetExchangeRateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetExchangeRate" type="{urn:core_2018_1.platform.webservices.netsuite.com}BudgetExchangeRate" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetExchangeRateList", propOrder = {
    "budgetExchangeRate"
})
public class BudgetExchangeRateList {

    @XmlElement(required = true)
    protected List<BudgetExchangeRate> budgetExchangeRate;

    /**
     * Gets the value of the budgetExchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetExchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BudgetExchangeRate }
     * 
     * 
     */
    public List<BudgetExchangeRate> getBudgetExchangeRate() {
        if (budgetExchangeRate == null) {
            budgetExchangeRate = new ArrayList<BudgetExchangeRate>();
        }
        return this.budgetExchangeRate;
    }

}
