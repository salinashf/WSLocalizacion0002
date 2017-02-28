
package ec.edu.uisrael.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para puntoInputContainer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="puntoInputContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pntoX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pntoY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "puntoInputContainer", propOrder = {
    "pntoX",
    "pntoY"
})
public class PuntoInputContainer {

    @XmlElement(required = true)
    protected String pntoX;
    @XmlElement(required = true)
    protected String pntoY;

    /**
     * Obtiene el valor de la propiedad pntoX.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPntoX() {
        return pntoX;
    }

    /**
     * Define el valor de la propiedad pntoX.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPntoX(String value) {
        this.pntoX = value;
    }

    /**
     * Obtiene el valor de la propiedad pntoY.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPntoY() {
        return pntoY;
    }

    /**
     * Define el valor de la propiedad pntoY.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPntoY(String value) {
        this.pntoY = value;
    }

}
