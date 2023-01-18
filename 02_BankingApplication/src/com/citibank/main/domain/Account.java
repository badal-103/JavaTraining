package com.citibank.main.domain;

public abstract class Account {
	//variable declaration 
	private int accountNumber;
	private String name;
	private double balance;
	
	public Account() {
		System.out.println("This is a default constructor!");
	}
	
	public Account(int accountNumber, String name, double balance) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}



	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//function 	
	abstract public boolean withdraw(double amountWdrw);
	abstract public boolean deposit(double amount);

}
