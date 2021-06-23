package com.digitinary.training.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * Jun 19, 2021
 * @author Salah Abu Msameh
 */
public class CahceReentrantLock {
	
	private Map<Integer, Object> students = new HashMap<Integer, Object>();
	ReentrantLock lock = new ReentrantLock();
	
	/**
	 * 
	 * @param student
	 */
	public synchronized void cache(Object student) {
		this.students.put(student.hashCode(), student);
	}
	
	/**
	 * 
	 * @param studentId
	 * @return
	 * @throws Exception 
	 */
	public Object getStudent(int studentId) throws Exception {

		if(studentId <= 0) {
			return null;
		}
		
		//inner synch block
		try {
			lock.lock();// acquire sych lock.
			
			return Optional.ofNullable(this.students.get(studentId))
					.orElseThrow(() -> new Exception("Student not found"));
		} finally {
			//DONT FORGET unlock to be in a finally block
			//it'll be always executed
			lock.unlock();
		}
	}
	
	/**
	 * 
	 */
	public void flush() {
		this.students.clear();
	}
}
