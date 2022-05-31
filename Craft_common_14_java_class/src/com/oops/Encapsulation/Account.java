package com.oops.Encapsulation;

public class Account {
	
	private String fullName;
	private Long accountNumber;
	private String address;
	private String email;
	private double depositAmount;
	private double accountBalance;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		if(depositAmount >100) {
		this.depositAmount = depositAmount;
		}
		else
	   System.err.println("The amount should be greaterthan 100!!!");
	}
	public double getAccountBalance() {
		return accountBalance + depositAmount;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
