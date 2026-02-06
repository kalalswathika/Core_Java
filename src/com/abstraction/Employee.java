package com.abstraction;

public abstract class Employee{
	String name,id;
	
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	abstract void calculateSalary();
	public void applyLeave() {
		System.out.println("All employees can apply for leave");
	}
	public void getDetails() {
		System.out.println("All employees have details that can be retrieved");
	}


}
