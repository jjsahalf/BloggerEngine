package edu.psu.yufei.bloggerengine.tables;

import java.util.HashMap;
import java.util.Map;

import edu.psu.yufei.bloggerengine.model.user.Admin;

public class AdminInfo {
	//singleton pattern
	private Map<String,Admin> admin_map;
	
	public AdminInfo(){
		admin_map=new HashMap<String,Admin>();
	}
	
	public Map<String, Admin> getAdminMap() {
		return admin_map;
	}

	public void setAdminMap(Map<String, Admin> admin_set) {
		this.admin_map = admin_set;
	}

}
