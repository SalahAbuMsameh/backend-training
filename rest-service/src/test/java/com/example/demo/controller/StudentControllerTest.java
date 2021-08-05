package com.example.demo.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

/**
 * 
 * Aug 4, 2021
 * @author Salah Abu Msameh
 */
@WebMvcTest(StudentController.class)
public class StudentControllerTest {
	
	@Autowired
    private MockMvc mvc;
	
	//2. we have to specify all spring beans
	@MockBean // spy bean means that mokito will execute empty / proxy mock code
	private StudentRepo studentRepo;
	
	@MockBean
	private CourseController courseController;
	
	@SpyBean// spy bean means that mokito will execute actual code
	private StudentService studentService;
	
	@Test
	public void testGetAllStudent() throws Exception {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(15L, "Student one", "MALE", "CIS", LocalDate.now()));
		
		when(studentRepo.getAllUsers())
			.thenReturn(students);
		
		this.mvc.perform(get("/students"))
	        .andExpect(status().isOk())//http status code - 200
	        .andDo(print())
	        .andExpect(jsonPath("$[0].studentId", is(15)));
		
	}
}
