package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account;  //object reference

		int accountNumber;
		String name;
		double balance;
		int choice;
		double amount;
		String continueChoice;

		System.out.println("Welcome to XYZ Bank");
		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter balance");
		balance = scanner.nextDouble();

		//account.setAccountNumber(accountNumber);
		//account.setBalance(balance);
		//account.setName(name);
		
		account = new Account(accountNumber, name, balance); //object initialization

		//System.out.println("Your account is opened successfully");
		//System.out.println("Account Number : " + account.getAccountNumber());
		//System.out.println("Name : " + account.getName());
		//System.out.println("Balance : " + account.getBalance());
		
		System.out.println("Your account is opened succesfully");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Name : " + name);
		System.out.println("Balance : " + balance);
		do {

			showTransactionMenu(scanner, account);
			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));

	}

	private static void showTransactionMenu(Scanner scanner, Account account) {
		int choice;
		double amount;
		System.out.println("****Transaction Menu******");
		System.out.println("Press 1 for Withdrawl");
		System.out.println("Press 2 for Deposit");
		System.out.println("Press 3 for Balance Enquiry");
		System.out.println("Press 4 to Exit the Menu");
		choice = scanner.nextInt();
		

		switch (choice) {
		case 1:
			System.out.println("Enter the amount to be withdrawn");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Withdraw successfull");
			else
				System.out.println("Transaction failed - Withdrawl");
			break;
		case 2:
			System.out.println("Enter the amount ot be deposited");
			amount = scanner.nextDouble();
			if (account.deposit(amount))
				System.out.println("Deposit successfull");
			else
				System.out.println("Traansaction failed - Deposit");
			break;
		case 3:
			System.out.println("Your balance is " + account.getBalance());
			break;
		case 4:
			System.out.println("Thank you for banking with us");
			System.exit(0);
			break;

		default:
			System.out.println("Press correct option");
			break;
		}
	}

}
