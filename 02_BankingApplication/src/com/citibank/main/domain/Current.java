package com.citibank.main.domain;

public class Current extends Account {
	private double overdraftLimit;
	private double initialOD;
	
	public Current() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor Current");
	}
	public Current(int accountNumber, String name, double balance, double overdraftLimit) {
		super(accountNumber, name, balance);
		this.overdraftLimit = overdraftLimit;
		initialOD = this.overdraftLimit;
		System.out.println(initialOD);
		
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		
		if(amount > 0 && overdraftLimit == initialOD) {
			setBalance(getBalance() + amount);
			return true;
		}
		if(amount > 0 && overdraftLimit < initialOD) {
			if(overdraftLimit + amount < initialOD) {
				overdraftLimit = overdraftLimit + amount;
				setBalance(getBalance());
				return true;
			
			}
			if(overdraftLimit + amount > initialOD) {
				setBalance(getBalance() + (amount + overdraftLimit - initialOD  ));
				overdraftLimit = initialOD;
				return true;
				
			
			}
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}
	@Override
	public boolean withdraw(double amount) {
		if(amount > 0) {
			if (amount < (getBalance())) {
				setBalance(getBalance() - amount);
				return true;
			}
			if(amount > (getBalance())) {
				
				overdraftLimit = (overdraftLimit - (amount - getBalance()));
				setBalance(0);
				return true;
				
			}
			
		}
		return false;
	}
	

}
