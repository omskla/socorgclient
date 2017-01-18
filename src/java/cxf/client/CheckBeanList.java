
package cxf.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckBeanList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckBeanList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checkBeanList" type="{http://socialorg.ws.ooic.ru/}CheckBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckBeanList", propOrder = {
    "checkBeanList"
})
public class CheckBeanList {

    @XmlElement(nillable = true)
    protected List<CheckBean> checkBeanList;

    /**
     * Gets the value of the checkBeanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkBeanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckBeanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckBean }
     * 
     * 
     */
    public List<CheckBean> getCheckBeanList() {
        if (checkBeanList == null) {
            checkBeanList = new ArrayList<CheckBean>();
        }
        return this.checkBeanList;
    }

}
