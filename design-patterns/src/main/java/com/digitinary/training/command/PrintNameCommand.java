package com.digitinary.training.command;

import java.util.Map;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public class PrintNameCommand implements Command {

	/**
	 * 
	 */
	public void execute(Map<String, Object> inputs) {
		System.out.println("Names >> " + inputs.get("name"));
	}
}
