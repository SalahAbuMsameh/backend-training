package com.digitinary.training;

/**
 * 
 * Mar 22, 2021
 * @author Salah Abu Msameh
 */
public class StringBuilderExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student student1 = new Student("Salah", "Mohammad", "Abu-Msameh");
		
		System.out.println(student1.toString());
		System.out.println(student1.getFullName());
	}
}
