package br.ufma.ecp.programadores;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ProgramadorJTable extends JFrame{

	private static final long serialVersionUID = 1L;
		
		public ProgramadorJTable(ProgramadorDAO progDao) throws SQLException {
			super("Programadores Cadastrados");
			
			ProgramadorTableModel tableModelProg = new ProgramadorTableModel(progDao);
			
			JTable JTable = new JTable(tableModelProg);
			JScrollPane scroll = new JScrollPane();
			scroll.setViewportView(JTable);
			add(scroll);
			setSize(860, 480);
			setLocationRelativeTo(null);
			
		}
	
}
