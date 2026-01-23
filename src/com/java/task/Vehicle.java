package com.java.task;

class Vehicle1{
	public void run() {
		System.out.println("Vehicle is running");
	}
}
class Car extends Vehicle1{
	public void speed() {
		System.out.println("Car is moving at 80 km/h");
	}
}
public class Vehicle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.run();
		c.speed();

	}
}
