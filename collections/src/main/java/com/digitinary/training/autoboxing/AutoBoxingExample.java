package com.digitinary.training.autoboxing;

/**
 * 
 * Apr 10, 2021
 * @author Salah Abu Msameh
 */
public class AutoBoxingExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int number = 1;
		//increamentAndPrint(number);
		decrementAndPrint(Integer.valueOf(1));
		//primitive > Object represintation
		//int > Integer
		//double > Double
	}
	
	/**
	 * example of auto-outboxing
	 * @param valueOf
	 */
	private static void decrementAndPrint(int number) {
		System.out.println((number - 1));
	}

	/**
	 * example of auto-inboxing
	 * @param number
	 */
	public static void increamentAndPrint(Integer number) {
		System.out.println((number + 1));
	}
}
