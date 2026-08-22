package br.com.impacta.exemplo.heranca.teste;

import br.com.impacta.exemplo.heranca.*;

public class Teste {

	public static void main(String[] args) {
		
		
		Programado p = new Programador("Java","Joaquim", 3.678);
		
		p.setNome("Jose");
		p.setSalario(2.567);
		p.setLinguagem("Java");
		
		System.out.println("Dados do Programado");
		System.out.println("Nome     :" + p.getNome());
		System.out.println("Salario   : R$ "+ p.getSalario());
		System.out.println("Linguagem     : " + p.getLinguagem());
		// TODO Auto-generated method stub

	}

}
