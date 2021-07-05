package com.digitinary.training.factory;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public class FactoryTest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car = CarFactory.getCar(CarType.GMC);
		System.out.println(car);
	}
}
