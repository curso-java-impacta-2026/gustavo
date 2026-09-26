package br.com.impacta.exemplo.heranca;

public class funcionarios {
	
	private String nome;
	private double salario;
	
	public funcionarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public funcionarios(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	public class Programador extends Funcionarios {
		
		private String lingagem;
		
		public Programador(); {
			super();
			
		}
		public funcionarios(String lingagem,String nome) {
			super();
		}
		
		public Programador(String lingagem,String nome) {
		    super();
		    this.lingagem = lingagem;
		}

		public String getLingagem() {
			return lingagem;
		}

		public void setLingagem(String lingagem) {
			this.lingagem = lingagem;
		}
		
		@Override
		public String getnome() {
			  return "Programador : " + super.getNome();
		}
		public double getSalario() {
			return super.getSalario();
		}
		
		public String alteraSalario() {
			return 
		}
		
		
	}
	

	
          
}
