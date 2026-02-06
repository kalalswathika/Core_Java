package com.abstraction;

public class PartTimeEmployee extends Employee {
	Integer hourlyRate , hoursWorked;

	public PartTimeEmployee(String name, String id, Integer hourlyRate, Integer hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public void calculateSalary() {
		Integer Salary= hoursWorked*hourlyRate;
		System.out.println("Salary:"+Salary);
		
	}
	public void applyLeave() {
		System.out.println("Leave applied successfully");
	}
		public void getDetails() {
			System.out.println("Employee Name:"+name);
			System.out.println("Employee Id:"+id);
		}

	}
