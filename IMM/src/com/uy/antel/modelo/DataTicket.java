package com.uy.antel.modelo;

import java.util.Date;

public class DataTicket {
	int importeTotal;
	int error;
	String mensaje;
	
	public DataTicket(){
		
	}
	
	public DataTicket(int importeTotal, int error, String mensaje){
		
	}
	
	public int getImporteTotal() {
		return importeTotal;
	}
	public void setImporteTotal(int importeTotal) {
		this.importeTotal = importeTotal;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
