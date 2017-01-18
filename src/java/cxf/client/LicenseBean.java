
package cxf.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LicenseBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dtStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="dtEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="orgLicense" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseBean")
public class LicenseBean {

    @XmlAttribute(name = "vid")
    protected String vid;
    @XmlAttribute(name = "dtStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtStart;
    @XmlAttribute(name = "dtEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEnd;
    @XmlAttribute(name = "orgLicense")
    protected String orgLicense;

    /**
     * Gets the value of the vid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVid() {
        return vid;
    }

    /**
     * Sets the value of the vid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVid(String value) {
        this.vid = value;
    }

    /**
     * Gets the value of the dtStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtStart() {
        return dtStart;
    }

    /**
     * Sets the value of the dtStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtStart(XMLGregorianCalendar value) {
        this.dtStart = value;
    }

    /**
     * Gets the value of the dtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEnd() {
        return dtEnd;
    }

    /**
     * Sets the value of the dtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEnd(XMLGregorianCalendar value) {
        this.dtEnd = value;
    }

    /**
     * Gets the value of the orgLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgLicense() {
        return orgLicense;
    }

    /**
     * Sets the value of the orgLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgLicense(String value) {
        this.orgLicense = value;
    }

}
