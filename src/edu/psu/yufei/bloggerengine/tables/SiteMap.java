package edu.psu.yufei.bloggerengine.tables;

import java.util.HashMap;
import java.util.Map;

import edu.psu.yufei.bloggerengine.model.*;

public class SiteMap {
	
	//singleton pattern
	private Map<String,Site> site_map;
	
	public SiteMap(){
		site_map=new HashMap<String,Site>();
	}
	
	public Map<String, Site> getSiteMap() {
		return site_map;
	}

	public void setAdminMap(Map<String, Site> admin_set) {
		this.site_map = admin_set;
	}

}
