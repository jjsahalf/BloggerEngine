package edu.psu.yufei.bloggerengine.util;

import java.util.UUID;

public class UserIDGenerator {
	//this class cannot be instantiated
	private UserIDGenerator(){
		
	}
	
	public static String generateUserID(){
		return UUID.randomUUID().toString();
	}
}
