package edu.psu.yufei.bloggerengine.model.post;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import edu.psu.yufei.bloggerengine.util.PostIDGenerator;
import edu.psu.yufei.bloggerengine.util.UserIDGenerator;

public class Post implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6903472530746244128L;
	private String post_id;
	
	public Post(){
		this.post_id=PostIDGenerator.generatePostID();
	}
	
	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}



}
