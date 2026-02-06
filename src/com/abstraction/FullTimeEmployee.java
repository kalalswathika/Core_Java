package com.abstraction;

public class FullTimeEmployee  extends Employee{
double basePay , benefits;
public FullTimeEmployee(String name,String id,double basePay, double  benefits) {
	super(name, id);
	this.basePay = basePay;
	this.benefits = benefits;
}
public void calculateSalary() {
	double salary=basePay+benefits;
	System.out.println("Salary:"+salary);
}
public void applyLeave() {
	System.out.println("Leave applied successfully");
}
	public void getDetails() {
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+id);
	}

}

