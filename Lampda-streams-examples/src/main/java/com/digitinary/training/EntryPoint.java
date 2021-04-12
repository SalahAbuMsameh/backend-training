package com.digitinary.training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * Apr 12, 2021
 * @author Salah Abu Msameh
 */
public class EntryPoint {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> names = new HashMap<Integer, String>();
		
		names.put(1, "Azzam");
		names.put(2, "Dyaa");
		names.put(3, "Ahmad");
		names.put(4, "Anas");
		names.put(5, "Abdullah");
		
		//names.forEach((k, v) -> System.out.println(k + " - " + v));
		
		List<Integer> keys = names.keySet()
			.stream()
			.filter(k -> (k%2 != 0))
			.collect(Collectors.toList());
		
		keys.forEach(k -> System.out.println("key > " + k));
	}
}
