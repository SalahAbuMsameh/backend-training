package com.digitinary.training.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Common JPA code.
 * 
 * Jun 12, 2021
 * @author Salah Abu Msameh
 */
abstract class BaseJpa {
	
	protected static EntityManager em = null;
	
	static {
		//Hibernate way
//		// A SessionFactory is set up once for an application!
//		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//				.configure() // configures settings from hibernate.cfg.xml
//				.build();
//		try {
//			SessionFactory sessionFactory = new MetadataSources(registry)
//				.buildMetadata()
//				.buildSessionFactory();
//			
//			em = sessionFactory.createEntityManager();
//		}
//		catch (Exception e) {
//			// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
//			// so destroy it manually.
//			e.printStackTrace();
//			StandardServiceRegistryBuilder.destroy(registry);
//		}
		
		//Standard JPA Way
		EntityManagerFactory emf = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("JpaExample");
			em = emf.createEntityManager();
		} catch (Exception e) {
			
			e.printStackTrace();
			
			if(em != null && em.isOpen()) {
				em.close();
			}
			
			if(emf != null && emf.isOpen()) {
				emf.close();
			}
		}
	}
}
