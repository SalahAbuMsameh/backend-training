package com.digitinary.training.task.entity;

/**
 * 
 * Jun 14, 2021
 * @author Salah Abu Msameh
 */
//TODO: TABLE NAME >>> COURSES
public class Course {
	
	private Long courseId;
	private String courseName;
	private String faculty;
	
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
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
}
