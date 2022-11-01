package com.valid8me.customerRecords.service;

import java.util.ArrayList;

import com.valid8me.customerRecords.model.Customer;

public interface CustomerService {
	
	public Customer getCustomerDetails(String nationSecurityNumber);

	public ArrayList<Customer> getAllCustomerDetails();

	public void saveCustomerDetails(Customer customer);

	public void updateCustomerDetails(Customer customer);
	
	public void deleteCustomerDetails(String nationSecurityNumber);

}
