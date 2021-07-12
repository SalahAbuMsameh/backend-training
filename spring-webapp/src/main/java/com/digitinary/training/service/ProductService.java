package com.digitinary.training.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.digitinary.training.model.Product;

/**
 * 
 * Jul 12, 2021
 * @author Salah Abu Msameh
 */
@Service
public class ProductService {

	
	/**
	 * get all products from storage.
	 * 
	 * @return
	 */
	public List<Product> getAllProdcuts() {
		//jpa fetch all products
		
		return IntStream.of(1, 2)
				.mapToObj(id -> new Product(Long.valueOf(id), "Product " + id))
				.collect(Collectors.toList());
	}
}
