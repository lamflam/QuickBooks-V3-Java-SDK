//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.09 at 07:43:52 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Transaction is the base
 * 				class of all transactions.
 * 			
 * 
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PrivateNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxnStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkedTxn" type="{http://schema.intuit.com/finance/v3}LinkedTxn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Line" type="{http://schema.intuit.com/finance/v3}Line" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TxnTaxDetail" type="{http://schema.intuit.com/finance/v3}TxnTaxDetail" minOccurs="0"/&gt;
 *         &lt;element name="TxnSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxFormType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxFormNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionLocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tag" type="{http://schema.intuit.com/finance/v3}Tag" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TxnApprovalInfo" type="{http://schema.intuit.com/finance/v3}TxnApprovalInfo" minOccurs="0"/&gt;
 *         &lt;element name="RecurDataRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="RecurringInfo" type="{http://schema.intuit.com/finance/v3}RecurringInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {
    "docNumber",
    "txnDate",
    "departmentRef",
    "currencyRef",
    "exchangeRate",
    "privateNote",
    "txnStatus",
    "linkedTxn",
    "line",
    "txnTaxDetail",
    "txnSource",
    "taxFormType",
    "taxFormNum",
    "transactionLocationType",
    "tag",
    "txnApprovalInfo",
    "recurDataRef",
    "recurringInfo"
})
@XmlSeeAlso({
    Purchase.class,
    BillPayment.class,
    Payment.class,
    StatementCharge.class,
    ChargeCredit.class,
    CreditCardPaymentTxn.class,
    ReimburseCharge.class,
    JournalEntry.class,
    Transfer.class,
    Deposit.class,
    SalesTransaction.class,
    PurchaseByVendor.class
})
public class Transaction
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DocNumber")
    protected String docNumber;
    @XmlElement(name = "TxnDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date txnDate;
    @XmlElement(name = "DepartmentRef")
    protected ReferenceType departmentRef;
    @XmlElement(name = "CurrencyRef")
    protected ReferenceType currencyRef;
    @XmlElement(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "PrivateNote")
    protected String privateNote;
    @XmlElement(name = "TxnStatus")
    protected String txnStatus;
    @XmlElement(name = "LinkedTxn")
    protected List<LinkedTxn> linkedTxn;
    @XmlElement(name = "Line")
    protected List<Line> line;
    @XmlElement(name = "TxnTaxDetail")
    protected TxnTaxDetail txnTaxDetail;
    @XmlElement(name = "TxnSource")
    protected String txnSource;
    @XmlElement(name = "TaxFormType")
    protected String taxFormType;
    @XmlElement(name = "TaxFormNum")
    protected String taxFormNum;
    @XmlElement(name = "TransactionLocationType")
    protected String transactionLocationType;
    @XmlElement(name = "Tag")
    protected List<Tag> tag;
    @XmlElement(name = "TxnApprovalInfo")
    protected TxnApprovalInfo txnApprovalInfo;
    @XmlElement(name = "RecurDataRef")
    protected ReferenceType recurDataRef;
    @XmlElement(name = "RecurringInfo")
    protected RecurringInfo recurringInfo;

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(Date value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the departmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDepartmentRef() {
        return departmentRef;
    }

    /**
     * Sets the value of the departmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDepartmentRef(ReferenceType value) {
        this.departmentRef = value;
    }

    /**
     * Gets the value of the currencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCurrencyRef() {
        return currencyRef;
    }

    /**
     * Sets the value of the currencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCurrencyRef(ReferenceType value) {
        this.currencyRef = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the privateNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateNote() {
        return privateNote;
    }

    /**
     * Sets the value of the privateNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateNote(String value) {
        this.privateNote = value;
    }

    /**
     * Gets the value of the txnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnStatus() {
        return txnStatus;
    }

    /**
     * Sets the value of the txnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnStatus(String value) {
        this.txnStatus = value;
    }

    /**
     * Gets the value of the linkedTxn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedTxn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedTxn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedTxn }
     * 
     * 
     */
    public List<LinkedTxn> getLinkedTxn() {
        if (linkedTxn == null) {
            linkedTxn = new ArrayList<LinkedTxn>();
        }
        return this.linkedTxn;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     * 
     * 
     */
    public List<Line> getLine() {
        if (line == null) {
            line = new ArrayList<Line>();
        }
        return this.line;
    }

    /**
     * Gets the value of the txnTaxDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TxnTaxDetail }
     *     
     */
    public TxnTaxDetail getTxnTaxDetail() {
        return txnTaxDetail;
    }

    /**
     * Sets the value of the txnTaxDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnTaxDetail }
     *     
     */
    public void setTxnTaxDetail(TxnTaxDetail value) {
        this.txnTaxDetail = value;
    }

    /**
     * Gets the value of the txnSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnSource() {
        return txnSource;
    }

    /**
     * Sets the value of the txnSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnSource(String value) {
        this.txnSource = value;
    }

    /**
     * Gets the value of the taxFormType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxFormType() {
        return taxFormType;
    }

    /**
     * Sets the value of the taxFormType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxFormType(String value) {
        this.taxFormType = value;
    }

    /**
     * Gets the value of the taxFormNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxFormNum() {
        return taxFormNum;
    }

    /**
     * Sets the value of the taxFormNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxFormNum(String value) {
        this.taxFormNum = value;
    }

    /**
     * Gets the value of the transactionLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLocationType() {
        return transactionLocationType;
    }

    /**
     * Sets the value of the transactionLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLocationType(String value) {
        this.transactionLocationType = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tag }
     * 
     * 
     */
    public List<Tag> getTag() {
        if (tag == null) {
            tag = new ArrayList<Tag>();
        }
        return this.tag;
    }

    /**
     * Gets the value of the txnApprovalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TxnApprovalInfo }
     *     
     */
    public TxnApprovalInfo getTxnApprovalInfo() {
        return txnApprovalInfo;
    }

    /**
     * Sets the value of the txnApprovalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnApprovalInfo }
     *     
     */
    public void setTxnApprovalInfo(TxnApprovalInfo value) {
        this.txnApprovalInfo = value;
    }

    /**
     * Gets the value of the recurDataRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRecurDataRef() {
        return recurDataRef;
    }

    /**
     * Sets the value of the recurDataRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRecurDataRef(ReferenceType value) {
        this.recurDataRef = value;
    }

    /**
     * Gets the value of the recurringInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringInfo }
     *     
     */
    public RecurringInfo getRecurringInfo() {
        return recurringInfo;
    }

    /**
     * Sets the value of the recurringInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringInfo }
     *     
     */
    public void setRecurringInfo(RecurringInfo value) {
        this.recurringInfo = value;
    }

    /**
     * Sets the value of the linkedTxn property.
     * 
     * @param linkedTxn
     *     allowed object is
     *     {@link LinkedTxn }
     *     
     */
    public void setLinkedTxn(List<LinkedTxn> linkedTxn) {
        this.linkedTxn = linkedTxn;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param line
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(List<Line> line) {
        this.line = line;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param tag
     *     allowed object is
     *     {@link Tag }
     *     
     */
    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Transaction that = ((Transaction) object);
        {
            String lhsDocNumber;
            lhsDocNumber = this.getDocNumber();
            String rhsDocNumber;
            rhsDocNumber = that.getDocNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "docNumber", lhsDocNumber), LocatorUtils.property(thatLocator, "docNumber", rhsDocNumber), lhsDocNumber, rhsDocNumber, (this.docNumber!= null), (that.docNumber!= null))) {
                return false;
            }
        }
        {
            Date lhsTxnDate;
            lhsTxnDate = this.getTxnDate();
            Date rhsTxnDate;
            rhsTxnDate = that.getTxnDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnDate", lhsTxnDate), LocatorUtils.property(thatLocator, "txnDate", rhsTxnDate), lhsTxnDate, rhsTxnDate, (this.txnDate!= null), (that.txnDate!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsDepartmentRef;
            lhsDepartmentRef = this.getDepartmentRef();
            ReferenceType rhsDepartmentRef;
            rhsDepartmentRef = that.getDepartmentRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departmentRef", lhsDepartmentRef), LocatorUtils.property(thatLocator, "departmentRef", rhsDepartmentRef), lhsDepartmentRef, rhsDepartmentRef, (this.departmentRef!= null), (that.departmentRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsCurrencyRef;
            lhsCurrencyRef = this.getCurrencyRef();
            ReferenceType rhsCurrencyRef;
            rhsCurrencyRef = that.getCurrencyRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currencyRef", lhsCurrencyRef), LocatorUtils.property(thatLocator, "currencyRef", rhsCurrencyRef), lhsCurrencyRef, rhsCurrencyRef, (this.currencyRef!= null), (that.currencyRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsExchangeRate;
            lhsExchangeRate = this.getExchangeRate();
            BigDecimal rhsExchangeRate;
            rhsExchangeRate = that.getExchangeRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exchangeRate", lhsExchangeRate), LocatorUtils.property(thatLocator, "exchangeRate", rhsExchangeRate), lhsExchangeRate, rhsExchangeRate, (this.exchangeRate!= null), (that.exchangeRate!= null))) {
                return false;
            }
        }
        {
            String lhsPrivateNote;
            lhsPrivateNote = this.getPrivateNote();
            String rhsPrivateNote;
            rhsPrivateNote = that.getPrivateNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "privateNote", lhsPrivateNote), LocatorUtils.property(thatLocator, "privateNote", rhsPrivateNote), lhsPrivateNote, rhsPrivateNote, (this.privateNote!= null), (that.privateNote!= null))) {
                return false;
            }
        }
        {
            String lhsTxnStatus;
            lhsTxnStatus = this.getTxnStatus();
            String rhsTxnStatus;
            rhsTxnStatus = that.getTxnStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnStatus", lhsTxnStatus), LocatorUtils.property(thatLocator, "txnStatus", rhsTxnStatus), lhsTxnStatus, rhsTxnStatus, (this.txnStatus!= null), (that.txnStatus!= null))) {
                return false;
            }
        }
        {
            List<LinkedTxn> lhsLinkedTxn;
            lhsLinkedTxn = (((this.linkedTxn!= null)&&(!this.linkedTxn.isEmpty()))?this.getLinkedTxn():null);
            List<LinkedTxn> rhsLinkedTxn;
            rhsLinkedTxn = (((that.linkedTxn!= null)&&(!that.linkedTxn.isEmpty()))?that.getLinkedTxn():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "linkedTxn", lhsLinkedTxn), LocatorUtils.property(thatLocator, "linkedTxn", rhsLinkedTxn), lhsLinkedTxn, rhsLinkedTxn, ((this.linkedTxn!= null)&&(!this.linkedTxn.isEmpty())), ((that.linkedTxn!= null)&&(!that.linkedTxn.isEmpty())))) {
                return false;
            }
        }
        {
            List<Line> lhsLine;
            lhsLine = (((this.line!= null)&&(!this.line.isEmpty()))?this.getLine():null);
            List<Line> rhsLine;
            rhsLine = (((that.line!= null)&&(!that.line.isEmpty()))?that.getLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line", lhsLine), LocatorUtils.property(thatLocator, "line", rhsLine), lhsLine, rhsLine, ((this.line!= null)&&(!this.line.isEmpty())), ((that.line!= null)&&(!that.line.isEmpty())))) {
                return false;
            }
        }
        {
            TxnTaxDetail lhsTxnTaxDetail;
            lhsTxnTaxDetail = this.getTxnTaxDetail();
            TxnTaxDetail rhsTxnTaxDetail;
            rhsTxnTaxDetail = that.getTxnTaxDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnTaxDetail", lhsTxnTaxDetail), LocatorUtils.property(thatLocator, "txnTaxDetail", rhsTxnTaxDetail), lhsTxnTaxDetail, rhsTxnTaxDetail, (this.txnTaxDetail!= null), (that.txnTaxDetail!= null))) {
                return false;
            }
        }
        {
            String lhsTxnSource;
            lhsTxnSource = this.getTxnSource();
            String rhsTxnSource;
            rhsTxnSource = that.getTxnSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnSource", lhsTxnSource), LocatorUtils.property(thatLocator, "txnSource", rhsTxnSource), lhsTxnSource, rhsTxnSource, (this.txnSource!= null), (that.txnSource!= null))) {
                return false;
            }
        }
        {
            String lhsTaxFormType;
            lhsTaxFormType = this.getTaxFormType();
            String rhsTaxFormType;
            rhsTaxFormType = that.getTaxFormType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxFormType", lhsTaxFormType), LocatorUtils.property(thatLocator, "taxFormType", rhsTaxFormType), lhsTaxFormType, rhsTaxFormType, (this.taxFormType!= null), (that.taxFormType!= null))) {
                return false;
            }
        }
        {
            String lhsTaxFormNum;
            lhsTaxFormNum = this.getTaxFormNum();
            String rhsTaxFormNum;
            rhsTaxFormNum = that.getTaxFormNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxFormNum", lhsTaxFormNum), LocatorUtils.property(thatLocator, "taxFormNum", rhsTaxFormNum), lhsTaxFormNum, rhsTaxFormNum, (this.taxFormNum!= null), (that.taxFormNum!= null))) {
                return false;
            }
        }
        {
            String lhsTransactionLocationType;
            lhsTransactionLocationType = this.getTransactionLocationType();
            String rhsTransactionLocationType;
            rhsTransactionLocationType = that.getTransactionLocationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionLocationType", lhsTransactionLocationType), LocatorUtils.property(thatLocator, "transactionLocationType", rhsTransactionLocationType), lhsTransactionLocationType, rhsTransactionLocationType, (this.transactionLocationType!= null), (that.transactionLocationType!= null))) {
                return false;
            }
        }
        {
            List<Tag> lhsTag;
            lhsTag = (((this.tag!= null)&&(!this.tag.isEmpty()))?this.getTag():null);
            List<Tag> rhsTag;
            rhsTag = (((that.tag!= null)&&(!that.tag.isEmpty()))?that.getTag():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tag", lhsTag), LocatorUtils.property(thatLocator, "tag", rhsTag), lhsTag, rhsTag, ((this.tag!= null)&&(!this.tag.isEmpty())), ((that.tag!= null)&&(!that.tag.isEmpty())))) {
                return false;
            }
        }
        {
            TxnApprovalInfo lhsTxnApprovalInfo;
            lhsTxnApprovalInfo = this.getTxnApprovalInfo();
            TxnApprovalInfo rhsTxnApprovalInfo;
            rhsTxnApprovalInfo = that.getTxnApprovalInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnApprovalInfo", lhsTxnApprovalInfo), LocatorUtils.property(thatLocator, "txnApprovalInfo", rhsTxnApprovalInfo), lhsTxnApprovalInfo, rhsTxnApprovalInfo, (this.txnApprovalInfo!= null), (that.txnApprovalInfo!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsRecurDataRef;
            lhsRecurDataRef = this.getRecurDataRef();
            ReferenceType rhsRecurDataRef;
            rhsRecurDataRef = that.getRecurDataRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurDataRef", lhsRecurDataRef), LocatorUtils.property(thatLocator, "recurDataRef", rhsRecurDataRef), lhsRecurDataRef, rhsRecurDataRef, (this.recurDataRef!= null), (that.recurDataRef!= null))) {
                return false;
            }
        }
        {
            RecurringInfo lhsRecurringInfo;
            lhsRecurringInfo = this.getRecurringInfo();
            RecurringInfo rhsRecurringInfo;
            rhsRecurringInfo = that.getRecurringInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurringInfo", lhsRecurringInfo), LocatorUtils.property(thatLocator, "recurringInfo", rhsRecurringInfo), lhsRecurringInfo, rhsRecurringInfo, (this.recurringInfo!= null), (that.recurringInfo!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theDocNumber;
            theDocNumber = this.getDocNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "docNumber", theDocNumber), currentHashCode, theDocNumber, (this.docNumber!= null));
        }
        {
            Date theTxnDate;
            theTxnDate = this.getTxnDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnDate", theTxnDate), currentHashCode, theTxnDate, (this.txnDate!= null));
        }
        {
            ReferenceType theDepartmentRef;
            theDepartmentRef = this.getDepartmentRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "departmentRef", theDepartmentRef), currentHashCode, theDepartmentRef, (this.departmentRef!= null));
        }
        {
            ReferenceType theCurrencyRef;
            theCurrencyRef = this.getCurrencyRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyRef", theCurrencyRef), currentHashCode, theCurrencyRef, (this.currencyRef!= null));
        }
        {
            BigDecimal theExchangeRate;
            theExchangeRate = this.getExchangeRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exchangeRate", theExchangeRate), currentHashCode, theExchangeRate, (this.exchangeRate!= null));
        }
        {
            String thePrivateNote;
            thePrivateNote = this.getPrivateNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "privateNote", thePrivateNote), currentHashCode, thePrivateNote, (this.privateNote!= null));
        }
        {
            String theTxnStatus;
            theTxnStatus = this.getTxnStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnStatus", theTxnStatus), currentHashCode, theTxnStatus, (this.txnStatus!= null));
        }
        {
            List<LinkedTxn> theLinkedTxn;
            theLinkedTxn = (((this.linkedTxn!= null)&&(!this.linkedTxn.isEmpty()))?this.getLinkedTxn():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "linkedTxn", theLinkedTxn), currentHashCode, theLinkedTxn, ((this.linkedTxn!= null)&&(!this.linkedTxn.isEmpty())));
        }
        {
            List<Line> theLine;
            theLine = (((this.line!= null)&&(!this.line.isEmpty()))?this.getLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line", theLine), currentHashCode, theLine, ((this.line!= null)&&(!this.line.isEmpty())));
        }
        {
            TxnTaxDetail theTxnTaxDetail;
            theTxnTaxDetail = this.getTxnTaxDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnTaxDetail", theTxnTaxDetail), currentHashCode, theTxnTaxDetail, (this.txnTaxDetail!= null));
        }
        {
            String theTxnSource;
            theTxnSource = this.getTxnSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnSource", theTxnSource), currentHashCode, theTxnSource, (this.txnSource!= null));
        }
        {
            String theTaxFormType;
            theTaxFormType = this.getTaxFormType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxFormType", theTaxFormType), currentHashCode, theTaxFormType, (this.taxFormType!= null));
        }
        {
            String theTaxFormNum;
            theTaxFormNum = this.getTaxFormNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxFormNum", theTaxFormNum), currentHashCode, theTaxFormNum, (this.taxFormNum!= null));
        }
        {
            String theTransactionLocationType;
            theTransactionLocationType = this.getTransactionLocationType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionLocationType", theTransactionLocationType), currentHashCode, theTransactionLocationType, (this.transactionLocationType!= null));
        }
        {
            List<Tag> theTag;
            theTag = (((this.tag!= null)&&(!this.tag.isEmpty()))?this.getTag():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tag", theTag), currentHashCode, theTag, ((this.tag!= null)&&(!this.tag.isEmpty())));
        }
        {
            TxnApprovalInfo theTxnApprovalInfo;
            theTxnApprovalInfo = this.getTxnApprovalInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnApprovalInfo", theTxnApprovalInfo), currentHashCode, theTxnApprovalInfo, (this.txnApprovalInfo!= null));
        }
        {
            ReferenceType theRecurDataRef;
            theRecurDataRef = this.getRecurDataRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recurDataRef", theRecurDataRef), currentHashCode, theRecurDataRef, (this.recurDataRef!= null));
        }
        {
            RecurringInfo theRecurringInfo;
            theRecurringInfo = this.getRecurringInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recurringInfo", theRecurringInfo), currentHashCode, theRecurringInfo, (this.recurringInfo!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
