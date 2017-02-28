
package ec.edu.uisrael.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="headerIn" type="{http://uisrael.edu.ec/servicios}GenericHeaderIn"/>
 *         &lt;element name="bodyIn" type="{http://uisrael.edu.ec/servicios}bodyInputContainer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "headerIn",
    "bodyIn"
})
@XmlRootElement(name = "ConsultarPuntos")
public class ConsultarPuntos {

    @XmlElement(required = true)
    protected GenericHeaderIn headerIn;
    @XmlElement(required = true)
    protected BodyInputContainer bodyIn;

    /**
     * Obtiene el valor de la propiedad headerIn.
     * 
     * @return
     *     possible object is
     *     {@link GenericHeaderIn }
     *     
     */
    public GenericHeaderIn getHeaderIn() {
        return headerIn;
    }

    /**
     * Define el valor de la propiedad headerIn.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericHeaderIn }
     *     
     */
    public void setHeaderIn(GenericHeaderIn value) {
        this.headerIn = value;
    }

    /**
     * Obtiene el valor de la propiedad bodyIn.
     * 
     * @return
     *     possible object is
     *     {@link BodyInputContainer }
     *     
     */
    public BodyInputContainer getBodyIn() {
        return bodyIn;
    }

    /**
     * Define el valor de la propiedad bodyIn.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyInputContainer }
     *     
     */
    public void setBodyIn(BodyInputContainer value) {
        this.bodyIn = value;
    }

}
