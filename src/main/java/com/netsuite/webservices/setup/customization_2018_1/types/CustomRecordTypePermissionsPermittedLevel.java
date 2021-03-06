
package com.netsuite.webservices.setup.customization_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRecordTypePermissionsPermittedLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomRecordTypePermissionsPermittedLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_create"/>
 *     &lt;enumeration value="_edit"/>
 *     &lt;enumeration value="_full"/>
 *     &lt;enumeration value="_none"/>
 *     &lt;enumeration value="_view"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomRecordTypePermissionsPermittedLevel", namespace = "urn:types.customization_2018_1.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomRecordTypePermissionsPermittedLevel {

    @XmlEnumValue("_create")
    CREATE("_create"),
    @XmlEnumValue("_edit")
    EDIT("_edit"),
    @XmlEnumValue("_full")
    FULL("_full"),
    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_view")
    VIEW("_view");
    private final String value;

    CustomRecordTypePermissionsPermittedLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomRecordTypePermissionsPermittedLevel fromValue(String v) {
        for (CustomRecordTypePermissionsPermittedLevel c: CustomRecordTypePermissionsPermittedLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
