package com.digitinary.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Mar 31, 2021
 * @author Salah Abu Msameh
 */
public class EntryPoint {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//simulateArithmaticException();
		try {
			simualteCheckedException();
		} catch (OurCheckException e) {
			e.printStackTrace();
		}
		
		simualteUncheckedException();
	}

	/**
	 * 
	 */
	private static void simualteUncheckedException() throws RuntimeException {
		throw new OurUncheckedException();
	}

	/**
	 * 
	 */
	private static void simualteCheckedException() throws OurCheckException {
		
		try {
			List<String> lines = Files.readAllLines(Paths.get("PATH to File"));
		} catch (IOException e) {// try to catch the actual exception
			System.out.println(e.getMessage());
			throw new OurCheckException();
		}
	}

	/**
	 * 
	 */
	private static void simulateArithmaticException() {
		
		Scanner scanner = new Scanner( System.in ); // scanner for input
		
		System.out.print( "Please enter an integer numerator: " );
		int numerator = scanner.nextInt();
		System.out.print( "Please enter an integer denominator: " );
		int denominator = scanner.nextInt();
		int result = 0;
		
		//check logic to avoid RunTimeExceptions
		if(denominator == 0) {
			//retry
		}
		
		try {
			result = numerator / denominator;
		} catch (ArithmeticException ex) {
			System.out.println("wrong value, please reinter the denominator");
			denominator = scanner.nextInt();
			result = numerator / denominator;
		}
		
		System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result );
		System.out.println("Done");
	}
}
