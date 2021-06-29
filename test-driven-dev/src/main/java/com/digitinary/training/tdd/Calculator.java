package com.digitinary.training.tdd;

/**
 * 
 * Jun 28, 2021
 * @author Salah Abu Msameh
 */
public class Calculator {

	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public int sum(int n1, int n2) {
		
		if(n1 < 0 || n2 < 0) {
			return 0;
		}
		
		return n1 + n2;
	}
}
