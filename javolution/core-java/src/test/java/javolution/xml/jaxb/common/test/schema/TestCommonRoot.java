//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.02 at 09:04:17 PM EDT 
//


package javolution.xml.jaxb.common.test.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testCommonElement" type="{http://javolution.org/xml/schema/javolution-common}testCommonElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testChoiceElement" type="{http://javolution.org/xml/schema/javolution-common}testChoiceElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testCommonElement",
    "testChoiceElement"
})
@XmlRootElement(name = "testCommonRoot")
public class TestCommonRoot {

    protected List<TestCommonElement> testCommonElement;
    protected List<TestChoiceElement> testChoiceElement;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the testCommonElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testCommonElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestCommonElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestCommonElement }
     * 
     * 
     */
    public List<TestCommonElement> getTestCommonElement() {
        if (testCommonElement == null) {
            testCommonElement = new ArrayList<TestCommonElement>();
        }
        return this.testCommonElement;
    }

    /**
     * Gets the value of the testChoiceElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testChoiceElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestChoiceElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestChoiceElement }
     * 
     * 
     */
    public List<TestChoiceElement> getTestChoiceElement() {
        if (testChoiceElement == null) {
            testChoiceElement = new ArrayList<TestChoiceElement>();
        }
        return this.testChoiceElement;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}