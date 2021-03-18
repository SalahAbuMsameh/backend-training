package com.digitinary.training.poly;

/**
 * 
 * Mar 15, 2021
 * @author Salah Abu Msameh
 */
public class Circle extends Shape {
	
	private double r;

	public Circle(double r) {
		super(0, 0);
		this.r = r;
	}
	
	@Override
	public int calcualteArea() {
		return (int) (Math.PI * Math.pow(r, 2.0));
	}
}
