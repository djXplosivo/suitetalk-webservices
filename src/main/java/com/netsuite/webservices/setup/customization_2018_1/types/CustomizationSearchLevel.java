
package com.netsuite.webservices.setup.customization_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationSearchLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizationSearchLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_none"/>
 *     &lt;enumeration value="_edit"/>
 *     &lt;enumeration value="_run"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomizationSearchLevel", namespace = "urn:types.customization_2018_1.setup.webservices.netsuite.com")
@XmlEnum
public enum CustomizationSearchLevel {

    @XmlEnumValue("_none")
    NONE("_none"),
    @XmlEnumValue("_edit")
    EDIT("_edit"),
    @XmlEnumValue("_run")
    RUN("_run");
    private final String value;

    CustomizationSearchLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizationSearchLevel fromValue(String v) {
        for (CustomizationSearchLevel c: CustomizationSearchLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
