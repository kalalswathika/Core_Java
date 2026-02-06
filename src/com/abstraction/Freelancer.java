package com.abstraction;

public class Freelancer extends Employee {
	double projectPayment;

	public Freelancer(String name, String id, double projectPayment) {
		super(name, id);
		this.projectPayment = projectPayment;
	}
	
public  void calculateSalary() {
	System.out.println("ProjectPayment:"+projectPayment);
}
public void applyLeave() {
	System.out.println("Leave applied successfully");
}
	public void getDetails() {
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+id);
	}
}
