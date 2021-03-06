
package com.netsuite.webservices.platform.messages_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_1.GetBudgetExchangeRateResult;


/**
 * <p>Java class for GetBudgetExchangeRateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBudgetExchangeRateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_1.platform.webservices.netsuite.com}getBudgetExchangeRateResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBudgetExchangeRateResponse", propOrder = {
    "getBudgetExchangeRateResult"
})
public class GetBudgetExchangeRateResponse {

    @XmlElement(namespace = "urn:core_2018_1.platform.webservices.netsuite.com", required = true)
    protected GetBudgetExchangeRateResult getBudgetExchangeRateResult;

    /**
     * Gets the value of the getBudgetExchangeRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetBudgetExchangeRateResult }
     *     
     */
    public GetBudgetExchangeRateResult getGetBudgetExchangeRateResult() {
        return getBudgetExchangeRateResult;
    }

    /**
     * Sets the value of the getBudgetExchangeRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBudgetExchangeRateResult }
     *     
     */
    public void setGetBudgetExchangeRateResult(GetBudgetExchangeRateResult value) {
        this.getBudgetExchangeRateResult = value;
    }

}
