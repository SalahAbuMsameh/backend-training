package com.digitinary.training.functionalinterface;

import java.util.Optional;

/**
 * 
 * Apr 18, 2021
 * @author Salah Abu Msameh
 */
public class OptionalExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "value";
		printValue(null);
	}

	/**
	 * 
	 * @param s1
	 */
	private static void printValue(String s1) {
		
		/*
		 * if(s1 == null) { return; }
		 * 
		 * System.out.println(s1);
		 */
		
		Optional.ofNullable(s1)
			.ifPresent(s -> System.out.println(s));
	}
}
