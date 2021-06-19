package com.digitinary.training.thread;

/**
 * 
 * Jun 19, 2021
 * @author Salah Abu Msameh
 */
public class MyThread extends Thread {
	
	/**
	 * 
	 * @param threadName
	 */
	public MyThread(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {
		//your logic
		//Code to be executed
		System.out.println("This is my therad >> " + Thread.currentThread().getName());
	}
}
