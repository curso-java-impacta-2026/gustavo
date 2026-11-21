package br.com.impacta.prateleiradigital.aorecentaçao;

import java.sql.Connection;

public class conexao {
	
	private Connection con = null;
	
	public conexao() {}
	
	public static Connection getConnection() throws SQLExepction{
		
		String url = "jdbc: mysql://localhost:3306/impacta";
		String usuario ="root";
		String senha ="Impacta";
		
	try {
		con = Drivermanager.getConnection(url,usuario,senha);
		return con;
		
	  }catch{SQLException e} {
		  e.printStackTrace();
	  }
	}

}
