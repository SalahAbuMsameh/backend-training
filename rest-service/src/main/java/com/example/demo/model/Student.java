package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

/**
 * 
 * Jul 26, 2021
 * @author Salah Abu Msameh
 */
public class Student implements ApiResponse {
	
	private Long studentId;
	private String name;
	private String gender;
	private String major;
	private LocalDate joinDate;
	
	private List<Course> enrolledCourses;
	
	/**
	 * 
	 * @param studentId
	 * @param name
	 * @param gender
	 * @param major
	 * @param joinDate
	 */
	public Student(Long studentId, String name, String gender, String major, LocalDate joinDate) {
		this.studentId = studentId;
		this.name = name;
		this.gender = gender;
		this.major = major;
		this.joinDate = joinDate;
	}

	public Long getStudentId() {
		return studentId;
	}
	
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public LocalDate getJoinDate() {
		return joinDate;
	}
	
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(List<Course> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
}
