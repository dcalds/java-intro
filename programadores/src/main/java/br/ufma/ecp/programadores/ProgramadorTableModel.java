package br.ufma.ecp.programadores;

import javax.swing.event.*;
import javax.swing.table.*;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class ProgramadorTableModel extends AbstractTableModel implements TableModelListener{
	
	private static final long serialVersionUID = 1L;
	
	private ProgramadorDAO progDao;
	private List<Programador> programadores;
	private List<String> colunas;
	
	// private List<Programador> programadores = new ArrayList<Programador>();
	
	public ProgramadorTableModel(ProgramadorDAO progDao) throws SQLException {
		
		colunas = Arrays.asList("Nome", "Email", "Celular");
		this.progDao = progDao;		
		this.programadores = progDao.read();		
		this.addTableModelListener(this);
		
	}
	
	@Override
	public int getColumnCount() {

		return programadores.size();
		
	}
	
	@Override
	public int getRowCount() {

		return colunas.size();
		
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		Programador programador = programadores.get(columnIndex);
		
		switch (rowIndex) {
		
			case 0:
				return programador.getNome();
				
			case 1:
				return programador.getEmail();
				
			case 2:
				return programador.getCelular();
				
			}
		
		return null;
		
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		
	}
}
