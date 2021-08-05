package com.digitinary.training.exception;

/**
 * 
 * Jul 31, 2021
 * @author Salah Abu Msameh
 */
public class CustomerNotFoundException extends RuntimeException {

	/**
	 * 
	 * @param customerId
	 */
	public CustomerNotFoundException(Long customerId) {
		super("Customer not found for given id >> " + customerId);
	}

}
