
package cxf.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseBeanList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseBeanList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="licenseBeanList" type="{http://socialorg.ws.ooic.ru/}LicenseBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseBeanList", propOrder = {
    "licenseBeanList"
})
public class LicenseBeanList {

    @XmlElement(nillable = true)
    protected List<LicenseBean> licenseBeanList;

    /**
     * Gets the value of the licenseBeanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseBeanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseBeanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseBean }
     * 
     * 
     */
    public List<LicenseBean> getLicenseBeanList() {
        if (licenseBeanList == null) {
            licenseBeanList = new ArrayList<LicenseBean>();
        }
        return this.licenseBeanList;
    }

}
