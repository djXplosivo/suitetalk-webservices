
package com.netsuite.webservices.lists.accounting_2018_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_1.AssemblyItemBomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.BomRevisionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.BomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_1.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_1.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_1.SearchRow;


/**
 * <p>Java class for BomSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BomSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_1.platform.webservices.netsuite.com}BomSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="revisionJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}BomRevisionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="assemblyItemJoin" type="{urn:common_2018_1.platform.webservices.netsuite.com}AssemblyItemBomSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "BomSearchRow", propOrder = {
    "basic",
    "revisionJoin",
    "transactionJoin",
    "assemblyItemJoin",
    "customSearchJoin"
})
public class BomSearchRow
    extends SearchRow
{

    protected BomSearchRowBasic basic;
    protected BomRevisionSearchRowBasic revisionJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected AssemblyItemBomSearchRowBasic assemblyItemJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public BomSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public void setBasic(BomSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the revisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public BomRevisionSearchRowBasic getRevisionJoin() {
        return revisionJoin;
    }

    /**
     * Sets the value of the revisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public void setRevisionJoin(BomRevisionSearchRowBasic value) {
        this.revisionJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the assemblyItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyItemBomSearchRowBasic }
     *     
     */
    public AssemblyItemBomSearchRowBasic getAssemblyItemJoin() {
        return assemblyItemJoin;
    }

    /**
     * Sets the value of the assemblyItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyItemBomSearchRowBasic }
     *     
     */
    public void setAssemblyItemJoin(AssemblyItemBomSearchRowBasic value) {
        this.assemblyItemJoin = value;
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
