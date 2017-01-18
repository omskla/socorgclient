
package cxf.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubDivisionBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubDivisionBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="guidOrg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nameOrg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="typeDep" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="capacity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="free" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="busy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="reserved" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="served" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="roomDays" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubDivisionBean")
public class SubDivisionBean {

    @XmlAttribute(name = "fullName")
    protected String fullName;
    @XmlAttribute(name = "guid")
    protected String guid;
    @XmlAttribute(name = "guidOrg")
    protected String guidOrg;
    @XmlAttribute(name = "nameOrg")
    protected String nameOrg;
    @XmlAttribute(name = "typeDep")
    protected String typeDep;
    @XmlAttribute(name = "capacity")
    protected String capacity;
    @XmlAttribute(name = "free")
    protected String free;
    @XmlAttribute(name = "busy")
    protected String busy;
    @XmlAttribute(name = "reserved")
    protected String reserved;
    @XmlAttribute(name = "served")
    protected String served;
    @XmlAttribute(name = "roomDays")
    protected String roomDays;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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
     * Gets the value of the guidOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidOrg() {
        return guidOrg;
    }

    /**
     * Sets the value of the guidOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidOrg(String value) {
        this.guidOrg = value;
    }

    /**
     * Gets the value of the nameOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOrg() {
        return nameOrg;
    }

    /**
     * Sets the value of the nameOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOrg(String value) {
        this.nameOrg = value;
    }

    /**
     * Gets the value of the typeDep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDep() {
        return typeDep;
    }

    /**
     * Sets the value of the typeDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDep(String value) {
        this.typeDep = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacity(String value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the free property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFree() {
        return free;
    }

    /**
     * Sets the value of the free property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFree(String value) {
        this.free = value;
    }

    /**
     * Gets the value of the busy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusy() {
        return busy;
    }

    /**
     * Sets the value of the busy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusy(String value) {
        this.busy = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved(String value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the served property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServed() {
        return served;
    }

    /**
     * Sets the value of the served property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServed(String value) {
        this.served = value;
    }

    /**
     * Gets the value of the roomDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomDays() {
        return roomDays;
    }

    /**
     * Sets the value of the roomDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomDays(String value) {
        this.roomDays = value;
    }

}
