package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {
		System.out.println("Entry");  //entry of the program starts here.
		// TODO Auto-generated method stub
		//object creation 
		Account account = new Account();
		account.setAccountNumber(101);
		System.out.println(account.getAccountNumber()); 	
	
		//function calling
		
		if(account.deposit(100)) {
			System.out.println("Transaction Successful");
		}
		
		account.withdraw(50);
		System.out.println("Exit"); //exit of the program is here.

	}

}
