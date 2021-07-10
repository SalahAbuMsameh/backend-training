package com.digitinary.training.observer;

/**
 * 
 * Jul 10, 2021
 * @author Salah Abu Msameh
 */
public class Observer {

	private Observable subject;
	
	/**
	 * 
	 * @param subject
	 */
	public Observer(Observable subject) {
		this.subject = subject;
		this.subject.attach(this);//add observer
	}



	/**
	 * 
	 * @return
	 */
	public void update() {
		System.out.println("status changed >> " + this.subject.getStatus());
	}
}
