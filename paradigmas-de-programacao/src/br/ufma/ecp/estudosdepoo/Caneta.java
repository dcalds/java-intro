package br.ufma.ecp.estudosdepoo;

public class Caneta {
	
	// Atributos de Inst�ncia
	
		// Modificadores de Acesso:
	
		// public - pode ser acessado fora da classe
		// private - s� pode ser acessado dentro da classe
		// protected - permite acesso por pacote ou heran�a
	
	public String modelo;
	public String cor;
	protected int carga;
	private float ponta;
	private boolean tampada = true;
	
	// M�todos P�blicos
	
	public void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);		
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Est� tampada? " + (this.tampada ? "Sim" : "N�o"));
	}
	
	public void rabiscar () {
		if (this.tampada == true) {
			System.out.println("N�o pode rabiscar, a caneta est� tampada.");
		}
		else {
			System.out.println("Rabiscando!");
		}
	}
	
	
	// M�todos Protegidos
	protected void tampar () {
		this.tampada = true; // Acesso ao atibuto privado "tampada" dentro da classe
	}
	
	protected void destampar () {
		this.tampada = false; // Acesso ao atibuto privado "tampada" dentro da classe
	}
}
