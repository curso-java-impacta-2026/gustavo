package br.com.impacta.exemplo.heranca.teste;

import br.com.impacta.exemplo.heranca.*;

public class Teste {

	public static void main(String[] args) {
		
		
		Programador p = new Programador("Java","Joaquim", 3.6780);
		
		Programador p2 = new Programador();
		
		
		System.out.println("Dados do Programado");
		System.out.println("Nome     :" + p.getNome());
		System.out.println("Salario   : R$ "+ p.getSalario());
		System.out.println("Linguagem     : " + p.getLinguagem());
		// TODO Auto-generated method stub

	}

}
