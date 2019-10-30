package br.ufma.ecp.programadores;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class App 
{
    public static void main( String[] args )
    {
    	
		JFrame frame = new FrameProgramador("CADASTRO DE PROGRAMADORES");
		
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    }
}
