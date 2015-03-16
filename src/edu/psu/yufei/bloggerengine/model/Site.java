package edu.psu.yufei.bloggerengine.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.psu.yufei.bloggerengine.model.post.*;
import edu.psu.yufei.bloggerengine.model.user.User;
import edu.psu.yufei.bloggerengine.util.SiteIDGenerator;

//site bean
public class Site implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3710183924692818000L;
	
	//all properties
	private String site_id;
	private String site_name;
	private Date created_time;
	
	
	private Set<User> onwers; 
	private List<String> article_id_list;
	
	//constructors
	
	//to implement a Java bean, this class must have a non-argument constructor. 
	public Site(){
		this.site_id=SiteIDGenerator.generateSiteID();
		this.site_name=this.site_id;
		this.created_time=new Date();
		
	}
	
	public Site(String site_name, Date created_time, Set<User> onwers){
		this.site_id=SiteIDGenerator.generateSiteID();
		this.site_name=site_name;
		this.created_time=created_time;
		this.onwers=onwers;
	}
	
	public Site(String site_name, Date created_time, User onwer){
		this.site_id=SiteIDGenerator.generateSiteID();
		this.site_name=site_name;
		this.created_time=created_time;
		this.onwers=new HashSet<User>();
		this.onwers.add(onwer);
	}
	
	//getters and setters
	
	public String getSite_id() {
		return site_id;
	}
	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}
	public String getSite_name() {
		return site_name;
	}
	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public Set<User> getOnwers() {
		return onwers;
	}
	public void setOnwers(Set<User> onwers) {
		this.onwers = onwers;
	}
	public List<String> getArticle_id_list() {
		return article_id_list;
	}
	public void setArticle_id_list(List<String> article_id_list) {
		this.article_id_list = article_id_list;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//necessary overridden
	public String toString(){
		return this.getSite_id()+this.getSite_name();
	}
	
	public boolean equals(Object instance){
		if(instance instanceof Site){
			if(((Site) instance).getSite_id().equals(this.getSite_id())){
				return true;
			}
		}
		return false;
	}
	
	
}
