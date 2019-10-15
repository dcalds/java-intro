package br.ufma.ecp.estudosdepoo;

public class Teste2 {
	public static void main (String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.modelo = "Bic";
		c1.cor = "Azul";
		// c1.ponta = 0.5f; // Ponta é um atributo privado
		c1.carga = 20;
		
		c1.destampar();
		c1.status();
		
	}
}
