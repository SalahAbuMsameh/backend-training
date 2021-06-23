package com.digitinary.training.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * Jun 23, 2021
 * @author Salah Abu Msameh
 */
public class ExecutorsExample {
	
	class Wrapper {
		private Object data;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new TaskOne());//Task queue [t1, t2, t3]
		
		//call callable task
		List<Future<Integer>> resultsInFuture = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			Future<Integer> future = executorService.submit(new TaskTwo());
			resultsInFuture.add(future);
		}
		
		resultsInFuture.forEach(f -> {
			try {
				f.get();//get keep waiting tell the result arrives
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		});
		
		// wait sometime to make sure that all of the pool threads completed their tasks
		//executorService.awaitTermination(5, TimeUnit.MINUTES);
		executorService.shutdown();
		
		//CompletableFuture example.
		CompletableFuture.supplyAsync(() -> "Hello", executorService) // first method to be executed in separate thread
				.thenApply(s -> s + " Salah")
				.thenAccept(s -> System.out.println(s));// no return.
		
		CompletableFuture<String> completableFuture = CompletableFuture
				.supplyAsync(() -> "Hello") // first method to be executed in separate thread
				.thenApply(s -> s + " Salah");// return result.
		
		completableFuture.get();//wait to get final result
	}
}
