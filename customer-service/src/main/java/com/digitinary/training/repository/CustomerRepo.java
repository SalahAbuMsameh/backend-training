package com.digitinary.training.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digitinary.training.repository.entity.Customer;

/**
 * 
 * Jul 28, 2021
 * @author Salah Abu Msameh
 */
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

}
