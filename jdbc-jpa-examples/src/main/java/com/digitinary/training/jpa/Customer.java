package com.digitinary.training.jpa;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {
	
	@Id // primary key
	@GeneratedValue(generator = "customerIdSeqGen", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "customerIdSeqGen", sequenceName = "CUSTOMER_ID_SEQ", allocationSize = 1)
	@Column(name = "CUSTOMER_ID")
	private Long customerId;
	
	@Column(name = "NAME")
	private String customerName;
	
	@Column(name = "MOBILE_No")
	private String mobileNo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "CREATED_DATE")
	private LocalDate createdDate;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d, name: %s, mobile no; %s, email: %s, created date: %s",
				customerId, customerName, mobileNo, email, createdDate.toString());
	}
}
