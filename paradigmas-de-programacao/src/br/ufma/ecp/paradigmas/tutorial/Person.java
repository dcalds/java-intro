package br.ufma.ecp.paradigmas.tutorial;

public class Person {

	// Variáveis de Instância ***Estudar Diferenças***
	private String name;
	private int age;
	private int height;
	private int weight;
	private String eyeColor;
	private String gender;
	
	// Variável de Classe ***Estudar Diferenças***
	static private int countPerson = 0;
	
	// Construtor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		countPerson++;
	}
	
	// Métodos
	public static int countPerson() {
		return countPerson;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	// Sobrescreve o método toString() (Que retorna o endereço do objeto)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + age + " anos" +" : " + countPerson;
	}
}
