package com.digitinary.training.jpa;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
public class Account {
	
	private long accountId;
	private String accountNo;
	private BigDecimal balance;
	private LocalDate createdDate;
	
	@Id
	@Column(name = "ACCOUNT_ID")
	public long getAccountId() {
		return accountId;
	}
	
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
	@Column(name = "ACCOUNT_NO")
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	@Column(name = "BALANCE")
	public BigDecimal getBalance() {
		return balance;
	}
	
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	@Column(name = "CREATED_DATE")
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return String.format("ACCID: %d, Acc No: %s, Balance: %s, Created Date: %s", 
				accountId, accountNo, balance.toString(), createdDate.toString());
	}
}
