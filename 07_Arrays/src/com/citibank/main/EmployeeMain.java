package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(101,"Badal",1000);
		Employee employee2 = new Employee(102,"Santosh",2000);
		Employee employee3 = new Employee(103,"Nahida",3000);
		Employee employee4 = new Employee(104,"Menka",4000);
		Employee employee5 = new Employee(105,"Shilpa",5000);
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		System.out.println(employee4.toString());
		System.out.println(employee5.toString());
		
		System.out.println("----------------------------------------------");
		
		Employee [] allEmployees = new Employee[5];
		Scanner scanner = new Scanner(System.in);
		int employeeId;
		
		String name;
		double salary;
		
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter employeeid");
			employeeId = scanner.nextInt();
			System.out.println("Enter Name");
			name = scanner.next();
			System.out.println("Enter salary");
			salary = scanner.nextDouble();
			Employee employee = new Employee(employeeId, name, salary);
			allEmployees[i]  = employee;
			System.out.println();
		}
		System.out.println("All employees");
		for (Employee employee : allEmployees) {
			System.out.println(employee);
			
		}
			
			
		

	}

}
