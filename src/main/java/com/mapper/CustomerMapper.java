package com.mapper;

import java.util.List;

import com.po.Customer;

public interface CustomerMapper {
	
	public List<Customer> findAll();
	
	public List<Customer> findCustomerByName(String first_name);

}
