
package com.thalesgroup.rtti._2014_02_20.ldbsv.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForecastType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Forecast"/&gt;
 *     &lt;enumeration value="Actual"/&gt;
 *     &lt;enumeration value="NoLog"/&gt;
 *     &lt;enumeration value="Delayed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastType")
@XmlEnum
public enum ForecastType {

    @XmlEnumValue("Forecast")
    FORECAST("Forecast"),
    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("NoLog")
    NO_LOG("NoLog"),
    @XmlEnumValue("Delayed")
    DELAYED("Delayed");
    private final String value;

    ForecastType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForecastType fromValue(String v) {
        for (ForecastType c: ForecastType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
