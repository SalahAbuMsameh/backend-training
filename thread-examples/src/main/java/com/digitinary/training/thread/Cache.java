package com.digitinary.training.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 
 * Jun 19, 2021
 * @author Salah Abu Msameh
 */
public class Cache {
	
	private Map<Integer, Object> students = new HashMap<Integer, Object>();
	private Object monitorObject = new Object();
	
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
		synchronized (monitorObject) {//DON'T use this ever!!!
			return Optional.ofNullable(this.students.get(studentId))
				.orElseThrow(() -> new Exception("Student not found"));
		}
	}
	
	/**
	 * 
	 */
	public void flush() {
		this.students.clear();
	}
}
