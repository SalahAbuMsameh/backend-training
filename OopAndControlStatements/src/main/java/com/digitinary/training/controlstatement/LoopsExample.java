package com.digitinary.training.controlstatement;

import java.util.Scanner;

/**
 * 
 * Mar 20, 2021
 * @author Salah Abu Msameh
 */
public class LoopsExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//forLoop();
		//whileLoopExample();
		doWhileExample();
	}

	/**
	 * 
	 */
	private static void forLoop() {
		
		//      0        1        2       3         4            5
		String[] names = new String[] {"Ahmad", "Azzam", "Dyaa", "Anas", "Abdulaziz", "Abdullah"}; // length = 6
		
		int length = names.length;
		for (int i = 0; i <= length ; i++) {
			System.out.println(names[i]);
		}
		
		//counter++ >> execute then add the value
		//++counter >> add the value then execute
	}
	
	/**
	 * 
	 */
	private static void whileLoopExample() {
		
								  //      0        1        2       3         4            5
		//String[] names = new String[] {"Ahmad", "Azzam", "Dyaa", "Anas", "Abdulaziz", "Abdullah"}; // length = 6
		
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		
		while(!name.isEmpty()) {
			
			name = in.nextLine();
			
			if(name.equals("aaa")) {
				continue;//skip
			}
			
			System.out.println("Name >> " + name + "\n");
			name = in.nextLine();
		}
		
		System.out.println("Done");
	}
	
	/**
	 * 
	 */
	private static void doWhileExample() {
		
		Scanner in = new Scanner(System.in);
		String name = "";
				
		do {
			name = in.nextLine();
			
			if(name.equals("skip")) {
				continue;//skip
			}
			
			if(name.equals("exit")) {
				break;//exit the loop
			}
			
			System.out.println("Name >> " + name + "\n");
			
		} while(!name.trim().isEmpty());
		
		System.out.println("Done");
	}
}
