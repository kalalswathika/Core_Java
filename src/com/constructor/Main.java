package com.constructor;
class Vehicle {
	String make;
	String model;
	int year;
	public Vehicle(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void displayInfo() {
		System.out.println("make:"+this.make);
		System.out.println("model:"+this.model);
		System.out.println("year:"+this.year);
	}
}
class Car extends Vehicle{
	int noofdoors;
	public Car(String make,String model,int year,int noofdoors) {
		super(make,model,year);
		this.noofdoors=noofdoors;
	}
	public void displayCarInfo() {
		System.out.println("make:"+this.make);
		System.out.println("model:"+this.model);
		System.out.println("year:"+this.year);
		System.out.println("noofdoors:"+this.noofdoors);
	}
}
class Truck extends Vehicle{
		int cargocapacity;
		public Truck(String make,String model,int year,int cargocapacity) {
			super(make,model,year);
			this.cargocapacity=cargocapacity;
		}
		public void displayTruckInfo() {
			System.out.println("make:"+this.make);
			System.out.println("model:"+this.model);
			System.out.println("year:"+this.year);
			System.out.println("cargocapacity:"+this.cargocapacity);
		}
	}
class Motorcycle extends Vehicle{
	boolean hassidecar;
	public Motorcycle(String make,String model,int year,boolean hassidecar ) {
		super(make,model,year);
		this.hassidecar=hassidecar;
	}
	public void displayMotorcycleInfo() {
		System.out.println("make:"+this.make);
		System.out.println("model:"+this.model);
		System.out.println("year:"+this.year);
		System.out.println("hassidecar:"+this.hassidecar);
	}
}
public class Main {
	public static void main(String[] args) {
		 Vehicle vehicle = new Car("Toyota", "Corolla", 2022, 4);
	       vehicle.displayInfo(); 
	       Car car=(Car) vehicle; 
	       car.displayCarInfo();
	       System.out.println("**********************");
	     Vehicle vehicle1= new Truck("Ford", "F-150", 2021, 1000); 
	        vehicle1.displayInfo();
	        Truck truck=(Truck) vehicle1;
	        truck.displayTruckInfo();
	        System.out.println("************************");
	        Vehicle vehicle2=new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);
	        vehicle2.displayInfo();
	        Motorcycle motorcycle=(Motorcycle) vehicle2;
	        motorcycle.displayMotorcycleInfo();
	}
}
