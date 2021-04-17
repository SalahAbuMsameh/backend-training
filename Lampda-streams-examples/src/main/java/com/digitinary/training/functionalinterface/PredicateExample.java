package com.digitinary.training.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * Apr 17, 2021
 * @author Salah Abu Msameh
 */
public class PredicateExample implements Predicate<Integer> {

	
	@Override
	public boolean test(Integer t) {
		return t%2 == 0;
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
		numbers.add(4);
		numbers.add(5);
		
		numbers.stream()
			.filter(new PredicateExample())
			.peek(no -> System.out.println("Current no -> " + no));
	}
}
