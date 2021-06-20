package com.digitinary.training.task;

import java.time.LocalDate;

import com.digitinary.training.task.entity.Gender;
import com.digitinary.training.task.entity.Student;

/**
 * 
 * Jun 14, 2021
 * @author Salah Abu Msameh
 */
public class JpaTask {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		JpaTaskService jpaService = new JpaTaskService();
		
		//test add student
		Student s1 = new Student();
		s1.setName("Student Three");
		s1.setGender(Gender.FEMALE);
		s1.setMajor("IT");
		s1.setJoinDate(LocalDate.now());
		
		System.out.println("added >> " + jpaService.addStudent(s1));
		
		//test update student
		
		//test delete student
	}
}
