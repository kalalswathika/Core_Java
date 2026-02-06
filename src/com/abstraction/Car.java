package com.abstraction;

public class Car extends Vehicle {
	Integer numberOfDoors;
	Boolean hasSunroof;
	public Car(String modelName, String vehicleNumber, String company, Integer numberOfDoors, Boolean hasSunroof) {
		super(modelName, vehicleNumber, company);
		this.numberOfDoors =numberOfDoors;
		this.hasSunroof = hasSunroof;
	}
	public void startEngine() {
		System.out.println("Starting engine with Key ignition.");
	}
}