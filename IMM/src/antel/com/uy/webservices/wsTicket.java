package antel.com.uy.webservices;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.uy.antel.modelo.DataTicket;

@WebService()
public class wsTicket {

	@WebMethod()
	public String metodoPrueba(String name) {
	   return "Prueba " + name + "!";
	}
	
	@WebMethod()
	public DataTicket altaTicket(String matricula, Date fechaIniE, int cantMinutos, Date fechaVenta, String agencia){
		DataTicket result = new DataTicket(50, 0, "Mensaje de error");
		return result;
	}
}
