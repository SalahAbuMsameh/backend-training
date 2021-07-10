package com.digitinary.training.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Jul 10, 2021
 * @author Salah Abu Msameh
 */
public class Observable {

	private int status;
	private List<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		this.observers.add(observer);
	}	
	
	public void setStatus(int status) {
		this.status = status;
		notifyObservers();
	}

	public int getStatus() {
		return status;
	}
	
	/**
	 * 
	 */
	private void notifyObservers() {
		this.observers.forEach(observer -> observer.update());
	}
}
