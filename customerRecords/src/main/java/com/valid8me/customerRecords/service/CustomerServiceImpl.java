package com.valid8me.customerRecords.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid8me.customerRecords.dao.CustomerDao;
import com.valid8me.customerRecords.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;

	@Override
	public Customer getCustomerDetails(String nationSecurityNumber) {
		Integer id = Integer.parseInt(nationSecurityNumber);
		Customer customer = customerDao.findById(id).get();
		return customer;
	}
	
	@Override
	public ArrayList<Customer> getAllCustomerDetails() {
		ArrayList<Customer> customers = (ArrayList<Customer>) customerDao.findAll();
		return customers;
	}

	@Override
	public void saveCustomerDetails(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void updateCustomerDetails(Customer customer) {
		customerDao.save(customer);

	}

	@Override
	public void deleteCustomerDetails(String nationSecurityNumber) {		
		Integer id = Integer.parseInt(nationSecurityNumber);
		customerDao.deleteById(id);
	}

}
