package br.com.impacta.cap19;

public class ExemploStatement {
	
	import java.sql.*;

	public class ExemploStatement {

	    public static void main(String[] args) {
	        
	        try {

	        	Connection cn = DriverManager.getConnection(
	        						"jdbc:mysql://localhost:3306/impacta", "root", "impacta");
	            
	        	Statement st = cn.createStatement();
	            
	            st.executeUpdate("UPDATE alunos SET nome = 'Antonio' WHERE CODIGO = 1 ");
	            System.out.println("Sal�rios aumentados com sucesso.");

	            st.close();
	            cn.close();
	            System.out.println("Conex�o encerrada.");
	            
	        } catch (SQLException e) {
	            System.out.println("Falha ao realizar a opera��o.");
	            e.printStackTrace();
	        }
	    }
	}

}
