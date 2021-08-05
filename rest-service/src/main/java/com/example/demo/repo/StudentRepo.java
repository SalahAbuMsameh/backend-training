package com.example.demo.repo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.demo.model.Student;

/**
 * 
 * Aug 4, 2021x
 * @author Salah Abu Msameh
 */
//@Repository
@Component
public class StudentRepo {
	
	//database
	private Map<Long, Student> students = new HashMap<Long, Student>();
	
	@PostConstruct
	private void init() {
		students.put(1L, new Student(1L, "Azzam", "MALE", "CIS", LocalDate.now()));
		students.put(2L, new Student(2L, "Ahmad", "MALE", "Software Eng", LocalDate.now()));	
	}

	/**
	 * 
	 * @return
	 */
	public Collection<Student> getAllUsers() {
		return students.values();
	}
	
	/**
	 * 
	 * @param student
	 */
	public void save(Student student) {
		this.students.put(student.getStudentId(), student);
	}
	
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	public Student findById(Long studentId) {
		return this.students.get(studentId);
	}
	
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	public Student delete(Long studentId) {
		return this.students.remove(studentId);
	}
}
