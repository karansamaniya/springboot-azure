package com.springboot.azure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.azure.entity.Customer;
import com.springboot.azure.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
	{
		Customer customer1 = customerService.saveCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(customer1);
	}
	@GetMapping("/{customerId}")
	public ResponseEntity<Customer> getSingleCustomer(@PathVariable int customerId)
	{
		Customer customer = customerService.getCustomer(customerId);
		return ResponseEntity.ok(customer);
	}
	
	@GetMapping
	public ResponseEntity<List<Customer>> getSingleCustomer()
	{
		
		List<Customer> allCustomer = customerService.getAllCustomer();
		return ResponseEntity.ok(allCustomer);
	}

}
