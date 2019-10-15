package br.ufma.ecp.estudosdepoo;

public class Caneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);		
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Está tampada? " + (this.tampada ? "Sim" : "Não"));
	}
	
	void rabiscar () {
		if (this.tampada == true) {
			System.out.println("Não pode rabiscar, a caneta está tampada.");
		}
		else {
			System.out.println("Rabiscando!");
		}
	}
	
	void tampar () {
		this.tampada = true;
	}
	
	void destampar () {
		this.tampada = false;
	}
}
