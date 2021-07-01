package com.digitinary.training.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.digitinary.training.repo.CustomerRepoMock;
import com.digitinary.training.repo.entity.Customer;

/**
 * 
 * Jun 30, 2021
 * @author Salah Abu Msameh
 */
@TestInstance(Lifecycle.PER_CLASS)
public class CustomerServiceTest {
	
	private CustomerService customerService;
	
	@BeforeAll
	public void setUp() {
		//init 
		customerService = new CustomerService(new CustomerRepoMock());
	}

	@Test
	public void testSave() {
		this.customerService.addCustomer(new Customer(1L));
		assertEquals(1, this.customerService.getAllCustomer().size());
	}
	
	@Test
	public void testGetCustomer_withInvalidId() {
		assertThrows(InvalidCustomerIdException.class, () -> customerService.getCustomer(null));
		assertThrows(InvalidCustomerIdException.class, () -> customerService.getCustomer(0L));
		assertThrows(InvalidCustomerIdException.class, () -> customerService.getCustomer(-5L));
	}
}
