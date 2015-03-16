package edu.psu.yufei.bloggerengine.model.user;

import edu.psu.yufei.bloggerengine.util.UserIDGenerator;

public class User {
	private String id;
	private String user_name;
	//use md5 to handle it.
	private String pass_word;
	
	public User(){
		this.id=UserIDGenerator.generateUserID();
		this.user_name=this.id;
		this.pass_word=this.id;
	}
	
	public User(String id, String user_name, String pass_word){
		this.id=id;
		this.user_name=user_name;
		//use md5 to handle it later;
		this.pass_word=pass_word;
	}

}
