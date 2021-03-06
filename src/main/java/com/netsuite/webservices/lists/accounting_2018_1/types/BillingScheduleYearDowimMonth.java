
package com.netsuite.webservices.lists.accounting_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingScheduleYearDowimMonth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingScheduleYearDowimMonth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_january"/>
 *     &lt;enumeration value="_february"/>
 *     &lt;enumeration value="_march"/>
 *     &lt;enumeration value="_april"/>
 *     &lt;enumeration value="_may"/>
 *     &lt;enumeration value="_june"/>
 *     &lt;enumeration value="_july"/>
 *     &lt;enumeration value="_august"/>
 *     &lt;enumeration value="_september"/>
 *     &lt;enumeration value="_october"/>
 *     &lt;enumeration value="_november"/>
 *     &lt;enumeration value="_december"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingScheduleYearDowimMonth", namespace = "urn:types.accounting_2018_1.lists.webservices.netsuite.com")
@XmlEnum
public enum BillingScheduleYearDowimMonth {

    @XmlEnumValue("_january")
    JANUARY("_january"),
    @XmlEnumValue("_february")
    FEBRUARY("_february"),
    @XmlEnumValue("_march")
    MARCH("_march"),
    @XmlEnumValue("_april")
    APRIL("_april"),
    @XmlEnumValue("_may")
    MAY("_may"),
    @XmlEnumValue("_june")
    JUNE("_june"),
    @XmlEnumValue("_july")
    JULY("_july"),
    @XmlEnumValue("_august")
    AUGUST("_august"),
    @XmlEnumValue("_september")
    SEPTEMBER("_september"),
    @XmlEnumValue("_october")
    OCTOBER("_october"),
    @XmlEnumValue("_november")
    NOVEMBER("_november"),
    @XmlEnumValue("_december")
    DECEMBER("_december");
    private final String value;

    BillingScheduleYearDowimMonth(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingScheduleYearDowimMonth fromValue(String v) {
        for (BillingScheduleYearDowimMonth c: BillingScheduleYearDowimMonth.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
