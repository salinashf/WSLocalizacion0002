
package ec.edu.uisrael.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para puntoData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="puntoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serial_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ubicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "puntoData", propOrder = {
    "serialId",
    "latitud",
    "longitud",
    "ubicacion"
})
public class PuntoData {

    public PuntoData(String serialId, String latitud, String longitud, String ubicacion) {
        this.serialId = serialId;
        this.latitud = latitud;
        this.longitud = longitud;
        this.ubicacion = ubicacion;
    }
    
    public PuntoData() {

    }

    @XmlElement(name = "serial_id", required = true)
    protected String serialId;
    @XmlElement(required = true)
    protected String latitud;
    @XmlElement(required = true)
    protected String longitud;
    @XmlElement(required = true)
    protected String ubicacion;

    /**
     * Obtiene el valor de la propiedad serialId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialId() {
        return serialId;
    }

    /**
     * Define el valor de la propiedad serialId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialId(String value) {
        this.serialId = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitud(String value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitud(String value) {
        this.longitud = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

}
