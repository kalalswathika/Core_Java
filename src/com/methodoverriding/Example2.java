package com.methodoverriding;
class Vehicle{
	public void Start() {
		System.out.println("Vehicle started");
	}
}
class Car extends Vehicle{
	@Override
	public void Start() {
		System.out.println("Car started");
	}
}
public class Example2 {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.Start();
		Car c=new Car();
		c.Start();
		

	}

}
