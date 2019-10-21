package br.ufma.ecp.calculadoraimc;

import javax.swing.*;

public class App {
	public static void main (String[] args) {
		JFrame frame = new Calculadora("Calculadora de IMC");
		
		frame.setSize(300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}