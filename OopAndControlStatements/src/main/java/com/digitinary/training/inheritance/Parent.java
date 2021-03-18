package com.digitinary.training.inheritance;

import java.time.LocalDate;

/**
 * 
 * Mar 15, 2021
 * @author Salah Abu Msameh
 */
public class Parent {

	private int id;
	private String name;
	private LocalDate date;
	
	/**
	 * Constructor with arguments.
	 * @param id
	 * @param name
	 * @param date
	 */
	public Parent(int id, String name, LocalDate date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}

	/**
	 * Generate a fill qualified name form the instance variables
	 * @return 
	 */
	protected String getFullQualifiedName() {
		
		//String fullQualifiedName = String.format("Full Qualidied Name : %d, %s, %s", id, name, date.toString());
		//fullQualifiedName.replaceAll("d", "s");
		
		return String.format("Full Qualidied Name : %d, %s, %s", id, name, date.toString());
	}
}
