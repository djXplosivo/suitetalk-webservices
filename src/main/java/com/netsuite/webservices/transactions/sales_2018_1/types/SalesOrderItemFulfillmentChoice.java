
package com.netsuite.webservices.transactions.sales_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderItemFulfillmentChoice.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalesOrderItemFulfillmentChoice">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_ship"/>
 *     &lt;enumeration value="_storePickup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalesOrderItemFulfillmentChoice", namespace = "urn:types.sales_2018_1.transactions.webservices.netsuite.com")
@XmlEnum
public enum SalesOrderItemFulfillmentChoice {

    @XmlEnumValue("_ship")
    SHIP("_ship"),
    @XmlEnumValue("_storePickup")
    STORE_PICKUP("_storePickup");
    private final String value;

    SalesOrderItemFulfillmentChoice(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalesOrderItemFulfillmentChoice fromValue(String v) {
        for (SalesOrderItemFulfillmentChoice c: SalesOrderItemFulfillmentChoice.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
