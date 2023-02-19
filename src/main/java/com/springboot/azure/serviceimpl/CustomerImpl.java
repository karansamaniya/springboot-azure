package com.springboot.azure.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.azure.entity.Customer;
import com.springboot.azure.repository.CustomerRepo;
import com.springboot.azure.service.CustomerService;


@Service
public class CustomerImpl  implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepo.findAll();
	}

	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerRepo.findById(customerId).orElseThrow();
	}

}
