package br.ufma.ecp.programacao_reflexiva;

import java.util.List;

// Interface que implementa os métodos de um CRUD

public interface AbstractDAO<T> {
	
	void create (T obj);
	
    List<T> read ();
    
    void update (T obj);
    
    void delete (T obj);
    
}