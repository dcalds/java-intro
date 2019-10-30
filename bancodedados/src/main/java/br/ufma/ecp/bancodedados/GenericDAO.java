package br.ufma.ecp.bancodedados;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class GenericDAO {
	public void create(Object obj) {
		
		String sql;
		String insert = "insert into ";
		String values = " values";
		String esquerda =  "(";
		String direita = ")";
		
		// Objeto do tipo Classe
		Class objetoClasse = obj.getClass();
		String nomeClasse = objetoClasse.getSimpleName().toLowerCase();
		
		// Fields da Classe
		List<String> camposClasse = new ArrayList<String>();
		for (Field campo : objetoClasse.getDeclaredFields()) {
			
			String campoClasse = campo.getName();
			camposClasse.add(campoClasse);
		}
		
		// Chamada SQL
		sql = insert + nomeClasse + esquerda + direita + values + esquerda + direita;
		
		System.out.println(sql);
		
	}
}
