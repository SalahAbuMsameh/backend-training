package com.digitinary.training.generic;

/**
 * 
 * Apr 10, 2021
 * @author Salah Abu Msameh
 */
public class GenericExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println("Max is > " + max(1, 2));
		//System.out.println("Max is > " + max(1.0, 2.1));
		System.out.println("Max is > " + maxObject(new String("ss"), Double.valueOf(3.36)));
		
		//System.out.println(new MaxExample<Double>().max(2.33, 2.99));
		System.out.println(maxNumber(2.33,  2.99));
	}
	
	/**
	 * 
	 * @param <N>
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static <N extends Number> N maxNumber(N n1, N n2) {
		return (n1.intValue() > n2.intValue() ? n1 : n2);
	}
	
	/**
	 * 
	 * @param <N>
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static <T> String getName(T type) {
		return type.toString();
	}
	
	/**
	 * not preferred
	 * @param o1
	 * @param o2
	 * @return
	 */
	public static Object maxObject(Object o1, Object o2) {
		
		//cast example
		Number n1 = (Number) o1;
		Number n2 = (Number) o2;
		return (n1.intValue() > n2.intValue() ? n1 : n2);
	}
	
	/**
	 * 
	 * @param d
	 * @param e
	 * @return
	 */
	private static double max(double d1, double d2) {
		return (d1 > d2 ? d1 : d2);
	}

	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int max(int n1, int n2) {
		return (n1 > n2 ? n1 : n2);
	}
}
