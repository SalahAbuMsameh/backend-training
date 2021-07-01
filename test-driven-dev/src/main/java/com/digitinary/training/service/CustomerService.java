package com.digitinary.training.service;

import java.util.Optional;
import java.util.Set;

import com.digitinary.training.repo.CustomerRepo;
import com.digitinary.training.repo.entity.Customer;

/**
 * 
 * Jun 30, 2021
 * @author Salah Abu Msameh
 */
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
	 * 
	 * @param customer
	 */
	public void addCustomer(Customer customer) {
		//do some logic
		this.customerRepo.save(customer);
	}
	
	/**
	 * 
	 * @param customerId
	 * @return
	 * @throws CustomerNotFoundException
	 */
	public Customer remove(Long customerId) throws CustomerNotFoundException, InvalidCustomerIdException {
		
		Customer customer = getCustomer(customerId);
		this.customerRepo.delete(customer);
		
		return customer;
	}
	
	/**
	 * 
	 * @param customerId
	 * @return
	 * @throws CustomerNotFoundException
	 */
	public Customer getCustomer(Long customerId) throws CustomerNotFoundException, InvalidCustomerIdException {
		
		if(customerId == null || customerId.longValue() <= 0) {
			throw new InvalidCustomerIdException(customerId);
		}
		
		return Optional.ofNullable(this.customerRepo.findById(customerId))
				.orElseThrow(() -> new CustomerNotFoundException(customerId));
	}
	
	/**
	 * 
	 * @return
	 */
	public Set<Customer> getAllCustomer() {
		return this.customerRepo.findAll();
	}
}
