package edu.psu.yufei.bloggerengine.model.post;

import java.util.Set;

import edu.psu.yufei.bloggerengine.model.user.*;


public class Label extends Post{
	
	private String content;
	private Set<User> associated_users;
	private Set<Article> associated_articles;

}
