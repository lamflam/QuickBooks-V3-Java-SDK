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
 * <p>Java class for ItemTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Assembly"/&gt;
 *     &lt;enumeration value="Category"/&gt;
 *     &lt;enumeration value="Fixed Asset"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="Inventory"/&gt;
 *     &lt;enumeration value="NonInventory"/&gt;
 *     &lt;enumeration value="Other Charge"/&gt;
 *     &lt;enumeration value="Payment"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *     &lt;enumeration value="Subtotal"/&gt;
 *     &lt;enumeration value="Discount"/&gt;
 *     &lt;enumeration value="Tax"/&gt;
 *     &lt;enumeration value="Tax Group"/&gt;
 *     &lt;enumeration value="Bundle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemTypeEnum")
@XmlEnum
public enum ItemTypeEnum {

    @XmlEnumValue("Assembly")
    ASSEMBLY("Assembly"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("Fixed Asset")
    FIXED_ASSET("Fixed Asset"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Inventory")
    INVENTORY("Inventory"),
    @XmlEnumValue("NonInventory")
    NON_INVENTORY("NonInventory"),
    @XmlEnumValue("Other Charge")
    OTHER_CHARGE("Other Charge"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Subtotal")
    SUBTOTAL("Subtotal"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("Tax Group")
    TAX_GROUP("Tax Group"),
    @XmlEnumValue("Bundle")
    BUNDLE("Bundle");
    private final String value;

    ItemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemTypeEnum fromValue(String v) {
        for (ItemTypeEnum c: ItemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
