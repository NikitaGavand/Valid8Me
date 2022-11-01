package com.valid8me.customerRecords.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valid8me.customerRecords.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer>{
	
}