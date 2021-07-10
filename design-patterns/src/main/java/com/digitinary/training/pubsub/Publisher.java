package com.digitinary.training.pubsub;

/**
 * 
 * Jul 10, 2021
 * @author Salah Abu Msameh
 */
public class Publisher {

	private String topic;

	/**
	 * 
	 * @param topic
	 */
	public Publisher(String topic) {
		this.topic = topic;
	}
	
	/**
	 * 
	 * @param message
	 */
	public void publish(Message message) {
		MessageBroker.getInstance().sendMessage(topic, message);
	}
}
