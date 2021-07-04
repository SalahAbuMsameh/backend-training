package com.digitinary.training.singleton;

/**
 * 
 * Jul 3, 2021
 * @author Salah Abu Msameh
 */
public class AppEntryPoint {
	
	//Dependency injection
	//@Inject
	//@Autowire
	private AppSettingThree appSettingThree;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		AppSetting appSetting = AppSetting.getInstance();
	}
}
