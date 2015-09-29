package com.uy.antel.controlador;

import java.util.Date;

import com.uy.antel.modelo.DataTicket;

public class ctrAgencia {

	public ctrAgencia(){
		
	}
	
	public boolean validarAgencia(String agencia){
		return ctrDAO.validarAgencia(agencia);
	}
	
	public DataTicket altaTicket(String matricula, Date fechaIniE, int cantMinutos, Date fechaVenta, String agencia){
		int error = 0;
		String mensaje = "";
		DataTicket result = new DataTicket();
		
		try{
			ICtrValidacion IValidador = new ctrValidacion();
			error = IValidador.validarEntrada(matricula, fechaIniE, cantMinutos, fechaVenta, agencia);
			
			switch(error){
				case 104:{
					mensaje = "La matricula consta de tres letras y cuatro números (Ejemplo: ABC 1234)";
					break;
				}case 101:{
					mensaje = "La fecha de estacionamiento debe ser en el futuro.";
					break;
				}case 103:{
					mensaje = "La cantidad de minutos debe ser un múltiplo de 30.";
					break;
				}default: {
						if (validarAgencia(agencia)){
							int idAuto = ctrDAO.altaAuto(matricula);				
							ctrTicket ctr = new ctrTicket();				
							result = ctr.altaTicket(idAuto, fechaIniE, cantMinutos, fechaVenta);
						}else{
							error = 100;
							mensaje = "La agencia no es correcta";
						}
					}
			}
		
		}catch(Exception ex){
			error = 201;
			mensaje = "Error de Sistema";
		}
		
		if (error!=0)
			result = new DataTicket(-1, error, mensaje,-1);	
		
		return result;
	}
	
}
