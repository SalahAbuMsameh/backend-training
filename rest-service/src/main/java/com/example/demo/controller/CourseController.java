package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;

/**
 * 
 * Jul 26, 2021
 * @author Salah Abu Msameh
 */
@RestController
@RequestMapping(path = "/courses")
public class CourseController {
	
	/**
	 * retrieve all courses.
	 * 
	 * @return
	 */
	@GetMapping
	public List<Course> getAllCourses() {
		return null;
	}
}
