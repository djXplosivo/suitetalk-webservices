
package com.netsuite.webservices.lists.support_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportCaseStatusStage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportCaseStatusStage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_closed"/>
 *     &lt;enumeration value="_escalated"/>
 *     &lt;enumeration value="_open"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupportCaseStatusStage", namespace = "urn:types.support_2018_1.lists.webservices.netsuite.com")
@XmlEnum
public enum SupportCaseStatusStage {

    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_escalated")
    ESCALATED("_escalated"),
    @XmlEnumValue("_open")
    OPEN("_open");
    private final String value;

    SupportCaseStatusStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupportCaseStatusStage fromValue(String v) {
        for (SupportCaseStatusStage c: SupportCaseStatusStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
