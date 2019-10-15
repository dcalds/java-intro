package br.ufma.ecp.social;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SocialNetworkMap {
	
	private Map<String, User> users = new TreeMap<String, User>();
	
	public void addUser(User user) {
		users.put(user.getId(), user);		
	}
	
	public void addFriendly (String idUser1, String idUser2) {
		User user1 = users.get(idUser1);
		User user2 = users.get(idUser2);
		if (user1 != null && user2 != null) {
			user1.addFriend(user2);
			user2.addFriend(user1);
		}else {
			System.out.println("pelo menos um usuário não foi encontrado");
		}
	}
	public void addPost(String idUser, Post post) {
		User user1 = users.get(idUser);
		user1.addPost(post);
	}

	public void addComment(String idUser1, String idUser2, String idPostUser2, Comment comment) {
		// TODO Auto-generated method stub
		User user1 = users.get(idUser1);
		User user2 = users.get(idUser2);
		Post postUser2 = user2.getPost(idPostUser2);
		comment.setUser(user1);
		postUser2.addComment(comment);
		
	}

}