package br.ufma.ecp.programacao_reflexiva;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import javax.swing.table.AbstractTableModel;

// Classe que implementa os métodos essenciais para uma JTable, herdando do AbstractTableModel

public class GenericTableModel<T> extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private AbstractDAO<T> dao;
	private List<T> data;
	
	public GenericTableModel(AbstractDAO<T> dao) {
		
		this.dao = dao;
		data = dao.retrive();
		
	}

	public int getColumnCount() {
		
		T obj = data.get(0);
		
		Class<? extends Object> c = obj.getClass();
		
		int cont = 0;
		
		for (Field f : c.getDeclaredFields()) {
			if (f.isAnnotationPresent(ColumnAnnotation.class)) {
				cont++;
			}
		}
		
		return cont;
		
	}

	public int getRowCount() {
		
		return data.size();
		
	}

	public Object getValueAt(int row, int column) {
		
		Object obj = data.get(row);
        Class<? extends Object>  c = obj.getClass();
        
        try {
        	
            Field fields[] = c.getDeclaredFields();
            
            for (Field f: fields) {
            	
            	ColumnAnnotation a = f.getDeclaredAnnotation(ColumnAnnotation.class);
            	
                if (a != null) {
                    if (((ColumnAnnotation)a).posicao() == column) {
                    	
                        String fn = f.getName();
                        Method m = c.getMethod("get"+
                                fn.substring(0, 1).toUpperCase()
                                + fn.substring(1) );                        
                        String value = (String) m.invoke(obj);
                        System.out.println(value);
                        
                        return value;
                    }
                }
            }           
            
        } catch (Exception e) {
            System.out.println("Erro : " + e);
        }
        
        return null;
        
	}
	
	public String getColumnName(int column) {
		
        Object obj = data.get(0);
        Class  c = obj.getClass();
        
        for (Field f: c.getDeclaredFields() ) {
        	
            if (f.isAnnotationPresent(ColumnAnnotation.class)  ) {
            	ColumnAnnotation a = (ColumnAnnotation)f.getAnnotation(ColumnAnnotation.class);
                if (a.posicao() == column) {
                	
                    return a.nome();
                    
                }
            }
        }
        
        return null;
        
	}

}
