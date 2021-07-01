package com.digitinary.training.service;

/**
 * 
 * Jun 30, 2021
 * @author Salah Abu Msameh
 */
public class InvalidCustomerIdException extends Exception {

	/**
	 * 
	 * @param customerId
	 */
	public InvalidCustomerIdException(Long customerId) {
		super("Invalid customer id >> " + customerId);
	}
}
