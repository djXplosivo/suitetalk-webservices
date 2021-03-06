
package com.netsuite.webservices.lists.employees_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeBaseWageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeBaseWageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_annualSalary"/>
 *     &lt;enumeration value="_hourly"/>
 *     &lt;enumeration value="_monthlySalary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeBaseWageType", namespace = "urn:types.employees_2018_1.lists.webservices.netsuite.com")
@XmlEnum
public enum EmployeeBaseWageType {

    @XmlEnumValue("_annualSalary")
    ANNUAL_SALARY("_annualSalary"),
    @XmlEnumValue("_hourly")
    HOURLY("_hourly"),
    @XmlEnumValue("_monthlySalary")
    MONTHLY_SALARY("_monthlySalary");
    private final String value;

    EmployeeBaseWageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeBaseWageType fromValue(String v) {
        for (EmployeeBaseWageType c: EmployeeBaseWageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
