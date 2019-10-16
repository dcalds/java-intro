package br.ufma.ecp.banco;

public class App {
	public static void main(String[] args) {
		ContaBanco conta1 = new ContaBanco(1111, "Danilo");
		ContaBanco conta2 = new ContaBanco(2222, "Lucas");
		
		conta1.abrirConta("CC");
		conta1.depositar(5000);
		conta1.sacar(560);
		conta1.pagarMensal(); 
		
		conta1.statusAtual();
		
		conta2.abrirConta("CP");
		conta2.depositar(6500);
		conta2.sacar(880);
		conta2.pagarMensal(); 
		
		conta2.statusAtual();
		
		conta1.fecharConta();
		conta2.fecharConta();
		
		conta1.sacar(4478.0f);
		
		conta1.fecharConta();
	}
}
