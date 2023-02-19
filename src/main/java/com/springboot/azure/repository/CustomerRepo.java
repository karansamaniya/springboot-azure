package com.springboot.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.azure.entity.Customer;


public interface CustomerRepo extends JpaRepository<Customer,Integer> {

	
}
