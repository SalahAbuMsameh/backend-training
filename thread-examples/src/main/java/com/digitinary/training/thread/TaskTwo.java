package com.digitinary.training.thread;

import java.util.concurrent.Callable;

/**
 * 
 * Jun 23, 2021
 * @author Salah Abu Msameh
 */
public class TaskTwo implements Callable<Integer> {
	
	@Override
	public Integer call() throws Exception { // the same exact behavior of the run method
		// business logic
		return 5;
	}
}
