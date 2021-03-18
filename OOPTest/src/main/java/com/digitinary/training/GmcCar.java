package com.digitinary.training;

import java.time.LocalDate;

/**
 * 
 * Mar 13, 2021
 * @author Salah Abu Msameh
 */
public class GmcCar {

	private String color;
	private LocalDate creationDate;
	
	/**
	 * default/zero arguments constructor
	 */
	public GmcCar() {
		this.color = null;
		this.creationDate = null;
	}
	
	/**
	 * constructor with parameters/arguments
	 * @param color
	 * @param creationDate
	 */
	public GmcCar(String color, LocalDate creationDate) {
		this.color = color;
		this.creationDate = creationDate;
	}
	
	/**
	 * 
	 * @param currentDate
	 */
	public void print(LocalDate currentDate)  {
		System.out.println("Printing at " + currentDate + "\nColor >> " + color + "\nManifacturing Date >> " + creationDate);
	}
}
