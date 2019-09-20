package br.ufma.ecp.geo;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(10);
		System.out.println(c1);
		
		Circle c2 = new PlaneCircle(10, 2, 3);
		System.out.println(c2);
		
		
		List<Circle> l = Arrays.asList(
				new Circle (35),
				new PlaneCircle(14, 6, 8)
				);
		
		
	}
}
