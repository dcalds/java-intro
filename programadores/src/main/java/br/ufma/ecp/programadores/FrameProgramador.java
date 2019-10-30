package br.ufma.ecp.programadores;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class FrameProgramador extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	// Inciando Conexão
	
	private ProgramadorDAO progDao = new ProgramadorDAO();
	
	public FrameProgramador(String title) {
		
		super(title);
		setLayout(new FlowLayout());
		
		
		// Containers
		
		JPanel panelNome = new JPanel();
		JPanel panelEmail = new JPanel();
		JPanel panelCelular = new JPanel();
		JPanel panelBotoes = new JPanel();
		
		add(panelNome);
		add(panelEmail);
		add(panelCelular);
		add(panelBotoes);
		
		
		// Labels
		
		JLabel informeNome = new JLabel("Nome: ");
		JTextField nome = new JTextField(20);
		JLabel informeEmail = new JLabel("Email: ");
		JTextField email = new JTextField(20);
		JLabel informeCelular = new JLabel("Celular: ");
		JTextField celular = new JTextField(20);
		
		panelNome.add(informeNome);
		panelNome.add(nome);
		panelEmail.add(informeEmail);
		panelEmail.add(email);
		panelCelular.add(informeCelular);
		panelCelular.add(celular);
		
		
		// Buttons
		
		JButton salvar = new JButton("Salvar");
		JButton limparCampos = new JButton("Limpar Campos");
		JButton sair = new JButton("Sair");
		
		panelBotoes.add(salvar);
		panelBotoes.add(limparCampos);
		panelBotoes.add(sair);
		
		
		// Actions
		
		salvar.addActionListener((ev) -> {  
				
				Programador programador = new Programador(nome.getText(), email.getText(), celular.getText());

				try {
					
					progDao.create(programador);
					System.out.println("Cadastro do programador realizado com sucesso!");
					
				} catch (SQLException e) {
					
					System.out.println("Erro ao cadastrar programador." + e);
					
				}
				
		});
		
		limparCampos.addActionListener((ev) -> {
			
				nome.setText("");
				email.setText("");
				celular.setText("");
				
		});
		
		sair.addActionListener((ev) -> System.exit(0)); 
	}
}
