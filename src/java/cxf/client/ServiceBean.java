
package cxf.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="servType" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="typeService" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tarif" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="norm" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="calcType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBean")
public class ServiceBean {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "guid")
    protected String guid;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "servType")
    protected Integer servType;
    @XmlAttribute(name = "typeService")
    protected String typeService;
    @XmlAttribute(name = "tarif")
    protected Double tarif;
    @XmlAttribute(name = "norm")
    protected Double norm;
    @XmlAttribute(name = "calcType")
    protected String calcType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the servType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServType() {
        return servType;
    }

    /**
     * Sets the value of the servType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServType(Integer value) {
        this.servType = value;
    }

    /**
     * Gets the value of the typeService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeService() {
        return typeService;
    }

    /**
     * Sets the value of the typeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeService(String value) {
        this.typeService = value;
    }

    /**
     * Gets the value of the tarif property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarif() {
        return tarif;
    }

    /**
     * Sets the value of the tarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarif(Double value) {
        this.tarif = value;
    }

    /**
     * Gets the value of the norm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNorm() {
        return norm;
    }

    /**
     * Sets the value of the norm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNorm(Double value) {
        this.norm = value;
    }

    /**
     * Gets the value of the calcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcType() {
        return calcType;
    }

    /**
     * Sets the value of the calcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcType(String value) {
        this.calcType = value;
    }

}
