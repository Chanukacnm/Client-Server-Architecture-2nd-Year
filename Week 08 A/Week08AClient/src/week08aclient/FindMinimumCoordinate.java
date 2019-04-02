
package week08aclient;

import week08aclient.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findMinimumCoordinate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findMinimumCoordinate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point" type="{http://server/}point2D" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findMinimumCoordinate", propOrder = {
    "point"
})
public class FindMinimumCoordinate {

    protected Point2D point;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link Point2D }
     *     
     */
    public Point2D getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point2D }
     *     
     */
    public void setPoint(Point2D value) {
        this.point = value;
    }

}
