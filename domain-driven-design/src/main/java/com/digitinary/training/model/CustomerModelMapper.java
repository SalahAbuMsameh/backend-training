package com.digitinary.training.model;

import com.digitinary.training.repo.entity.Customer;

/**
 * 
 * Jun 26, 2021
 * @author Salah Abu Msameh
 */
public final class CustomerModelMapper {
	
	/**
	 * 
	 * @param customerModel
	 */
	static Customer toEntity(CustomerModel customerModel) {
		//code to map
		return new Customer();
	}
}
