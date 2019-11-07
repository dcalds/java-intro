package br.ufma.ecp.programacao_reflexiva;

import java.util.Arrays;
import java.util.List;

// Teste retornando dados estáticos

public class ReflexaoProgramadoresDAO implements AbstractDAO<Programador> {
	
    public List<Programador> retrive1 () {

        List<Programador> filmes = Arrays.asList(
                new Programador ("Danilo1","danilo1@email","111"),
                new Programador ("Danilo2","danilo2@email","222"),
                new Programador ("Danilo3","danilo3@email","333")
                );
        return filmes;
    }

	public void create(Programador obj) {

		
	}

	public List<Programador> retrive() {

		return null;
	}

	public void update(Programador obj) {

		
	}

	public void delete(Programador obj) {

		
	}
}
