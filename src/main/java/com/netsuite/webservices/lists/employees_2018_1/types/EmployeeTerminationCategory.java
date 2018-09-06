
package com.netsuite.webservices.lists.employees_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeTerminationCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeTerminationCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_involuntary"/>
 *     &lt;enumeration value="_voluntary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeTerminationCategory", namespace = "urn:types.employees_2018_1.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeTerminationCategory {

    @XmlEnumValue("_involuntary")
    INVOLUNTARY("_involuntary"),
    @XmlEnumValue("_voluntary")
    VOLUNTARY("_voluntary");
    private final String value;

    EmployeeTerminationCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeTerminationCategory fromValue(String v) {
        for (EmployeeTerminationCategory c: EmployeeTerminationCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
