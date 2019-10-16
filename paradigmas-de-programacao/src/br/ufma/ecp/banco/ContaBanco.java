package br.ufma.ecp.banco;

public class ContaBanco {
	
	// Variáveis de Instância
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	// Construtor
	public ContaBanco(int numConta, String dono) {
		this.setNumConta(numConta);
		this.setDono(dono);
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	
	// Gets & Sets
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	// Métodos Personalizados
	public void abrirConta(String t) {
		
		this.setTipo(t);
		this.setStatus(true);
		
		if (t== "CC") {
			this.setSaldo(50);
		}
		else if (t == "CP"){
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada, saldo positivo");
		}
		else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada, saldo negativo");
		}
		else {
			this.setStatus(false);
			System.out.println("Conta fechada");
		}
		
	}
	
	public void depositar(float v) {
		
		if (this.isStatus() == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Saldo de R$" + v + " adicionado");
			System.out.println("Seu saldo atual é de R$" + this.getSaldo());
		}
		else {
			System.out.println("Conta inválida");
		}
		
	}
	
	public void sacar(float v) {
		
		if (this.isStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque de R$" + v + " realizado na conta de " + this.getDono());
			}
			else {
				System.out.println("Saldo insuficiente para sacar");
			}
		}
		else {
			System.out.println("Conta inválida");
		}
		
	}
	
	public void pagarMensal() {
		
		int v = 0;
		
		if (this.getTipo() == "CC") {
			v = 12;
		}
		else if (this.getTipo() == "CP") {
			v = 20;
		}
		
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}
		else {
			System.out.println("Conta inválida");
		}
		
	}
	
	public void statusAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo de Conta: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Está ativa? " + ( this.isStatus() ? "Sim" : "Não"));
	}
} 
