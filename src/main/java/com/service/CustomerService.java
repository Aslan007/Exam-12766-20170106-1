package com.service;

import java.util.List;


import com.po.Customer;

public interface CustomerService {
	
	
	public  List<Customer> findUserByName(String first_name);
	

	public  List<Customer> findAll();
	


}
