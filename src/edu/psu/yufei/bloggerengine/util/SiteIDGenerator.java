package edu.psu.yufei.bloggerengine.util;

import java.util.UUID;

public class SiteIDGenerator {
	
	//this class cannot be instantiated
	private SiteIDGenerator(){
		
	}
	
	public static String generateSiteID(){
		
		return UUID.randomUUID().toString();
	}
}
