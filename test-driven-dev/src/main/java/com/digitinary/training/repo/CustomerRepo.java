package com.digitinary.training.repo;

import java.util.Set;

import com.digitinary.training.repo.entity.Customer;

/**
 * 
 * Jun 30, 2021
 * @author Salah Abu Msameh
 */
public class CustomerRepo {
	
	/**
	 * 
	 * @param customer
	 */
	public void save(Customer customer) {
		//do save
		//em.persist(customer);
	}
	
	/**
	 * 
	 * @param customerId
	 * @return
	 */
	public void delete(Customer customer) {
		//do remove
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Customer findById(Long id) {
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public Set<Customer> findAll() {
		return null;
	}
}
