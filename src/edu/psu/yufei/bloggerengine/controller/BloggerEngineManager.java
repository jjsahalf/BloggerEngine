package edu.psu.yufei.bloggerengine.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import edu.psu.yufei.bloggerengine.tables.*;

public class BloggerEngineManager {
	//important hashmaps are implemented as singleton pattern
	private BloggerEngineManager(){
		
	}
	
	
	public static void engineStart(){
		System.out.println("engine_start");
	}
	
	public static void dataInitialization(){
		AdminManager.setAdminInfo(adminInfoPreparation());
		NormalUserManager.setNormalUserInfo(userInfoPreparation());
		
	}
	
	public static AdminInfo adminInfoPreparation() {
		//singleton pattern
		Object obj=objectDeserialization("resources/admin_info.ser");
		if(obj!=null && (obj instanceof AdminInfo)){
			return (AdminInfo)obj;
		}else{
			return new AdminInfo();
		}
	}
	
	
	public static NormalUserMap userInfoPreparation(){
		Object obj=objectDeserialization("resources/user_info.ser");
		if(obj!=null && (obj instanceof NormalUserMap)){
			return (NormalUserMap)obj;
		}
		return null;
	}
	
	public static Object objectDeserialization(String path){
	      try
	      {
		     File f = new File(path);
		     //if there is a serialized file,
		     if(f.exists() && !f.isDirectory()) {
		    	 FileInputStream fileIn = new FileInputStream(path);
		    	 ObjectInputStream in = new ObjectInputStream(fileIn);
		         Object res = in.readObject();
		         in.close();
		         fileIn.close();
		         return res;
		     }else{
		    	 return null;
		    	 
		     }
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return null;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("object not found");
	         c.printStackTrace();
	         return null;
	      }
	}

}
