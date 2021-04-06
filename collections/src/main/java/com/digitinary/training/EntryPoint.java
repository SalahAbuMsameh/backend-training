package com.digitinary.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Apr 3, 2021
 * @author Salah Abu Msameh
 */
public class EntryPoint {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		listExample();
		//setExample();
		//mapExample();
	}
	
	/**
	 * 
	 */
	private static void mapExample() {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value 1");
		map.put("key1", "Other value");
		map.put("key2", "value 2");
		
		//map.remove("key1");
		//map.forEach((key, value) -> System.out.println(key + " " + value));
		map.values().forEach(element -> System.out.println(element));//printing elements
		map.keySet().forEach(key -> System.out.println(key));
		
		/*for(Entry<String, String> element : map.entrySet()) {
			System.out.println(element.getValue());
		}*/
		
		//System.out.println(map.get("key1"));
		//System.out.println(map.size());
	}

	/**
	 * 
	 */
	private static void setExample() {
		
		//Set
		Set<String> set = new HashSet<String>();
		set.add("AAAA");// generate key -> map.put(generatedKey, "AAAA")
		set.add("AAAA");
		
		Set<String> treeSet = new TreeSet<String>();
		
		set.forEach(element -> System.out.println(element));
	}
	
	/**
	 * 
	 */
	private static void listExample() {
		
		//1. List
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("value 1"); //O(1) //O(1) //O(n)
		arrayList.add("value 2");
		arrayList.add("value 3");
		arrayList.add("value 4");
		
		//Iterator<String> itr = arrayList.iterator();
		/*while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		System.out.println("size : " + arrayList.size());
		System.out.println(arrayList.get(0));
		
		arrayList.forEach(element -> System.out.println(element));
		
		//old for each
		for (String element : arrayList) {
			System.out.println(element);
		}
		
		//1.2. LinkedList > //O(1) //O(1) //O(n)
		List<String> linkedlist = new LinkedList<String>();
		linkedlist.add("AAAA");
		linkedlist.get(0);
	}

	//refresh your minds
	class Node {
		
		private String value;
		private Node next;
		
		/**
		 * 
		 * @param value
		 */
		public Node(String value) {
			this.value = value;
		}
	}
	
	/*class LinkedList {
		
		private Node first;
		private Node last;
		
		public void add(String value) {
			first = new Node(value);
		}
	}*/
}
