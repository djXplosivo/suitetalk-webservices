
package com.netsuite.webservices.activities.scheduling_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_completed"/>
 *     &lt;enumeration value="_inProgress"/>
 *     &lt;enumeration value="_notStarted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskStatus", namespace = "urn:types.scheduling_2018_1.activities.webservices.netsuite.com")
@XmlEnum
public enum TaskStatus {

    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_notStarted")
    NOT_STARTED("_notStarted");
    private final String value;

    TaskStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskStatus fromValue(String v) {
        for (TaskStatus c: TaskStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
