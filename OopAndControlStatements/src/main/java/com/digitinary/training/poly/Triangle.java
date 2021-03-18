package com.digitinary.training.poly;

/**
 * 
 * Mar 15, 2021
 * @author Salah Abu Msameh
 */
public class Triangle extends Shape {

	public Triangle(int x, int y) {
		super(x, y);
	}

	@Override
	public int calcualteArea() {
		return super.calcualteArea() / 2;
	}
}
