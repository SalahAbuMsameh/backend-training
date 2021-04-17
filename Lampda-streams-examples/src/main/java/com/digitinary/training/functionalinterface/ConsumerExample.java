package com.digitinary.training.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * Apr 17, 2021
 * @author Salah Abu Msameh
 */
public class ConsumerExample implements Consumer<Integer> {

	@Override
	public void accept(Integer no) {
		System.out.println("Current No > " + no);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		numbers.forEach(new ConsumerExample());
		numbers.forEach(no -> System.out.println("Current No > " + no));
	}
}
