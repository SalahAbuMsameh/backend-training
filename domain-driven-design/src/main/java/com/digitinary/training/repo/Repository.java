package com.digitinary.training.repo;

/**
 * 
 * Jun 26, 2021
 * @author Salah Abu Msameh
 */
public interface Repository<E, I> {
	
	/**
	 * 
	 * @param entity
	 */
	public void save(E entity);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public E findById(I id);
}
