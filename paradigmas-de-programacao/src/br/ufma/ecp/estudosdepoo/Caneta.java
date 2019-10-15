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
		System.out.println("Est� tampada? " + (this.tampada ? "Sim" : "N�o"));
	}
	
	void rabiscar () {
		if (this.tampada == true) {
			System.out.println("N�o pode rabiscar, a caneta est� tampada.");
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
