package com.digitinary.training.pubsub;

/**
 * 
 * Jul 10, 2021
 * @author Salah Abu Msameh
 */
public class Subscriber {

	/**
	 * handle message.
	 * @param message
	 */
	public void handleMessage(final Message message) {
		System.out.println(message);
	}
}
