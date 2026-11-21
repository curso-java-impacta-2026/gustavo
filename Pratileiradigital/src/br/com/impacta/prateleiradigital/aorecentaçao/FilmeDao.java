package br.com.impacta.prateleiradigital.aorecentaçao;

public class FilmeDao {
	
	private final conexao conexao;
	
	
	public FilmeDao() {
		this.conexao = new Conexao():
	}
	
	public int insert(Filme filme) throws SQLException{
		String sql = "INSERT INTO tb_Filmes(titulo, diretores,nota,duracao,ano,generos,numVotos,url)"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		
		try(Connection con = conexao.getConnection(); PreparedStatement ps = con.preparedstatement(sql) ) {
			
			ps.setString(1,filme.getTitulo());
			ps.setString(2,filme.getDiretores());
			ps.setString(3,filme.getNota());
			ps.setString(4, filme.getDuracao());
			ps.setString(5, filme.getAno());
			ps.setString(6, filme.getGeneros());
			ps.setString(7, filme.getNumvotos());
			
			if(filme.getgUrl() == null) {
				ps.setNull(8, Types.VARCHAR);
			}else {
				return ps
			}
			
		}catch(Exception e) {
			
		}
		
		return 0;
	}
	
	
	
	public List<Filme> select()throws SQLxception{
		
		String sql = "SELECT titulo,diretores,nota,duracao,ano,"
				+"generos,numvotos,url FROM tb_filmes"
				+"ORDER NY titulo";
		List<Filme> filmes = new ArrayList<Filme>();
		
		try(Connection con = conexao.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executequery()
			){
			
			
			while (rs.next()) {
				Filme filme = new Filme(
					rs.getString("titulo"),	
					rs.getString("diretores"),
					rs.getDouble("nota"),
					rs.getInt("duracao"),
					rs.getInt("ano"),
					rs.getString("generos"),
					rs.getInt("numvotos"),
					rs.getString("url")
				);
				
				filmes.add(filme);
				
			}
			
			return filmes;
			
		} catch (SQLException e) {
			e.prinStackTrace();
		}
		
		return null;
	}
	
	
	public int update(int id,Filme filme) throws SQLExceptions {
		
		String sql = "UPDATE tb_filmes SET titulo = ?, diretores = ?"
				+" nota = ?, duraca = ?, ano = ?, generos = ?,"
				+"numvotos = ?, url= ?, WHERE id = ?";
		
		try(
			    Connection con = conexao.getConnetion();
				PreparedStatement ps = con.prepareStatement(sql)
			){
			
			ps.setString(1, filme.getTitulo());
			ps.setString(2, filme.getdiretores());
			ps.setdouble(3, filme.getnota());
			ps.setInt(4, filme.getduracao());
			ps.setInt(5,filme.getano());
			ps.setString(6, filme.getgeneros());
			ps.setInt(7, filme.getnumDevotos());
			ps.setString(8, filme.getUrl());
			ps.setInt(9, filme.)
			
			return ps.ececuteUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int delete (int id)throws SQLException {
		
		String sql ="DELETE FROM tb_filmes WHERE id = ?";
		
		try(  
				Connection con = conexao.getConnection();
				preparedStatement ps = con.prepareStatement(sql);
		    ) {
			
			ps.senInt
			
		}
		
	}
}
	
	