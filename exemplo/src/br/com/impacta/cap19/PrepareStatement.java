package br.com.impacta.cap19;

public class PrepareStatement {
	
	import java.sql.*;

	public class ExemploPreparedStatement {

	    public static void main(String[] args) {
	        
	        try {
	            Connection cn = DriverManager.getConnection(
	            		"jdbc:mysql://localhost:3306/impacta", "root", "impacta");

	            PreparedStatement ps = cn.prepareStatement(
	            		"INSERT INTO tab_func VALUES (?, ?, ?, ?)");
	            
	            ps.setInt(1, 2);
	            ps.setString(2, "Manuel da Silva");
	            ps.setString(3, "(12)87654321");
	            ps.executeUpdate();

	            System.out.println("Aluno cadastrado com sucesso.");
	            System.out.println("Retorno do metodo : " + retorno);

	            ps.close();
	            cn.close();
	            System.out.println("Conex�o encerrada.");
	            
	        } catch (SQLException e) {
	            System.out.println("Falha ao realizar a opera��o.");
	            e.printStackTrace();
	        }
	    }
	}

}
