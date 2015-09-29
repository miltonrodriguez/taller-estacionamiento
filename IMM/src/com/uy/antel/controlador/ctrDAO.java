package com.uy.antel.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ctrDAO {
	private static String LOOKUP_DATASOURSE_MySqlIMM = "java:jboss/datasources/MySqlIMM";
	

	public static Connection getConexion(){
		Connection conn = null;
		try {
			InitialContext initContext;
			try {
				initContext = new InitialContext();
				DataSource ds = (DataSource)initContext.lookup(LOOKUP_DATASOURSE_MySqlIMM);
				conn = ds.getConnection();
			} catch (NamingException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}finally{}
		return conn;
		
	}	
	
	public static ResultSet getQuery(Connection conn, String query){
		Statement stm = null;
		ResultSet result = null;
		try{
			stm = (Statement)conn.createStatement();
			result = stm.executeQuery(query);			
		}catch(SQLException e){
			e.printStackTrace();
		}		
		return result;
	}
	
	public static void setQuery(Connection conn, String query){
		Statement stm = null;
		try{
			stm = (Statement)conn.createStatement();
			stm.execute(query);			
		}catch(SQLException e){			
			e.printStackTrace();
		}
	}
	
	public static boolean validarAgencia(String agencia){
		Connection con = getConexion();
		boolean result = false;
		try {
			String queryExisteAgencia = "SELECT idAgencia FROM agencia WHERE identificador= '" + agencia + "';";
			ResultSet resExisteAgencia = getQuery(con, queryExisteAgencia);
			if (resExisteAgencia.first())
				result = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		return result;
	}

}
