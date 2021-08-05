package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

/**
 * Student business logic.
 * 
 * Jul 26, 2021
 * @author Salah Abu Msameh
 */
@Service
public class StudentService {
	
	private StudentRepo studentRepo;
	
	/**
	 * 
	 * @param studentRepo
	 */
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Student> getStudents() {
		
		return this.studentRepo.getAllUsers()
				.stream()
				.collect(Collectors.toList());
	}

	/**
	 * 
	 * @param studentId
	 * @return
	 */
	public Student getStudent(Long studentId) {
		return this.studentRepo.findById(studentId);
	}

	/**
	 * 
	 * @param student
	 * @return
	 */
	public Student createStudent(Student student) {
		
		student.setStudentId(new Random().nextLong());
		student.setJoinDate(LocalDate.now());
		this.studentRepo.save(student);
		
		return student;
	}
	
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	public Student deleteStudent(Long studentId) {
		return this.studentRepo.delete(studentId);
	}
}
