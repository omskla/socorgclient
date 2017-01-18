
package cxf.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaffBeanList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffBeanList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="staffBeanList" type="{http://socialorg.ws.ooic.ru/}StaffBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffBeanList", propOrder = {
    "staffBeanList"
})
public class StaffBeanList {

    @XmlElement(nillable = true)
    protected List<StaffBean> staffBeanList;

    /**
     * Gets the value of the staffBeanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffBeanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffBeanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffBean }
     * 
     * 
     */
    public List<StaffBean> getStaffBeanList() {
        if (staffBeanList == null) {
            staffBeanList = new ArrayList<StaffBean>();
        }
        return this.staffBeanList;
    }

}
