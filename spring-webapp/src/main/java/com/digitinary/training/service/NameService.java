package com.digitinary.training.service;

import org.springframework.stereotype.Service;

/**
 * 
 * Jul 12, 2021
 * @author Salah Abu Msameh
 */
@Service
public class NameService {
	
	/**
	 * 
	 * @return
	 */
	public String getCurrentLogedInUsername() {
		return "Salah";
	}
}
