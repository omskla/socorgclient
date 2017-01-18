
package cxf.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubDivisionBeanList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubDivisionBeanList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubDivisionBeanList" type="{http://socialorg.ws.ooic.ru/}SubDivisionBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubDivisionBeanList", propOrder = {
    "subDivisionBeanList"
})
public class SubDivisionBeanList {

    @XmlElement(name = "SubDivisionBeanList", nillable = true)
    protected List<SubDivisionBean> subDivisionBeanList;

    /**
     * Gets the value of the subDivisionBeanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDivisionBeanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDivisionBeanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubDivisionBean }
     * 
     * 
     */
    public List<SubDivisionBean> getSubDivisionBeanList() {
        if (subDivisionBeanList == null) {
            subDivisionBeanList = new ArrayList<SubDivisionBean>();
        }
        return this.subDivisionBeanList;
    }

}
