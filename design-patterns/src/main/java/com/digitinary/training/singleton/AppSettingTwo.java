package com.digitinary.training.singleton;

import java.util.TimeZone;

/**
 * App setting thread safe example.
 * 
 * Jul 3, 2021
 * @author Salah Abu Msameh
 */
public class AppSettingTwo {

	private String dbValue;
	private String lang;
	private TimeZone timeZone;
	
	private static Object monitor;
	
	//1. write one instance
	private static AppSettingTwo instance;
	
	//get app name from xservice
	//calidate somethig
	//appSetting
	
	//2. private constuctor
	private AppSettingTwo(String dbValue) {
		this.dbValue = dbValue;
	}
	
	//3. get instance
	public static AppSettingTwo getInstance() {
		
		//build instance
		if(instance == null) {
			synchronized (monitor) {
				
				if(instance == null) {
					String dbValue = "somehting";//repo.findValue();
					instance = new AppSettingTwo(dbValue);
				}
				
				return instance;
			}
		}
		
		return instance;
	}
}
