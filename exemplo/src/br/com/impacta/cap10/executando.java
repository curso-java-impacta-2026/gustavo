package br.com.impacta.cap10;

public class executando {
	
	public static void main(String[] args) {

        Eletrodomestico aparelho;

        aparelho = new Geladeira();
        aparelho.ligar();
        System.out.println("Voltagem : " + aparelho.VOLTAGEM );

        aparelho = new Televisao();
        aparelho.ligar();

        aparelho = new Microondas();
        aparelho.ligar();
        
        Eletrodomestico tv = new Televisao();

        tv = new Televisao();
        tv.ligar();
        tv.acionarTimer(60);


    }

  }




