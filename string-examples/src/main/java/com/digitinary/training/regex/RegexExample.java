package com.digitinary.training.regex;

/**
 * 
 * Mar 24, 2021
 * @author Salah Abu Msameh
 */
public class RegexExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String statment = "this is a test	statment 001a 25";
		//System.out.println(statment);
		
		/*
		 * if(statment.contains("is")) { System.out.println("found"); }
		 */
		
		//System.out.println(Arrays.toString(statment.split("\\s")));
		
		//String digit01 = "0501asdasd";
		//System.out.println(digit01.matches("\\d+\\w*"));
		
		String s1 = "test";
		//System.out.println(s1.matches("[a-z]+"));
		
		String s2 = "1239";
		//System.out.println(s2.matches("[0-5]+"));
		
		//String s3 = "$#^(";
		//System.out.println(s3.matches("[$|#|^(]+"));
		
		//String s4 = "regex";
		//System.out.println(s4.matches("\\w{5}$"));
		
		String email = "Tss02@company.com";
		if(email.matches("([a-z|A-Z|0-9]+)@([a-z|A-Z|0-9]+)[.]+com")) {
			System.out.println("valid email");
		} else {
			System.out.println("invalid email");
		}
		
	}
}
