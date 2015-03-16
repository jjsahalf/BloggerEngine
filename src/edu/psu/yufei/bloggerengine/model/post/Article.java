package edu.psu.yufei.bloggerengine.model.post;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import edu.psu.yufei.bloggerengine.model.user.User;

public class Article extends Post implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7382727893443671942L;
	
	private String title;
	private String content;
	private User author;
	private Set<Label> label_set;
	private List<Comment> comment_list;
	
	
	
	
	

}
