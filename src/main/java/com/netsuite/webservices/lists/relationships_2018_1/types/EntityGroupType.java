
package com.netsuite.webservices.lists.relationships_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityGroupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityGroupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_contact"/>
 *     &lt;enumeration value="_customer"/>
 *     &lt;enumeration value="_employee"/>
 *     &lt;enumeration value="_partner"/>
 *     &lt;enumeration value="_vendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityGroupType", namespace = "urn:types.relationships_2018_1.lists.webservices.netsuite.com")
@XmlEnum
public enum EntityGroupType {

    @XmlEnumValue("_contact")
    CONTACT("_contact"),
    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_employee")
    EMPLOYEE("_employee"),
    @XmlEnumValue("_partner")
    PARTNER("_partner"),
    @XmlEnumValue("_vendor")
    VENDOR("_vendor");
    private final String value;

    EntityGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityGroupType fromValue(String v) {
        for (EntityGroupType c: EntityGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
