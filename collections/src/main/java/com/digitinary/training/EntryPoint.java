package com.digitinary.training;

import java.util.ArrayList;
import java.util.List;

import com.digitinary.training.abst.ParentType;
import com.digitinary.training.abst.TypeOne;

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
		
		//1. List
		List<String> names = new ArrayList<String>();
		names.add("value");
		names.add("value 2");
		names.add("value 3");
		names.add("value 4");
		
		System.out.println("size : " + names.size());
		
		ParentType type1 = new TypeOne();
		type1.doSothing();
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
	
	class LinkedList {
		
		private Node first;
		private Node last;
		
		public void add(String value) {
			first = new Node(value);
		}
	}
}
