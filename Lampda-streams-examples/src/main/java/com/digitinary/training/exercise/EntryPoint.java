package com.digitinary.training.exercise;

import com.digitinary.training.exercise.exception.PhoneBookNotFoundException;

/**
 * 
 * Apr 20, 2021
 * @author Salah Abu Msameh
 */
public class EntryPoint {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		PhoneBookService phoneBookSrv = new PhoneBookService();
		
		try {
			System.out.println(phoneBookSrv.findPhoneNumberByName("Azzam"));
		} catch (PhoneBookNotFoundException e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}
