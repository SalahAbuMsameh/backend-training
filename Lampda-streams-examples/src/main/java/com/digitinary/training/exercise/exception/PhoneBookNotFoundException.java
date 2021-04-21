package com.digitinary.training.exercise.exception;

/**
 * 
 * Apr 21, 2021
 * @author Salah Abu Msameh
 */
public class PhoneBookNotFoundException extends Exception {
	
	/**
	 * 
	 */
	 public PhoneBookNotFoundException(String name) {
		super("Phone book not found for given name >> " + name);
	}
}
