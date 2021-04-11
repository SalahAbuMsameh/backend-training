package com.digitinary.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
		
		//listExample();
		setExample();
		//mapExample();
		
		
		ParentType t = new TypeOne();
		TypeOne t1 = new TypeOne();
		
		ParentType tt1 = (ParentType) t1;
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
		//Set<String> set = new HashSet<String>();
		//set.add("AAAA");// generate key -> map.put(generatedKey, "AAAA")
		//set.add("AAAA");
		
		
		//default comparison
		Set<String> treeSet = new TreeSet<String>();
		
		treeSet.add("AAA");
		treeSet.add("BBB");
		treeSet.add("CCC");
		
		Set<Integer> test = new TreeSet<Integer>();
		
		test.add(1);
		test.forEach(no -> {
			no++;
			System.out.println(no);
		});
		
		//treeSet.forEach(val -> System.out.println(val));
		
		//Compare using comparable
//		Set<Student> students = new TreeSet<Student>(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				
//				if(o1.getId() > o2.getId()) {
//					return 1;//this object is greater that passed object
//				} else if (o1.getId() == o2.getId()) {
//					return 0;//0 this object is equal the passed object
//				} else {
//					return -1;// this object is less that the passed object
//				}
//			}
//		});
		
		
		//Lambda syntax to pass anonymous class
		Set<Student> students = new TreeSet<Student>((o1, o2) -> {
			
			if(o1.getId() > o2.getId()) {
				return 1;//this object is greater that passed object
			} else if (o1.getId() == o2.getId()) {
				return 0;//0 this object is equal the passed object
			} else {
				return -1;// this object is less that the passed object
			}
		});
		
		students.add(new Student(5));
		students.add(new Student(8));
		students.add(new Student(7));
		
		students.forEach(val -> System.out.println(val));
	}
	
	/**
	 * 
	 * Apr 10, 2021
	 * @author Salah Abu Msameh
	 */
//	static class StudentComparator implements Comparator<Student> {
//
//		@Override
//		public int compare(Student o1, Student o2) {
//			
//			if(o1.getId() > o2.getId()) {
//				return 1;//this object is greater that passed object
//			} else if (o1.getId() == o2.getId()) {
//				return 0;//0 this object is equal the passed object
//			} else {
//				return -1;// this object is less that the passed object
//			}
//		}
//	}
	
	/**
	 * 
	 * Apr 10, 2021
	 * @author Salah Abu Msameh
	 */
	//static class Student implements Comparable<Student> {
	static class Student {
		
		private int id;

		/**
		 * 
		 * @param id
		 */
		public Student(int id) {
			this.id = id;
		}
		
		/**
		 * 
		 * @return
		 */
		public int getId() {
			return id;
		}
		
		@Override
		public String toString() {
			return String.valueOf(this.id);
		}

//		@Override
//		public int compareTo(Student o) {
//			
//			if(this.id > o.getId()) {
//				return 1;//this object is greater that passed object
//			} else if (this.id == o.getId()) {
//				return 0;//0 this object is equal the passed object
//			} else {
//				return -1;// this object is less that the passed object
//			}
//		}
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
