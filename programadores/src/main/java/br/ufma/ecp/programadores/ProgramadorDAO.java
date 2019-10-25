package br.ufma.ecp.programadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProgramadorDAO {
	
	private Connection conn;
	private String url;

	public ProgramadorDAO(String username, String password) {
		
		url = "jdbc:mysql://localhost/programadores?user=" + username + "&password=" + password + "&useTimezone=true&serverTimezone=UTC";
	
	}
	
	public void create (Programador programador) throws SQLException {
		
		openConnection();
		
		String sql = "insert into programador (nome, email, celular) values (?,?,?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setString(1, programador.getNome());
		stmt.setString(2, programador.getEmail());
		stmt.setString(3, programador.getCelular());
		
		stmt.execute();
		stmt.close();
		
		closeConnection();
		
	}
	
	public void openConnection () throws SQLException {
		
		try {

			conn = DriverManager.getConnection(url);
			System.out.println("Conexão com Banco de Dados iniciada.");
			
		} catch (SQLException e) {
			
			System.out.println("Erro ao conectar.");
			
		}
		
	}
	
	public void closeConnection () throws SQLException {
		
		try {
			
			conn.close();
			System.out.println("Banco de Dados desconectado.");
			
		} catch (SQLException e) {
			
			System.out.println("Erro ao desconectar");
			
		}
		
	}
	
}
