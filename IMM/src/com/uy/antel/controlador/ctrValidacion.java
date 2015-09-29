package com.uy.antel.controlador;

import java.util.Date;

public class ctrValidacion implements ICtrValidacion {

	public ctrValidacion(){
		
	}
	
	@Override
	public boolean validarEntrada(String matricula, Date fechaIniE,	int cantMinutos, Date fechaVenta, String agencia) {
		
		return true;
	}

}
