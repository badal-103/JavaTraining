package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;
import com.citibank.main.repository.CustomerRepositoryInterface;

public class CustomerService implements CustomerServiceInterface {
	
	private CustomerRepositoryInterface customerRepository = new CustomerRepository();

	@Override
	public boolean addNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.addNewCustomer(customer);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByCustomerId(customerId);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.getAllCustomer();
	}

	@Override
	public boolean updateCustomerbyCustomerId(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.updateCustomerbyCustomerId(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return customerRepository.deleteCustomerByCustomerId(customerId);
	}

}
