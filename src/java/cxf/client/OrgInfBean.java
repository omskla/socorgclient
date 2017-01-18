
package cxf.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrgInfBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgInfBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="head" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bux" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgBean" type="{http://socialorg.ws.ooic.ru/}OrgBean" minOccurs="0"/&gt;
 *         &lt;element name="dtreg" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="founder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="about" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgInfBean", propOrder = {
    "tel",
    "workTime",
    "head",
    "bux",
    "orgBean",
    "dtreg",
    "founder",
    "guid",
    "street",
    "vid",
    "tip",
    "regNum",
    "about",
    "email"
})
public class OrgInfBean {

    protected String tel;
    protected String workTime;
    protected String head;
    protected String bux;
    protected OrgBean orgBean;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtreg;
    protected String founder;
    protected String guid;
    protected String street;
    protected String vid;
    protected String tip;
    protected String regNum;
    protected String about;
    protected String email;

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the workTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTime() {
        return workTime;
    }

    /**
     * Sets the value of the workTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTime(String value) {
        this.workTime = value;
    }

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHead(String value) {
        this.head = value;
    }

    /**
     * Gets the value of the bux property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBux() {
        return bux;
    }

    /**
     * Sets the value of the bux property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBux(String value) {
        this.bux = value;
    }

    /**
     * Gets the value of the orgBean property.
     * 
     * @return
     *     possible object is
     *     {@link OrgBean }
     *     
     */
    public OrgBean getOrgBean() {
        return orgBean;
    }

    /**
     * Sets the value of the orgBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgBean }
     *     
     */
    public void setOrgBean(OrgBean value) {
        this.orgBean = value;
    }

    /**
     * Gets the value of the dtreg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtreg() {
        return dtreg;
    }

    /**
     * Sets the value of the dtreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtreg(XMLGregorianCalendar value) {
        this.dtreg = value;
    }

    /**
     * Gets the value of the founder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounder() {
        return founder;
    }

    /**
     * Sets the value of the founder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounder(String value) {
        this.founder = value;
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
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

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
     * Gets the value of the tip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTip() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTip(String value) {
        this.tip = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the about property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbout(String value) {
        this.about = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
