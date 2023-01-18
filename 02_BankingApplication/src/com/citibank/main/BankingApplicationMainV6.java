package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account;
		String name;
		double balance;
		boolean isSalary;
		double overdraftLimit;
		int choice;
		int accountNumber;
		

		System.out.println("Account menu");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		System.out.println("enter account number");
		accountNumber = scanner.nextInt();
		
		account = getAccountByChoice(choice);
		
			

	}
	public static Account getAccountByChoice(int choice) {
		int accountNumber;
		String name;
		double balance;
		boolean isSalary;
		double overdraftLimit;
		
		Scanner scanner = new Scanner(System.in);
		
		if(choice == 1) {
			System.out.println("Do u want to open salary account(true/false)");
			isSalary = scanner.nextBoolean();
			return new Savings(accountNumber,new,)
			
		}
		if(choice == 2) {
			System.out.println("Enter overdradft Limit");
			
		}
		return null;
		
	}

}
