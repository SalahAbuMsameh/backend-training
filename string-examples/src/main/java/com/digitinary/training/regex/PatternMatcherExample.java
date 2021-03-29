package com.digitinary.training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Mar 29, 2021
 * @author Salah Abu Msameh
 */
public class PatternMatcherExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("(([0-9]{2})*[-]*[0-9]{2}+[-]+[0-9]{2,4}+)");//
		Matcher matcher = pattern.matcher("The concept arose in the 01-1950 when the American mathematician Stephen "
				+ "Cole Kleene formalized the description of a regular language. The concept came into common "
				+ "use with Unix text-processing utilities. Different syntaxes for writing regular "
				+ "expressions have existed since the 17-05-1980, one being the POSIX standard and another, "
				+ "widely used, being the Perl syntax. and till now 29-03-21");
		
		while(matcher.find()) {
			//matcher.start();
			//matcher.start(30);
			matcher.end();
			matcher.end(10);
			//System.out.println(matcher.group());
			//System.out.println(matcher.matches());//string1.matches()
			//System.out.println(matcher.lookingAt());//same as matches but from begging of string
		}
		
		/*
		 * if(matcher.find()) { System.out.println(matcher.replaceAll("DATE")); }
		 */
	}
}
