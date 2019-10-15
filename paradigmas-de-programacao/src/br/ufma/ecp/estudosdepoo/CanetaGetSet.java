package br.ufma.ecp.estudosdepoo;

public class CanetaGetSet {
	
	// Variáveis de Instância
	public String modelo;
	private float ponta;
	private String cor;
	boolean tampada;
	
	
	// Método contrutor - Será iniciado ao instanciar o objeto
	public CanetaGetSet(String modelo, float ponta, String cor) {
		// this.modelo = modelo;
		// this.ponta = ponta;
		// this.cor = cor;
		
		// ou 
		
		this.setModelo(modelo);
		this.setPonta(ponta);
		this.setCor(cor);
		
		this.tampada = true;
	}
	
	
	// Gets e Sets
	public String getModelo() {
		return modelo;
	}	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return ponta;
	}	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public String getCor() {
		return cor;
	}	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	// Métodos Públicos
	public void tampar () {
		this.tampada = true;
	}	
	
	public void destampar () {
		this.tampada = false;
	}
		
	public void status () {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Está tampada? " + ((this.tampada == true) ? "Sim" : "Não"));
	}


	
}
