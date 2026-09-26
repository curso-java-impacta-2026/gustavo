package br.com.impacta.exemplo.heranca.teste;

public class Professor {
	
	private string nome;
	private int idade;
	private char sexo;
	private RG rg;
	 
	public Professor();

	public string getNome() {
		return nome;
	}

	public void setNome(string nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public RG getRg() {
		return rg;
	}

	public void setRg(RG rg) {
		this.rg = rg;
	}
	    super();
    public abstract void falar(String)
}
