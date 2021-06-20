package com.digitinary.training.task.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * Jun 14, 2021
 * @author Salah Abu Msameh
 */
@Entity
@Table(name = "STUDENTS")
public class Student {
	
	private Long studentId;
	private String name;
	private Gender gender;
	private String major;
	private LocalDate joinDate;
	
	private Set<Course> courses = new HashSet<Course>();
	
	
	@Id
	@Column(name = "STUDENT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getStudentId() {
		return studentId;
	}
	
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name = "STUDENT_NAME")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "GENDER")
	@Enumerated(EnumType.STRING)
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Column(name = "MAJOR")
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Column(name = "JOIN_DATE")
	public LocalDate getJoinDate() {
		return joinDate;
	}
	
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	@ManyToMany
	@JoinTable(name = "STUDENT_COURSES", 
			joinColumns = {@JoinColumn(name = "STUDENT_ID")},
			inverseJoinColumns = {@JoinColumn(name = "COURSE_ID")})
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
}
