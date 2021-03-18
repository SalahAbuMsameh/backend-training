package com.digitinary.training.poly;

/**
 * 
 * Mar 15, 2021
 * @author Salah Abu Msameh
 */
public class Shape {

	private int x;
	private int y;
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 
	 * @return
	 */
	public int calcualteArea() {
		return this.x * this.y;
	}
}
