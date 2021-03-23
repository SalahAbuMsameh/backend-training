package com.digitinary.training;

/**
 * 
 * Mar 22, 2021
 * @author Salah Abu Msameh
 */
public class Student {

	private String firstName;
	private String midName;
	private String lastName;
	
	/**
	 * 
	 * @param firstName
	 * @param midName
	 * @param lastName
	 */
	public Student(String firstName, String midName, String lastName) {
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
	}
	
	/**
	 * return full name.
	 * 
	 * @note derived value / calculated value
	 * @return
	 */
	public String getFullName() {
		
		//return firstName + " " + midName + " " + lastName; 
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(firstName);
		sb.append(" ");
		sb.append(midName);
		sb.append(" ");
		sb.append(lastName);
		
		return sb.toString();
		
		/*return new StringBuilder(firstName)
				.append(" ")
				.append(midName)
				.append(" ")
				.append(lastName)
				.toString();*/
	}

	@Override
	public String toString() {
		return this.getFullName();
	}
}
