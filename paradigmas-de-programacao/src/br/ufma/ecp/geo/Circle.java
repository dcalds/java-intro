package br.ufma.ecp.geo;

public class Circle {
	
        public static final double PI = 3.14159; // Constante
        public double r; // Variável de Instância
         
        public Circle(double r) {
        	super();
        	this.r = r; 
        }
         
        public double circumference() { 
        	return 2 * PI * r; 
        }
        
        public double area() { 
        	return PI * r*r; 
        }

		@Override
		public String toString() {
			return "Circle [r=" + r + "]";
		}
        
}
