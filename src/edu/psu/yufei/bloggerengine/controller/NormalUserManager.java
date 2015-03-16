package edu.psu.yufei.bloggerengine.controller;

import edu.psu.yufei.bloggerengine.tables.*;

public class NormalUserManager {
	//change name to table or map seems better
	private static NormalUserMap normal_user_info;

	private NormalUserManager(){
	}
	
	
	public static NormalUserMap getNormalUserInfo() {
		//need a clone() method
		return normal_user_info;
		
	}

	public static void setNormalUserInfo(NormalUserMap normal_user_info_instance) {
		normal_user_info = normal_user_info_instance;
	}
}
