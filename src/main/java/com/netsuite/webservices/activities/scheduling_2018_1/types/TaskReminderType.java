
package com.netsuite.webservices.activities.scheduling_2018_1.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskReminderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskReminderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_eMail"/>
 *     &lt;enumeration value="_popupWindow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskReminderType", namespace = "urn:types.scheduling_2018_1.activities.webservices.netsuite.com")
@XmlEnum
public enum TaskReminderType {

    @XmlEnumValue("_eMail")
    E_MAIL("_eMail"),
    @XmlEnumValue("_popupWindow")
    POPUP_WINDOW("_popupWindow");
    private final String value;

    TaskReminderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskReminderType fromValue(String v) {
        for (TaskReminderType c: TaskReminderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
