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
 * <p>Java class for AccountTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bank"/&gt;
 *     &lt;enumeration value="Accounts Receivable"/&gt;
 *     &lt;enumeration value="Other Current Asset"/&gt;
 *     &lt;enumeration value="Fixed Asset"/&gt;
 *     &lt;enumeration value="Other Asset"/&gt;
 *     &lt;enumeration value="Accounts Payable"/&gt;
 *     &lt;enumeration value="Credit Card"/&gt;
 *     &lt;enumeration value="Other Current Liability"/&gt;
 *     &lt;enumeration value="Long Term Liability"/&gt;
 *     &lt;enumeration value="Equity"/&gt;
 *     &lt;enumeration value="Income"/&gt;
 *     &lt;enumeration value="Cost of Goods Sold"/&gt;
 *     &lt;enumeration value="Expense"/&gt;
 *     &lt;enumeration value="Other Income"/&gt;
 *     &lt;enumeration value="Other Expense"/&gt;
 *     &lt;enumeration value="Non-Posting"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountTypeEnum")
@XmlEnum
public enum AccountTypeEnum {

    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("Accounts Receivable")
    ACCOUNTS_RECEIVABLE("Accounts Receivable"),
    @XmlEnumValue("Other Current Asset")
    OTHER_CURRENT_ASSET("Other Current Asset"),
    @XmlEnumValue("Fixed Asset")
    FIXED_ASSET("Fixed Asset"),
    @XmlEnumValue("Other Asset")
    OTHER_ASSET("Other Asset"),
    @XmlEnumValue("Accounts Payable")
    ACCOUNTS_PAYABLE("Accounts Payable"),
    @XmlEnumValue("Credit Card")
    CREDIT_CARD("Credit Card"),
    @XmlEnumValue("Other Current Liability")
    OTHER_CURRENT_LIABILITY("Other Current Liability"),
    @XmlEnumValue("Long Term Liability")
    LONG_TERM_LIABILITY("Long Term Liability"),
    @XmlEnumValue("Equity")
    EQUITY("Equity"),
    @XmlEnumValue("Income")
    INCOME("Income"),
    @XmlEnumValue("Cost of Goods Sold")
    COST_OF_GOODS_SOLD("Cost of Goods Sold"),
    @XmlEnumValue("Expense")
    EXPENSE("Expense"),
    @XmlEnumValue("Other Income")
    OTHER_INCOME("Other Income"),
    @XmlEnumValue("Other Expense")
    OTHER_EXPENSE("Other Expense"),
    @XmlEnumValue("Non-Posting")
    NON_POSTING("Non-Posting");
    private final String value;

    AccountTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountTypeEnum fromValue(String v) {
        for (AccountTypeEnum c: AccountTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
