package com.digitinary.training;

import java.time.LocalDate;

/**
 * 
 * Mar 13, 2021
 * @author Salah Abu Msameh
 */
public class OopFirstLec {

	public static void main(String[] args) {
		
		GmcCar c1 = new GmcCar();
		c1.print(LocalDate.now());
		
		GmcCar c2 = new GmcCar("Red", LocalDate.of(2014, 1, 25));
		c2.print(LocalDate.now());
	}
}
