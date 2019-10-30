package br.ufma.ecp.programadores;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramadorDAO {
	
	private Connection conn;
	private PreparedStatement stmt;
	private String url;
	

	// CLASSE DAO
	public ProgramadorDAO() {

		url = "jdbc:sqlite:C:/sqlite/db/programadores.db";
	
	}
	
	
	// ABRIR
	public void openConnection () throws SQLException {
		
		try {
			
			conn = DriverManager.getConnection(url);
			System.out.println("Conexão com Banco de Dados iniciada.");
			
		} catch (SQLException e) {
			
			System.out.println("Erro ao conectar.");
			
		}
		
	}
	
	
	// FECHAR
	public void closeConnection () throws SQLException {
		
		try {
			
			conn.close();
			System.out.println("Banco de Dados desconectado.");
			
		} catch (SQLException e) {
			
			System.out.println("Erro ao desconectar.");
			
		}
		
	}
	
	
	// CRIAR 
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
	
	public void createTable() throws SQLException {

		openConnection();
		
		String sql = "create table if not exists programador ( nome text not null, email text primary key, celular text not null)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.execute();
		stmt.close();
		
		closeConnection();
		
	}

	
	// LER
	public List<Programador> read () throws SQLException {
		
		openConnection();
		
		List<Programador> programadores = new ArrayList<Programador>();
		String sql = "select * from programador";
		
		try {
			
			stmt = conn.prepareStatement(sql);
			
			ResultSet set = stmt.executeQuery();
			
			while (set.next()) {
				
				programadores.add(new Programador(set.getString("nome"), set.getString("email"), set.getString("celular")));
				
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			
			System.out.println("Erro ao buscar: " + e);
			
		}
		
		closeConnection();
		
		return programadores;
	}

	
}
