package com.digitinary.training.exercise;

/**
 * 
 * Apr 20, 2021
 * @author Salah Abu Msameh
 */
public class PhoneBook {

	private int id;
	private String name;
	private String phoneNo;
	
	public PhoneBook(int id, String name, String phoneNo) {
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
		public String toString() {
			return String.format("Id [%d], Name [%s], PhoneNo [%s]", 
					this.id, this.name, this.phoneNo);
		}
}
