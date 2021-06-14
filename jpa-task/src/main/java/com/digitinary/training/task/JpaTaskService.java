package com.digitinary.training.task;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.digitinary.training.task.entity.Gender;
import com.digitinary.training.task.entity.Student;

/**
 * 
 * Jun 14, 2021
 * @author Salah Abu Msameh
 */
public class JpaTaskService {
	
	private static EntityManager em = null;
	
	static {
		//Standard JPA Way
		EntityManagerFactory emf = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("JpaTask");
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
	
	/**
	 * Add given student.
	 * 
	 * @param student
	 * @return
	 */
	public boolean addStudent(Student student) {
		
		return true;
	}
	
	/**
	 * Update given student.
	 * 
	 * @param student
	 * @return
	 */
	public boolean updateStudent(Student student) {
		
		//TODO: if the given student are not already saved, throw a StudentNotFoundException
		
		return true;
	}
	
	/**
	 * Delete given student.
	 * 
	 * @param student
	 * @return
	 */
	public boolean deleteStudent(Long studentId) {
		
		//TODO: if the given student are not already saved, throw a StudentNotFoundException
		
		return true;
	}

	/**
	 * Fetch student by the given id.
	 * @param student
	 */
	public Student getStudentById(long studentId) {
		
		//TODO: use Option<> to check if the student exists
		//TODO: if student not exists, rasie a custom check exception StudentNotFoundException
		
		return null;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Student> getAllStudents() {
		
		//TODO: use JQL to fetch all students
		
		return null;
	}
	
	/**
	 * Fetch all students after the given join date;
	 * @return
	 */
	public List<Student> getStudentsAfterJoinDate(LocalDate joinDate) {
		
		//TODO: use JQL to fetch all students
		
		return null;
	}
	
	/**
	 * Fetch all student for the given gender.
	 * 
	 * @param gender
	 * @return
	 */
	public List<Student> getStudents(Gender gender) {
		
		//TODO: user criteria APIs
		
		return null;
	}
}
