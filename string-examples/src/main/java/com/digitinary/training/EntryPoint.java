package com.digitinary.training;

import java.util.Arrays;

/**
 * 
 * Mar 22, 2021
 * @author Salah Abu Msameh
 */
public class EntryPoint extends Object {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "value 1"; //-> ['v', 'a', ]
		String s2 = new String(new char[] {'v', 'a'});
		String s3 = new String("value3");
		
		String s4 = "value 1 12 asdasdasd";
		String s5 = "value 1";
		
		String s6 = s4.concat("asdasd");//immutable
		
		if(s1.equals(s2)) {
			
		}
		
		s1.replace('a', 'b');
		s1.replaceAll("ab", "12");
		char char1 = s1.charAt(0);
		int length = s1.length();
		char[] chars = s1.toCharArray();
		//System.out.println(s1.contains("aaaa"));
		//System.out.println(s1.startsWith("va"));
		
		String[] splitResult = s4.split(" ");
		System.out.println(Arrays.toString(splitResult));
		System.out.println(splitResult.length);
		
		String.valueOf(1);
		
		//System.out.println(s6);
	}
}
