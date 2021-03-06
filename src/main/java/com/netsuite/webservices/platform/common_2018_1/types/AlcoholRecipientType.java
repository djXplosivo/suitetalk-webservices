
package com.netsuite.webservices.platform.common_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlcoholRecipientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlcoholRecipientType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_consumer"/>
 *     &lt;enumeration value="_licensee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlcoholRecipientType", namespace = "urn:types.common_2018_1.platform.webservices.netsuite.com")
@XmlEnum
public enum AlcoholRecipientType {

    @XmlEnumValue("_consumer")
    CONSUMER("_consumer"),
    @XmlEnumValue("_licensee")
    LICENSEE("_licensee");
    private final String value;

    AlcoholRecipientType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlcoholRecipientType fromValue(String v) {
        for (AlcoholRecipientType c: AlcoholRecipientType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
