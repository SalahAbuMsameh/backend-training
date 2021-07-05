package com.digitinary.training.command;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public class CommandFactory {

	/**
	 * 
	 * @param commandType
	 * @return
	 */
	public static Command getCommand(CommandType commandType) throws Exception {
		
		switch (commandType) {
			case PRINT_NAME: {
				return new PrintNameCommand();
			}
			case SEND_NOTIFICATION: {
				return new SendNotificationCommand();
			}
			default: {
				throw new Exception("Command not found exception");
			}
		}
	}
}
