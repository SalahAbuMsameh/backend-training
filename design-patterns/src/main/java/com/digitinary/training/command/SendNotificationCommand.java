package com.digitinary.training.command;

import java.util.Map;

/**
 * 
 * Jul 5, 2021
 * @author Salah Abu Msameh
 */
public class SendNotificationCommand implements Command {

	public void execute(Map<String, Object> inputs) {
		//send notification
		System.out.println("Sending notification ...");
	}
}
