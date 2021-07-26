package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ApiResponse;
import com.example.demo.model.ErrorModel;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

/**
 * Students rest APIs controller.
 * 
 * Jul 26, 2021
 * @author Salah Abu Msameh
 */
@RestController
@RequestMapping(path ="/students")
public class StudentController {
	
	private StudentService studentSrv;
	
	/**
	 * 
	 * @param studentSrv
	 */
	public StudentController(final StudentService studentSrv) {
		this.studentSrv = studentSrv;
	}

	@GetMapping({"", "/"})
	public List<Student> getAllStudents() {
		return this.studentSrv.getStudents();
	}
	
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	@GetMapping("/{studentId}")
	public ResponseEntity<ApiResponse> getStudent(@PathVariable("studentId") Long studentId) {
		
		Student student = this.studentSrv.getStudent(studentId);
		
		if(student == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.header("header_name", "header value")
					.body(new ErrorModel("ERR-001", "Student not found for id >> " + studentId));
		}
		
		return ResponseEntity.ok(student);
	}
	
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	@GetMapping("/{studentId}/courses")
	public ResponseEntity<ApiResponse> getStudentCourses(@PathVariable("studentId") Long studentId) {
		return null;
	}
	
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	@GetMapping("/{studentId}/courses/{courseId}")
	public ResponseEntity<ApiResponse> getStudentCourses(@PathVariable("studentId") Long studentId,
			@PathVariable("courseId") final Long courseId) {
		return null;
	}
	
	/**
	 * 
	 * @param student
	 * @return
	 */
	@PostMapping
	public ResponseEntity<ApiResponse> createStudent(@RequestBody Student student) {
		
		//example of validation
		if(student.getName() == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new ErrorModel("ERR-002", "student name can't be null"));
		}
		
		Student createdStudent = this.studentSrv.createStudent(student);
			
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(createdStudent);
	}
	
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	@DeleteMapping("/{studentId}")
	public ResponseEntity<ApiResponse> deleteStudent(@PathVariable("studentId") final Long studentId) {
		
		Student student = this.studentSrv.deleteStudent(studentId);
		
		if(student == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body(new ErrorModel("ERR-001", "Student not found for id >> " + studentId));
		}
		
		return ResponseEntity.ok(student); 
	}
}
