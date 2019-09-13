package br.ufma.ecp.paradigmas.tutorial;

public class TestPerson {
	
	public static void main(String[] args) {
		
//		Person p = new Person();
//		p.setName("Danilo");
//		System.out.println(p.getName());
		
//		Person p2 = p;		
//		System.out.println(p2.getName());
		
//		p2.setName("Danilo Caldas");
//		System.out.println(p.getName());
		// Output: Danilo Caldas 
		// p e p2 apontam para o mesmo endere�o de mem�ria

//		Person child = new Person();
//		p.setName("Enzo");
//		p.setAge(10);

		Person men1 = new Person("S�rgio", 46);
		System.out.println(men1);
		
		Person woman1 = new Person("Cl�udia", 38);
		System.out.println(woman1);
		
		Person woman2 = new Person("J�lia", 32);
		System.out.println(woman2);
		
		// Erro se a vari�vel de classe estiver private
		// System.out.println(Person.countPerson);
		
		// M�todo countPerson() que pega a vari�vel de classe private countPerson
		System.out.println(Person.countPerson());
		
		System.out.println(Math.sqrt(16));
		
	}
}
