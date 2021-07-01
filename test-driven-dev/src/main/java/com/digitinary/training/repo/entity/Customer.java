package com.digitinary.training.repo.entity;

/**
 * Customer entity.
 * 
 * Jun 30, 2021
 * @author Salah Abu Msameh
 */
public class Customer {

	private Long customerId;
	
	public Customer(Long customerId) {
		this.customerId = customerId;
	}
	
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Customer)) {
			return false;
		}
		
		Customer otherCustomer = (Customer) obj;
		
		return this.customerId.longValue() == otherCustomer.getCustomerId().longValue();
	}
}
