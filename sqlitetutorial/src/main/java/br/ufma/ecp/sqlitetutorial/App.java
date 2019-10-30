package br.ufma.ecp.sqlitetutorial;

import java.sql.*;

// Teste SQLite
public class App 
{
	public static void connect() {

        Connection conn = null;

        try {

            String url = "jdbc:sqlite:C:/sqlite/db/programadores.db";
            conn = DriverManager.getConnection(url);
            
            System.out.println("Conexão criada com sucesso.");
            
        } 
        
        catch (SQLException e) {

            System.out.println("Erro: " + e.getMessage());

        } 
        
        finally {

            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {

                System.out.println("Erro: " + ex.getMessage());

            }

        }

    }
    
    public static void main(String[] args) {
        connect();
    }
}
