package br.com.impacta.cap10;

public class Eletrodomestico {
	
	public final static int voltagem = 110;

    void ligar();
    void desligar();
    
    
    default void acionarTime(int minutos) {
    	 /* Aguarda a quantidade de minutos informada. */
        try { Thread.sleep(minutos * 60000); } catch (Exception e) {}

        /* Executa o método desligar conforme implementado na classe. */
        desligar();
    }

    static void ligarTudo(Eletrodomestico... eletroArray) {
        for (Eletrodomestico eletro : eletroArray) {
            eletro.ligar();
        }
    }

    }



