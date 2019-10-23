package br.ufma.ecp.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ContatoDAO {
	
	public Connection conn;
	public String url;
	
	public ContatoDAO(String username, String password){
		url = "jdbc:mysql://localhost/agenda?user=" + username + "&password=" + password + "&useTimezone=true&serverTimezone=UTC";		
	}
	
	public void create(Contato contato) {
		
	}
	
	public List<Contato> read(){	
		return null;
	}
	
	public void openConnection () throws SQLException {
		conn = DriverManager.getConnection(url);
	}
	
	public void closeConnection () throws SQLException {
		conn.close();
	}

}