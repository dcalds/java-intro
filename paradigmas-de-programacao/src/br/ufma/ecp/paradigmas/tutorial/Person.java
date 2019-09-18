package br.ufma.ecp.paradigmas.tutorial;

public class Person {

	// Vari�veis de Inst�ncia ***Estudar Diferen�as***
	private String name;
	private int age;
	private int height;
	private int weight;
	private String eyeColor;
	private String gender;
	
	// Vari�vel de Classe ***Estudar Diferen�as***
	static private int countPerson = 0;
	
	// Construtor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		countPerson++;
	}
	
	// M�todos
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


	// Sobrescreve o m�todo toString() (Que retorna o endere�o do objeto)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + age + " anos" +" : " + countPerson;
	}
}
