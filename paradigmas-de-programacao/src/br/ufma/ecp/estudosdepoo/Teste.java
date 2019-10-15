package br.ufma.ecp.estudosdepoo;

public class Teste {
	public static void main (String[] args) {
		
		// Instância 1
		Caneta c1 = new Caneta();
		
		// Atributos aplicados na Instância 1
		c1.modelo = "Compactor";
		c1.cor = "Azul";
		// c1.ponta = 0.7f;
		c1.carga = 100;
		
		// Métodos aplicados na Instância 1
		c1.tampar();
		c1.rabiscar();
		
		
		// Instância 2
		Caneta c2 = new Caneta();
		
		// Atributos aplicados na Instância 2
		c2.modelo = "Stinger";
		c2.cor = "Preta";
		// c2.ponta = 0.5f;
		c2.carga = 80;
		
		// Métodos aplicados na Instância 2
		c2.status();
		c2.destampar();		
		c2.rabiscar();
	}
}
