package com.example.demo.model;

/**
 * 
 * Jul 26, 2021
 * @author Salah Abu Msameh
 */
public class Course {

	private Long courseId;
	private String courseName;
	
	/**
	 * 
	 * @param courseId
	 * @param courseName
	 */
	public Course(Long courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
