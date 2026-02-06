package com.abstraction;

public class Bike extends Vehicle {
	Boolean hasSidecar;

	public Bike(String modelName, String vehicleNumber, String company, Boolean hasSidecar) {
		super(modelName, vehicleNumber, company);
		this.hasSidecar = hasSidecar;
	}
	public void startEngine() {
		System.out.println("Starting engine with kick-start.");
	}

}
