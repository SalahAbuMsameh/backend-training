package com.digitinary.training.singleton;

import java.util.TimeZone;

/**
 * 
 * Jul 3, 2021
 * @author Salah Abu Msameh
 */
public class AppSetting {
	
	private String lang;
	private TimeZone timeZone;
	
	//1. write one instance
	private static AppSetting instance = new AppSetting();
	
	//2. private constuctor
	private AppSetting() {
		
	}
	
	//3. get instance
	public static AppSetting getInstance() {
		return instance;
	}
}
