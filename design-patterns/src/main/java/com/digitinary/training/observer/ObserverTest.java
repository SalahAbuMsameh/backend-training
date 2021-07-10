package com.digitinary.training.observer;

/**
 * 
 * Jul 10, 2021
 * @author Salah Abu Msameh
 */
public class ObserverTest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Observable observable = new Observable();
		
		Observer one = new Observer(observable);
		Observer two = new Observer(observable);
		
		observable.setStatus(3);
	}
}
