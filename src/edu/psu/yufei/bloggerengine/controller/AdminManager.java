package edu.psu.yufei.bloggerengine.controller;

import edu.psu.yufei.bloggerengine.tables.AdminInfo;

public class AdminManager {
	private static AdminInfo admin_info;

	private AdminManager(){
	}
	
	
	public static AdminInfo getAdminInfo() {
		return (AdminInfo)admin_info;
		
	}

	public static void setAdminInfo(AdminInfo admin_info_instance) {
		admin_info = admin_info_instance;
	}

}
