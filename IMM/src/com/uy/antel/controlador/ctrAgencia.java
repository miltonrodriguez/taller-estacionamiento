package com.uy.antel.controlador;

import java.util.Date;

import com.uy.antel.modelo.DataTicket;

public class ctrAgencia {

	public boolean validarAgencia(String agencia){
		return ctrDAO.validarAgencia(agencia);
	}
	
	public DataTicket altaTicket(String matricula, Date fechaIniE, int cantMinutos, Date fechaVenta, String agencia){
		
		DataTicket result = new DataTicket();
		if (validarAgencia(agencia)){
			//HAGO ALGO
			
			result = new DataTicket(-1, 0, "Error de Sistema",0);
		}else{
			//GENERO MENSAJE DE ERROR
			result = new DataTicket(-1, 100, "La agencia no es correcta",-1);
		}	
		return result;
	}
	
}
