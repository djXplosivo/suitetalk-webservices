
package com.netsuite.webservices.activities.scheduling_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneCallStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneCallStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_completed"/>
 *     &lt;enumeration value="_scheduled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhoneCallStatus", namespace = "urn:types.scheduling_2018_1.activities.webservices.netsuite.com")
@XmlEnum
public enum PhoneCallStatus {

    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_scheduled")
    SCHEDULED("_scheduled");
    private final String value;

    PhoneCallStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneCallStatus fromValue(String v) {
        for (PhoneCallStatus c: PhoneCallStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
