
package org.mitre.taxii.messages.xml11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * The root of all TAXII messages. This is used to define header fields. This will never be instantiated directly but the TAXII Message Body types all extend this type.
 * 
 * <p>Java class for MessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extended_Headers" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}ExtendedHeadersType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="message_id" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageType", propOrder = {
    "extendedHeaders"
})
@XmlSeeAlso({
    RequestMessageType.class,
    ResponseMessageType.class
})
public abstract class MessageType
    implements Equals
{

    @XmlElement(name = "Extended_Headers")
    protected ExtendedHeadersType extendedHeaders;
    @XmlAttribute(name = "message_id", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String messageId;

    /**
     * Gets the value of the extendedHeaders property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedHeadersType }
     *     
     */
    public ExtendedHeadersType getExtendedHeaders() {
        return extendedHeaders;
    }

    /**
     * Sets the value of the extendedHeaders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedHeadersType }
     *     
     */
    public void setExtendedHeaders(ExtendedHeadersType value) {
        this.extendedHeaders = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MessageType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MessageType that = ((MessageType) object);
        {
            ExtendedHeadersType lhsExtendedHeaders;
            lhsExtendedHeaders = this.getExtendedHeaders();
            ExtendedHeadersType rhsExtendedHeaders;
            rhsExtendedHeaders = that.getExtendedHeaders();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extendedHeaders", lhsExtendedHeaders), LocatorUtils.property(thatLocator, "extendedHeaders", rhsExtendedHeaders), lhsExtendedHeaders, rhsExtendedHeaders)) {
                return false;
            }
        }
        {
            String lhsMessageId;
            lhsMessageId = this.getMessageId();
            String rhsMessageId;
            rhsMessageId = that.getMessageId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageId", lhsMessageId), LocatorUtils.property(thatLocator, "messageId", rhsMessageId), lhsMessageId, rhsMessageId)) {
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
