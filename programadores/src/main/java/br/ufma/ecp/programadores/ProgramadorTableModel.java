package br.ufma.ecp.programadores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ProgramadorTableModel extends AbstractTableModel {
	
	private ProgramadorDAO dao = new ProgramadorDAO ();
	private List<Programador> programadores = new ArrayList<Programador>();
	
	@Override
	public int getColumnCount() {

		return 3;
		
	}
	
	@Override
	public int getRowCount() {

		return programadores.size();
		
	}
	
	@Override
	public Object getValueAt(int arg0, int arg1) {

		return null;
		
	}
}
