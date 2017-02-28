
package ec.edu.uisrael.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para puntoYContainer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="puntoYContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="punto" type="{http://uisrael.edu.ec/servicios}puntoInputContainer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "puntoYContainer", propOrder = {
    "punto"
})
public class PuntoYContainer {

    @XmlElement(required = true)
    protected PuntoInputContainer punto;

    /**
     * Obtiene el valor de la propiedad punto.
     * 
     * @return
     *     possible object is
     *     {@link PuntoInputContainer }
     *     
     */
    public PuntoInputContainer getPunto() {
        return punto;
    }

    /**
     * Define el valor de la propiedad punto.
     * 
     * @param value
     *     allowed object is
     *     {@link PuntoInputContainer }
     *     
     */
    public void setPunto(PuntoInputContainer value) {
        this.punto = value;
    }

}
