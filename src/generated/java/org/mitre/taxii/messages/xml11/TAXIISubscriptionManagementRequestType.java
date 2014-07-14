
package org.mitre.taxii.messages.xml11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.taxii.messages.xmldsig.SignatureType;


/**
 * Request management of a Data Collection subscription (including creation of a new subscription).
 * 
 * <p>Java class for TAXIISubscriptionManagementRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAXIISubscriptionManagementRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}RequestMessageType">
 *       &lt;sequence>
 *         &lt;element name="Subscription_ID" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Subscription_Parameters" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}SubscriptionParametersType" minOccurs="0"/>
 *         &lt;element name="Push_Parameters" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}PushParameterType" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" use="required" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}CollectionActionEnum" />
 *       &lt;attribute name="collection_name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAXIISubscriptionManagementRequestType", propOrder = {
    "subscriptionID",
    "subscriptionParameters",
    "pushParameters",
    "signature"
})
public class TAXIISubscriptionManagementRequestType
    extends RequestMessageType
{

    @XmlElement(name = "Subscription_ID")
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionID;
    @XmlElement(name = "Subscription_Parameters")
    protected SubscriptionParametersType subscriptionParameters;
    @XmlElement(name = "Push_Parameters")
    protected PushParameterType pushParameters;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "action", required = true)
    protected CollectionActionEnum action;
    @XmlAttribute(name = "collection_name", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String collectionName;

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
     * Gets the value of the subscriptionParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionParametersType }
     *     
     */
    public SubscriptionParametersType getSubscriptionParameters() {
        return subscriptionParameters;
    }

    /**
     * Sets the value of the subscriptionParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionParametersType }
     *     
     */
    public void setSubscriptionParameters(SubscriptionParametersType value) {
        this.subscriptionParameters = value;
    }

    /**
     * Gets the value of the pushParameters property.
     * 
     * @return
     *     possible object is
     *     {@link PushParameterType }
     *     
     */
    public PushParameterType getPushParameters() {
        return pushParameters;
    }

    /**
     * Sets the value of the pushParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PushParameterType }
     *     
     */
    public void setPushParameters(PushParameterType value) {
        this.pushParameters = value;
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
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionActionEnum }
     *     
     */
    public CollectionActionEnum getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionActionEnum }
     *     
     */
    public void setAction(CollectionActionEnum value) {
        this.action = value;
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

}
