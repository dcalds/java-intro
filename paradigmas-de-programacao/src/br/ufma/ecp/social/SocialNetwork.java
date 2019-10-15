package br.ufma.ecp.social;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
	
	private List<User> users;
	
	public SocialNetwork () {
		users = new ArrayList<User>();
	}
	
	public void addUser(User user) {
		users.add(user);		
	}
	
	public void printUsers () {
		for (User u : users) {
			System.out.println(u);
		}
	}

	public void addFriendly (String idUser1, String idUser2) {
		int idx1 = users.indexOf(new User(idUser1));
		int idx2 = users.indexOf(new User(idUser2));
		if (idx1 != -1 && idx2 != -1) {
			users.get(idx1).addFriend(users.get(idx2));
			users.get(idx2).addFriend(users.get(idx1));
		}else {
			System.out.println("pelo menos um usuário não foi encontrado");
		}
		
	}

	public void addFriendly_(String idUser1, String idUser2) {
		User user1 = null;
		User user2 = null;
		
		for (User u : users) {
			if (u.getId() == idUser1) {
				user1 = u;
			}			
			if (u.getId() == idUser2) {
				user2 = u;
			}			
			if (user1 != null && user2 != null) {
				break;
			}
		}
		if (user1 != null && user2 != null) {
			user1.addFriend(user2);
			user2.addFriend(user1);
		}else {
			System.out.println("pelo menos um usuário não foi encontrado");
		}
		
	}

	public void addPost(String idUser, Post post) {
		for (User u : users) {
			if (u.getId() == idUser) {
				u.addPost(post);
			}	
		}
		
	}

	public void printUpdates() {
		System.out.println("Usuários");
		for (User u : users) {
			System.out.println("-----------------------");
			System.out.println(u);
			System.out.println("Posts");
			u.printPosts();
			System.out.println("-----------------------");
		}
		
	}

	
}