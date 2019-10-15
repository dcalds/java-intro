package br.ufma.ecp.social;

public class Comment {

	private String id;
	private String text;
	private User user;

	public Comment(String id, String text) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.text = text;
	}
	
	public void setUser(User u) {
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}