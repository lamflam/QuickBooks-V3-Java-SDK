//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.09 at 07:43:52 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * QueryResponse entity describing the response of query
 * 
 * <p>Java class for QueryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Warnings" type="{http://schema.intuit.com/finance/v3}Warnings" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://schema.intuit.com/finance/v3}IntuitObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="Fault" type="{http://schema.intuit.com/finance/v3}Fault" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="startPosition" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResponse", propOrder = {
    "warnings",
    "intuitObject",
    "fault"
})
public class QueryResponse implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Warnings")
    protected Warnings warnings;
    @XmlElementRef(name = "IntuitObject", namespace = "http://schema.intuit.com/finance/v3", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends IntuitEntity>> intuitObject;
    @XmlElement(name = "Fault")
    protected Fault fault;
    @XmlAttribute(name = "startPosition")
    protected Integer startPosition;
    @XmlAttribute(name = "maxResults")
    protected Integer maxResults;
    @XmlAttribute(name = "totalCount")
    protected Integer totalCount;

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link Warnings }
     *     
     */
    public Warnings getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warnings }
     *     
     */
    public void setWarnings(Warnings value) {
        this.warnings = value;
    }

    /**
     * Any IntuitEntity derived object like Customer, Invoice can be part of response Gets the value of the intuitObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intuitObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntuitObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     * {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     * {@link JAXBElement }{@code <}{@link Bill }{@code >}
     * {@link JAXBElement }{@code <}{@link Budget }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     * {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     * {@link JAXBElement }{@code <}{@link Status }{@code >}
     * {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxRate }{@code >}
     * {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link Item }{@code >}
     * {@link JAXBElement }{@code <}{@link EmailDeliveryInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link Tag }{@code >}
     * {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     * {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     * {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     * {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargeCredit }{@code >}
     * {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     * {@link JAXBElement }{@code <}{@link QbdtEntityIdMapping }{@code >}
     * {@link JAXBElement }{@code <}{@link SyncActivity }{@code >}
     * {@link JAXBElement }{@code <}{@link Employee }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     * {@link JAXBElement }{@code <}{@link Department }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxReturn }{@code >}
     * {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanyCurrency }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxClassification }{@code >}
     * {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     * {@link JAXBElement }{@code <}{@link Preferences }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanyInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link Account }{@code >}
     * {@link JAXBElement }{@code <}{@link ReimburseCharge }{@code >}
     * {@link JAXBElement }{@code <}{@link RefundReceipt }{@code >}
     * {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TDSMetadata }{@code >}
     * {@link JAXBElement }{@code <}{@link MasterAccount }{@code >}
     * {@link JAXBElement }{@code <}{@link Company }{@code >}
     * {@link JAXBElement }{@code <}{@link Payment }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     * {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     * {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxAgency }{@code >}
     * {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link StatementCharge }{@code >}
     * {@link JAXBElement }{@code <}{@link RecurringTransaction }{@code >}
     * {@link JAXBElement }{@code <}{@link Customer }{@code >}
     * {@link JAXBElement }{@code <}{@link Term }{@code >}
     * {@link JAXBElement }{@code <}{@link Class }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditCardPaymentTxn }{@code >}
     * {@link JAXBElement }{@code <}{@link UserAlert }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxPayment }{@code >}
     * {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link Task }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxService }{@code >}
     * {@link JAXBElement }{@code <}{@link Attachable }{@code >}
     * {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link JournalCode }{@code >}
     * {@link JAXBElement }{@code <}{@link IntuitEntity }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends IntuitEntity>> getIntuitObject() {
        if (intuitObject == null) {
            intuitObject = new ArrayList<JAXBElement<? extends IntuitEntity>>();
        }
        return this.intuitObject;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPosition(Integer value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    /**
     * Any IntuitEntity derived object like Customer, Invoice can be part of response
     * 
     * @param intuitObject
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bill }{@code >}
     *     {@link JAXBElement }{@code <}{@link Budget }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Estimate }{@code >}
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     {@link JAXBElement }{@code <}{@link BillPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxRate }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link Item }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmailDeliveryInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Tag }{@code >}
     *     {@link JAXBElement }{@code <}{@link Invoice }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalEntry }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     {@link JAXBElement }{@code <}{@link Purchase }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargeCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link InventorySite }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditMemo }{@code >}
     *     {@link JAXBElement }{@code <}{@link QbdtEntityIdMapping }{@code >}
     *     {@link JAXBElement }{@code <}{@link SyncActivity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Employee }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherName }{@code >}
     *     {@link JAXBElement }{@code <}{@link Department }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxReturn }{@code >}
     *     {@link JAXBElement }{@code <}{@link DateTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyCurrency }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxClassification }{@code >}
     *     {@link JAXBElement }{@code <}{@link VendorCredit }{@code >}
     *     {@link JAXBElement }{@code <}{@link Preferences }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanyInfo }{@code >}
     *     {@link JAXBElement }{@code <}{@link Account }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReimburseCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundReceipt }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumberTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link TDSMetadata }{@code >}
     *     {@link JAXBElement }{@code <}{@link MasterAccount }{@code >}
     *     {@link JAXBElement }{@code <}{@link Company }{@code >}
     *     {@link JAXBElement }{@code <}{@link Payment }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOrder }{@code >}
     *     {@link JAXBElement }{@code <}{@link Vendor }{@code >}
     *     {@link JAXBElement }{@code <}{@link FixedAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxAgency }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanTypeCustomFieldDefinition }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatementCharge }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecurringTransaction }{@code >}
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     {@link JAXBElement }{@code <}{@link Term }{@code >}
     *     {@link JAXBElement }{@code <}{@link Class }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditCardPaymentTxn }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserAlert }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxPayment }{@code >}
     *     {@link JAXBElement }{@code <}{@link PaymentMethod }{@code >}
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     {@link JAXBElement }{@code <}{@link TaxService }{@code >}
     *     {@link JAXBElement }{@code <}{@link Attachable }{@code >}
     *     {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesRep }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceLevel }{@code >}
     *     {@link JAXBElement }{@code <}{@link JournalCode }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntuitEntity }{@code >}
     *     
     */
    public void setIntuitObject(List<JAXBElement<? extends IntuitEntity>> intuitObject) {
        this.intuitObject = intuitObject;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final QueryResponse that = ((QueryResponse) object);
        {
            Warnings lhsWarnings;
            lhsWarnings = this.getWarnings();
            Warnings rhsWarnings;
            rhsWarnings = that.getWarnings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warnings", lhsWarnings), LocatorUtils.property(thatLocator, "warnings", rhsWarnings), lhsWarnings, rhsWarnings, (this.warnings!= null), (that.warnings!= null))) {
                return false;
            }
        }
        {
            List<JAXBElement<? extends IntuitEntity>> lhsIntuitObject;
            lhsIntuitObject = (((this.intuitObject!= null)&&(!this.intuitObject.isEmpty()))?this.getIntuitObject():null);
            List<JAXBElement<? extends IntuitEntity>> rhsIntuitObject;
            rhsIntuitObject = (((that.intuitObject!= null)&&(!that.intuitObject.isEmpty()))?that.getIntuitObject():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intuitObject", lhsIntuitObject), LocatorUtils.property(thatLocator, "intuitObject", rhsIntuitObject), lhsIntuitObject, rhsIntuitObject, ((this.intuitObject!= null)&&(!this.intuitObject.isEmpty())), ((that.intuitObject!= null)&&(!that.intuitObject.isEmpty())))) {
                return false;
            }
        }
        {
            Fault lhsFault;
            lhsFault = this.getFault();
            Fault rhsFault;
            rhsFault = that.getFault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fault", lhsFault), LocatorUtils.property(thatLocator, "fault", rhsFault), lhsFault, rhsFault, (this.fault!= null), (that.fault!= null))) {
                return false;
            }
        }
        {
            Integer lhsStartPosition;
            lhsStartPosition = this.getStartPosition();
            Integer rhsStartPosition;
            rhsStartPosition = that.getStartPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startPosition", lhsStartPosition), LocatorUtils.property(thatLocator, "startPosition", rhsStartPosition), lhsStartPosition, rhsStartPosition, (this.startPosition!= null), (that.startPosition!= null))) {
                return false;
            }
        }
        {
            Integer lhsMaxResults;
            lhsMaxResults = this.getMaxResults();
            Integer rhsMaxResults;
            rhsMaxResults = that.getMaxResults();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxResults", lhsMaxResults), LocatorUtils.property(thatLocator, "maxResults", rhsMaxResults), lhsMaxResults, rhsMaxResults, (this.maxResults!= null), (that.maxResults!= null))) {
                return false;
            }
        }
        {
            Integer lhsTotalCount;
            lhsTotalCount = this.getTotalCount();
            Integer rhsTotalCount;
            rhsTotalCount = that.getTotalCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalCount", lhsTotalCount), LocatorUtils.property(thatLocator, "totalCount", rhsTotalCount), lhsTotalCount, rhsTotalCount, (this.totalCount!= null), (that.totalCount!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            Warnings theWarnings;
            theWarnings = this.getWarnings();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warnings", theWarnings), currentHashCode, theWarnings, (this.warnings!= null));
        }
        {
            List<JAXBElement<? extends IntuitEntity>> theIntuitObject;
            theIntuitObject = (((this.intuitObject!= null)&&(!this.intuitObject.isEmpty()))?this.getIntuitObject():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intuitObject", theIntuitObject), currentHashCode, theIntuitObject, ((this.intuitObject!= null)&&(!this.intuitObject.isEmpty())));
        }
        {
            Fault theFault;
            theFault = this.getFault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fault", theFault), currentHashCode, theFault, (this.fault!= null));
        }
        {
            Integer theStartPosition;
            theStartPosition = this.getStartPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startPosition", theStartPosition), currentHashCode, theStartPosition, (this.startPosition!= null));
        }
        {
            Integer theMaxResults;
            theMaxResults = this.getMaxResults();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxResults", theMaxResults), currentHashCode, theMaxResults, (this.maxResults!= null));
        }
        {
            Integer theTotalCount;
            theTotalCount = this.getTotalCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalCount", theTotalCount), currentHashCode, theTotalCount, (this.totalCount!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
