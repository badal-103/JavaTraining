package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService = new CustomerService();
		
		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(102, "Badal Kumar", "Pune");
		Customer customer3 = new Customer(103, "Kapil Rawat", "Indore");
		Customer customer4 = new Customer(104, "Salman Khan", "Bhopal");
		Customer customer5 = new Customer(105, "Sohail Khan", "Nagpur");
		
		System.out.println("Adding first  customer :: " + customerService.addNewCustomer(customer1));
		System.out.println("Adding second customer :: " + customerService.addNewCustomer(customer2));
		System.out.println("Adding third  customer :: " + customerService.addNewCustomer(customer3));
		System.out.println("Adding fourth customer :: " + customerService.addNewCustomer(customer4));
		System.out.println("Adding fifth  customer :: " + customerService.addNewCustomer(customer5));
		
		System.out.println("-----------------------------------------------");
		System.out.println("reading all customers from database");
		List<Customer> customerList = customerService.getAllCustomer();
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Read one customer from DB");
		Customer customer = customerService.getCustomerByCustomerId(101);
		System.out.println(customer);
		

		
		

		

	}

}
