package com.citibank.main.domain;

public class Savings extends Account {
	boolean isSaving;
	public Savings() {
		System.out.println("This is the default constructor for Savings");
		
	}
	public Savings(int accountNumber, String name, double balance, boolean isSavings) {
		super(accountNumber, name, balance);
		System.out.println("This is the parameterized constructor for Savings");
	}
	
	public boolean isSaving() {
		return isSaving;
	}
	public void setSaving(boolean isSaving) {
		this.isSaving = isSaving;
	}
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount > 0) {
			if(isSaving && amount <= getBalance()) {
				setBalance(getBalance() -amount);
				return true;
			}

				if(isSaving && amount - getBalance() >= 1500){
					setBalance(getBalance() -amount);
					return true;
				}
		}	
		return false;
	}
	@Override
	public boolean deposit(double amount) {
		if(amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
			
	}

}
