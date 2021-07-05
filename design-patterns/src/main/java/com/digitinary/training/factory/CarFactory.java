package com.digitinary.training.factory;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public final class CarFactory {

	/**
	 * 
	 * @param type
	 * @return
	 */
	public static Car getCar(CarType type) {//you define input
		
		switch (type) {
			case MERCEDIS: {
				return new MercedisCar();
			}
			case GMC: {
				return new GmcCar();
			}
			default: {
				return null;
				//throw exception
			}
		}
	}
}
