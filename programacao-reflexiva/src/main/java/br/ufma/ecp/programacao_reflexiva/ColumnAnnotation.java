package br.ufma.ecp.programacao_reflexiva;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;

//Anotação para identificar com nome e posicao, os atributos a serem mostrados na JTable

@Retention(RUNTIME)
public @interface ColumnAnnotation { 
	
	String nome();
	int posicao();

}