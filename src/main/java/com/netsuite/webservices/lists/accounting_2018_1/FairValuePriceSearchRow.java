
package com.netsuite.webservices.lists.accounting_2018_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_1.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.FairValuePriceSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.ItemSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchRow;


/**
 * <p>Java class for FairValuePriceSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FairValuePriceSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_1.platform.webservices.netsuite.com}FairValuePriceSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "FairValuePriceSearchRow", propOrder = {
    "basic",
    "itemJoin",
    "customSearchJoin"
})
public class FairValuePriceSearchRow
    extends SearchRow
{

    protected FairValuePriceSearchRowBasic basic;
    protected ItemSearchRowBasic itemJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link FairValuePriceSearchRowBasic }
     *     
     */
    public FairValuePriceSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link FairValuePriceSearchRowBasic }
     *     
     */
    public void setBasic(FairValuePriceSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
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
