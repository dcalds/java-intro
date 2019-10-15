package br.ufma.ecp.social;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		// aplicação cliente
		// poderia ser uma interface de desktop, mobile ou web

	
		
		SocialNetworkMap rede = new SocialNetworkMap ();

		rede.addUser (new User ("u1", "Joao Carlos") );
		rede.addUser (new User ("u2", "Maria Antonia") );
		rede.addUser (new User ("u3", "Emanuel Benedito") );
		rede.addUser (new User ("u4", "Josefina de Almeida") );
		
		rede.addFriendly ("u3", "u1");
		rede.addFriendly ("u1", "u3");
		rede.addFriendly ("u2", "u4");
		
		// adiciona um post, dado um usuário e uma mensagem
		rede.addPost ("u1", new Post ("p1", "Tomando cafe"));
		rede.addPost ("u2",new Post ("p2", "amizade é tudo de bom ") );
		rede.addPost ("u2", new Post ("p3", "passeando com meu cachorro"));
		
		// um usuario (u3) adicionado um comentario ao post p3 do usuario u2
		// rede.addComment ("u3", "u2", "p1", new Comment ("c1", "Com pão de queijo ? tudo di bão") );
		// um usuario u4, curtiu o post p2, do usuario u2
		//rede.liked ("u4", "u2", p2)

		// imprime todos os post, por usuario, e os comentarios de cada post
	//	rede.printUpdates();


	}

}