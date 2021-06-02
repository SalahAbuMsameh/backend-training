package com.digitinary.training.jpa;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * 
 * May 31, 2021
 * @author Salah Abu Msameh
 */
public class JpaExample {
	
	private static EntityManager em = null;
	
	static {
		// A SessionFactory is set up once for an application!
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		try {
			SessionFactory sessionFactory = new MetadataSources(registry)
				.buildMetadata()
				.buildSessionFactory();
			
			em = sessionFactory.createEntityManager();
		}
		catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
			// so destroy it manually.
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// fetch customer by id
		Customer c4 = em.find(Customer.class, Long.valueOf(4));
		System.out.println("Customer >> " + c4);
		
		// save new customer
//		Customer newCustomer = new Customer();
//		newCustomer.setCustomerId(Long.valueOf(20));
//		newCustomer.setCustomerName("New Customer from JPA");
//		newCustomer.setMobileNo("333333333");
//		newCustomer.setEmail("new.customer@email.com");
//		newCustomer.setCreatedDate(LocalDate.now());
		
		em.getTransaction().begin();
		
		Customer c16 = em.find(Customer.class, Long.valueOf(16));
		
		c16.setCustomerName("Modified Customer");
		em.merge(c16);
		
		//em.persist(newCustomer);
		//em.remove(newCustomer);
		
		em.getTransaction().commit();
		System.exit(0);
	}
}
