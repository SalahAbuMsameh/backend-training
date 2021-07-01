package com.digitinary.training.service;

/**
 * 
 * Jun 30, 2021
 * @author Salah Abu Msameh
 */
public class CustomerNotFoundException extends Exception {

	/**
	 * 
	 * @param customerId
	 */
	public CustomerNotFoundException(Long customerId) {
		super("Customer not found for customer id >> " + customerId);
	}
}
