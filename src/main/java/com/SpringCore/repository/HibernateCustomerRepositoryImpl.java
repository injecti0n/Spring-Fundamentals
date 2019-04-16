package com.SpringCore.repository;

import java.util.ArrayList;
import java.util.List;

import com.SpringCore.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Julian");
		customer.setLastname("Assange");
		
		customers.add(customer);
		
		return customers;
	}
}
