package com.kiran.AirBookingSystem;

public class AirlineCustomer 
{
	int customerId;
	String fullName;
	String email;
	String phoneNumber;
	public AirlineCustomer(int customerId, String fullName, String email, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public AirlineCustomer() 
	{
		super();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
