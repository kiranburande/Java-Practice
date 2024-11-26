package com.kiranCustomerandOrdersManagement;

public class Customer 
{
	private String name;  
	private String email; 
	private Order order;
	public Customer(String name, String email, Order order) {
		super();
		this.name = name;
		this.email = email;
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [Name=" + name + ", Email=" + email + ", " + order + "]";
	}
	

}
