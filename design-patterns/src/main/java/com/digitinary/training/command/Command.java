package com.digitinary.training.command;

import java.util.Map;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public interface Command {//Action 

	/**
	 * execute a command
	 */
	public void execute(Map<String, Object> inputs);
}
