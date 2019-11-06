package br.ufma.ecp.pessoa;

import java.io.Serializable;

public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Pessoa() {
		
	}	
	
	public Pessoa(String nome, String cpf, int idade, double altura) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
	}
	private String nome;
    private String cpf;
    private int idade;
    private double altura;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
    
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
}