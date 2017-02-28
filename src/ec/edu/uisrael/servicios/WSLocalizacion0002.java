package ec.edu.uisrael.servicios;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * Apache CXF 2.7.18
 * Source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://uisrael.edu.ec/servicios", name = "WSLocalizacion0002")
@XmlSeeAlso({ObjectFactory.class})
public interface WSLocalizacion0002 {

    @RequestWrapper(localName = "ConsultarPuntos", targetNamespace = "http://uisrael.edu.ec/servicios", className = "ec.edu.uisrael.servicios.ConsultarPuntos")
    @WebMethod(operationName = "ConsultarPuntos", action = "http://uisrael.edu.ec/servicios/ConsultarPuntos")
    @ResponseWrapper(localName = "ConsultarPuntosResponse", targetNamespace = "http://uisrael.edu.ec/servicios", className = "ec.edu.uisrael.servicios.ConsultarPuntosResponse")
    public void consultarPuntos(
        @WebParam(name = "headerIn", targetNamespace = "")
        ec.edu.uisrael.servicios.GenericHeaderIn headerIn,
        @WebParam(name = "bodyIn", targetNamespace = "")
        ec.edu.uisrael.servicios.BodyInputContainer bodyIn,
        @WebParam(mode = WebParam.Mode.OUT, name = "headerOut", targetNamespace = "")
        javax.xml.ws.Holder<GenericHeaderOut> headerOut,
        @WebParam(mode = WebParam.Mode.OUT, name = "bodyOut", targetNamespace = "")
        javax.xml.ws.Holder<BodyOutputContainer> bodyOut,
        @WebParam(mode = WebParam.Mode.OUT, name = "error", targetNamespace = "")
        javax.xml.ws.Holder<GenericError> error
    );
}
