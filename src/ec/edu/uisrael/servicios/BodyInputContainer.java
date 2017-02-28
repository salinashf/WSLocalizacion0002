
package ec.edu.uisrael.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bodyInputContainer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bodyInputContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="puntoSuperior" type="{http://uisrael.edu.ec/servicios}puntoXContainer"/>
 *         &lt;element name="puntoInferior" type="{http://uisrael.edu.ec/servicios}puntoYContainer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bodyInputContainer", propOrder = {
    "puntoSuperior",
    "puntoInferior"
})
public class BodyInputContainer {

    @XmlElement(required = true)
    protected PuntoXContainer puntoSuperior;
    @XmlElement(required = true)
    protected PuntoYContainer puntoInferior;

    /**
     * Obtiene el valor de la propiedad puntoSuperior.
     * 
     * @return
     *     possible object is
     *     {@link PuntoXContainer }
     *     
     */
    public PuntoXContainer getPuntoSuperior() {
        return puntoSuperior;
    }

    /**
     * Define el valor de la propiedad puntoSuperior.
     * 
     * @param value
     *     allowed object is
     *     {@link PuntoXContainer }
     *     
     */
    public void setPuntoSuperior(PuntoXContainer value) {
        this.puntoSuperior = value;
    }

    /**
     * Obtiene el valor de la propiedad puntoInferior.
     * 
     * @return
     *     possible object is
     *     {@link PuntoYContainer }
     *     
     */
    public PuntoYContainer getPuntoInferior() {
        return puntoInferior;
    }

    /**
     * Define el valor de la propiedad puntoInferior.
     * 
     * @param value
     *     allowed object is
     *     {@link PuntoYContainer }
     *     
     */
    public void setPuntoInferior(PuntoYContainer value) {
        this.puntoInferior = value;
    }

}
