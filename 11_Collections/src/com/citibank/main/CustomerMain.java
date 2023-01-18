package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		//String flagFound = "no";
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(102, "Badal Kumar", "Pune");
		Customer customer3 = new Customer(103, "Kapil Rawat", "Indore");
		Customer customer4 = new Customer(104, "Salman Khan", "Bhopal");
		Customer customer5 = new Customer(105, "Sohail Khan", "Nagpur");
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		printAllCustomers(customerList);
		
		Scanner scanner = new Scanner(System.in);
//		int customerId;
//		System.out.println("enter customerid to be searched");
//		customerId = scanner.nextInt();
//		
//		printCustomerByCustomerId(customerList, customerId);
		
		int customerId;
		String updated_name, updated_address;
		System.out.println("Enter CustomerId :: " );
		customerId = scanner.nextInt();
		
		scanner.nextLine();
		
//		System.out.println("enter new name");
//		updated_name = scanner.nextLine();
//		
//		System.out.println("Enter the address");
//		updated_address = scanner.nextLine();
		
//		Customer updateCustomer = new Customer(customerId, updated_name, updated_address);
		
		
		
//		updateCustomerByCustomerId(customerList, updateCustomer);
//		printCustomerByCustomerId(customerList, customerId);
//		
		deleteCustomerByCustomerId(customerList, customerId);
		printAllCustomers(customerList);
		
		
		

	}
	private static void printAllCustomers(List<Customer> customerList) {
		System.out.println("All customers");
		for(Customer customer : customerList) {
			System.out.println(customer);
			
		}
		
	}
	private static void printCustomerByCustomerId(List<Customer> customerList, int customerId) {
	
		String flagFound = "no";
		for(Customer customer : customerList) {
			if(customer.getCustomerId() == customerId) {
				
				System.out.println(customer);
				flagFound = "yes";
				
			}
			
			
		}
		if(flagFound == "no") {
			System.out.println("CustomerID not found");
		}
	}
	
		
	public static void updateCustomerByCustomerId(List<Customer> customerList, Customer customer ) {
		String flagFound = "no";
		for(Customer c : customerList) {
			if(c.getCustomerId() == customer.getCustomerId()) {
				
//				System.out.println(customer);
				flagFound = "yes";
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				System.out.println("Update done");
				break;
				
			}
			
			
		}
		if(flagFound == "no") {
			System.out.println("CustomerID not found");
		}
		
	}
	
	public static void deleteCustomerByCustomerId(List<Customer> customerList, int customerId) {
		String flagFound = "no";
		for(Customer customer : customerList) {
			if(customer.getCustomerId() == customerId) {
				customerList.remove(customer);
				flagFound = "Yes";
				System.out.println("customer deleted");
				break;
				
			}
			
			
		}
		if(flagFound == "no") {
			System.out.println("CustomerID not found");
		}
	
		
	}
}
	


