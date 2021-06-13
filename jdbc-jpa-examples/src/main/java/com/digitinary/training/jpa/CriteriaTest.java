package com.digitinary.training.jpa;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * 
 * Jun 12, 2021
 * @author Salah Abu Msameh
 */
public class CriteriaTest extends BaseJpa {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//1. em -> criteria builder
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		//2. cb -> build query
		CriteriaQuery<Customer> cq = criteriaBuilder.createQuery(Customer.class);
		Root<Customer> root = cq.from(Customer.class); // Root entity (FROM "ROOT")
		cq.select(root); // SELECT * FROM CUSTOMER CUSTOMER_ID > ?;
		
		ParameterExpression<Long> customerIdParam = criteriaBuilder.parameter(Long.class);
		Predicate p = criteriaBuilder.gt(root.get("customerId"), customerIdParam);
		Predicate p2 = criteriaBuilder.isNotNull(root.get("email"));
		
		cq.where(criteriaBuilder.and(p, p2));
		
		//3. em -> execute criteria query
		em.createQuery(cq)
			.setParameter(customerIdParam, 5L)
			.getResultList()
			.forEach(c -> System.out.println(c));
	}
}
