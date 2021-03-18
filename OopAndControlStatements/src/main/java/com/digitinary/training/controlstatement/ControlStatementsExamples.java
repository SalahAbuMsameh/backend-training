package com.digitinary.training.controlstatement;

/**
 * 
 * Mar 17, 2021
 * @author Salah Abu Msameh
 */
public class ControlStatementsExamples {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer age = 20;
		//printGraduationResult(age);
		printNumber(6);
	}
	
	/**
	 * 
	 * @param age
	 */
	private static void printGraduationResult(Integer age) {
		
		//simple if else form
		String geneder = age >= 21 ? "M" : "F";
		
		if(age >= 21) {
			geneder = "M";
		} else {
			geneder = "F";
		}
		
		
		if(age != null && age >= 21) {
			System.out.println("Graduated studen");
		} else {
			System.out.println("print curent course");
			System.out.println("do something else");
			System.out.println("Ungraduated student");
		}
		
		//early exit
		if(age >= 21) {
			System.out.println("Graduated studen");
			return;
		}
		
		System.out.println("print curent course");
		System.out.println("do something else");
		System.out.println("Ungraduated student");
	}
	
	/**
	 * 
	 * @param student
	 */
	/*
	 * private void calcualteAvg(Student student) {
	 * 
	 * ////early exit example if(student == null) { return; }
	 * 
	 * System.out.println("print curent course");
	 * System.out.println("do something else");
	 * System.out.println("Ungraduated student"); }
	 */
	
	
	/**
	 * 
	 * @param number
	 */
	private static void printNumber(int number) {
		
		if( number == 1) {
			System.out.println("One");
		} else if(number == 2) {
			System.out.println("Two");
		} else if(number == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Unsupported");
		}
		
		switch (number) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Unsupported");
				break;
		}
		
	}
}
