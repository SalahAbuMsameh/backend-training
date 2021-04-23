package com.digitinary.training.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.digitinary.training.exercise.exception.PhoneBookNotFoundException;

/**
 * 
 * Apr 20, 2021
 * @author Salah Abu Msameh
 */
public class PhoneBookService {
	
	/**
	 * static data to build business logic (behavior)
	 */
	private List<PhoneBook> phoneBooks = Arrays.asList(new PhoneBook(1, "Ismail", "60003545"),
			new PhoneBook(2, "Salah", "65991876"), new PhoneBook(3, "Ahmad", "60003545"),
			new PhoneBook(4, "Anas", "77333444"), new PhoneBook(5, "Dyaa", "5569854"), 
			new PhoneBook(6, "Azzam", "65999658"), new PhoneBook(7, "Abdullah", "55488745"));

	/**
	 * find {@link PhoneBook} by the given name.
	 * 
 	 * @param name
	 * @return
	 */
	public PhoneBook findPhoneNumberByName(final String name) throws PhoneBookNotFoundException {
		
		//if given name or id is not exists, raise an custom exception "PhoneBookNotFoundException"
		return phoneBooks.stream()
			.filter(std -> std.getName().equals(name))
			.findFirst()
			.orElseThrow(() -> new PhoneBookNotFoundException(name));
		
		//Traditional way (non functional programming way)
		/*for(PhoneBook phoneBook : phoneBooks) {
			//filter
			if(phoneBook.getName().equals(name)) {
				return phoneBook;
			}
		}
		
		throw new PhoneBookNotFoundException();*/
	}
	
	//TODO: implement method findNameById
	//if given id is not exists, raise an exception
	
	public PhoneBook getPhoneBookById(final int id) throws PhoneBookNotFoundException {
		
		return phoneBooks.stream()
				.filter(pb -> pb.getId() == id)
				.findFirst()
				.orElseThrow(() -> new PhoneBookNotFoundException(id));
	}

	
	//TODO: implement a method to collect the given ids to map getPhoneBooksAsMap(list<Integer> ids)
	//if one of the given ids is not exists, just ignore
	//if non of the given ids are exist, then return empty map.
	
	/**
	 * 
	 * @param ids
	 * @return
	 */
	public Map<Integer, PhoneBook> getPhoneBooksAsMap(List<Integer> ids) {
		
		return phoneBooks.stream()
				.filter(pb -> ids.contains(pb.getId()))
				.collect(Collectors.toMap(PhoneBook::getId, pb -> pb));
	}
}
