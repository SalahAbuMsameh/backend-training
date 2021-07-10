package com.digitinary.training.pubsub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 
 * Jul 10, 2021
 * @author Salah Abu Msameh
 */
public class MessageBroker {
	
	private static MessageBroker messageBroker = new MessageBroker();
	
	//subscribers
	private Map<String, List<Subscriber>> subscribers = new HashMap<String, List<Subscriber>>();
	
	/**
	 * get message broker instance.
	 * @return
	 */
	public static MessageBroker getInstance() {
		return messageBroker;
	}
	
	/**
	 * 
	 * @param topic
	 * @param subscriber
	 */
	public void addSubscriber(final String topic, final Subscriber subscriber) {
		
		List<Subscriber> currSubscribers = Optional.ofNullable(this.subscribers.get(topic))
			.orElse(new ArrayList<Subscriber>());
		
		currSubscribers.add(subscriber);
		this.subscribers.put(topic, currSubscribers);
	}
	
	/**
	 * 
	 * @param topic
	 * @param message
	 */
	public void sendMessage(String topic, Message message) {
		
		//loop over subscriber, and hand the current message to them
		Optional.ofNullable(this.subscribers.get(topic))
			.ifPresent(list -> {
				list.forEach(s -> s.handleMessage(message));
			});
	}
}
