
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
 *         &lt;element name="headerOut" type="{http://uisrael.edu.ec/servicios}GenericHeaderOut"/>
 *         &lt;element name="bodyOut" type="{http://uisrael.edu.ec/servicios}bodyOutputContainer" minOccurs="0"/>
 *         &lt;element name="error" type="{http://uisrael.edu.ec/servicios}GenericError"/>
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
    "headerOut",
    "bodyOut",
    "error"
})
@XmlRootElement(name = "ConsultarPuntosResponse")
public class ConsultarPuntosResponse {

    @XmlElement(required = true)
    protected GenericHeaderOut headerOut;
    protected BodyOutputContainer bodyOut;
    @XmlElement(required = true)
    protected GenericError error;

    /**
     * Obtiene el valor de la propiedad headerOut.
     * 
     * @return
     *     possible object is
     *     {@link GenericHeaderOut }
     *     
     */
    public GenericHeaderOut getHeaderOut() {
        return headerOut;
    }

    /**
     * Define el valor de la propiedad headerOut.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericHeaderOut }
     *     
     */
    public void setHeaderOut(GenericHeaderOut value) {
        this.headerOut = value;
    }

    /**
     * Obtiene el valor de la propiedad bodyOut.
     * 
     * @return
     *     possible object is
     *     {@link BodyOutputContainer }
     *     
     */
    public BodyOutputContainer getBodyOut() {
        return bodyOut;
    }

    /**
     * Define el valor de la propiedad bodyOut.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyOutputContainer }
     *     
     */
    public void setBodyOut(BodyOutputContainer value) {
        this.bodyOut = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link GenericError }
     *     
     */
    public GenericError getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericError }
     *     
     */
    public void setError(GenericError value) {
        this.error = value;
    }

}
