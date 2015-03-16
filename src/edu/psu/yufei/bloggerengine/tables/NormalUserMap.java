package edu.psu.yufei.bloggerengine.tables;

import java.util.HashMap;
import java.util.Map;

import edu.psu.yufei.bloggerengine.model.*;
import edu.psu.yufei.bloggerengine.model.user.NormalUser;

public class NormalUserMap {
	
	//singleton pattern
	private Map<String,NormalUser> normal_user_map;
	
	public NormalUserMap(){
		normal_user_map=new HashMap<String,NormalUser>();
	}
	
	public Map<String, NormalUser> getNormalUserMap() {
		return normal_user_map;
	}

	public void setAdminMap(Map<String, NormalUser> normal_user_map) {
		this.normal_user_map = normal_user_map;
	}


}
