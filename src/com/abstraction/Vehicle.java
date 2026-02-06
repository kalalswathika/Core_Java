package com.abstraction;

public abstract class Vehicle {
	String modelName , vehicleNumber , company;
	
	public Vehicle(String modelName, String vehicleNumber, String company) {
		super();
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}

	abstract void startEngine();
	
	public void fuleType() {
	System.out.println("Most vehicles use petrol by default");	
	}

}
