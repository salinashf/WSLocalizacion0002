package ec.edu.uisrael.servicios;
/**
 * (c) 2017 Salinas Henry  
 * (c) 2017 in House
 * 
 * @author Salinas Henry  
 * @since 13:46:22 - 14.09.2010
 */

import ec.edu.uisrael.datos.ConsultaPuntos;
import ec.edu.uisrael.datos.Punto;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jws.WebService;

@WebService(
        serviceName = "WSLocalizacion0002",
        portName = "WSLocalizacion0002SOAP",
        targetNamespace = "http://uisrael.edu.ec/servicios",
        wsdlLocation = "resources/WSLocalizacion0002.wsdl",
        endpointInterface = "ec.edu.uisrael.servicios.WSLocalizacion0002")
public class WSLocalizacion0002Impl extends WSManager {

    BodyOutputContainer bodyOut = new BodyOutputContainer();
    PuntosOutputContainer puntos;//= new PuntosOutputContainer();
    //List<PuntoData> listaPuntos = new ArrayList<PuntoData>();
    //listaPuntos.add(puntoData);
    //listaPuntos.add(puntoDatab);		
    //puntos.getPunto().addAll(listaPuntos);
    PuntoData puntoData = new PuntoData();
    PuntoData puntoDatab = new PuntoData();

    @Override
    public BodyOutputContainer consultarInput(GenericHeaderIn headerIn, BodyInputContainer bodyIn) {
        vaciarListaPuntos();
        PuntoInputContainer pntoSup = bodyIn.getPuntoSuperior().getPunto();
        PuntoInputContainer pntoInf = bodyIn.getPuntoInferior().getPunto();
        Punto sup = new Punto(
                pntoSup.getPntoX(),
                pntoSup.getPntoY()
        );
        Punto inf = new Punto(
                pntoInf.getPntoX(),
                pntoInf.getPntoY()
        );


        List<Punto> pntos;
        try {
            pntos = (new ConsultaPuntos()).ConsultaPuntosCercanos(sup, inf);
            for (Punto pntt : pntos) {
                puntos.getPunto().add(new PuntoData(pntt.getSiteid(), pntt.getLatitude(), pntt.getLongitude(), pntt.getSitename()));
            }

        } catch (Exception ex) {
            Logger.getLogger(WSLocalizacion0002Impl.class.getName()).log(Level.SEVERE, null, ex);
        }

        puntoData.setSerialId("AAAAABBBBCCCC");
        puntoData.setLatitud("0.252");
        puntoData.setLongitud("0.35");
        puntoData.setUbicacion("COTACACHI");
        
        puntoDatab.setSerialId("DDDDEEEEFFF");
        puntoDatab.setLatitud("0.55");
        puntoDatab.setLongitud("0.75");
        puntoDatab.setUbicacion("INTAG");
        

        
        puntos.getPunto().add(puntoData);
        puntos.getPunto().add(puntoDatab);
        
        
        bodyOut.setPuntos(puntos);
        getErrorValue().setCodigo("0");
        getErrorValue().setMensaje("OK.");
        getErrorValue().setTipo("");
        return bodyOut;
    }

    public void vaciarListaPuntos() {
        puntos = null;
        System.gc();
        puntos = new PuntosOutputContainer();
        for (int y = 0; y < puntos.getPunto().size(); y++) {
            puntos.getPunto().remove(y);
        }
        System.gc();
    }

}
