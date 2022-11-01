package com.valid8me.customerRecords.ws;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valid8me.customerRecords.model.Customer;
import com.valid8me.customerRecords.service.CustomerService;

@RestController
@RequestMapping("/customer/")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GET
	@Path("{nationSecurityNumber}")
	public Customer getCustomerDetails(@PathParam("nationSecurityNumber") String customerId) {
		Customer customer= customerService.getCustomerDetails(customerId);
		return customer;
	}
	
	@GET
	@Path("/getAllCustomer")
	public ArrayList<Customer> getAllCustomerDetails() {
		ArrayList<Customer> customer= customerService.getAllCustomerDetails();
		return customer;
	}

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void saveCustomerDetails(@RequestBody Customer customer) {
		customerService.saveCustomerDetails(customer);
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void updateCustomerDetails(@RequestBody Customer customer) {
		customerService.updateCustomerDetails(customer);
	}
	
	@DELETE
	@Path("/delete/{nationSecurityNumber}")
	public void deleteCustomerDetails(@PathParam("nationSecurityNumber") String customerId) {
		customerService.deleteCustomerDetails(customerId);
	}
}
