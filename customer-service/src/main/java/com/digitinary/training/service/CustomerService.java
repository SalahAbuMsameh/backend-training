package com.digitinary.training.service;

import org.springframework.stereotype.Service;

import com.digitinary.training.exception.CustomerNotFoundException;
import com.digitinary.training.repository.CustomerRepo;
import com.digitinary.training.repository.entity.Customer;


/**
 * 
 * Jul 28, 2021
 * @author Salah Abu Msameh
 */
@Service
public class CustomerService {

	private CustomerRepo customerRepo;

	/**
	 * 
	 * @param customerRepo
	 */
	public CustomerService(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

	/**
	 * get all customers
	 * @return
	 */
	public Iterable<Customer> getCustomers() {
		return this.customerRepo.findAll();
	}
	
	/**
	 * 
	 * @param customerId
	 * @return
	 */
	public Customer getCustomer(final Long customerId) {
		
		return customerRepo.findById(customerId)
				.orElseThrow(() -> new CustomerNotFoundException(customerId));
	}
	
	/**
	 * 
	 * @param customer
	 * @return
	 */
	public Customer add(final Customer customer) {
		return this.customerRepo.save(customer);
	}
	
	/**
	 * 
	 * @param customerId
	 */
	public void delete(final Long customerId) {
		this.customerRepo.deleteById(customerId);
	}
}
