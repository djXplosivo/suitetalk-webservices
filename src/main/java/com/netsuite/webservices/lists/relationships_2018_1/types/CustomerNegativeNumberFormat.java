
package com.netsuite.webservices.lists.relationships_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerNegativeNumberFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerNegativeNumberFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_bracketSurrounded"/>
 *     &lt;enumeration value="_minusSigned"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerNegativeNumberFormat", namespace = "urn:types.relationships_2018_1.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerNegativeNumberFormat {

    @XmlEnumValue("_bracketSurrounded")
    BRACKET_SURROUNDED("_bracketSurrounded"),
    @XmlEnumValue("_minusSigned")
    MINUS_SIGNED("_minusSigned");
    private final String value;

    CustomerNegativeNumberFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerNegativeNumberFormat fromValue(String v) {
        for (CustomerNegativeNumberFormat c: CustomerNegativeNumberFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
