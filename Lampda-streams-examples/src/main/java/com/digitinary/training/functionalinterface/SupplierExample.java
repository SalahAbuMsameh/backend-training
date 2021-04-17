package com.digitinary.training.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * 
 * Apr 18, 2021
 * @author Salah Abu Msameh
 */
public class SupplierExample implements Supplier<Integer> {

	@Override
	public Integer get() {
		return Integer.valueOf(10);
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
		
		Integer no1 = numbers.stream()
			.filter(no -> no > 10)
			.findAny()
			//.orElseGet(() -> Integer.valueOf(10));
			.orElseGet(new SupplierExample());
		
		if(no1 != null) {
			System.out.println(no1);
		} else {
			System.out.println("Not Found");
		}
	}
}
