package com.springboot.azure.service;

import java.util.List;

import com.springboot.azure.entity.Customer;

public interface CustomerService {
	
	//create
		Customer saveCustomer(Customer customer);
		
		
		//get all
		List<Customer> getAllCustomer();
		
		//get single
		Customer getCustomer(int customerId);

}
