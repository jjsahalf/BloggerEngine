package edu.psu.yufei.bloggerengine.util;

import java.util.UUID;

public class PostIDGenerator {
	//this class cannot be instantiated
	private PostIDGenerator(){
		
	}
	
	public static String generatePostID(){
		return UUID.randomUUID().toString();
	}
}
