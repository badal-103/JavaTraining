package com.citibank.main.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;
	
	
		
	public void accept() {
		Scanner scanner =  new Scanner(System.in);
		try {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("enter 2 nums");
		num1 = scanner.nextDouble();
		num2= scanner.nextDouble();
		
		}catch(InputMismatchException e) {
			System.out.println("Invalid input from the user");
			System.out.println("Program will continue its execution");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception in code ");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Thank you");
			scanner.close();
			
		}
		
		
	}
		
		
	
	public void calculation() {
		result = num1 + num2;
	}
	public void display() {
		System.out.println ("Result : " + result);
	}

}
