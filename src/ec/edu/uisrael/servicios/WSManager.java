package ec.edu.uisrael.servicios;


import java.util.Calendar;

import javax.xml.ws.Holder;

import org.joda.time.DateTime;



public abstract class WSManager implements WSLocalizacion0002 {
	private GenericHeaderOut headerOutValue = new GenericHeaderOut();
	private GenericError errorValue = new GenericError();
        @Override
	public void consultarPuntos(GenericHeaderIn headerIn, BodyInputContainer bodyIn, Holder<GenericHeaderOut> headerOut,
			Holder<BodyOutputContainer> bodyOut, Holder<GenericError> error) {
		headerOut.value = asignarCabecera(headerIn);
		error.value = errorValue;
		bodyOut.value = consultarInput(headerIn, bodyIn);
	}
	public WSManager() {
		super();
		errorValue.setCodigo("Codigo1987716012");
		errorValue.setMensaje("Mensaje-404871114");
		errorValue.setTipo("Tipo-2019573610");
		errorValue.setRecurso("Recurso1791079661");
		errorValue.setComponente("Componente-558185324");
	}

	public abstract BodyOutputContainer consultarInput(GenericHeaderIn headerIn, BodyInputContainer bodyIn);

	public GenericHeaderOut getHeaderOutValue() {
		return headerOutValue;
	}
	public GenericError getErrorValue() {
		return errorValue;
	}

	public GenericHeaderOut  asignarCabecera(GenericHeaderIn headerIn){
		headerOutValue.setDispositivo(headerIn.getDispositivo());
		headerOutValue.setCanal(headerIn.getCanal());
		headerOutValue.setMedio(headerIn.getMedio());
		headerOutValue.setAplicacion(headerIn.getAplicacion());
		headerOutValue.setUsuario("Usuario1603556766");
		headerOutValue.setFechaHora(DateTime.now().toString());
		headerOutValue.setIdioma(Calendar.getInstance().getTimeZone().getDisplayName());
		headerOutValue.setIp(headerIn.getIp());
		return headerOutValue; 
		
	}



}
