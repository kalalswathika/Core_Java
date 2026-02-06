package com.abstraction;

public class Main {

	public static void main(String[] args) {
     Vehicle v=new Car("Sedan","1234", "maruthi",4,false);
     v.startEngine();
     v.fuleType();
     System.out.println("***********");
     v=new Bike("Sedan","1234", "maruthi",true);
     v.startEngine();
     v.fuleType();
     System.out.println("**********");
     v=new Truck("Tata", "12345", "Tata",200000 );
     v.startEngine();
     v.fuleType();
     
	}

}
