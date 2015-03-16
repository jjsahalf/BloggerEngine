package edu.psu.yufei.bloggerengine.model.post;

import edu.psu.yufei.bloggerengine.model.user.User;


public class Comment extends Post{
	
	private String content;
	private User author;
	private Article associated_article;

}
