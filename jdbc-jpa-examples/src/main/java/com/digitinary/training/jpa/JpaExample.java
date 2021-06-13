package com.digitinary.training.jpa;

/**
 * 
 * May 31, 2021
 * @author Salah Abu Msameh
 */
public class JpaExample extends BaseJpa {
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// fetch customer by id
		Customer c1 = em.find(Customer.class, Long.valueOf(1));
		System.out.println("Customer >> " + c1);
		
		//JQL
//		List<Customer> allCustomers = em.createQuery("FROM Customer where customerId > :customerByUser", Customer.class)
//				.setParameter("customerByUser", 6L)
//				.getResultList();
		
		//List<Customer> allCustomers = em.createQuery(CriteriaBuilder)//TODO: to be implemented next session
//		allCustomers.forEach(customer -> System.out.println(customer));
		
		c1.getAccounts()
			.forEach(acc -> System.out.println(acc));
		
		em.createNamedQuery("customFetchCustomers", Customer.class)
			.getResultList()
			.forEach(c -> System.out.println(c));
		
		// save new customer
//		Customer newCustomer = new Customer();
//		newCustomer.setCustomerId(Long.valueOf(20));
//		newCustomer.setCustomerName("New Customer from JPA");
//		newCustomer.setMobileNo("333333333");
//		newCustomer.setEmail("new.customer@email.com");
//		newCustomer.setCreatedDate(LocalDate.now());
		
		//em.getTransaction().begin();
		
		//Customer c16 = em.find(Customer.class, Long.valueOf(16));
		
		//c16.setCustomerName("Modified Customer");
		//em.merge(c16);
		
		//em.persist(newCustomer);
		//em.remove(newCustomer);
		
		//em.getTransaction().commit();
		System.exit(0);
	}
}
