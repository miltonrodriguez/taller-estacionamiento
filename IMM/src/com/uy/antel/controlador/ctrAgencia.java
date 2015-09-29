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
		
		DataTicket result = new DataTicket();
		ICtrValidacion IValidador = new ctrValidacion();
		if (IValidador.validarEntrada(matricula, fechaIniE, cantMinutos, fechaVenta, agencia)){
			if (validarAgencia(agencia)){
				int idAuto = ctrDAO.altaAuto(matricula);				
				ctrTicket ctr = new ctrTicket();				
				result = ctr.altaTicket(idAuto, fechaIniE, cantMinutos, fechaVenta);
			}else{
				//GENERO MENSAJE DE ERROR
				result = new DataTicket(-1, 100, "La agencia no es correcta",-1);
			}	
		}else{
			//GENERO MENSAJE DE ERROR
			result = new DataTicket(-1, 101, "Los parametros de entradas no son correctos",-1);
		}
			
		return result;
	}
	
}
