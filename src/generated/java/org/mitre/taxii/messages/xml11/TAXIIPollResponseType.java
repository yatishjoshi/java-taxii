
package org.mitre.taxii.messages.xml11;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.mitre.taxii.messages.xmldsig.SignatureType;


/**
 * Type for the Poll Response Messages.
 * 
 * <p>Java class for TAXIIPollResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAXIIPollResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}ResponseMessageType">
 *       &lt;sequence>
 *         &lt;element name="Subscription_ID" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Exclusive_Begin_Timestamp" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}TimestampLabelType" minOccurs="0"/>
 *         &lt;element name="Inclusive_End_Timestamp" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}TimestampLabelType" minOccurs="0"/>
 *         &lt;element name="Record_Count" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}RecordCountType" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content_Block" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}ContentBlockType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="collection_name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="more" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="result_id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="result_part_number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAXIIPollResponseType", propOrder = {
    "subscriptionID",
    "exclusiveBeginTimestamp",
    "inclusiveEndTimestamp",
    "recordCount",
    "message",
    "contentBlock",
    "signature"
})
public class TAXIIPollResponseType
    extends ResponseMessageType
    implements Equals
{

    @XmlElement(name = "Subscription_ID")
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionID;
    @XmlElement(name = "Exclusive_Begin_Timestamp")
    protected XMLGregorianCalendar exclusiveBeginTimestamp;
    @XmlElement(name = "Inclusive_End_Timestamp")
    protected XMLGregorianCalendar inclusiveEndTimestamp;
    @XmlElement(name = "Record_Count")
    protected RecordCountType recordCount;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Content_Block")
    protected List<ContentBlockType> contentBlock;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "collection_name", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String collectionName;
    @XmlAttribute(name = "more")
    protected Boolean more;
    @XmlAttribute(name = "result_id")
    @XmlSchemaType(name = "anyURI")
    protected String resultId;
    @XmlAttribute(name = "result_part_number")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger resultPartNumber;

    /**
     * Gets the value of the subscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionID(String value) {
        this.subscriptionID = value;
    }

    /**
     * Gets the value of the exclusiveBeginTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExclusiveBeginTimestamp() {
        return exclusiveBeginTimestamp;
    }

    /**
     * Sets the value of the exclusiveBeginTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExclusiveBeginTimestamp(XMLGregorianCalendar value) {
        this.exclusiveBeginTimestamp = value;
    }

    /**
     * Gets the value of the inclusiveEndTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInclusiveEndTimestamp() {
        return inclusiveEndTimestamp;
    }

    /**
     * Sets the value of the inclusiveEndTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInclusiveEndTimestamp(XMLGregorianCalendar value) {
        this.inclusiveEndTimestamp = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordCountType }
     *     
     */
    public RecordCountType getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordCountType }
     *     
     */
    public void setRecordCount(RecordCountType value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the contentBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentBlockType }
     * 
     * 
     */
    public List<ContentBlockType> getContentBlock() {
        if (contentBlock == null) {
            contentBlock = new ArrayList<ContentBlockType>();
        }
        return this.contentBlock;
    }

    /**
     * An XML Digital Signature scoped to this message.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the collectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * Sets the value of the collectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionName(String value) {
        this.collectionName = value;
    }

    /**
     * Gets the value of the more property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMore() {
        if (more == null) {
            return false;
        } else {
            return more;
        }
    }

    /**
     * Sets the value of the more property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMore(Boolean value) {
        this.more = value;
    }

    /**
     * Gets the value of the resultId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * Sets the value of the resultId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultId(String value) {
        this.resultId = value;
    }

    /**
     * Gets the value of the resultPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultPartNumber() {
        if (resultPartNumber == null) {
            return new BigInteger("1");
        } else {
            return resultPartNumber;
        }
    }

    /**
     * Sets the value of the resultPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultPartNumber(BigInteger value) {
        this.resultPartNumber = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TAXIIPollResponseType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TAXIIPollResponseType that = ((TAXIIPollResponseType) object);
        {
            String lhsSubscriptionID;
            lhsSubscriptionID = this.getSubscriptionID();
            String rhsSubscriptionID;
            rhsSubscriptionID = that.getSubscriptionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriptionID", lhsSubscriptionID), LocatorUtils.property(thatLocator, "subscriptionID", rhsSubscriptionID), lhsSubscriptionID, rhsSubscriptionID)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsExclusiveBeginTimestamp;
            lhsExclusiveBeginTimestamp = this.getExclusiveBeginTimestamp();
            XMLGregorianCalendar rhsExclusiveBeginTimestamp;
            rhsExclusiveBeginTimestamp = that.getExclusiveBeginTimestamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exclusiveBeginTimestamp", lhsExclusiveBeginTimestamp), LocatorUtils.property(thatLocator, "exclusiveBeginTimestamp", rhsExclusiveBeginTimestamp), lhsExclusiveBeginTimestamp, rhsExclusiveBeginTimestamp)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsInclusiveEndTimestamp;
            lhsInclusiveEndTimestamp = this.getInclusiveEndTimestamp();
            XMLGregorianCalendar rhsInclusiveEndTimestamp;
            rhsInclusiveEndTimestamp = that.getInclusiveEndTimestamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inclusiveEndTimestamp", lhsInclusiveEndTimestamp), LocatorUtils.property(thatLocator, "inclusiveEndTimestamp", rhsInclusiveEndTimestamp), lhsInclusiveEndTimestamp, rhsInclusiveEndTimestamp)) {
                return false;
            }
        }
        {
            RecordCountType lhsRecordCount;
            lhsRecordCount = this.getRecordCount();
            RecordCountType rhsRecordCount;
            rhsRecordCount = that.getRecordCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordCount", lhsRecordCount), LocatorUtils.property(thatLocator, "recordCount", rhsRecordCount), lhsRecordCount, rhsRecordCount)) {
                return false;
            }
        }
        {
            String lhsMessage;
            lhsMessage = this.getMessage();
            String rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
                return false;
            }
        }
        {
            List<ContentBlockType> lhsContentBlock;
            lhsContentBlock = (((this.contentBlock!= null)&&(!this.contentBlock.isEmpty()))?this.getContentBlock():null);
            List<ContentBlockType> rhsContentBlock;
            rhsContentBlock = (((that.contentBlock!= null)&&(!that.contentBlock.isEmpty()))?that.getContentBlock():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contentBlock", lhsContentBlock), LocatorUtils.property(thatLocator, "contentBlock", rhsContentBlock), lhsContentBlock, rhsContentBlock)) {
                return false;
            }
        }
        {
            SignatureType lhsSignature;
            lhsSignature = this.getSignature();
            SignatureType rhsSignature;
            rhsSignature = that.getSignature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signature", lhsSignature), LocatorUtils.property(thatLocator, "signature", rhsSignature), lhsSignature, rhsSignature)) {
                return false;
            }
        }
        {
            String lhsCollectionName;
            lhsCollectionName = this.getCollectionName();
            String rhsCollectionName;
            rhsCollectionName = that.getCollectionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collectionName", lhsCollectionName), LocatorUtils.property(thatLocator, "collectionName", rhsCollectionName), lhsCollectionName, rhsCollectionName)) {
                return false;
            }
        }
        {
            boolean lhsMore;
            lhsMore = ((this.more!= null)?this.isMore():false);
            boolean rhsMore;
            rhsMore = ((that.more!= null)?that.isMore():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "more", lhsMore), LocatorUtils.property(thatLocator, "more", rhsMore), lhsMore, rhsMore)) {
                return false;
            }
        }
        {
            String lhsResultId;
            lhsResultId = this.getResultId();
            String rhsResultId;
            rhsResultId = that.getResultId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultId", lhsResultId), LocatorUtils.property(thatLocator, "resultId", rhsResultId), lhsResultId, rhsResultId)) {
                return false;
            }
        }
        {
            BigInteger lhsResultPartNumber;
            lhsResultPartNumber = this.getResultPartNumber();
            BigInteger rhsResultPartNumber;
            rhsResultPartNumber = that.getResultPartNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resultPartNumber", lhsResultPartNumber), LocatorUtils.property(thatLocator, "resultPartNumber", rhsResultPartNumber), lhsResultPartNumber, rhsResultPartNumber)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
