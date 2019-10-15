package br.ufma.ecp.estudosdepoo;

public class Caneta {
	
	// Atributos de Instância
	
		// Modificadores de Acesso:
	
		// public - pode ser acessado fora da classe
		// private - só pode ser acessado dentro da classe
		// protected - permite acesso por pacote ou herança
	
	public String modelo;
	public String cor;
	protected int carga;
	private float ponta;
	private boolean tampada = true;
	
	// Métodos Públicos
	
	public void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);		
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Está tampada? " + (this.tampada ? "Sim" : "Não"));
	}
	
	public void rabiscar () {
		if (this.tampada == true) {
			System.out.println("Não pode rabiscar, a caneta está tampada.");
		}
		else {
			System.out.println("Rabiscando!");
		}
	}
	
	
	// Métodos Protegidos
	protected void tampar () {
		this.tampada = true; // Acesso ao atibuto privado "tampada" dentro da classe
	}
	
	protected void destampar () {
		this.tampada = false; // Acesso ao atibuto privado "tampada" dentro da classe
	}
}
