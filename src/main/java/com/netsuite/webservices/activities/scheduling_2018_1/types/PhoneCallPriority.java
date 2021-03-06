
package com.netsuite.webservices.activities.scheduling_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneCallPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneCallPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_high"/>
 *     &lt;enumeration value="_low"/>
 *     &lt;enumeration value="_medium"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhoneCallPriority", namespace = "urn:types.scheduling_2018_1.activities.webservices.netsuite.com")
@XmlEnum
public enum PhoneCallPriority {

    @XmlEnumValue("_high")
    HIGH("_high"),
    @XmlEnumValue("_low")
    LOW("_low"),
    @XmlEnumValue("_medium")
    MEDIUM("_medium");
    private final String value;

    PhoneCallPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneCallPriority fromValue(String v) {
        for (PhoneCallPriority c: PhoneCallPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
