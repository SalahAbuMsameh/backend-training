package com.digitinary.training;

import java.util.Random;

import com.digitinary.training.poly.Circle;
import com.digitinary.training.poly.Shape;
import com.digitinary.training.poly.Square;
import com.digitinary.training.poly.Triangle;

/**
 * 
 * Mar 15, 2021
 * @author Salah Abu Msameh
 */
public class ProjectEntryPoint {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Child c1 = new Child(1, "firstObject", LocalDate.now());
		//System.out.println(c1.getFullQualifiedName());
		
		System.out.println("please inter action");
		
		Shape s1 = getShape(new Random().nextInt(2) + 1);
		System.out.println(s1.calcualteArea());
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	private static Shape getShape(int number) {
		
		System.out.println(number);
		
		switch (number) {
			case 1:
				return new Square(4, 6);
			case 2:
				return new Triangle(4, 6);
			case 3:
				return new Circle(4);
			default:
				return null;
		}
	}
}
