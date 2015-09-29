package com.uy.antel.controlador;

import java.util.Date;

public class ctrImporte implements ICtrImporte {

	@Override
	public int calcularImporte(int cantidadMinutos, Date fechaIniE) {
		//Definir algun calculo inicial del importe, 16$ cada media hora
		return (int)Math.ceil((cantidadMinutos/30))*16;
	}

}
