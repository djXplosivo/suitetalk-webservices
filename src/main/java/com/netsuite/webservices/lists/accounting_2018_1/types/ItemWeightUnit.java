
package com.netsuite.webservices.lists.accounting_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemWeightUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemWeightUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_g"/>
 *     &lt;enumeration value="_kg"/>
 *     &lt;enumeration value="_lb"/>
 *     &lt;enumeration value="_oz"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemWeightUnit", namespace = "urn:types.accounting_2018_1.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemWeightUnit {

    @XmlEnumValue("_g")
    G("_g"),
    @XmlEnumValue("_kg")
    KG("_kg"),
    @XmlEnumValue("_lb")
    LB("_lb"),
    @XmlEnumValue("_oz")
    OZ("_oz");
    private final String value;

    ItemWeightUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemWeightUnit fromValue(String v) {
        for (ItemWeightUnit c: ItemWeightUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
