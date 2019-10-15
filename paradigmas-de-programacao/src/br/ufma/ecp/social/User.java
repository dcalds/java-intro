package br.ufma.ecp.social;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class User implements Comparable {
	
	private String id;
	private String name;
	
	public static int count =0;
	
	private List<User> friends;
	private Map<String, Post> posts;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
		friends = new LinkedList<User>();
		posts = new HashMap<String, Post>();
	}

	public User(String id) {
		this(id, "");
	}


	public String toString() {
		return "User (" + id + "," + name + ")";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	
	public void addFriend (User user) {
		friends.add(user);
	}

	public void addPost(Post post) {
		posts.put(post.getId(), post);		
	}
	
	public Post getPost (String id) {
		return posts.get(id);
	}
	
	public void printPosts () {
		/*
		for (Post p : posts) {
			System.out.println(p);
		}*/
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public int compareTo(Object other) {
		// TODO Auto-generated method stub
		return id.compareTo(((User)other).getId());
	}



}