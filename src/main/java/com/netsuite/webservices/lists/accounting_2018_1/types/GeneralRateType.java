
package com.netsuite.webservices.lists.accounting_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralRateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralRateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_average"/>
 *     &lt;enumeration value="_current"/>
 *     &lt;enumeration value="_historical"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeneralRateType", namespace = "urn:types.accounting_2018_1.lists.webservices.netsuite.com")
@XmlEnum
public enum GeneralRateType {

    @XmlEnumValue("_average")
    AVERAGE("_average"),
    @XmlEnumValue("_current")
    CURRENT("_current"),
    @XmlEnumValue("_historical")
    HISTORICAL("_historical");
    private final String value;

    GeneralRateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralRateType fromValue(String v) {
        for (GeneralRateType c: GeneralRateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
