package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.CustomerMapper;
import com.po.Customer;
import com.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<Customer> findUserByName(String first_name) {
		List<Customer> list = customerMapper.findCustomerByName(first_name);
		return list;
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> list = customerMapper.findAll();
		return list;
	}

}
