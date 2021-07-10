package com.digitinary.training.pubsub;

/**
 * 
 * Jul 10, 2021
 * @author Salah Abu Msameh
 */
public class Message {

	private String value;

	/**
	 * 
	 * @param value
	 */
	public Message(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Message >> " + this.value;
	}
}
