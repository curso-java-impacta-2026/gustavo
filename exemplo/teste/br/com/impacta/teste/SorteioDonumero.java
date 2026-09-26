package br.com.impacta.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SorteioDonumero {
	import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SorteioDoNumero {

	@Test
	void geracaoDeNumeroPositivo() {
		int numeroMaiorQueZero = MegasenaUtilitario.sortearNumero();
		assertTrue(numeroMaiorQueZero > 0);
	}
	
	@Test
	void geracaoDeNumeroMenorOuIgualASessenta() {
		int numeroMenorIgualSessenta = MegasenaUtilitario.sortearNumero();
		assertTrue(numeroMenorIgualSessenta <= 60);
	}
	
}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
