package com.digitinary.training.repo;

import java.util.HashSet;
import java.util.Set;

import com.digitinary.training.repo.entity.Customer;

/**
 * 
 * Jun 30, 2021
 * @author Salah Abu Msameh
 */
public class CustomerRepoMock extends CustomerRepo {
	
	private Set<Customer> customers = new HashSet<Customer>();

	//constructor 
	//add two customers
	
	@Override
	public void save(Customer customer) {
		//save set instead of db
		customers.add(customer);
	}
	
	@Override
	public void delete(Customer customer) {
		//delete from set
		customers.remove(customer);
	}
	
	@Override
	public Customer findById(Long id) {
		//find from set
		return customers.stream()
				.filter(c -> c.getCustomerId().longValue() == id.longValue())
				.findFirst()
				.orElse(null);
	}
	
	@Override
	public Set<Customer> findAll() {
		return this.customers;
	}
}
