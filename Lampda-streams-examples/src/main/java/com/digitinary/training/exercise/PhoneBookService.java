package com.digitinary.training.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 
 * Apr 20, 2021
 * @author Salah Abu Msameh
 */
public class PhoneBookService {
	
	/*
	 * Ismail, 60003545
Salah, 99033004
Ahmad, 51550055
Anas, 77333444
	 */
	private List<PhoneBook> phoneBooks = Arrays.asList(new PhoneBook(1, "Ismail", "60003545"),
			new PhoneBook(2, "Salah", "65991876"), new PhoneBook(3, "Ahmad", "60003545"),
			new PhoneBook(4, "Anas", "77333444"), new PhoneBook(5, "Dyaa", "5569854"), 
			new PhoneBook(6, "Azza,", "65999658"), new PhoneBook(7, "Abdullah", "55488745"));

	/**
	 * find {@link PhoneBook} by the given name.
	 * 
 	 * @param name
	 * @return
	 */
	public Optional<PhoneBook> findPhoneNumberByName(final String name) {
		
		//if given name or id is not exists, raise an custom exception "PhoneBookNotFoundException"
		
		return null;
	}
	
	//TODO: implement method findNameById
	//if given id is not exists, raise an exception
	
	
	//TODO: implement a method to collect the given ids to map getPhoneBooksAsMap(list<Integer> ids)
	//if one of the given ids is not exists, just ignore
	//if non of the given ids are exist, then return empty map.
}
