
package ec.edu.uisrael.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bodyOutputContainer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bodyOutputContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="puntos" type="{http://uisrael.edu.ec/servicios}PuntosOutputContainer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bodyOutputContainer", propOrder = {
    "puntos"
})
public class BodyOutputContainer {

    @XmlElement(required = true)
    protected PuntosOutputContainer puntos;

    /**
     * Obtiene el valor de la propiedad puntos.
     * 
     * @return
     *     possible object is
     *     {@link PuntosOutputContainer }
     *     
     */
    public PuntosOutputContainer getPuntos() {
        return puntos;
    }

    /**
     * Define el valor de la propiedad puntos.
     * 
     * @param value
     *     allowed object is
     *     {@link PuntosOutputContainer }
     *     
     */
    public void setPuntos(PuntosOutputContainer value) {
        this.puntos = value;
    }

}
