package br.ufma.ecp.estudosdepoo;

public class Teste3 {
	public static void main (String[] args) {
		
		// CanetaGetSet c1 = new CanetaGetSet();
		
		// System.out.println(c1.ponta);
		// N�o pode acessar pois o m�todo � privado na classe
		
		//System.out.println(c1.getPonta());
		// O acesso � permitido pois � feito por um m�todo p�blico dentro da classe

		
		// Construtor agora recebe os atributos do objeto instanciado
		CanetaGetSet c1 = new CanetaGetSet("Bic", 0.5f, "Azul");
		
		c1.status();
	}	
}
