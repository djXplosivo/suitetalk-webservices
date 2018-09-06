
package com.netsuite.webservices.lists.accounting_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationGeolocationMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationGeolocationMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_deriveFromPostalCode"/>
 *     &lt;enumeration value="_useLatLongCoordinates"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationGeolocationMethod", namespace = "urn:types.accounting_2018_1.lists.webservices.netsuite.com")
@XmlEnum
public enum LocationGeolocationMethod {

    @XmlEnumValue("_deriveFromPostalCode")
    DERIVE_FROM_POSTAL_CODE("_deriveFromPostalCode"),
    @XmlEnumValue("_useLatLongCoordinates")
    USE_LAT_LONG_COORDINATES("_useLatLongCoordinates");
    private final String value;

    LocationGeolocationMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationGeolocationMethod fromValue(String v) {
        for (LocationGeolocationMethod c: LocationGeolocationMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
