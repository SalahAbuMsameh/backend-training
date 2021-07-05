package com.digitinary.training.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public class CommandTest {

	/**
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		CommandType userSelectedCommand = CommandType.PRINT_NAME;//THIS VALUE SHOULD COME FORM USER
		Map<String, Object> userInputs = new HashMap<String, Object>();
		userInputs.put("name", "salah");
		
		Command cmd = CommandFactory.getCommand(userSelectedCommand);
		
		cmd.execute(userInputs);
	}
}
