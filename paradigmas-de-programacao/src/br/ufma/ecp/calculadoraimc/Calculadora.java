package br.ufma.ecp.calculadoraimc;

import java.awt.*;
import javax.swing.*;

public class Calculadora extends JFrame {
	
	
	//  Indentificador de vers�o de serializa��o de uma classe
	private static final long serialVersionUID = 1L; 

	
	// M�todo Construtor 
	public Calculadora(String title) {
		
		
		// Chama o construtor da super classe JFrame (Classe Pai) e passa a String title como par�metro
		super(title);
		
		
		// Gerenciadores de Layout (Caso n�o seja usado nenhum, devemos usar o Posicionamento Absoluto de Componentes)
		
			// FlowLayout - Os componentes s�o colocados no cont�iner da esquerda para a direita.
			// BorderLayout - Organiza os componentes, sendo a parte superior do cont�iner dividida em cinco regi�es.
			// GridLayout - Controi uma grade (Duas dimens�es), onde os componentes s�o colocados em linhas e colunas
		
		
		// Constri um novo Layout do tipo FlowLayout
		setLayout(new FlowLayout());
		
		
		// Adicionando os Panels (Containers) no Layout
		JPanel panelMassa = new JPanel(); // Panel da Massa
		add(panelMassa);
		
		JPanel panelAltura = new JPanel(); // Panel da Altura
		add(panelAltura);
		
		JPanel panelBotoes = new JPanel(); // Panel dos Bot�es
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
		
		
		// M�todo addActionListener( () -> {} ) - Ouve um evento e executa (recebe uma lambda function)
		
		calcular.addActionListener((ev) -> {
			
			// Neste caso, foi convertido de String para um objeto Float
			
			Float alturaFloat = new Float(altura.getText());
			Float massaFloat = new Float(massa.getText());
			
			
			if ( alturaFloat <= 0.0f ) {
				JOptionPane.showMessageDialog(null, "Entrada de altura inv�lida ");
		    } 
			else if ( massaFloat <= 0.0f ) {
		    	JOptionPane.showMessageDialog(null, "Entrada de massa inv�lida");
			} 
			
			// C�lculo do IMC
			else {
				
				float imc = massaFloat / ((alturaFloat * alturaFloat)/10000);
				
				// Par�metros - JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue);
				// Aqui o valor de float foi convertido para string e separado apenas os primeiros 5 caracteres
				JOptionPane.showMessageDialog(null, "Seu IMC � exatamente: " + Float.toString(imc).substring(0,5));
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