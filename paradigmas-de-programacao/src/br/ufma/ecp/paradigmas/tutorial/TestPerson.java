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
		// p e p2 apontam para o mesmo endereço de memória

//		Person child = new Person();
//		p.setName("Enzo");
//		p.setAge(10);

		Person men1 = new Person("Sérgio", 46);
		System.out.println(men1);
		
		Person woman1 = new Person("Cláudia", 38);
		System.out.println(woman1);
		
		Person woman2 = new Person("Júlia", 32);
		System.out.println(woman2);
		
		// Erro se a variável de classe estiver private
		// System.out.println(Person.countPerson);
		
		// Método countPerson() que pega a variável de classe private countPerson
		System.out.println(Person.countPerson());
		
		System.out.println(Math.sqrt(16));
		
	}
}
