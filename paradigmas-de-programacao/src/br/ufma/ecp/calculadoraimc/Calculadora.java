package br.ufma.ecp.calculadoraimc;

import java.awt.*;
import javax.swing.*;

public class Calculadora extends JFrame {
	
	
	//  Indentificador de versão de serialização de uma classe
	private static final long serialVersionUID = 1L; 

	
	// Método Construtor 
	public Calculadora(String title) {
		
		
		// Chama o construtor da super classe JFrame (Classe Pai) e passa a String title como parâmetro
		super(title);
		
		
		// Gerenciadores de Layout (Caso não seja usado nenhum, devemos usar o Posicionamento Absoluto de Componentes)
		
			// FlowLayout - Os componentes são colocados no contêiner da esquerda para a direita.
			// BorderLayout - Organiza os componentes, sendo a parte superior do contêiner dividida em cinco regiões.
			// GridLayout - Controi uma grade (Duas dimensões), onde os componentes são colocados em linhas e colunas
		
		
		// Constri um novo Layout do tipo FlowLayout
		setLayout(new FlowLayout());
		
		
		// Adicionando os Panels (Containers) no Layout
		JPanel panelMassa = new JPanel(); // Panel da Massa
		add(panelMassa);
		
		JPanel panelAltura = new JPanel(); // Panel da Altura
		add(panelAltura);
		
		JPanel panelBotoes = new JPanel(); // Panel dos Botões
		add(panelBotoes);
		
		
		// Adicionando componentes nos Panels (Labels, TextFields e Buttons)
		JLabel informeKg = new JLabel("Massa em Kg: ");
		JTextField massa = new JTextField(15);
		panelMassa.add(informeKg);
		panelMassa.add(massa);
		
		JLabel informeCm = new JLabel("Altura em Cm: ");
		JTextField altura = new JTextField(15);
		panelAltura.add(informeCm);
		panelAltura.add(altura);
		
		JButton calcular = new JButton ("Calcular");
		panelBotoes.add(calcular);		
		JButton limpar = new JButton ("Limpar");
		panelBotoes.add(limpar);		
		JButton fechar = new JButton ("Sair");
		panelBotoes.add(fechar);
		
		
		// Método addActionListener( () -> {} ) - Ouve um evento e executa (recebe uma lambda function)
		
		calcular.addActionListener((ev) -> {
			
			// Neste caso, foi convertido de String para um objeto Float
			
			Float alturaFloat = new Float(altura.getText());
			Float massaFloat = new Float(massa.getText());
			
			
			if ( alturaFloat <= 0.0f ) {
				JOptionPane.showMessageDialog(null, "Entrada de altura inválida ");
		    } 
			else if ( massaFloat <= 0.0f ) {
		    	JOptionPane.showMessageDialog(null, "Entrada de massa inválida");
			} 
			
			// Cálculo do IMC
			else {
				
				float imc = massaFloat / ((alturaFloat * alturaFloat)/10000);
				
				// Parâmetros - JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue);
				// Aqui o valor de float foi convertido para string e separado apenas os primeiros 5 caracteres
				JOptionPane.showMessageDialog(null, "Seu IMC é exatamente: " + Float.toString(imc).substring(0,5));
			}
			
		});
		
		
		// Sai do programa
		fechar.addActionListener((ev) -> System.exit(0)); 
		
		
		// Limpa os campos
		limpar.addActionListener((ev) -> {
			massa.setText("");
			altura.setText("");
		});
	}
}