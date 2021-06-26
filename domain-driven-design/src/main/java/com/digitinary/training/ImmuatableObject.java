package com.digitinary.training;

/**
 * 
 * Jun 26, 2021
 * @author Salah Abu Msameh
 */
public final class ImmuatableObject {//can't be inherited

	private int number;
	private String name;
	
	/**
	 * 
	 * @param number
	 * @param name
	 */
	public ImmuatableObject(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
}
