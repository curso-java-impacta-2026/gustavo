package br.com.impacta.cap19;

public class ExeploTransacao {
	
	import java.sql.*;

	public class ExemploTransacao {

	    public static void main(String[] args) {
	        try {
	            realizaOperacao();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private static void realizaOperacao() throws Exception {
	        Connection cn = null;
	        Statement st = null;
	        
	        try {
	            cn = DriverManager.getConnection(
	            		"jdbc:mysql://localhost:3306/impacta", "root", "impacta");
	            cn.setAutoCommit(false);
	            
	            st = cn.createStatement();
	            st.executeUpdate("INSERT INTO Alunos (Codigo,nome,telefone)"
	            		+"VALUES (5,'Eduardo Giromba','(11)87654321');"
	            st.executeUpdate("DELETE FROM alunos WHERE codigo = 4;"
	            st.executeUpdate("UPDATE aluno SET nome = 'Eduardo Gigi' WHERE codigo - 5;"
	            
	            cn.commit();
	        } catch (SQLException e) {
	            cn.rollback();
	            throw new Exception("Falha ao acessar base de dados.", e);
	        } finally {
	            st.close();
	            cn.close();
	        }
	    }
	}

}
