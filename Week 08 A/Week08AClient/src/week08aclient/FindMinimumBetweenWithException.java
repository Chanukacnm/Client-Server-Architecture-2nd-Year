
package week08aclient;

import week08aclient.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findMinimumBetweenWithException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findMinimumBetweenWithException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="parameter1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findMinimumBetweenWithException", propOrder = {
    "a",
    "parameter1"
})
public class FindMinimumBetweenWithException {

    protected Double a;
    protected Double parameter1;

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setA(Double value) {
        this.a = value;
    }

    /**
     * Gets the value of the parameter1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParameter1() {
        return parameter1;
    }

    /**
     * Sets the value of the parameter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParameter1(Double value) {
        this.parameter1 = value;
    }

}
