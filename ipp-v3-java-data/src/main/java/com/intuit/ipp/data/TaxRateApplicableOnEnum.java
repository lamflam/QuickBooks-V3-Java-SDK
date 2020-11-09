//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.09 at 07:43:52 AM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRateApplicableOnEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxRateApplicableOnEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sales"/&gt;
 *     &lt;enumeration value="Purchase"/&gt;
 *     &lt;enumeration value="Adjustment"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxRateApplicableOnEnum")
@XmlEnum
public enum TaxRateApplicableOnEnum {

    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TaxRateApplicableOnEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxRateApplicableOnEnum fromValue(String v) {
        for (TaxRateApplicableOnEnum c: TaxRateApplicableOnEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
