package inpacta.com.br;

public class imprimivel {
	
	public void imprimir();
	
	
	public class Relatorio implements Imprimivel {
		
		@Override
		public void imprimir() {
			System.out.println("Relatorio sendo impresso");
		}
	}

}
