package com.digitinary.training.factory;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public class ComplexTypeFactory {

	/**
	 * 
	 * @return
	 */
	public static House getHouse(String regNo) {
		
		//1. call function to calculate dimensions
		int x = 52; // cal
		int y = 10; // cal
		
		//2. get owner
		String owner = "owner";//gov.getOwner(regNo);
		
		return new House(regNo, owner, x, y);
	}
	
	/**
	 * 
	 * Jul 5, 2021
	 * @author Salah Abu Msameh
	 */
	private static class House {

		/**
		 * 
		 * @param regNo
		 * @param owner
		 * @param x
		 * @param y
		 */
		public House(String regNo, String owner, int x, int y) {
			// TODO Auto-generated constructor stub
		}
	}
}
