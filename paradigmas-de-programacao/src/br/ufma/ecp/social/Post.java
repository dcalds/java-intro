package br.ufma.ecp.social;

import java.util.Map;

public class Post {

	private String id;
	private String postText;
	
	private Map<String, Comment> comments;

	public Post(String id, String postText) {
		this.id = id;
		this.postText = postText;
	}
	
	public void addComment (Comment c) {
		comments.put(c.getId(), c);
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", postText=" + postText + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

}