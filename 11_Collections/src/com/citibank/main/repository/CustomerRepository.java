package com.citibank.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {
	
	private List<Customer> customerList = new ArrayList<>();

	@Override
	public boolean addNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerList.add(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		for(Customer customer : customerList) {
			if(customer.getCustomerId() == customerId) {
				
				System.out.println(customer);
				return customerList.get(customerId);
				
			}
		
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
	
			return customerList;
	}
		
	

	@Override
	public boolean updateCustomerbyCustomerId(Customer customer) {
		// TODO Auto-generated method 
		for (Customer c : customerList) {
			if(c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				return true;
				
				
				
			}
		}
		
		
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		for (Customer c : customerList) {
			if(c.getCustomerId() == customerId()) {
				customerList.remove(c);
				
				return true;
				
				
				
			}
		}
		return false;
	}

	private int customerId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
