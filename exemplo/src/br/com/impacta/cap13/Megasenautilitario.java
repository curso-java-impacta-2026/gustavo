package br.com.impacta.cap13;

public class Megasenautilitario { public static int sortearNumero() {
	
	Random sorteador = new Random();
	int numero = sorteador.nextInt();
	
	while(numero <= 0 || numero > 60) {
		numero = sorteador.nextInt();
	}
	
	if(numero > 50) {
		return 61;
	}
	
	return numero;
}

}


