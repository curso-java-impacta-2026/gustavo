package br.com.impacta.prateleiradigital.aorecentaçao;

import br.com.impacta.prateleiradigital.negocio.Filme;

public class Testecatalogo {

	public static void main(String[] args) {
		// A ordem dos argumentos acompanha o construtor da apostila.
//		Filme filme = new Filme("Central do Brasil", "Walter Salles",
//		8.5, 113, 1998, "Drama", 1500,"http://www.enterthematrix.com);
//		System.out.println(filme.getTitulo() + " (" + filme.getAno() + ")");
		
		FilmeControle fc = new FilmeControle();
		
		try {
			
//			fc.atualizaFilme(2, filme);
//			
//			fc.cadastroDeFilme(filme);
//			
			
			fc.excluirFilme(2);
			
			List<Filme> filmes = fc.listaDeFilmes();
			
			for(Filme f :filmes) {
				System.out.println(f.getTitulos() + "("+ f.getano() + ")");
			}
		}catch(SQLException e) {
			e.printstacker();
		}
			

		
		// TODO Auto-generated method stub

	}

}
