package com.kiran.ChangeTheDriver;

public class CarBLC 
{
	private String brand;
	 private String model;
	 private int year ;
	 private Driver driver;
	public CarBLC(String brand, String model, int year, Driver driver) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}
	
	
	public CarBLC(CarBLC c) {
		super();
		this.brand = c.brand;
		this.model = c.model;
		this.year = c.year;
		this.driver = c.driver;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	 

}
