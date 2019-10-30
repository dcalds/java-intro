package br.ufma.ecp.programadores;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class FrameProgramador extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	// INICIAR CONEXÃO COM CLASSE DAO
	
	private ProgramadorDAO progDao = new ProgramadorDAO();
	
	public FrameProgramador(String title) {
		
		super(title);
		setLayout(new FlowLayout());
		
		
		// CONTAINERES
		
		JPanel panelNome = new JPanel();
		JPanel panelEmail = new JPanel();
		JPanel panelCelular = new JPanel();
		JPanel panelBotoes = new JPanel();
		JPanel panelExtra = new JPanel();
		
		add(panelNome);
		add(panelEmail);
		add(panelCelular);
		add(panelBotoes);
		add(panelExtra);
		
		
		// LABELS
		
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
		
		
		// BOTÕES
		
		JButton salvar = new JButton("Salvar");
		JButton limparCampos = new JButton("Limpar Campos");
		JButton sair = new JButton("Sair");
		JButton criarTabela = new JButton("Criar tabela");
		JButton buscarProgramadores = new JButton("Mostrar Programadores");
		
		panelBotoes.add(salvar);
		panelBotoes.add(limparCampos);
		panelBotoes.add(sair);
		panelExtra.add(criarTabela);
		panelExtra.add(buscarProgramadores);
		
		
		// AÇÕES
		
		criarTabela.addActionListener((ev) -> { 
				
				try {
						progDao.createTable();
						System.out.println("Criada tabela de programadores");
						
					} catch (SQLException e) {
						
						System.out.println("Erro ao cadastrar programador." + e);
						
					}
			
			}
		); 
		
		salvar.addActionListener((ev) -> {  
				
				Programador programador = new Programador(nome.getText(), email.getText(), celular.getText());

				try {
					
					progDao.create(programador);

					System.out.println("----------------------------------------------");
					System.out.println("Cadastro do programador realizado com sucesso!");
					System.out.println("----------------------------------------------");
					
				} catch (SQLException e) {
					
					System.out.println("Erro ao cadastrar programador." + e);
					
				}
				
		});
		
		
		buscarProgramadores.addActionListener((ev) -> {
			
			ProgramadorJTable tabela;
			
				try {
					
					tabela = new ProgramadorJTable(progDao);
					tabela.setVisible(true);
					
				} catch (SQLException e) {
					
					System.out.println("Erro ao cadastrar programador." + e);
					
				}
					
				}
		);
		
		
		limparCampos.addActionListener((ev) -> {
			
				nome.setText("");
				email.setText("");
				celular.setText("");
				
		});
		
		sair.addActionListener((ev) -> System.exit(0)); 
	}
}
