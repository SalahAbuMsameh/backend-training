package com.digitinary.training.thread;

/**
 * 
 * Jun 19, 2021
 * @author Salah Abu Msameh
 */
public class ThreadExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		//logic within the thread itself
		//MyThread myThread = new MyThread("MyThread - 01");
		//myThread.start();
		//System.out.println(Thread.currentThread().getName());
		
		
		//Separate logic from actual thread
		Thread executor = new Thread(new TaskOne());
		executor.start();
		
		//change the thread status to time waiting
		//Thread.currentThread().sleep(10000);
		
		//executor.wait();//to wait tell another thread complete execute.
		//executor.notifyAll();
		
		System.out.println("Done");
	}
}
