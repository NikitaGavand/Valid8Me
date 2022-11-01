package com.valid8me.customerRecords.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private Date dateOfBirth;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer NationSecurityNumber;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getNationSecurityNumber() {
		return NationSecurityNumber;
	}
	public void setNationSecurityNumber(Integer nationSecurityNumber) {
		NationSecurityNumber = nationSecurityNumber;
	}
}
