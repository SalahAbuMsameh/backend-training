package com.digitinary.training.thread;

/**
 * 
 * Jun 19, 2021
 * @author Salah Abu Msameh
 */
public class TaskOne implements Runnable {

	/**
	 * 
	 */
	public void run() {
		//Code to be executed in a thread context
		System.out.println("From thread >> " + Thread.currentThread().getName());
	}
}
