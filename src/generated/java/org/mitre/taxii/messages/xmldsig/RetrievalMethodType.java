
package org.mitre.taxii.messages.xmldsig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrievalMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrievalMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalMethodType", propOrder = {
    "transforms"
})
public class RetrievalMethodType {

    @XmlElement(name = "Transforms")
    protected TransformsType transforms;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anyURI")
    protected String type;

    /**
     * Gets the value of the transforms property.
     * 
     * @return
     *     possible object is
     *     {@link TransformsType }
     *     
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /**
     * Sets the value of the transforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformsType }
     *     
     */
    public void setTransforms(TransformsType value) {
        this.transforms = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
