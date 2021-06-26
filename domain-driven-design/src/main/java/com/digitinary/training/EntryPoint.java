package com.digitinary.training;

import java.util.List;

/**
 * 
 * Jun 26, 2021
 * @author Salah Abu Msameh
 */
public class EntryPoint {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Customer can buy multiple items at the same time.
		//Model >> Customer & Item
		//Entity >> Customer & Item
		
		
	}
	
	class Customer {
		
	}
	
	/**
	 * hold/contains business logic.
	 * functions list of model
	 * 
	 * Jun 26, 2021
	 * @author Salah Abu Msameh
	 */
	class CustomerService {
		
		/**
		 * 
		 * @param order
		 * @return
		 */
		public boolean buy(Order order) {
			return true;
		}
	}
	
	/**
	 * Customer repository.
	 * DAO >> Data Access Object (object functions related to access(read, write) object)
	 * 
	 * 
	 * Jun 26, 2021
	 * @author Salah Abu Msameh
	 */
	interface CustomerRepo {
		
		/**
		 * 
		 * @param customer
		 */
		public void save(Customer customer);
		
		/**
		 * 
		 * @param id
		 * @return
		 */
		public Customer find(Long id);
	}
	
	class Item {
		
	}
	
	class ItemService {
		
	}
	
	class ItemRepo {
		
	}
	
	// Aggregate of items
	class Order {
		private List<Item> items;
	}
}
