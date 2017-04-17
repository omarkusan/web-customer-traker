package com.omar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omar.dao.CustomerDAO;
import com.omar.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	//need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}


	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}


	@Override
	@Transactional
	public Customer getCustomers(int theId) {

		
		return customerDAO.getCustomer(theId);
	}

}
