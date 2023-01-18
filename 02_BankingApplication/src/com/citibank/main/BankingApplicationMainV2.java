package com.citibank.main;
import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Bank");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Number");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter balance");
		double balance = scanner.nextDouble();
		
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setBalance(balance);
		account.setName(name);
		
		System.out.println("Your account is opened succesfully");
		System.out.println("Account Number : " + account.getAccountNumber());
		System.out.println("Name : " + account.getName());
		System.out.println("Balance : "+account.getBalance());
		
					
		
		
		
	}

}
