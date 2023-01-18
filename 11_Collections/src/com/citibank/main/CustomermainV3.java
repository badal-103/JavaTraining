package com.citibank.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.citibank.main.domain.Customer;

public class CustomermainV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Customer> customerSet = new HashSet<>();
		
		Customer customer1 = new Customer(101, "Vivek Gohil", "Mumbai");
		Customer customer2 = new Customer(102, "Badal Kumar", "Pune");
		Customer customer3 = new Customer(103, "Kapil Rawat", "Indore");
		Customer customer4 = new Customer(104, "Salman Khan", "Bhopal");
		Customer customer5 = new Customer(105, "Sohail Khan", "Nagpur");
		Customer customer6 = new Customer(105, "Sohail Khan", "Nagpur");
		
		
		System.out.println("First customer :: " + customer1.hashCode());
		System.out.println("Adding first  customer :: " + customerSet.add(customer1));
//		System.out.println("Adding second customer :: " + customerSet.add(customer2));
//		System.out.println("Adding third  customer :: " + customerSet.add(customer3));
//		System.out.println("Adding fourth customer :: " + customerSet.add(customer4));
//		System.out.println("Adding fifth  customer :: " + customerSet.add(customer5));
//		System.out.println("Adding sixth  customer :: " + customerSet.add(customer6));
		System.out.println("fifth customer :: " + customer5.hashCode());
		System.out.println("Adding fifth  customer :: " + customerSet.add(customer5));
		System.out.println("sixth customer :: " + customer6.hashCode());
		System.out.println("Adding sixth  customer :: " + customerSet.add(customer6));
		
		System.out.println("-----------------------------------------------");
		System.out.println("reading all customers from database");
		
		System.out.println(customerSet);
		

	}

}
