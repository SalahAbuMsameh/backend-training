package com.digitinary.training.web;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitinary.training.repository.entity.Customer;
import com.digitinary.training.service.CustomerService;

/**
 * 
 * Jul 28, 2021
 * @author Salah Abu Msameh
 */
@RestController
@RequestMapping("/customers")
public class CustomerRestController {

	private CustomerService customerSrv;
	
	/**
	 * 
	 * @param customerSrv
	 */
	public CustomerRestController(CustomerService customerSrv) {
		this.customerSrv = customerSrv;
	}
	
	/**
	 * 
	 * @return
	 */
	@GetMapping
	public ResponseEntity<Iterable<Customer>> getCustomers() {
		return ResponseEntity.ok(this.customerSrv.getCustomers());
	}
	
	/**
	 * 
	 * @param customerId
	 * @return
	 */
	@GetMapping("/{customerId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("customerId") Long customerId) {
		
		CustomerService cs2 = null;
		return ResponseEntity.ok(cs2.getCustomer(customerId));
	}
	
	/**
	 * create new customer.
	 * @param customer
	 * @return
	 */
	@PostMapping
	public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer) {
		
		Customer createdCustomer = this.customerSrv.add(customer);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(createdCustomer);
	}
	
}
