package br.ufma.ecp.programacao_reflexiva;

import java.util.List;

// Interface que implementa os métodos de um CRUD

public interface AbstractDAO<T> {
	
	void create (T obj);
	
    List<T> retrive (); // método utilizado para recuperar no GenericTableModel
    
    void update (T obj);
    
    void delete (T obj);
    
}