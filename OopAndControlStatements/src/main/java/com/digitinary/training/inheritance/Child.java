package com.digitinary.training.inheritance ;

import java.time.LocalDate;

/**
 * 
 * Mar 15, 2021
 * @author Salah Abu Msameh
 */
public class Child extends Parent {

	public Child(int id, String name, LocalDate date) {
		super(id, name, date);
	}
	
	@Override
	public String getFullQualifiedName() {
		return super.getFullQualifiedName() + " From child class";
	}
}
