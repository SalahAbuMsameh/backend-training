package com.digitinary.training.jpa;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@NamedQuery(name = "customFetchCustomers", query = "FROM Customer WHERE customerId > 6")
//@NamedQueries({@NamedQuery(name = "", query = ""), @NamedQuery(name = "nasdasd", query = "jql")})
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
	
	@OneToMany(fetch = FetchType.EAGER)//case by case
	@Fetch(FetchMode.JOIN) // join sql. se
	@JoinColumn(name = "CUSTOMER_ID")
	private Set<Account> accounts = new HashSet<Account>();

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
	
	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return String.format("ID: %d, name: %s, mobile no; %s, email: %s, created date: %s",
				customerId, customerName, mobileNo, email, createdDate.toString());
	}
}
