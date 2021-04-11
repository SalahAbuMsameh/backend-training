package com.digitinary.training.generic;

/**
 * 
 * Apr 10, 2021
 * @author Salah Abu Msameh
 */
public class MaxExample<N extends Number> {//type restriction

	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public N max(N n1, N n2) {
		return (n1.intValue() > n2.intValue() ? n1 : n2);
	}
}
