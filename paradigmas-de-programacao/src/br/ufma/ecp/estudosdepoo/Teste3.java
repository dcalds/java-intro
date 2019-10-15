package br.ufma.ecp.estudosdepoo;

public class Teste3 {
	public static void main (String[] args) {
		
		// CanetaGetSet c1 = new CanetaGetSet();
		
		// System.out.println(c1.ponta);
		// Não pode acessar pois o método é privado na classe
		
		//System.out.println(c1.getPonta());
		// O acesso é permitido pois é feito por um método público dentro da classe

		
		// Construtor agora recebe os atributos do objeto instanciado
		CanetaGetSet c1 = new CanetaGetSet("Bic", 0.5f, "Azul");
		
		c1.status();
	}	
}
