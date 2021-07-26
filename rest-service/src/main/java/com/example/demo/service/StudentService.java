package com.example.demo.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

/**
 * Student business logic.
 * 
 * Jul 26, 2021
 * @author Salah Abu Msameh
 */
@Service
public class StudentService {

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
	public List<Student> getStudents() {
		
		return this.students.values()
				.stream()
				.collect(Collectors.toList());
	}

	/**
	 * 
	 * @param studentId
	 * @return
	 */
	public Student getStudent(Long studentId) {
		return this.students.get(studentId);
	}

	/**
	 * 
	 * @param student
	 * @return
	 */
	public Student createStudent(Student student) {
		
		student.setStudentId(new Random().nextLong());
		student.setJoinDate(LocalDate.now());
		this.students.put(student.getStudentId(), student);
		
		return student;
	}
	
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	public Student deleteStudent(Long studentId) {
		return this.students.remove(studentId);
	}
}
