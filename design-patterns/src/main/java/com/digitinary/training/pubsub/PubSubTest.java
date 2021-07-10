package com.digitinary.training.pubsub;

/**
 * 
 * Jul 10, 2021
 * @author Salah Abu Msameh
 */
public class PubSubTest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String topicA = "A";
		String topicB = "B";
		
		Publisher aPub = new Publisher(topicA);
		Publisher bPub = new Publisher(topicB);
		
		MessageBroker.getInstance().addSubscriber(topicA, new Subscriber());
		MessageBroker.getInstance().addSubscriber(topicA, new Subscriber());
		MessageBroker.getInstance().addSubscriber(topicA, new Subscriber());
		
		aPub.publish(new Message("message one"));
		bPub.publish(new Message("Message two for B topic"));
		System.out.println("Done ..");
		
	}
}
