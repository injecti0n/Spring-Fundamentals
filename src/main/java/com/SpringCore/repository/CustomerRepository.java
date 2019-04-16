package com.SpringCore.repository;

import java.util.List;

import com.SpringCore.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}